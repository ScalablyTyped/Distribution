package typings
package atPulumiAwsLib.ecrLifecyclePolicyDocumentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyRule extends js.Object {
  /**
    * The action to perform when selection criteria is met.
    */
  var action: Action
  /**
    * An optional description for the rule.
    */
  var description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Indicate the Rule Priority - each rule must have a different priority.
    */
  var rulePriority: atPulumiPulumiLib.outputMod.Input[scala.Double]
  /**
    * The selection criteria for the rule.
    */
  var selection: Selection
}

object PolicyRule {
  @scala.inline
  def apply(
    action: Action,
    rulePriority: atPulumiPulumiLib.outputMod.Input[scala.Double],
    selection: Selection,
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): PolicyRule = {
    val __obj = js.Dynamic.literal(action = action, rulePriority = rulePriority.asInstanceOf[js.Any], selection = selection)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRule]
  }
}

