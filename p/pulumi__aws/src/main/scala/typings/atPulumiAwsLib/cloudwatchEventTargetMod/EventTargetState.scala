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

