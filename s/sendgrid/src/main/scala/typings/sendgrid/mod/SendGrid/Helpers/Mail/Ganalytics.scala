package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Utmcampaign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ganalytics extends StObject {
  
  def getContent(): String
  
  def getEnable(): Boolean
  
  def getUrmMedium(): String
  
  def getUrmTerm(): String
  
  def getUtmCampaign(): String
  
  def getUtmSource(): String
  
  def setContent(content: String): Unit
  
  def setEnable(enabled: Boolean): Unit
  
  def setUrmMedium(medium: String): Unit
  
  def setUrmTerm(term: String): Unit
  
  def setUtmCampaign(campaign: String): Unit
  
  def setUtmSource(source: String): Unit
  
  def toJSON(): Utmcampaign
}
object Ganalytics {
  
  inline def apply(
    getContent: () => String,
    getEnable: () => Boolean,
    getUrmMedium: () => String,
    getUrmTerm: () => String,
    getUtmCampaign: () => String,
    getUtmSource: () => String,
    setContent: String => Unit,
    setEnable: Boolean => Unit,
    setUrmMedium: String => Unit,
    setUrmTerm: String => Unit,
    setUtmCampaign: String => Unit,
    setUtmSource: String => Unit,
    toJSON: () => Utmcampaign
  ): Ganalytics = {
    val __obj = js.Dynamic.literal(getContent = js.Any.fromFunction0(getContent), getEnable = js.Any.fromFunction0(getEnable), getUrmMedium = js.Any.fromFunction0(getUrmMedium), getUrmTerm = js.Any.fromFunction0(getUrmTerm), getUtmCampaign = js.Any.fromFunction0(getUtmCampaign), getUtmSource = js.Any.fromFunction0(getUtmSource), setContent = js.Any.fromFunction1(setContent), setEnable = js.Any.fromFunction1(setEnable), setUrmMedium = js.Any.fromFunction1(setUrmMedium), setUrmTerm = js.Any.fromFunction1(setUrmTerm), setUtmCampaign = js.Any.fromFunction1(setUtmCampaign), setUtmSource = js.Any.fromFunction1(setUtmSource), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Ganalytics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ganalytics] (val x: Self) extends AnyVal {
    
    inline def setGetContent(value: () => String): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
    
    inline def setGetEnable(value: () => Boolean): Self = StObject.set(x, "getEnable", js.Any.fromFunction0(value))
    
    inline def setGetUrmMedium(value: () => String): Self = StObject.set(x, "getUrmMedium", js.Any.fromFunction0(value))
    
    inline def setGetUrmTerm(value: () => String): Self = StObject.set(x, "getUrmTerm", js.Any.fromFunction0(value))
    
    inline def setGetUtmCampaign(value: () => String): Self = StObject.set(x, "getUtmCampaign", js.Any.fromFunction0(value))
    
    inline def setGetUtmSource(value: () => String): Self = StObject.set(x, "getUtmSource", js.Any.fromFunction0(value))
    
    inline def setSetContent(value: String => Unit): Self = StObject.set(x, "setContent", js.Any.fromFunction1(value))
    
    inline def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    inline def setSetUrmMedium(value: String => Unit): Self = StObject.set(x, "setUrmMedium", js.Any.fromFunction1(value))
    
    inline def setSetUrmTerm(value: String => Unit): Self = StObject.set(x, "setUrmTerm", js.Any.fromFunction1(value))
    
    inline def setSetUtmCampaign(value: String => Unit): Self = StObject.set(x, "setUtmCampaign", js.Any.fromFunction1(value))
    
    inline def setSetUtmSource(value: String => Unit): Self = StObject.set(x, "setUtmSource", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => Utmcampaign): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
