package typings.signalrNoJquery.mod

import org.scalablytyped.runtime.StringDictionary
import typings.signalrNoJquery.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connection extends js.Object {
  
  /**
    * Creates a new proxy object for the given hub connection that can be used to invoke
    * methods on server hubs and handle client method invocation requests from the server.
    *
    * @param hubName The name of the hub on the server to create the proxy for.
    */
  def createHubProxy(hubName: String): Proxy = js.native
  
  def disconnected(callback: js.Function0[Unit]): Unit = js.native
  
  var id: String = js.native
  
  var proxies: StringDictionary[js.Any] = js.native
  
  def reconnecting(callback: js.Function0[Unit]): Unit = js.native
  
  def start(): js.Any = js.native
  def start(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Any = js.native
  def start(options: js.Any): js.Any = js.native
  def start(options: js.Any, callback: js.Function0[Unit]): js.Any = js.native
  
  def stop(): Unit = js.native
  def stop(async: js.UndefOr[scala.Nothing], notifyServer: Boolean): Unit = js.native
  def stop(async: Boolean): Unit = js.native
  def stop(async: Boolean, notifyServer: Boolean): Unit = js.native
  
  var transport: Name = js.native
}
