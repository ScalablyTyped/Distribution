package typings.reactDayPicker.modifiersMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayModifiers
  extends /* other */ StringDictionary[js.UndefOr[Boolean]] {
  
  var outside: js.UndefOr[Boolean] = js.native
  
  var today: js.UndefOr[Boolean] = js.native
}
object DayModifiers {
  
  @scala.inline
  def apply(): DayModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayModifiers]
  }
  
  @scala.inline
  implicit class DayModifiersOps[Self <: DayModifiers] (val x: Self) extends AnyVal {
    
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
    def setOutside(value: Boolean): Self = this.set("outside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutside: Self = this.set("outside", js.undefined)
    
    @scala.inline
    def setToday(value: Boolean): Self = this.set("today", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToday: Self = this.set("today", js.undefined)
  }
}
