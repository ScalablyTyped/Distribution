package typings.sparkpost.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Campaignid extends StObject {
  
  var campaign_id: js.UndefOr[String] = js.undefined
  
  var template_id: js.UndefOr[String] = js.undefined
}
object Campaignid {
  
  inline def apply(): Campaignid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Campaignid]
  }
  
  extension [Self <: Campaignid](x: Self) {
    
    inline def setCampaign_id(value: String): Self = StObject.set(x, "campaign_id", value.asInstanceOf[js.Any])
    
    inline def setCampaign_idUndefined: Self = StObject.set(x, "campaign_id", js.undefined)
    
    inline def setTemplate_id(value: String): Self = StObject.set(x, "template_id", value.asInstanceOf[js.Any])
    
    inline def setTemplate_idUndefined: Self = StObject.set(x, "template_id", js.undefined)
  }
}
