package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Footer extends StObject {
  
  def getEnable(): Boolean
  
  def getHtml(): String
  
  def getText(): String
  
  def setEnable(enabled: Boolean): Unit
  
  def setHtml(html: String): Unit
  
  def setText(text: String): Unit
  
  def toJSON(): Text
}
object Footer {
  
  inline def apply(
    getEnable: () => Boolean,
    getHtml: () => String,
    getText: () => String,
    setEnable: Boolean => Unit,
    setHtml: String => Unit,
    setText: String => Unit,
    toJSON: () => Text
  ): Footer = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getHtml = js.Any.fromFunction0(getHtml), getText = js.Any.fromFunction0(getText), setEnable = js.Any.fromFunction1(setEnable), setHtml = js.Any.fromFunction1(setHtml), setText = js.Any.fromFunction1(setText), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[Footer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Footer] (val x: Self) extends AnyVal {
    
    inline def setGetEnable(value: () => Boolean): Self = StObject.set(x, "getEnable", js.Any.fromFunction0(value))
    
    inline def setGetHtml(value: () => String): Self = StObject.set(x, "getHtml", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    inline def setSetHtml(value: String => Unit): Self = StObject.set(x, "setHtml", js.Any.fromFunction1(value))
    
    inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    inline def setToJSON(value: () => Text): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
