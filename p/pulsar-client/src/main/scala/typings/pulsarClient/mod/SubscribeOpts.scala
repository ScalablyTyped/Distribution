package typings.pulsarClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeOpts extends js.Object {
  /**
    * Acknowledge timeout in milliseconds.
    * Default: 0
    */
  var ackTimeoutMs: js.UndefOr[Double] = js.undefined
  /**
    * The name of consumer. Currently, failover mode uses consumer name for ordering.
    */
  var consumerName: js.UndefOr[String] = js.undefined
  /**
    * The metadata of consumer.
    */
  var properties: js.UndefOr[MessageProperties] = js.undefined
  /**
    * Sets the size of the consumer's receiver queue, i.e. the number of messages that can be accumulated by the consumer before the application calls receive.
    * A value higher than the default could increase consumer throughput, though at the expense of more memory utilization.
    * Default: 1000
    */
  var receiverQueueSize: js.UndefOr[Double] = js.undefined
  /**
    * Set the max total receiver queue size across partitions.
    * This setting will be used to reduce the receiver queue size for individual partitions if the total exceeds this value.
    * Default: 50000
    */
  var receiverQueueSizeAcrossPartitions: js.UndefOr[Double] = js.undefined
  /**
    * The subscription name for this consumer.
    */
  var subscription: String
  /**
    * Available options are Exclusive, Shared, and Failover.
    * Default: Exclusive
    */
  var subscriptionType: js.UndefOr[SubscriptionType] = js.undefined
  /**
    * The Pulsar topic on which the consumer will establish a subscription and listen for messages.
    */
  var topic: String
}

object SubscribeOpts {
  @scala.inline
  def apply(
    subscription: String,
    topic: String,
    ackTimeoutMs: Int | Double = null,
    consumerName: String = null,
    properties: MessageProperties = null,
    receiverQueueSize: Int | Double = null,
    receiverQueueSizeAcrossPartitions: Int | Double = null,
    subscriptionType: SubscriptionType = null
  ): SubscribeOpts = {
    val __obj = js.Dynamic.literal(subscription = subscription.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (ackTimeoutMs != null) __obj.updateDynamic("ackTimeoutMs")(ackTimeoutMs.asInstanceOf[js.Any])
    if (consumerName != null) __obj.updateDynamic("consumerName")(consumerName.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (receiverQueueSize != null) __obj.updateDynamic("receiverQueueSize")(receiverQueueSize.asInstanceOf[js.Any])
    if (receiverQueueSizeAcrossPartitions != null) __obj.updateDynamic("receiverQueueSizeAcrossPartitions")(receiverQueueSizeAcrossPartitions.asInstanceOf[js.Any])
    if (subscriptionType != null) __obj.updateDynamic("subscriptionType")(subscriptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeOpts]
  }
}

