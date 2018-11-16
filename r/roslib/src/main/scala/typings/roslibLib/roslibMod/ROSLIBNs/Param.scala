package typings
package roslibLib.roslibMod.ROSLIBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Param extends js.Object {
  /**
  		 * Delete this parameter on the ROS server.
  		 */
  def delete(callback: js.Function1[/* response */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * Fetches the value of the param.
  		 *
  		 * @param callback - function with the following params:
  		 *  * value - the value of the param from ROS.
  		 */
  def get(callback: js.Function1[/* response */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * Sets the value of the param in ROS.
  		 *
  		 * @param value - value to set param to.
  		 * @param callback - function with params:
  		 *   * response - the response from the service request
  		 */
  def set(value: js.Any): scala.Unit = js.native
  /**
  		 * Sets the value of the param in ROS.
  		 *
  		 * @param value - value to set param to.
  		 * @param callback - function with params:
  		 *   * response - the response from the service request
  		 */
  def set(value: js.Any, callback: js.Function1[/* response */ js.Any, scala.Unit]): scala.Unit = js.native
}

