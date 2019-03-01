package typings
package atPulumiAwsLib.cloudwatchEventTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTargetState extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated of the target.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
    */
  val batchTarget: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArraySizeJobAttempts]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
    */
  val ecsTarget: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_GroupLaunchType]] = js.undefined
  /**
    * Valid JSON text passed to the target.
    */
  val input: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The value of the [JSONPath](http://goessner.net/articles/JsonPath/)
    * that is used for extracting part of the matched event when passing it to the target.
    */
  val inputPath: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Parameters used when you are providing a custom input to a target based on certain event data.
    */
  val inputTransformer: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_InputPathsInputTemplate]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
    */
  val kinesisTarget: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PartitionKeyPathInput]] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecs_target` is used.
    */
  val roleArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the rule you want to add targets to.
    */
  val rule: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
    */
  val runCommandTargets: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]]
  ] = js.undefined
  /**
    * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
    */
  val sqsTarget: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MessageGroupIdInput]] = js.undefined
  /**
    * The unique target assignment ID.  If missing, will generate a random, unique id.
    */
  val targetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object EventTargetState {
  @scala.inline
  def apply(
    arn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    batchTarget: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ArraySizeJobAttempts] = null,
    ecsTarget: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_GroupLaunchType] = null,
    input: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    inputPath: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    inputTransformer: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_InputPathsInputTemplate] = null,
    kinesisTarget: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_PartitionKeyPathInput] = null,
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    rule: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    runCommandTargets: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyValuesArray]]] = null,
    sqsTarget: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_MessageGroupIdInput] = null,
    targetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
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

