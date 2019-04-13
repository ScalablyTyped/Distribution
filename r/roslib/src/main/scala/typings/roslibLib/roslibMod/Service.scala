package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Service")
@js.native
class Service protected () extends js.Object {
  /**
  		 * A ROS service client.
  		 *
  		 * @constructor
  		 * @params options - possible keys include:
  		 *   * ros - the ROSLIB.Ros connection handle
  		 *   * name - the service name, like /add_two_ints
  		 *   * serviceType - the service type, like 'rospy_tutorials/AddTwoInts'
  		 */
  def this(data: roslibLib.Anon_NameRos) = this()
  // getter
  var name: java.lang.String = js.native
  // getter
  var serviceType: java.lang.String = js.native
  /**
  		 * Advertise this service and call the callback each time a client calls it.
  		 *
  		 * @param callback - function with the following params:
  		 *   * request - the service request data
  		 *   * response - the data which should be sent back to the caller
  		 */
  def advertise(callback: js.Function2[/* request */ js.Any, /* response */ js.Any, scala.Unit]): scala.Unit = js.native
  /**
  		 * Calls the service. Returns the service response in the callback.
  		 *
  		 * @param request - the ROSLIB.ServiceRequest to send
  		 * @param callback - function with params:
  		 *   * response - the response from the service request
  		 * @param failedCallback - the callback function when the service call failed (optional). Params:
  		 *   * error - the error message reported by ROS
  		 */
  def callService(request: ServiceRequest, callback: js.Function1[/* response */ js.Any, scala.Unit]): scala.Unit = js.native
  def callService(
    request: ServiceRequest,
    callback: js.Function1[/* response */ js.Any, scala.Unit],
    failedCallback: js.Function1[/* error */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  /**
  		 * Unadvertise a previously advertised service
  		 */
  def unadvertise(): scala.Unit = js.native
}

