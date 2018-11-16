package typings
package signalrLib.SignalRNs.HubNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection
  extends signalrLib.SignalRNs.Connection {
  var proxies: ScalablyTyped.runtime.StringDictionary[js.Any] = js.native
  var transport: signalrLib.Anon_SupportsKeepAlive = js.native
  /**
              * Creates a new proxy object for the given hub connection that can be used to invoke
              * methods on server hubs and handle client method invocation requests from the server.
              *
              * @param hubName The name of the hub on the server to create the proxy for.
              */
  def createHubProxy(hubName: java.lang.String): Proxy = js.native
}

