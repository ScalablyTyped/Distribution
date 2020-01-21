package typings.pulumiAws.ruleGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.wafregional.RuleGroupActivatedRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleGroupState extends js.Object {
  /**
    * A list of activated rules, see below
    */
  val activatedRules: js.UndefOr[Input[js.Array[Input[RuleGroupActivatedRule]]]] = js.native
  /**
    * The ARN of the WAF Regional Rule Group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A friendly name for the metrics from the rule group
    */
  val metricName: js.UndefOr[Input[String]] = js.native
  /**
    * A friendly name of the rule group
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RuleGroupState {
  @scala.inline
  def apply(
    activatedRules: Input[js.Array[Input[RuleGroupActivatedRule]]] = null,
    arn: Input[String] = null,
    metricName: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): RuleGroupState = {
    val __obj = js.Dynamic.literal()
    if (activatedRules != null) __obj.updateDynamic("activatedRules")(activatedRules.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupState]
  }
}

