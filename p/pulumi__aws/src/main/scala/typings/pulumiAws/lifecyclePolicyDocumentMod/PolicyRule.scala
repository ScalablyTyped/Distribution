package typings.pulumiAws.lifecyclePolicyDocumentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyRule extends js.Object {
  /**
    * The action to perform when selection criteria is met.
    */
  var action: Action = js.native
  /**
    * An optional description for the rule.
    */
  var description: js.UndefOr[Input[String]] = js.native
  /**
    * Indicate the Rule Priority - each rule must have a different priority.
    */
  var rulePriority: Input[Double] = js.native
  /**
    * The selection criteria for the rule.
    */
  var selection: Selection = js.native
}

object PolicyRule {
  @scala.inline
  def apply(
    action: Action,
    rulePriority: Input[Double],
    selection: Selection,
    description: Input[String] = null
  ): PolicyRule = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], rulePriority = rulePriority.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyRule]
  }
}

