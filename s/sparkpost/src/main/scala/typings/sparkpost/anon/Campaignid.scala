package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Campaignid extends StObject {
  
  var campaign_id: js.UndefOr[String] = js.undefined
  
  var template_id: js.UndefOr[String] = js.undefined
}
object Campaignid {
  
  @scala.inline
  def apply(): Campaignid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaignid]
  }
  
  @scala.inline
  implicit class CampaignidMutableBuilder[Self <: Campaignid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCampaign_id(value: String): Self = StObject.set(x, "campaign_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCampaign_idUndefined: Self = StObject.set(x, "campaign_id", js.undefined)
    
    @scala.inline
    def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate_idUndefined: Self = StObject.set(x, "template_id", js.undefined)
  }
}
