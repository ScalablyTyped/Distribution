package typings.strftime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locale extends js.Object {
  
  var AM: js.UndefOr[String] = js.native
  
  var PM: js.UndefOr[String] = js.native
  
  var am: js.UndefOr[String] = js.native
  
  var days: js.UndefOr[js.Array[String]] = js.native
  
  var formats: LocaleFormats = js.native
  
  var months: js.UndefOr[js.Array[String]] = js.native
  
  var pm: js.UndefOr[String] = js.native
  
  var shortDays: js.UndefOr[js.Array[String]] = js.native
  
  var shortMonths: js.UndefOr[js.Array[String]] = js.native
}
object Locale {
  
  @scala.inline
  def apply(formats: LocaleFormats): Locale = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    
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
    def setFormats(value: LocaleFormats): Self = this.set("formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAM(value: String): Self = this.set("AM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAM: Self = this.set("AM", js.undefined)
    
    @scala.inline
    def setPM(value: String): Self = this.set("PM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePM: Self = this.set("PM", js.undefined)
    
    @scala.inline
    def setDaysVarargs(value: String*): Self = this.set("days", js.Array(value :_*))
    
    @scala.inline
    def setDays(value: js.Array[String]): Self = this.set("days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDays: Self = this.set("days", js.undefined)
    
    @scala.inline
    def setMonthsVarargs(value: String*): Self = this.set("months", js.Array(value :_*))
    
    @scala.inline
    def setMonths(value: js.Array[String]): Self = this.set("months", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonths: Self = this.set("months", js.undefined)
    
    @scala.inline
    def setShortDaysVarargs(value: String*): Self = this.set("shortDays", js.Array(value :_*))
    
    @scala.inline
    def setShortDays(value: js.Array[String]): Self = this.set("shortDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortDays: Self = this.set("shortDays", js.undefined)
    
    @scala.inline
    def setShortMonthsVarargs(value: String*): Self = this.set("shortMonths", js.Array(value :_*))
    
    @scala.inline
    def setShortMonths(value: js.Array[String]): Self = this.set("shortMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShortMonths: Self = this.set("shortMonths", js.undefined)
  }
}
