package typings.pulumiAws.wafregionalRuleMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.wafregional.RulePredicate
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleArgs extends js.Object {
  /**
    * The name or description for the Amazon CloudWatch metric of this rule.
    */
  val metricName: Input[String] = js.native
  /**
    * The name or description of the rule.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The objects to include in a rule (documented below).
    */
  val predicates: js.UndefOr[Input[js.Array[Input[RulePredicate]]]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object RuleArgs {
  @scala.inline
  def apply(metricName: Input[String]): RuleArgs = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
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
    def setMetricName(value: Input[String]): Self = this.set("metricName", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPredicatesVarargs(value: Input[RulePredicate]*): Self = this.set("predicates", js.Array(value :_*))
    @scala.inline
    def setPredicates(value: Input[js.Array[Input[RulePredicate]]]): Self = this.set("predicates", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePredicates: Self = this.set("predicates", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

