package typings.pulumiAws.listenerRuleMod

import typings.pulumiAws.inputMod.alb.ListenerRuleAction
import typings.pulumiAws.inputMod.alb.ListenerRuleCondition
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerRuleArgs extends js.Object {
  /**
    * An Action block. Action blocks are documented below.
    */
  val actions: Input[js.Array[Input[ListenerRuleAction]]] = js.native
  /**
    * A Condition block. Multiple condition blocks of different types can be set and all must be satisfied for the rule to match. Condition blocks are documented below.
    */
  val conditions: Input[js.Array[Input[ListenerRuleCondition]]] = js.native
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: Input[String] = js.native
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: js.UndefOr[Input[Double]] = js.native
}

object ListenerRuleArgs {
  @scala.inline
  def apply(
    actions: Input[js.Array[Input[ListenerRuleAction]]],
    conditions: Input[js.Array[Input[ListenerRuleCondition]]],
    listenerArn: Input[String],
    priority: Input[Double] = null
  ): ListenerRuleArgs = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], conditions = conditions.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleArgs]
  }
}

