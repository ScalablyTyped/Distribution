package typings.signalr.SignalR.Hub

import org.scalablytyped.runtime.StringDictionary
import typings.signalr.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection
  extends typings.signalr.SignalR.Connection {
  
  /**
    * Creates a new proxy object for the given hub connection that can be used to invoke
    * methods on server hubs and handle client method invocation requests from the server.
    *
    * @param hubName The name of the hub on the server to create the proxy for.
    */
  def createHubProxy(hubName: String): Proxy = js.native
  
  var proxies: StringDictionary[js.Any] = js.native
  
  var transport: Name = js.native
}
