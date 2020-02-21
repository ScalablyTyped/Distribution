package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pulsar-client", "Consumer")
@js.native
class Consumer () extends js.Object {
  /**
    * Acknowledges a message to the Pulsar broker by message object.
    * @param message Message to acknowledge.
    */
  def acknowledge(message: Message): Unit = js.native
  /**
    * Acknowledges all the messages in the stream, up to and including the specified message.
    * The acknowledgeCumulative method will return void, and send the ack to the broker asynchronously.
    * After that, the messages will not be redelivered to the consumer. Cumulative acking can not be used with a shared subscription type.
    * @param message Message to acknowledge cumulatively.
    */
  def acknowledgeCumulative(message: Message): Unit = js.native
  /**
    * Acknowledges all the messages in the stream, up to and including the specified message ID.
    * @param messageId Message ID to acknowledge cumulatively.
    */
  def acknowledgeCumulativeId(messageId: MessageId): Unit = js.native
  /**
    * Acknowledges a message to the Pulsar broker by message ID object.
    * @param messageId Message ID to acknowledge.
    */
  def acknowledgeId(messageId: MessageId): Unit = js.native
  /**
    * Closes the consumer, disabling its ability to receive messages from the broker.
    */
  def close(): js.Promise[Null] = js.native
  /**
    * Receives a single message from the topic with optional specific timeout in milliseconds.
    * @param timeout Wait timeout in milliseconds.
    */
  def receive(): js.Promise[Message] = js.native
  def receive(timeout: Double): js.Promise[Message] = js.native
}

