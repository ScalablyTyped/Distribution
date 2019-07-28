package typings.roslib.roslibMod

import typings.roslib.Anon_ActionClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Goal")
@js.native
class Goal protected () extends js.Object {
  /**
  		 * An actionlib goal goal is associated with an action server.
  		 *
  		 * Emits the following events:
  		 *  * 'timeout' - if a timeout occurred while sending a goal
  		 *
  		 *  @constructor
  		 *  @param options with following keys:
  		 *   * actionClient - the ROSLIB.ActionClient to use with this goal
  		 *   * goalMessage - The JSON object containing the goal for the action server
  		 */
  def this(options: Anon_ActionClient) = this()
  /**
  		 * Cancel the current goal.
  		 */
  def cancel(): Unit = js.native
  /**
  		 * Connect callback functions to goal based events
  		 *
  		 * @param eventName Name of event ('timeout', 'status', 'feedback', 'result')
  		 * @param callback Callback function executed on connected event
  		 */
  def on(eventName: String, callback: js.Function1[/* event */ js.Any, Unit]): Unit = js.native
  /**
  		 * Send the goal to the action server.
  		 *
  		 * @param timeout (optional) - a timeout length for the goal's result
  		 */
  def send(): Unit = js.native
  def send(timeout: Double): Unit = js.native
}

