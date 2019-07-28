package typings.atPulumiAws.elasticloadbalancingv2ListenerRuleMod

import typings.atPulumiAws.Anon_AuthenticateCognitoAuthenticateOidc
import typings.atPulumiAws.Anon_FieldValues
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleState extends js.Object {
  /**
    * An Action block. Action blocks are documented below.
    */
  val actions: js.UndefOr[Input[js.Array[Input[Anon_AuthenticateCognitoAuthenticateOidc]]]] = js.undefined
  /**
    * The ARN of the rule (matches `id`)
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * A Condition block. Condition blocks are documented below.
    */
  val conditions: js.UndefOr[Input[js.Array[Input[Anon_FieldValues]]]] = js.undefined
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: js.UndefOr[Input[Double]] = js.undefined
}

object ListenerRuleState {
  @scala.inline
  def apply(
    actions: Input[js.Array[Input[Anon_AuthenticateCognitoAuthenticateOidc]]] = null,
    arn: Input[String] = null,
    conditions: Input[js.Array[Input[Anon_FieldValues]]] = null,
    listenerArn: Input[String] = null,
    priority: Input[Double] = null
  ): ListenerRuleState = {
    val __obj = js.Dynamic.literal()
    if (actions != null) __obj.updateDynamic("actions")(actions.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (conditions != null) __obj.updateDynamic("conditions")(conditions.asInstanceOf[js.Any])
    if (listenerArn != null) __obj.updateDynamic("listenerArn")(listenerArn.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleState]
  }
}

