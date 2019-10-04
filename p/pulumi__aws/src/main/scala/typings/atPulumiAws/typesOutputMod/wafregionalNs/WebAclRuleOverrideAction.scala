package typings.atPulumiAws.typesOutputMod.wafregionalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebAclRuleOverrideAction extends js.Object {
  /**
    * Specifies how you want AWS WAF Regional to respond to requests that match the settings in a rule. e.g. `ALLOW`, `BLOCK` or `COUNT`
    */
  var `type`: String
}

object WebAclRuleOverrideAction {
  @scala.inline
  def apply(`type`: String): WebAclRuleOverrideAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WebAclRuleOverrideAction]
  }
}

