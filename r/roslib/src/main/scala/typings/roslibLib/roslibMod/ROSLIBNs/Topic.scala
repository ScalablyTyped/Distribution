package typings
package roslibLib.roslibMod.ROSLIBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Topic extends js.Object {
  // getter
  var messageType: java.lang.String = js.native
  // getter
  var name: java.lang.String = js.native
  /**
  		 * Registers as a publisher for the topic.
  		 */
  def advertise(): scala.Unit = js.native
  /**
  		 * Publish the message.
  		 *
  		 * @param message - A ROSLIB.Message object.
  		 */
  def publish(message: Message): scala.Unit = js.native
  /**
  		 * Every time a message is published for the given topic, the callback
  		 * will be called with the message object.
  		 *
  		 * @param callback - function with the following params:
  		 *   * message - the published message
  		 */
  def subscribe(callback: js.Function1[/* message */ Message, scala.Unit]): scala.Unit = js.native
  /**
  		 * Unregisters as a publisher for the topic.
  		 */
  def unadvertise(): scala.Unit = js.native
  /**
  		 * Unregisters as a subscriber for the topic. Unsubscribing stop remove
  		 * all subscribe callbacks. To remove a call back, you must explicitly
  		 * pass the callback function in.
  		 *
  		 * @param callback - the optional callback to unregister, if
  		 *     * provided and other listeners are registered the topic won't
  		 *     * unsubscribe, just stop emitting to the passed listener
  		 */
  def unsubscribe(): scala.Unit = js.native
  /**
  		 * Unregisters as a subscriber for the topic. Unsubscribing stop remove
  		 * all subscribe callbacks. To remove a call back, you must explicitly
  		 * pass the callback function in.
  		 *
  		 * @param callback - the optional callback to unregister, if
  		 *     * provided and other listeners are registered the topic won't
  		 *     * unsubscribe, just stop emitting to the passed listener
  		 */
  def unsubscribe(callback: js.Function1[/* callback */ js.Function1[/* message */ Message, scala.Unit], scala.Unit]): scala.Unit = js.native
}

