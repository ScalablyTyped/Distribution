package typings.signalrNoJquery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Proxy extends js.Object {
  
  var connection: Connection = js.native
  
  def hasSubscriptions(): Boolean = js.native
  
  var hubName: String = js.native
  
  def init(connection: Connection, hubName: String): Unit = js.native
  
  /**
    * Invokes a server hub method with the given arguments.
    *
    * @param methodName The name of the server hub method.
    */
  def invoke(methodName: String, args: js.Any*): js.Promise[_] = js.native
  
  /**
    * Removes the callback invocation request from the server hub for the given event name.
    *
    * @param eventName The name of the hub event to unregister the callback for.
    * @param callback The callback to be invoked.
    */
  def off(eventName: String): Proxy = js.native
  def off(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy = js.native
  
  /**
    * Wires up a callback to be invoked when a invocation request is received from the server hub.
    *
    * @param eventName The name of the hub event to register the callback for.
    * @param callback The callback to be invoked.
    */
  def on(eventName: String): Proxy = js.native
  def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy = js.native
  
  var state: js.Any = js.native
}
