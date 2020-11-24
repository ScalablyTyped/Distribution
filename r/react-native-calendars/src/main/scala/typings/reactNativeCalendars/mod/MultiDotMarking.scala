package typings.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiDotMarking extends Marking {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var dots: js.Array[CalendarDot] = js.native
  
  var selected: js.UndefOr[Boolean] = js.native
  
  var selectedColor: js.UndefOr[String] = js.native
}
object MultiDotMarking {
  
  @scala.inline
  def apply(dots: js.Array[CalendarDot]): MultiDotMarking = {
    val __obj = js.Dynamic.literal(dots = dots.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiDotMarking]
  }
  
  @scala.inline
  implicit class MultiDotMarkingOps[Self <: MultiDotMarking] (val x: Self) extends AnyVal {
    
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
    def setDotsVarargs(value: CalendarDot*): Self = this.set("dots", js.Array(value :_*))
    
    @scala.inline
    def setDots(value: js.Array[CalendarDot]): Self = this.set("dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setSelectedColor(value: String): Self = this.set("selectedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedColor: Self = this.set("selectedColor", js.undefined)
  }
}
