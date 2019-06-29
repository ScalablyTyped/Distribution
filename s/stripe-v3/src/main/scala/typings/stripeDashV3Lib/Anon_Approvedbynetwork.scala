package typings
package stripeDashV3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Approvedbynetwork extends js.Object {
  var network_status: stripeDashV3Lib.stripeDashV3LibStrings.approved_by_network | stripeDashV3Lib.stripeDashV3LibStrings.declined_by_network | stripeDashV3Lib.stripeDashV3LibStrings.not_sent_to_network | stripeDashV3Lib.stripeDashV3LibStrings.reversed_after_approval
  var reason: stripeDashV3Lib.stripeDashV3LibStrings.highest_risk_level | stripeDashV3Lib.stripeDashV3LibStrings.elevated_risk_level | stripeDashV3Lib.stripeDashV3LibStrings.rule | scala.Null
  var risk_level: stripeDashV3Lib.stripeDashV3LibStrings.normal | stripeDashV3Lib.stripeDashV3LibStrings.elevated | stripeDashV3Lib.stripeDashV3LibStrings.highest | stripeDashV3Lib.stripeDashV3LibStrings.not_assessed | stripeDashV3Lib.stripeDashV3LibStrings.unknown
  var risk_score: scala.Double
  var rule: js.UndefOr[java.lang.String] = js.undefined
  var seller_message: java.lang.String
  var `type`: stripeDashV3Lib.stripeDashV3LibStrings.authorized | stripeDashV3Lib.stripeDashV3LibStrings.manual_review | stripeDashV3Lib.stripeDashV3LibStrings.issuer_declined | stripeDashV3Lib.stripeDashV3LibStrings.blocked | stripeDashV3Lib.stripeDashV3LibStrings.invalid
}

object Anon_Approvedbynetwork {
  @scala.inline
  def apply(
    network_status: stripeDashV3Lib.stripeDashV3LibStrings.approved_by_network | stripeDashV3Lib.stripeDashV3LibStrings.declined_by_network | stripeDashV3Lib.stripeDashV3LibStrings.not_sent_to_network | stripeDashV3Lib.stripeDashV3LibStrings.reversed_after_approval,
    risk_level: stripeDashV3Lib.stripeDashV3LibStrings.normal | stripeDashV3Lib.stripeDashV3LibStrings.elevated | stripeDashV3Lib.stripeDashV3LibStrings.highest | stripeDashV3Lib.stripeDashV3LibStrings.not_assessed | stripeDashV3Lib.stripeDashV3LibStrings.unknown,
    risk_score: scala.Double,
    seller_message: java.lang.String,
    `type`: stripeDashV3Lib.stripeDashV3LibStrings.authorized | stripeDashV3Lib.stripeDashV3LibStrings.manual_review | stripeDashV3Lib.stripeDashV3LibStrings.issuer_declined | stripeDashV3Lib.stripeDashV3LibStrings.blocked | stripeDashV3Lib.stripeDashV3LibStrings.invalid,
    reason: stripeDashV3Lib.stripeDashV3LibStrings.highest_risk_level | stripeDashV3Lib.stripeDashV3LibStrings.elevated_risk_level | stripeDashV3Lib.stripeDashV3LibStrings.rule = null,
    rule: java.lang.String = null
  ): Anon_Approvedbynetwork = {
    val __obj = js.Dynamic.literal(network_status = network_status.asInstanceOf[js.Any], risk_level = risk_level.asInstanceOf[js.Any], risk_score = risk_score, seller_message = seller_message)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[Anon_Approvedbynetwork]
  }
}

