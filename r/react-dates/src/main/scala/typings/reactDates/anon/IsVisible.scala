package typings.reactDates.anon

import typings.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsVisible extends js.Object {
  
  var isVisible: Boolean = js.native
  
  var month: Moment = js.native
  
  def onMonthSelect(currentMonth: Moment, newMonthVal: String): Unit = js.native
  
  def onYearSelect(currentMonth: Moment, newMonthVal: String): Unit = js.native
}
object IsVisible {
  
  @scala.inline
  def apply(
    isVisible: Boolean,
    month: Moment,
    onMonthSelect: (Moment, String) => Unit,
    onYearSelect: (Moment, String) => Unit
  ): IsVisible = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], onMonthSelect = js.Any.fromFunction2(onMonthSelect), onYearSelect = js.Any.fromFunction2(onYearSelect))
    __obj.asInstanceOf[IsVisible]
  }
  
  @scala.inline
  implicit class IsVisibleOps[Self <: IsVisible] (val x: Self) extends AnyVal {
    
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
    def setIsVisible(value: Boolean): Self = this.set("isVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonth(value: Moment): Self = this.set("month", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnMonthSelect(value: (Moment, String) => Unit): Self = this.set("onMonthSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnYearSelect(value: (Moment, String) => Unit): Self = this.set("onYearSelect", js.Any.fromFunction2(value))
  }
}
