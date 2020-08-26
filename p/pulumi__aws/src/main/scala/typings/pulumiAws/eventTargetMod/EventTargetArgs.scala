package typings.pulumiAws.eventTargetMod

import typings.pulumiAws.inputMod.cloudwatch.EventTargetBatchTarget
import typings.pulumiAws.inputMod.cloudwatch.EventTargetEcsTarget
import typings.pulumiAws.inputMod.cloudwatch.EventTargetInputTransformer
import typings.pulumiAws.inputMod.cloudwatch.EventTargetKinesisTarget
import typings.pulumiAws.inputMod.cloudwatch.EventTargetRunCommandTarget
import typings.pulumiAws.inputMod.cloudwatch.EventTargetSqsTarget
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTargetArgs extends js.Object {
  /**
    * The Amazon Resource Name (ARN) associated of the target.
    */
  val arn: Input[String] = js.native
  /**
    * Parameters used when you are using the rule to invoke an Amazon Batch Job. Documented below. A maximum of 1 are allowed.
    */
  val batchTarget: js.UndefOr[Input[EventTargetBatchTarget]] = js.native
  /**
    * Parameters used when you are using the rule to invoke Amazon ECS Task. Documented below. A maximum of 1 are allowed.
    */
  val ecsTarget: js.UndefOr[Input[EventTargetEcsTarget]] = js.native
  /**
    * Valid JSON text passed to the target.
    */
  val input: js.UndefOr[Input[String]] = js.native
  /**
    * The value of the [JSONPath](http://goessner.net/articles/JsonPath/)
    * that is used for extracting part of the matched event when passing it to the target.
    */
  val inputPath: js.UndefOr[Input[String]] = js.native
  /**
    * Parameters used when you are providing a custom input to a target based on certain event data.
    */
  val inputTransformer: js.UndefOr[Input[EventTargetInputTransformer]] = js.native
  /**
    * Parameters used when you are using the rule to invoke an Amazon Kinesis Stream. Documented below. A maximum of 1 are allowed.
    */
  val kinesisTarget: js.UndefOr[Input[EventTargetKinesisTarget]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the IAM role to be used for this target when the rule is triggered. Required if `ecsTarget` is used.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the rule you want to add targets to.
    */
  val rule: Input[String] = js.native
  /**
    * Parameters used when you are using the rule to invoke Amazon EC2 Run Command. Documented below. A maximum of 5 are allowed.
    */
  val runCommandTargets: js.UndefOr[Input[js.Array[Input[EventTargetRunCommandTarget]]]] = js.native
  /**
    * Parameters used when you are using the rule to invoke an Amazon SQS Queue. Documented below. A maximum of 1 are allowed.
    */
  val sqsTarget: js.UndefOr[Input[EventTargetSqsTarget]] = js.native
  /**
    * The unique target assignment ID.  If missing, will generate a random, unique id.
    */
  val targetId: js.UndefOr[Input[String]] = js.native
}

object EventTargetArgs {
  @scala.inline
  def apply(arn: Input[String], rule: Input[String]): EventTargetArgs = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTargetArgs]
  }
  @scala.inline
  implicit class EventTargetArgsOps[Self <: EventTargetArgs] (val x: Self) extends AnyVal {
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
    def setRule(value: Input[String]): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def setBatchTarget(value: Input[EventTargetBatchTarget]): Self = this.set("batchTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBatchTarget: Self = this.set("batchTarget", js.undefined)
    @scala.inline
    def setEcsTarget(value: Input[EventTargetEcsTarget]): Self = this.set("ecsTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcsTarget: Self = this.set("ecsTarget", js.undefined)
    @scala.inline
    def setInput(value: Input[String]): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setInputPath(value: Input[String]): Self = this.set("inputPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputPath: Self = this.set("inputPath", js.undefined)
    @scala.inline
    def setInputTransformer(value: Input[EventTargetInputTransformer]): Self = this.set("inputTransformer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputTransformer: Self = this.set("inputTransformer", js.undefined)
    @scala.inline
    def setKinesisTarget(value: Input[EventTargetKinesisTarget]): Self = this.set("kinesisTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesisTarget: Self = this.set("kinesisTarget", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
    @scala.inline
    def setRunCommandTargetsVarargs(value: Input[EventTargetRunCommandTarget]*): Self = this.set("runCommandTargets", js.Array(value :_*))
    @scala.inline
    def setRunCommandTargets(value: Input[js.Array[Input[EventTargetRunCommandTarget]]]): Self = this.set("runCommandTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunCommandTargets: Self = this.set("runCommandTargets", js.undefined)
    @scala.inline
    def setSqsTarget(value: Input[EventTargetSqsTarget]): Self = this.set("sqsTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSqsTarget: Self = this.set("sqsTarget", js.undefined)
    @scala.inline
    def setTargetId(value: Input[String]): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
  
}

