package typings.sendgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableUtmcampaign extends js.Object {
  var enable: Boolean
  var utm_campaign: String
  var utm_content: String
  var utm_medium: String
  var utm_source: String
  var utm_term: String
}

object Anon_EnableUtmcampaign {
  @scala.inline
  def apply(
    enable: Boolean,
    utm_campaign: String,
    utm_content: String,
    utm_medium: String,
    utm_source: String,
    utm_term: String
  ): Anon_EnableUtmcampaign = {
    val __obj = js.Dynamic.literal(enable = enable, utm_campaign = utm_campaign, utm_content = utm_content, utm_medium = utm_medium, utm_source = utm_source, utm_term = utm_term)
  
    __obj.asInstanceOf[Anon_EnableUtmcampaign]
  }
}

