package typings.roslib.roslibMod

import typings.roslib.Anon_ActionName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "ActionClient")
@js.native
class ActionClient protected () extends js.Object {
  /**
  		 * An actionlib action client.
  		 *
  		 * Emits the following events:
  		 *  * 'timeout' - if a timeout occurred while sending a goal
  		 *  * 'status' - the status messages received from the action server
  		 *  * 'feedback' -  the feedback messages received from the action server
  		 *  * 'result' - the result returned from the action server
  		 *
  		 *  @constructor
  		 *  @param options - object with following keys:
  		 *   * ros - the ROSLIB.Ros connection handle
  		 *   * serverName - the action server name, like /fibonacci
  		 *   * actionName - the action message name, like 'actionlib_tutorials/FibonacciAction'
  		 *   * timeout - the timeout length when connecting to the action server
  		 */
  def this(options: Anon_ActionName) = this()
  /**
  		 * Cancel all goals associated with this ActionClient.
  		 */
  def cancel(): Unit = js.native
}

