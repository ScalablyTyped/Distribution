package typings.pulumiAws.topicSubscriptionMod

import typings.pulumiAws.snsMod.Topic
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicSubscriptionState extends js.Object {
  /**
    * The ARN of the subscription stored as a more user-friendly property
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Integer indicating number of minutes to wait in retying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols (default is 1 minute).
    */
  val confirmationTimeoutInMinutes: js.UndefOr[Input[Double]] = js.native
  /**
    * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
    */
  val deliveryPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The endpoint to send data to, the contents will vary with the protocol. (see below for more information)
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean indicating whether the end point is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) e.g., PagerDuty (default is false)
    */
  val endpointAutoConfirms: js.UndefOr[Input[Boolean]] = js.native
  /**
    * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
    */
  val filterPolicy: js.UndefOr[Input[String]] = js.native
  /**
    * The protocol to use. The possible values for this are: `sqs`, `sms`, `lambda`, `application`. (`http` or `https` are partially supported, see below) (`email` is an option but is unsupported, see below).
    */
  val protocol: js.UndefOr[Input[String]] = js.native
  /**
    * Boolean indicating whether or not to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property) (default is false).
    */
  val rawMessageDelivery: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The ARN of the SNS topic to subscribe to
    */
  val topic: js.UndefOr[Input[String | Topic]] = js.native
}

object TopicSubscriptionState {
  @scala.inline
  def apply(): TopicSubscriptionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicSubscriptionState]
  }
  @scala.inline
  implicit class TopicSubscriptionStateOps[Self <: TopicSubscriptionState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setConfirmationTimeoutInMinutes(value: Input[Double]): Self = this.set("confirmationTimeoutInMinutes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConfirmationTimeoutInMinutes: Self = this.set("confirmationTimeoutInMinutes", js.undefined)
    @scala.inline
    def setDeliveryPolicy(value: Input[String]): Self = this.set("deliveryPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeliveryPolicy: Self = this.set("deliveryPolicy", js.undefined)
    @scala.inline
    def setEndpoint(value: Input[String]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setEndpointAutoConfirms(value: Input[Boolean]): Self = this.set("endpointAutoConfirms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpointAutoConfirms: Self = this.set("endpointAutoConfirms", js.undefined)
    @scala.inline
    def setFilterPolicy(value: Input[String]): Self = this.set("filterPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterPolicy: Self = this.set("filterPolicy", js.undefined)
    @scala.inline
    def setProtocol(value: Input[String]): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setRawMessageDelivery(value: Input[Boolean]): Self = this.set("rawMessageDelivery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawMessageDelivery: Self = this.set("rawMessageDelivery", js.undefined)
    @scala.inline
    def setTopic(value: Input[String | Topic]): Self = this.set("topic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopic: Self = this.set("topic", js.undefined)
  }
  
}

