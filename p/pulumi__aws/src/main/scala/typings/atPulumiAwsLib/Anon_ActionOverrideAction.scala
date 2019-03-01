package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOverrideAction extends js.Object {
  var action: js.UndefOr[Anon_TypeString] = js.undefined
  var overrideAction: js.UndefOr[Anon_TypeString] = js.undefined
  var priority: scala.Double
  var ruleId: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ActionOverrideAction {
  @scala.inline
  def apply(
    priority: scala.Double,
    ruleId: java.lang.String,
    action: Anon_TypeString = null,
    overrideAction: Anon_TypeString = null,
    `type`: java.lang.String = null
  ): Anon_ActionOverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("ruleId")(ruleId)
    if (action != null) __obj.updateDynamic("action")(action)
    if (overrideAction != null) __obj.updateDynamic("overrideAction")(overrideAction)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ActionOverrideAction]
  }
}

