package typings
package atPulumiAwsLib.applicationloadbalancingListenerRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleState extends js.Object {
  /**
    * An Action block. Action blocks are documented below.
    */
  val actions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuthenticateCognitoAuthenticateOidc]
      ]
    ]
  ] = js.undefined
  /**
    * The ARN of the rule (matches `id`)
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A Condition block. Condition blocks are documented below.
    */
  val conditions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldValues]]]
  ] = js.undefined
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

