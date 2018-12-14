package typings
package signalrDashNoDashJqueryLib.signalrDashNoDashJqueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends js.Object {
  var id: java.lang.String = js.native
  var proxies: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var transport: signalrDashNoDashJqueryLib.Anon_SupportsKeepAlive = js.native
  /**
      * Creates a new proxy object for the given hub connection that can be used to invoke
      * methods on server hubs and handle client method invocation requests from the server.
      *
      * @param hubName The name of the hub on the server to create the proxy for.
      */
  def createHubProxy(hubName: java.lang.String): Proxy = js.native
  def start(): js.Any = js.native
  def start(options: js.Any): js.Any = js.native
  def start(options: js.Any, callback: js.Any): js.Any = js.native
}

