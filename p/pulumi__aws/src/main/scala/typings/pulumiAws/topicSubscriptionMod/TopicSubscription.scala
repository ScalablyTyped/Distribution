package typings.pulumiAws.topicSubscriptionMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/sns/topicSubscription", "TopicSubscription")
@js.native
class TopicSubscription protected () extends CustomResource {
  /**
    * Create a TopicSubscription resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TopicSubscriptionArgs) = this()
  def this(name: String, args: TopicSubscriptionArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the subscription stored as a more user-friendly property
    */
  val arn: Output_[String] = js.native
  
  /**
    * Integer indicating number of minutes to wait in retying mode for fetching subscription arn before marking it as failure. Only applicable for http and https protocols (default is 1 minute).
    */
  val confirmationTimeoutInMinutes: Output_[js.UndefOr[Double]] = js.native
  
  /**
    * JSON String with the delivery policy (retries, backoff, etc.) that will be used in the subscription - this only applies to HTTP/S subscriptions. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/DeliveryPolicies.html) for more details.
    */
  val deliveryPolicy: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The endpoint to send data to, the contents will vary with the protocol. (see below for more information)
    */
  val endpoint: Output_[String] = js.native
  
  /**
    * Boolean indicating whether the end point is capable of [auto confirming subscription](http://docs.aws.amazon.com/sns/latest/dg/SendMessageToHttp.html#SendMessageToHttp.prepare) e.g., PagerDuty (default is false)
    */
  val endpointAutoConfirms: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * JSON String with the filter policy that will be used in the subscription to filter messages seen by the target resource. Refer to the [SNS docs](https://docs.aws.amazon.com/sns/latest/dg/message-filtering.html) for more details.
    */
  val filterPolicy: Output_[js.UndefOr[String]] = js.native
  
  /**
    * The protocol to use. The possible values for this are: `sqs`, `sms`, `lambda`, `application`. (`http` or `https` are partially supported, see below) (`email` is an option but is unsupported, see below).
    */
  val protocol: Output_[String] = js.native
  
  /**
    * Boolean indicating whether or not to enable raw message delivery (the original message is directly passed, not wrapped in JSON with the original message in the message property) (default is false).
    */
  val rawMessageDelivery: Output_[js.UndefOr[Boolean]] = js.native
  
  /**
    * The ARN of the SNS topic to subscribe to
    */
  val topic: Output_[String] = js.native
}
/* static members */
@JSImport("@pulumi/aws/sns/topicSubscription", "TopicSubscription")
@js.native
object TopicSubscription extends js.Object {
  
  /**
    * Get an existing TopicSubscription resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): TopicSubscription = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): TopicSubscription = js.native
  def get(name: String, id: Input[ID], state: TopicSubscriptionState): TopicSubscription = js.native
  def get(name: String, id: Input[ID], state: TopicSubscriptionState, opts: CustomResourceOptions): TopicSubscription = js.native
  
  /**
    * Returns true if the given object is an instance of TopicSubscription.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sns/topicSubscription.TopicSubscription */ Boolean = js.native
}
