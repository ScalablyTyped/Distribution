package typings.atPulumiAws.lbListenerRuleMod

import typings.atPulumiAws.typesInputMod.lb.ListenerRuleAction
import typings.atPulumiAws.typesInputMod.lb.ListenerRuleCondition
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleArgs extends js.Object {
  /**
    * An Action block. Action blocks are documented below.
    */
  val actions: Input[js.Array[Input[ListenerRuleAction]]]
  /**
    * A Condition block. Condition blocks are documented below.
    */
  val conditions: Input[js.Array[Input[ListenerRuleCondition]]]
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: Input[String]
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: js.UndefOr[Input[Double]] = js.undefined
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

