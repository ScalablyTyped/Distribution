package typings
package sendgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnableUtmcampaign extends js.Object {
  var enable: scala.Boolean
  var utm_campaign: java.lang.String
  var utm_content: java.lang.String
  var utm_medium: java.lang.String
  var utm_source: java.lang.String
  var utm_term: java.lang.String
}

object Anon_EnableUtmcampaign {
  @scala.inline
  def apply(
    enable: scala.Boolean,
    utm_campaign: java.lang.String,
    utm_content: java.lang.String,
    utm_medium: java.lang.String,
    utm_source: java.lang.String,
    utm_term: java.lang.String
  ): Anon_EnableUtmcampaign = {
    val __obj = js.Dynamic.literal(enable = enable, utm_campaign = utm_campaign, utm_content = utm_content, utm_medium = utm_medium, utm_source = utm_source, utm_term = utm_term)
  
    __obj.asInstanceOf[Anon_EnableUtmcampaign]
  }
}

