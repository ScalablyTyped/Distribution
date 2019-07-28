package typings.atPulumiAws.ecrLifecyclePolicyDocumentMod

import typings.atPulumiPulumi.outputMod.Input
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
  var description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Indicate the Rule Priority - each rule must have a different priority.
    */
  var rulePriority: Input[Double]
  /**
    * The selection criteria for the rule.
    */
  var selection: Selection
}

object PolicyRule {
  @scala.inline
  def apply(
    action: Action,
    rulePriority: Input[Double],
    selection: Selection,
    description: Input[String] = null
  ): PolicyRule = {
    val __obj = js.Dynamic.literal(action = action, rulePriority = rulePriority.asInstanceOf[js.Any], selection = selection)
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRule]
  }
}

