package typings.pulumiAws.ruleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.cfg.RuleScope
import typings.pulumiAws.inputMod.cfg.RuleSource
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleArgs extends js.Object {
  /**
    * Description of the rule
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A string in JSON format that is passed to the AWS Config rule Lambda function.
    */
  val inputParameters: js.UndefOr[Input[String]] = js.native
  /**
    * The frequency that you want AWS Config to run evaluations for a rule that
    * is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
    */
  val maximumExecutionFrequency: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the rule
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Scope defines which resources can trigger an evaluation for the rule as documented below.
    */
  val scope: js.UndefOr[Input[RuleScope]] = js.native
  /**
    * Source specifies the rule owner, the rule identifier, and the notifications that cause
    * the function to evaluate your AWS resources as documented below.
    */
  val source: Input[RuleSource] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object RuleArgs {
  @scala.inline
  def apply(source: Input[RuleSource]): RuleArgs = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleArgs]
  }
  @scala.inline
  implicit class RuleArgsOps[Self <: RuleArgs] (val x: Self) extends AnyVal {
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
    def setSource(value: Input[RuleSource]): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setInputParameters(value: Input[String]): Self = this.set("inputParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputParameters: Self = this.set("inputParameters", js.undefined)
    @scala.inline
    def setMaximumExecutionFrequency(value: Input[String]): Self = this.set("maximumExecutionFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumExecutionFrequency: Self = this.set("maximumExecutionFrequency", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setScope(value: Input[RuleScope]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

