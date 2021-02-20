package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Footer extends StObject {
  
  def getEnable(): Boolean = js.native
  
  def getHtml(): String = js.native
  
  def getText(): String = js.native
  
  def setEnable(enabled: Boolean): Unit = js.native
  
  def setHtml(html: String): Unit = js.native
  
  def setText(text: String): Unit = js.native
  
  def toJSON(): Text = js.native
}
object Footer {
  
  @scala.inline
  def apply(
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
  implicit class FooterMutableBuilder[Self <: Footer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEnable(value: () => Boolean): Self = StObject.set(x, "getEnable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHtml(value: () => String): Self = StObject.set(x, "getHtml", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetText(value: () => String): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHtml(value: String => Unit): Self = StObject.set(x, "setHtml", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => Text): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
