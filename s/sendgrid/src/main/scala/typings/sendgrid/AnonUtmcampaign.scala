package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUtmcampaign extends js.Object {
  var enable: Boolean
  var utm_campaign: String
  var utm_content: String
  var utm_medium: String
  var utm_source: String
  var utm_term: String
}

object AnonUtmcampaign {
  @scala.inline
  def apply(
    enable: Boolean,
    utm_campaign: String,
    utm_content: String,
    utm_medium: String,
    utm_source: String,
    utm_term: String
  ): AnonUtmcampaign = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], utm_campaign = utm_campaign.asInstanceOf[js.Any], utm_content = utm_content.asInstanceOf[js.Any], utm_medium = utm_medium.asInstanceOf[js.Any], utm_source = utm_source.asInstanceOf[js.Any], utm_term = utm_term.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonUtmcampaign]
  }
}

