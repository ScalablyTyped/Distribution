package typings.roslib.mod

import typings.roslib.anon.Compression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("roslib", "Topic")
@js.native
class Topic protected () extends js.Object {
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
  def this(options: Compression) = this()
  
  /**
    * Registers as a publisher for the topic.
    */
  def advertise(): Unit = js.native
  
  // getter
  var messageType: String = js.native
  
  // getter
  var name: String = js.native
  
  /**
    * Publish the message.
    *
    * @param message - A ROSLIB.Message object.
    */
  def publish(message: Message): Unit = js.native
  
  /**
    * Every time a message is published for the given topic, the callback
    * will be called with the message object.
    *
    * @param callback - function with the following params:
    *   * message - the published message
    */
  def subscribe(callback: js.Function1[/* message */ Message, Unit]): Unit = js.native
  
  /**
    * Unregisters as a publisher for the topic.
    */
  def unadvertise(): Unit = js.native
  
  /**
    * Unregisters as a subscriber for the topic. Unsubscribing stop remove
    * all subscribe callbacks. To remove a call back, you must explicitly
    * pass the callback function in.
    *
    * @param callback - the optional callback to unregister, if
    *     * provided and other listeners are registered the topic won't
    *     * unsubscribe, just stop emitting to the passed listener
    */
  def unsubscribe(): Unit = js.native
  def unsubscribe(callback: js.Function1[/* callback */ js.Function1[/* message */ Message, Unit], Unit]): Unit = js.native
}
