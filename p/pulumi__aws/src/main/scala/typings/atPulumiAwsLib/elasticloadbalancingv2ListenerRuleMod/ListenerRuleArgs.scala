package typings
package atPulumiAwsLib.elasticloadbalancingv2ListenerRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerRuleArgs extends js.Object {
  /**
    * An Action block. Action blocks are documented below.
    */
  val actions: atPulumiPulumiLib.outputMod.Input[
    js.Array[
      atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AuthenticateCognitoAuthenticateOidc]
    ]
  ]
  /**
    * A Condition block. Condition blocks are documented below.
    */
  val conditions: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_FieldValues]]]
  /**
    * The ARN of the listener to which to attach the rule.
    */
  val listenerArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The priority for the rule between `1` and `50000`. Leaving it unset will automatically set the rule with next available priority after currently existing highest rule. A listener can't have multiple rules with the same priority.
    */
  val priority: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

