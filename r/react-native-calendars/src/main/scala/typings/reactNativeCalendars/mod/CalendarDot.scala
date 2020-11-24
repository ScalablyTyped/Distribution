package typings.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CalendarDot extends js.Object {
  
  var color: String = js.native
  
  var key: String = js.native
  
  var selectedDotColor: js.UndefOr[String] = js.native
}
object CalendarDot {
  
  @scala.inline
  def apply(color: String, key: String): CalendarDot = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDot]
  }
  
  @scala.inline
  implicit class CalendarDotOps[Self <: CalendarDot] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedDotColor(value: String): Self = this.set("selectedDotColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDotColor: Self = this.set("selectedDotColor", js.undefined)
  }
}
