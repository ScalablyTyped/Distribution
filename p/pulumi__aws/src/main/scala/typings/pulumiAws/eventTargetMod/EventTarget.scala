package typings.pulumiAws.eventTargetMod

import typings.pulumiAws.outputMod.cloudwatch.EventTargetBatchTarget
import typings.pulumiAws.outputMod.cloudwatch.EventTargetEcsTarget
import typings.pulumiAws.outputMod.cloudwatch.EventTargetInputTransformer
import typings.pulumiAws.outputMod.cloudwatch.EventTargetKinesisTarget
import typings.pulumiAws.outputMod.cloudwatch.EventTargetRunCommandTarget
import typings.pulumiAws.outputMod.cloudwatch.EventTargetSqsTarget
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloudwatch/eventTarget", "EventTarget")
@js.native
class EventTarget protected () extends CustomResource {
  /**
    * Create a EventTarget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EventTargetArgs) = this()
  def this(name: String, args: EventTargetArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) associated of the target.
    */
  val arn: Output_[String] = js.native
  /**
    * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
    */
  val batchTarget: Output_[js.UndefOr[EventTargetBatchTarget]] = js.native
  /**
    * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
    */
  val ecsTarget: Output_[js.UndefOr[EventTargetEcsTarget]] = js.native
  /**
    * Valid JSON text passed to the target.
    */
  val input: Output_[js.UndefOr[String]] = js.native
  /**
    * The value of the [JSONPath](http://goessner.net/articles/JsonPath/)
    * that is used for extracting part of the matched event when passing it to the target.
    */
  val inputPath: Output_[js.UndefOr[String]] = js.native
  /**
    * Parameters used when you are providing a custom input to a target based on certain event data.
    */
  val inputTransformer: Output_[js.UndefOr[EventTargetInputTransformer]] = js.native
  /**
    * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
    */
  val kinesisTarget: Output_[js.UndefOr[EventTargetKinesisTarget]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecsTarget` is used.
    */
  val roleArn: Output_[js.UndefOr[String]] = js.native
  /**
    * The name of the rule you want to add targets to.
    */
  val rule: Output_[String] = js.native
  /**
    * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
    */
  val runCommandTargets: Output_[js.UndefOr[js.Array[EventTargetRunCommandTarget]]] = js.native
  /**
    * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
    */
  val sqsTarget: Output_[js.UndefOr[EventTargetSqsTarget]] = js.native
  /**
    * The unique target assignment ID.  If missing, will generate a random, unique id.
    */
  val targetId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloudwatch/eventTarget", "EventTarget")
@js.native
object EventTarget extends js.Object {
  /**
    * Get an existing EventTarget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EventTarget = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EventTarget = js.native
  def get(name: String, id: Input[ID], state: EventTargetState): EventTarget = js.native
  def get(name: String, id: Input[ID], state: EventTargetState, opts: CustomResourceOptions): EventTarget = js.native
  /**
    * Returns true if the given object is an instance of EventTarget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloudwatch/eventTarget.EventTarget */ Boolean = js.native
}

