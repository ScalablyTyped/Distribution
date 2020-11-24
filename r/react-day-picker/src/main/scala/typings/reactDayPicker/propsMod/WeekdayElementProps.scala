package typings.reactDayPicker.propsMod

import typings.reactDayPicker.localeUtilsMod.LocaleUtils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeekdayElementProps extends js.Object {
  
  var className: String = js.native
  
  var locale: String = js.native
  
  var localeUtils: LocaleUtils = js.native
  
  var weekday: Double = js.native
  
  var weekdaysLong: js.UndefOr[js.Array[String]] = js.native
  
  var weekdaysShort: js.UndefOr[js.Array[String]] = js.native
}
object WeekdayElementProps {
  
  @scala.inline
  def apply(className: String, locale: String, localeUtils: LocaleUtils, weekday: Double): WeekdayElementProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], localeUtils = localeUtils.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeekdayElementProps]
  }
  
  @scala.inline
  implicit class WeekdayElementPropsOps[Self <: WeekdayElementProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUtils(value: LocaleUtils): Self = this.set("localeUtils", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekday(value: Double): Self = this.set("weekday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeekdaysLongVarargs(value: String*): Self = this.set("weekdaysLong", js.Array(value :_*))
    
    @scala.inline
    def setWeekdaysLong(value: js.Array[String]): Self = this.set("weekdaysLong", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdaysLong: Self = this.set("weekdaysLong", js.undefined)
    
    @scala.inline
    def setWeekdaysShortVarargs(value: String*): Self = this.set("weekdaysShort", js.Array(value :_*))
    
    @scala.inline
    def setWeekdaysShort(value: js.Array[String]): Self = this.set("weekdaysShort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdaysShort: Self = this.set("weekdaysShort", js.undefined)
  }
}
