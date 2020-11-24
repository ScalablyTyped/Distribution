package typings.rmcCalendar.confirmPanelMod

import typings.rmcCalendar.dataTypesMod.Models.Locale
import typings.rmcCalendar.rmcCalendarStrings.one
import typings.rmcCalendar.rmcCalendarStrings.range
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmPanelPropsType extends js.Object {
  
  var disableBtn: js.UndefOr[Boolean] = js.native
  
  var endDateTime: js.UndefOr[Date] = js.native
  
  var formatStr: js.UndefOr[String] = js.native
  
  var locale: Locale = js.native
  
  def onConfirm(): Unit = js.native
  
  var onlyConfirm: js.UndefOr[Boolean] = js.native
  
  var startDateTime: js.UndefOr[Date] = js.native
  
  var `type`: js.UndefOr[one | range] = js.native
}
object ConfirmPanelPropsType {
  
  @scala.inline
  def apply(locale: Locale, onConfirm: () => Unit): ConfirmPanelPropsType = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], onConfirm = js.Any.fromFunction0(onConfirm))
    __obj.asInstanceOf[ConfirmPanelPropsType]
  }
  
  @scala.inline
  implicit class ConfirmPanelPropsTypeOps[Self <: ConfirmPanelPropsType] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnConfirm(value: () => Unit): Self = this.set("onConfirm", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisableBtn(value: Boolean): Self = this.set("disableBtn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableBtn: Self = this.set("disableBtn", js.undefined)
    
    @scala.inline
    def setEndDateTime(value: Date): Self = this.set("endDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDateTime: Self = this.set("endDateTime", js.undefined)
    
    @scala.inline
    def setFormatStr(value: String): Self = this.set("formatStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatStr: Self = this.set("formatStr", js.undefined)
    
    @scala.inline
    def setOnlyConfirm(value: Boolean): Self = this.set("onlyConfirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyConfirm: Self = this.set("onlyConfirm", js.undefined)
    
    @scala.inline
    def setStartDateTime(value: Date): Self = this.set("startDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDateTime: Self = this.set("startDateTime", js.undefined)
    
    @scala.inline
    def setType(value: one | range): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
