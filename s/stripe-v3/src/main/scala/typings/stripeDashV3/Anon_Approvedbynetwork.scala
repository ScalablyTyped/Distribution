package typings.stripeDashV3

import typings.stripeDashV3.stripeDashV3Strings.approved_by_network
import typings.stripeDashV3.stripeDashV3Strings.authorized
import typings.stripeDashV3.stripeDashV3Strings.blocked
import typings.stripeDashV3.stripeDashV3Strings.declined_by_network
import typings.stripeDashV3.stripeDashV3Strings.elevated
import typings.stripeDashV3.stripeDashV3Strings.elevated_risk_level
import typings.stripeDashV3.stripeDashV3Strings.highest
import typings.stripeDashV3.stripeDashV3Strings.highest_risk_level
import typings.stripeDashV3.stripeDashV3Strings.invalid
import typings.stripeDashV3.stripeDashV3Strings.issuer_declined
import typings.stripeDashV3.stripeDashV3Strings.manual_review
import typings.stripeDashV3.stripeDashV3Strings.normal
import typings.stripeDashV3.stripeDashV3Strings.not_assessed
import typings.stripeDashV3.stripeDashV3Strings.not_sent_to_network
import typings.stripeDashV3.stripeDashV3Strings.reversed_after_approval
import typings.stripeDashV3.stripeDashV3Strings.rule
import typings.stripeDashV3.stripeDashV3Strings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Approvedbynetwork extends js.Object {
  var network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval
  var reason: highest_risk_level | elevated_risk_level | rule | Null
  var risk_level: normal | elevated | highest | not_assessed | unknown
  var risk_score: Double
  var rule: js.UndefOr[String] = js.undefined
  var seller_message: String
  var `type`: authorized | manual_review | issuer_declined | blocked | invalid
}

object Anon_Approvedbynetwork {
  @scala.inline
  def apply(
    network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval,
    risk_level: normal | elevated | highest | not_assessed | unknown,
    risk_score: Double,
    seller_message: String,
    `type`: authorized | manual_review | issuer_declined | blocked | invalid,
    reason: highest_risk_level | elevated_risk_level | rule = null,
    rule: String = null
  ): Anon_Approvedbynetwork = {
    val __obj = js.Dynamic.literal(network_status = network_status.asInstanceOf[js.Any], risk_level = risk_level.asInstanceOf[js.Any], risk_score = risk_score, seller_message = seller_message)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[Anon_Approvedbynetwork]
  }
}

