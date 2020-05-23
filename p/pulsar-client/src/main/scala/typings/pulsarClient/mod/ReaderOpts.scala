package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaderOpts extends js.Object {
  /**
    * The name of the reader.
    */
  var readerName: js.UndefOr[String] = js.undefined
  /**
    * Sets the size of the reader's receiver queue, i.e. the number of messages that can be accumulated by the reader before the application calls readNext.
    * A value higher than the default of 1000 could increase reader throughput, though at the expense of more memory utilization.
    * Default 1000
    */
  var receiverQueueSize: js.UndefOr[Double] = js.undefined
  /**
    * The initial reader position, i.e. the message at which the reader begins processing messages.
    * The options are Pulsar.MessageId.earliest (the earliest available message on the topic), Pulsar.MessageId.latest (the latest available message on the topic),
    * or a message ID object for a position that is not earliest or latest.
    */
  var startMessageId: MessageId
  /**
    * The subscription role prefix.
    */
  var subscriptionRolePrefix: js.UndefOr[String] = js.undefined
  /**
    * The Pulsar topic on which the reader will establish a subscription and listen for messages.
    */
  var topic: String
}

object ReaderOpts {
  @scala.inline
  def apply(
    startMessageId: MessageId,
    topic: String,
    readerName: String = null,
    receiverQueueSize: js.UndefOr[Double] = js.undefined,
    subscriptionRolePrefix: String = null
  ): ReaderOpts = {
    val __obj = js.Dynamic.literal(startMessageId = startMessageId.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (readerName != null) __obj.updateDynamic("readerName")(readerName.asInstanceOf[js.Any])
    if (!js.isUndefined(receiverQueueSize)) __obj.updateDynamic("receiverQueueSize")(receiverQueueSize.get.asInstanceOf[js.Any])
    if (subscriptionRolePrefix != null) __obj.updateDynamic("subscriptionRolePrefix")(subscriptionRolePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderOpts]
  }
}

