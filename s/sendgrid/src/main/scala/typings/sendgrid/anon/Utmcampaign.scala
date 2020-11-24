package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Utmcampaign extends js.Object {
  
  var enable: Boolean = js.native
  
  var utm_campaign: String = js.native
  
  var utm_content: String = js.native
  
  var utm_medium: String = js.native
  
  var utm_source: String = js.native
  
  var utm_term: String = js.native
}
object Utmcampaign {
  
  @scala.inline
  def apply(
    enable: Boolean,
    utm_campaign: String,
    utm_content: String,
    utm_medium: String,
    utm_source: String,
    utm_term: String
  ): Utmcampaign = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], utm_campaign = utm_campaign.asInstanceOf[js.Any], utm_content = utm_content.asInstanceOf[js.Any], utm_medium = utm_medium.asInstanceOf[js.Any], utm_source = utm_source.asInstanceOf[js.Any], utm_term = utm_term.asInstanceOf[js.Any])
    __obj.asInstanceOf[Utmcampaign]
  }
  
  @scala.inline
  implicit class UtmcampaignOps[Self <: Utmcampaign] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnable(value: Boolean): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtm_campaign(value: String): Self = this.set("utm_campaign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtm_content(value: String): Self = this.set("utm_content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtm_medium(value: String): Self = this.set("utm_medium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtm_source(value: String): Self = this.set("utm_source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUtm_term(value: String): Self = this.set("utm_term", value.asInstanceOf[js.Any])
  }
}
