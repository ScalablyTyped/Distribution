package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReaderOpts extends js.Object {
  /**
    * The name of the reader.
    */
  var readerName: js.UndefOr[String] = js.native
  /**
    * Sets the size of the reader's receiver queue, i.e. the number of messages that can be accumulated by the reader before the application calls readNext.
    * A value higher than the default of 1000 could increase reader throughput, though at the expense of more memory utilization.
    * Default 1000
    */
  var receiverQueueSize: js.UndefOr[Double] = js.native
  /**
    * The initial reader position, i.e. the message at which the reader begins processing messages.
    * The options are Pulsar.MessageId.earliest (the earliest available message on the topic), Pulsar.MessageId.latest (the latest available message on the topic),
    * or a message ID object for a position that is not earliest or latest.
    */
  var startMessageId: MessageId = js.native
  /**
    * The subscription role prefix.
    */
  var subscriptionRolePrefix: js.UndefOr[String] = js.native
  /**
    * The Pulsar topic on which the reader will establish a subscription and listen for messages.
    */
  var topic: String = js.native
}

object ReaderOpts {
  @scala.inline
  def apply(startMessageId: MessageId, topic: String): ReaderOpts = {
    val __obj = js.Dynamic.literal(startMessageId = startMessageId.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderOpts]
  }
  @scala.inline
  implicit class ReaderOptsOps[Self <: ReaderOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStartMessageId(value: MessageId): Self = this.set("startMessageId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setReaderName(value: String): Self = this.set("readerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReaderName: Self = this.set("readerName", js.undefined)
    @scala.inline
    def setReceiverQueueSize(value: Double): Self = this.set("receiverQueueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiverQueueSize: Self = this.set("receiverQueueSize", js.undefined)
    @scala.inline
    def setSubscriptionRolePrefix(value: String): Self = this.set("subscriptionRolePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionRolePrefix: Self = this.set("subscriptionRolePrefix", js.undefined)
  }
  
}

