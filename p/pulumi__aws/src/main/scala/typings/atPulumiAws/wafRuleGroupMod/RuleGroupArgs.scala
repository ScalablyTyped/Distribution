package typings.atPulumiAws.wafRuleGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesInputMod.waf.RuleGroupActivatedRule
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleGroupArgs extends js.Object {
  /**
    * A list of activated rules, see below
    */
  val activatedRules: js.UndefOr[Input[js.Array[Input[RuleGroupActivatedRule]]]] = js.native
  /**
    * A friendly name for the metrics from the rule group
    */
  val metricName: Input[String] = js.native
  /**
    * A friendly name of the rule group
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object RuleGroupArgs {
  @scala.inline
  def apply(
    metricName: Input[String],
    activatedRules: Input[js.Array[Input[RuleGroupActivatedRule]]] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): RuleGroupArgs = {
    val __obj = js.Dynamic.literal(metricName = metricName.asInstanceOf[js.Any])
    if (activatedRules != null) __obj.updateDynamic("activatedRules")(activatedRules.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupArgs]
  }
}

