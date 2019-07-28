package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionPriority extends js.Object {
  var action: Anon_TypeString
  var priority: Double
  var ruleId: String
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_ActionPriority {
  @scala.inline
  def apply(action: Anon_TypeString, priority: Double, ruleId: String, `type`: String = null): Anon_ActionPriority = {
    val __obj = js.Dynamic.literal(action = action, priority = priority, ruleId = ruleId)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ActionPriority]
  }
}

