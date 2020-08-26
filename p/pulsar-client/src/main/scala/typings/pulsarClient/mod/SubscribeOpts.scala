package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscribeOpts extends js.Object {
  /**
    * Acknowledge timeout in milliseconds.
    * Default: 0
    */
  var ackTimeoutMs: js.UndefOr[Double] = js.native
  /**
    * The name of consumer. Currently, failover mode uses consumer name for ordering.
    */
  var consumerName: js.UndefOr[String] = js.native
  /**
    * The metadata of consumer.
    */
  var properties: js.UndefOr[MessageProperties] = js.native
  /**
    * Sets the size of the consumer's receiver queue, i.e. the number of messages that can be accumulated by the consumer before the application calls receive.
    * A value higher than the default could increase consumer throughput, though at the expense of more memory utilization.
    * Default: 1000
    */
  var receiverQueueSize: js.UndefOr[Double] = js.native
  /**
    * Set the max total receiver queue size across partitions.
    * This setting will be used to reduce the receiver queue size for individual partitions if the total exceeds this value.
    * Default: 50000
    */
  var receiverQueueSizeAcrossPartitions: js.UndefOr[Double] = js.native
  /**
    * The subscription name for this consumer.
    */
  var subscription: String = js.native
  /**
    * Available options are Exclusive, Shared, and Failover.
    * Default: Exclusive
    */
  var subscriptionType: js.UndefOr[SubscriptionType] = js.native
  /**
    * The Pulsar topic on which the consumer will establish a subscription and listen for messages.
    */
  var topic: String = js.native
}

object SubscribeOpts {
  @scala.inline
  def apply(subscription: String, topic: String): SubscribeOpts = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOpts]
  }
  @scala.inline
  implicit class SubscribeOptsOps[Self <: SubscribeOpts] (val x: Self) extends AnyVal {
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
    def setSubscription(value: String): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopic(value: String): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def setAckTimeoutMs(value: Double): Self = this.set("ackTimeoutMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAckTimeoutMs: Self = this.set("ackTimeoutMs", js.undefined)
    @scala.inline
    def setConsumerName(value: String): Self = this.set("consumerName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConsumerName: Self = this.set("consumerName", js.undefined)
    @scala.inline
    def setPropertiesVarargs(value: js.Any*): Self = this.set("properties", js.Array(value :_*))
    @scala.inline
    def setProperties(value: MessageProperties): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setReceiverQueueSize(value: Double): Self = this.set("receiverQueueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiverQueueSize: Self = this.set("receiverQueueSize", js.undefined)
    @scala.inline
    def setReceiverQueueSizeAcrossPartitions(value: Double): Self = this.set("receiverQueueSizeAcrossPartitions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReceiverQueueSizeAcrossPartitions: Self = this.set("receiverQueueSizeAcrossPartitions", js.undefined)
    @scala.inline
    def setSubscriptionType(value: SubscriptionType): Self = this.set("subscriptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscriptionType: Self = this.set("subscriptionType", js.undefined)
  }
  
}

