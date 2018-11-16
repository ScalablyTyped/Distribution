package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Goal")
@js.native
class Goal protected ()
  extends roslibLib.roslibMod.ROSLIBNs.Goal {
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
}

