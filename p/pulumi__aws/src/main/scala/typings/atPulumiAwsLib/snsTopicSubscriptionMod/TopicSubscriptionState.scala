package typings
package atPulumiAwsLib.snsTopicSubscriptionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TopicSubscriptionState extends js.Object {
  /**
    * The ARN of the subscription stored as a more user-friendly property
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Integer indicating number of minutes to wait in retying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols (default is 1 minute).
    */
  val confirmationTimeoutInMinutes: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
    */
  val deliveryPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The endpoint to send data to, the contents will vary with the protocol. (see below for more information)
    */
  val endpoint: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Boolean indicating whether the end point is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) e.g., PagerDuty (default is false)
    */
  val endpointAutoConfirms: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
    */
  val filterPolicy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The protocol to use. The possible values for this are: `sqs`, `sms`, `lambda`, `application`. (`http` or `https` are partially supported, see below) (`email` is option but unsupported, see below).
    */
  val protocol: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Boolean indicating whether or not to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property) (default is false).
    */
  val rawMessageDelivery: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The ARN of the SNS topic to subscribe to
    */
  val topic: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.snsTopicMod.Topic]] = js.undefined
}

object TopicSubscriptionState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    confirmationTimeoutInMinutes: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    deliveryPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    endpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    endpointAutoConfirms: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    filterPolicy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    protocol: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rawMessageDelivery: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    topic: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.snsTopicMod.Topic] = null
  ): TopicSubscriptionState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (confirmationTimeoutInMinutes != null) __obj.updateDynamic("confirmationTimeoutInMinutes")(confirmationTimeoutInMinutes.asInstanceOf[js.Any])
    if (deliveryPolicy != null) __obj.updateDynamic("deliveryPolicy")(deliveryPolicy.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (endpointAutoConfirms != null) __obj.updateDynamic("endpointAutoConfirms")(endpointAutoConfirms.asInstanceOf[js.Any])
    if (filterPolicy != null) __obj.updateDynamic("filterPolicy")(filterPolicy.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (rawMessageDelivery != null) __obj.updateDynamic("rawMessageDelivery")(rawMessageDelivery.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicSubscriptionState]
  }
}

