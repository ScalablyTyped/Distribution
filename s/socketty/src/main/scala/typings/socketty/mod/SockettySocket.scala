package typings.socketty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SockettySocket extends js.Object {
  
  /**
    * Specify a callback to be run when the socket is disconnected.
    * @param callback The disconnect callback
    */
  def disconnect(callback: js.Function0[Unit]): Unit = js.native
  
  /**
    * Listen for an action.
    * @param action The action to listen to
    * @param callback A callback to be run when the action is fired
    */
  def on(action: String, callback: js.Function1[/* message */ js.UndefOr[js.Any], Unit]): Unit = js.native
  
  /**
    * Send an action, as well as an optional message.
    * @param action The action to send
    * @param message The message to send
    */
  def send(action: String): Unit = js.native
  def send(action: String, message: js.Any): Unit = js.native
}
