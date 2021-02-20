package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Enable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickTracking extends StObject {
  
  def getEnable(): Boolean = js.native
  
  def getEnableText(): Boolean = js.native
  
  def setEnable(enabled: Boolean): Unit = js.native
  
  def setEnableText(enableText: Boolean): Unit = js.native
  
  def toJSON(): Enable = js.native
}
object ClickTracking {
  
  @scala.inline
  def apply(
    getEnable: () => Boolean,
    getEnableText: () => Boolean,
    setEnable: Boolean => Unit,
    setEnableText: Boolean => Unit,
    toJSON: () => Enable
  ): ClickTracking = {
    val __obj = js.Dynamic.literal(getEnable = js.Any.fromFunction0(getEnable), getEnableText = js.Any.fromFunction0(getEnableText), setEnable = js.Any.fromFunction1(setEnable), setEnableText = js.Any.fromFunction1(setEnableText), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[ClickTracking]
  }
  
  @scala.inline
  implicit class ClickTrackingMutableBuilder[Self <: ClickTracking] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEnable(value: () => Boolean): Self = StObject.set(x, "getEnable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnableText(value: () => Boolean): Self = StObject.set(x, "getEnableText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = StObject.set(x, "setEnable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnableText(value: Boolean => Unit): Self = StObject.set(x, "setEnableText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => Enable): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
