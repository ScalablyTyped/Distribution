package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Service")
@js.native
class Service protected ()
  extends roslibLib.roslibMod.ROSLIBNs.Service {
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
}

