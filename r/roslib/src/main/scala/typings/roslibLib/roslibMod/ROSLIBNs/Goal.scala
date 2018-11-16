package typings
package roslibLib.roslibMod.ROSLIBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Goal extends js.Object {
  /**
  		 * Cancel the current goal.
  		 */
  def cancel(): scala.Unit = js.native
  /**
  		 * Connect callback functions to goal based events
  		 *
  		 * @param eventName Name of event ('timeout', 'status', 'feedback', 'result')
  		 * @param callback Callback function executed on connected event
  		 */
  def on(eventName: java.lang.String, callback: js.Function1[/* event */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * Send the goal to the action server.
  		 *
  		 * @param timeout (optional) - a timeout length for the goal's result
  		 */
  def send(): scala.Unit = js.native
  /**
  		 * Send the goal to the action server.
  		 *
  		 * @param timeout (optional) - a timeout length for the goal's result
  		 */
  def send(timeout: scala.Double): scala.Unit = js.native
}

