package typings.roslib.roslibMod

import typings.roslib.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Param")
@js.native
class Param protected () extends js.Object {
  /**
  		 * A ROS parameter.
  		 *
  		 * @constructor
  		 * @param options - possible keys include:
  		 *   * ros - the ROSLIB.Ros connection handle
  		 *   * name - the param name, like max_vel_x
  		 */
  def this(options: Anon_Name) = this()
  /**
  		 * Delete this parameter on the ROS server.
  		 */
  def delete(callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  /**
  		 * Fetches the value of the param.
  		 *
  		 * @param callback - function with the following params:
  		 *  * value - the value of the param from ROS.
  		 */
  def get(callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
  /**
  		 * Sets the value of the param in ROS.
  		 *
  		 * @param value - value to set param to.
  		 * @param callback - function with params:
  		 *   * response - the response from the service request
  		 */
  def set(value: js.Any): Unit = js.native
  def set(value: js.Any, callback: js.Function1[/* response */ js.Any, Unit]): Unit = js.native
}

