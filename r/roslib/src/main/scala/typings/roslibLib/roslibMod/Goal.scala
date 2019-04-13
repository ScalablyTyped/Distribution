package typings
package roslibLib.roslibMod

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
  def this(options: roslibLib.Anon_ActionClient) = this()
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
  def send(timeout: scala.Double): scala.Unit = js.native
}

