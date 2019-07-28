package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOverrideActionPriority extends js.Object {
  var action: js.UndefOr[Input[Anon_TypeInputString]] = js.undefined
  var overrideAction: js.UndefOr[Input[Anon_TypeInputString]] = js.undefined
  var priority: Input[Double]
  var ruleId: Input[String]
  var `type`: js.UndefOr[Input[String]] = js.undefined
}

object Anon_ActionOverrideActionPriority {
  @scala.inline
  def apply(
    priority: Input[Double],
    ruleId: Input[String],
    action: Input[Anon_TypeInputString] = null,
    overrideAction: Input[Anon_TypeInputString] = null,
    `type`: Input[String] = null
  ): Anon_ActionOverrideActionPriority = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (overrideAction != null) __obj.updateDynamic("overrideAction")(overrideAction.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ActionOverrideActionPriority]
  }
}

