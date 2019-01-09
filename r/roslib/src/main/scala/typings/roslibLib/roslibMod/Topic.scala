package typings
package roslibLib.roslibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roslib", "Topic")
@js.native
class Topic protected ()
  extends roslibLib.roslibMod.ROSLIBNs.Topic {
  /**
  		 * Publish and/or subscribe to a topic in ROS.
  		 *
  		 * Emits the following events:
  		 *  * 'warning' - if there are any warning during the Topic creation
  		 *  * 'message' - the message data from rosbridge
  		 *
  		 * @constructor
  		 * @param options - object with following keys:
  		 *   * ros - the ROSLIB.Ros connection handle
  		 *   * name - the topic name, like /cmd_vel
  		 *   * messageType - the message type, like 'std_msgs/String'
  		 *   * compression - the type of compression to use, like 'png'
  		 *   * throttle_rate - the rate (in ms in between messages) at which to throttle the topics
  		 *   * queue_size - the queue created at bridge side for re-publishing webtopics (defaults to 100)
  		 *   * latch - latch the topic when publishing
  		 *   * queue_length - the queue length at bridge side used when subscribing (defaults to 0, no queueing).
  		 */
  def this(options: roslibLib.Anon_Compression) = this()
}

