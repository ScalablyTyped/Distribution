package typings.atPulumiAws.cloudwatchEventTargetMod

import typings.atPulumiAws.Anon_ArraySizeJobAttempts
import typings.atPulumiAws.Anon_GroupLaunchType
import typings.atPulumiAws.Anon_InputPathsInputTemplate
import typings.atPulumiAws.Anon_KeyValuesArray
import typings.atPulumiAws.Anon_MessageGroupIdInput
import typings.atPulumiAws.Anon_PartitionKeyPathInput
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated of the target.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
    */
  val batchTarget: js.UndefOr[Input[Anon_ArraySizeJobAttempts]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
    */
  val ecsTarget: js.UndefOr[Input[Anon_GroupLaunchType]] = js.undefined
  /**
    * Valid JSON text passed to the target.
    */
  val input: js.UndefOr[Input[String]] = js.undefined
  /**
    * The value of the [JSONPath](http://goessner.net/articles/JsonPath/)
    * that is used for extracting part of the matched event when passing it to the target.
    */
  val inputPath: js.UndefOr[Input[String]] = js.undefined
  /**
    * Parameters used when you are providing a custom input to a target based on certain event data.
    */
  val inputTransformer: js.UndefOr[Input[Anon_InputPathsInputTemplate]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
    */
  val kinesisTarget: js.UndefOr[Input[Anon_PartitionKeyPathInput]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecsTarget` is used.
    */
  val roleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the rule you want to add targets to.
    */
  val rule: js.UndefOr[Input[String]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
    */
  val runCommandTargets: js.UndefOr[Input[js.Array[Input[Anon_KeyValuesArray]]]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
    */
  val sqsTarget: js.UndefOr[Input[Anon_MessageGroupIdInput]] = js.undefined
  /**
    * The unique target assignment ID.  If missing, will generate a random, unique id.
    */
  val targetId: js.UndefOr[Input[String]] = js.undefined
}

object EventTargetState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    batchTarget: Input[Anon_ArraySizeJobAttempts] = null,
    ecsTarget: Input[Anon_GroupLaunchType] = null,
    input: Input[String] = null,
    inputPath: Input[String] = null,
    inputTransformer: Input[Anon_InputPathsInputTemplate] = null,
    kinesisTarget: Input[Anon_PartitionKeyPathInput] = null,
    roleArn: Input[String] = null,
    rule: Input[String] = null,
    runCommandTargets: Input[js.Array[Input[Anon_KeyValuesArray]]] = null,
    sqsTarget: Input[Anon_MessageGroupIdInput] = null,
    targetId: Input[String] = null
  ): EventTargetState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (batchTarget != null) __obj.updateDynamic("batchTarget")(batchTarget.asInstanceOf[js.Any])
    if (ecsTarget != null) __obj.updateDynamic("ecsTarget")(ecsTarget.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (inputPath != null) __obj.updateDynamic("inputPath")(inputPath.asInstanceOf[js.Any])
    if (inputTransformer != null) __obj.updateDynamic("inputTransformer")(inputTransformer.asInstanceOf[js.Any])
    if (kinesisTarget != null) __obj.updateDynamic("kinesisTarget")(kinesisTarget.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule.asInstanceOf[js.Any])
    if (runCommandTargets != null) __obj.updateDynamic("runCommandTargets")(runCommandTargets.asInstanceOf[js.Any])
    if (sqsTarget != null) __obj.updateDynamic("sqsTarget")(sqsTarget.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetState]
  }
}

