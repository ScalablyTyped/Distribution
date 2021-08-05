package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscriptionTracking extends StObject {
  
  def getEnable(): Boolean
  
  def getHtml(): String
  
  def getSubstitutionTag(): String
  
  def getText(): String
  
  def setEnable(enabled: Boolean): Unit
  
  def setHtml(html: String): Unit
  
  def setSubstitutionTag(substitutionTag: String): Unit
  
  def setText(text: String): Unit
  
  def toJSON(): Html
}
object SubscriptionTracking {
  
  inline def apply(
    getEnable: () => Boolean,
    getHtml: () => String,
    getSubstitutionTag: () => String,
    getText: () => String,
    setEnable: Boolean => Unit,
    setHtml: String => Unit,
    setSubstitutionTag: String => Unit,
    setText: String => Unit,
    toJSON: () => Html
  ): SubscriptionTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getHtml = js.Any.fromFunction0(getHtml), getSubstitutionTag = js.Any.fromFunction0(getSubstitutionTag), getText = js.Any.fromFunction0(getText), setEnable = js.Any.fromFunction1(setEnable), setHtml = js.Any.fromFunction1(setHtml), setSubstitutionTag = js.Any.fromFunction1(setSubstitutionTag), setText = js.Any.fromFunction1(setText), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[SubscriptionTracking]
  }
  
  extension [Self <: SubscriptionTracking](x: Self) {
    
    inline def setGetEnable(value: () => Boolean): Self = StObject.set(x, "getEnable", js.Any.fromFunction0(value))
    
    inline def setGetHtml(value: () => String): Self = StObject.set(x, "getHtml", js.Any.fromFunction0(value))
    
    inline def setGetSubstitutionTag(value: () => String): Self = StObject.set(x, "getSubstitutionTag", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    inline def setSetHtml(value: String => Unit): Self = StObject.set(x, "setHtml", js.Any.fromFunction1(value))
    
    inline def setSetSubstitutionTag(value: String => Unit): Self = StObject.set(x, "setSubstitutionTag", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => Html): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
