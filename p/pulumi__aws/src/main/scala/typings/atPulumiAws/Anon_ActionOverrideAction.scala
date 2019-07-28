package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOverrideAction extends js.Object {
  var action: js.UndefOr[Anon_TypeString] = js.undefined
  var overrideAction: js.UndefOr[Anon_TypeString] = js.undefined
  var priority: Double
  var ruleId: String
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_ActionOverrideAction {
  @scala.inline
  def apply(
    priority: Double,
    ruleId: String,
    action: Anon_TypeString = null,
    overrideAction: Anon_TypeString = null,
    `type`: String = null
  ): Anon_ActionOverrideAction = {
    val __obj = js.Dynamic.literal(priority = priority, ruleId = ruleId)
    if (action != null) __obj.updateDynamic("action")(action)
    if (overrideAction != null) __obj.updateDynamic("overrideAction")(overrideAction)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ActionOverrideAction]
  }
}

