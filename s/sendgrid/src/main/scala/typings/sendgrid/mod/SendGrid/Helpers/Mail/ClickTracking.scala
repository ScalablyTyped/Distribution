package typings.sendgrid.mod.SendGrid.Helpers.Mail

import typings.sendgrid.anon.Enable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClickTracking extends js.Object {
  
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
  implicit class ClickTrackingOps[Self <: ClickTracking] (val x: Self) extends AnyVal {
    
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
    def setGetEnable(value: () => Boolean): Self = this.set("getEnable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnableText(value: () => Boolean): Self = this.set("getEnableText", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetEnable(value: Boolean => Unit): Self = this.set("setEnable", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnableText(value: Boolean => Unit): Self = this.set("setEnableText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToJSON(value: () => Enable): Self = this.set("toJSON", js.Any.fromFunction0(value))
  }
}
