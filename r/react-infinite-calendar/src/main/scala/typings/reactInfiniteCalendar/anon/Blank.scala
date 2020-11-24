package typings.reactInfiniteCalendar.anon

import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`0`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`1`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`2`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`3`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`4`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`5`
import typings.reactInfiniteCalendar.reactInfiniteCalendarNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Blank extends js.Object {
  
  var blank: js.UndefOr[String] = js.native
  
  var headerFormat: js.UndefOr[String] = js.native
  
  var locale: js.UndefOr[DistanceInWords] = js.native
  
  var todayLabel: js.UndefOr[Long] = js.native
  
  var weekStartsOn: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
  
  var weekdays: js.UndefOr[js.Array[String]] = js.native
}
object Blank {
  
  @scala.inline
  def apply(): Blank = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Blank]
  }
  
  @scala.inline
  implicit class BlankOps[Self <: Blank] (val x: Self) extends AnyVal {
    
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
    def setBlank(value: String): Self = this.set("blank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlank: Self = this.set("blank", js.undefined)
    
    @scala.inline
    def setHeaderFormat(value: String): Self = this.set("headerFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFormat: Self = this.set("headerFormat", js.undefined)
    
    @scala.inline
    def setLocale(value: DistanceInWords): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setTodayLabel(value: Long): Self = this.set("todayLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayLabel: Self = this.set("todayLabel", js.undefined)
    
    @scala.inline
    def setWeekStartsOn(value: `0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("weekStartsOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekStartsOn: Self = this.set("weekStartsOn", js.undefined)
    
    @scala.inline
    def setWeekdaysVarargs(value: String*): Self = this.set("weekdays", js.Array(value :_*))
    
    @scala.inline
    def setWeekdays(value: js.Array[String]): Self = this.set("weekdays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdays: Self = this.set("weekdays", js.undefined)
  }
}
