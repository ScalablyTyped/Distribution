package typings.reactInfiniteCalendar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccentColor extends js.Object {
  
  var accentColor: js.UndefOr[String] = js.native
  
  var floatingNav: js.UndefOr[Background] = js.native
  
  var headerColor: js.UndefOr[String] = js.native
  
  var selectionColor: js.UndefOr[String] = js.native
  
  var textColor: js.UndefOr[Active] = js.native
  
  var todayColor: js.UndefOr[String] = js.native
  
  var weekdayColor: js.UndefOr[String] = js.native
}
object AccentColor {
  
  @scala.inline
  def apply(): AccentColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccentColor]
  }
  
  @scala.inline
  implicit class AccentColorOps[Self <: AccentColor] (val x: Self) extends AnyVal {
    
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
    def setAccentColor(value: String): Self = this.set("accentColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccentColor: Self = this.set("accentColor", js.undefined)
    
    @scala.inline
    def setFloatingNav(value: Background): Self = this.set("floatingNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloatingNav: Self = this.set("floatingNav", js.undefined)
    
    @scala.inline
    def setHeaderColor(value: String): Self = this.set("headerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderColor: Self = this.set("headerColor", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: String): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    
    @scala.inline
    def setTextColor(value: Active): Self = this.set("textColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextColor: Self = this.set("textColor", js.undefined)
    
    @scala.inline
    def setTodayColor(value: String): Self = this.set("todayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTodayColor: Self = this.set("todayColor", js.undefined)
    
    @scala.inline
    def setWeekdayColor(value: String): Self = this.set("weekdayColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWeekdayColor: Self = this.set("weekdayColor", js.undefined)
  }
}
