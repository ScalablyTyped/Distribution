package typings
package sockettyLib.sockettyMod.sockettyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SockettySocket extends js.Object {
  /**
           * Specify a callback to be run when the socket is disconnected.
           * @param callback The disconnect callback
           */
  def disconnect(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
           * Listen for an action.
           * @param action The action to listen to
           * @param callback A callback to be run when the action is fired
           */
  def on(action: java.lang.String, callback: js.Function1[/* message */ js.UndefOr[js.Any], scala.Unit]): scala.Unit = js.native
  /**
           * Send an action, as well as an optional message.
           * @param action The action to send
           * @param message The message to send
           */
  def send(action: java.lang.String): scala.Unit = js.native
  /**
           * Send an action, as well as an optional message.
           * @param action The action to send
           * @param message The message to send
           */
  def send(action: java.lang.String, message: js.Any): scala.Unit = js.native
}

