package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionPriority extends js.Object {
  var action: Anon_TypeString
  var priority: scala.Double
  var ruleId: java.lang.String
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_ActionPriority {
  @scala.inline
  def apply(
    action: Anon_TypeString,
    priority: scala.Double,
    ruleId: java.lang.String,
    `type`: java.lang.String = null
  ): Anon_ActionPriority = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("action")(action)
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("ruleId")(ruleId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ActionPriority]
  }
}

