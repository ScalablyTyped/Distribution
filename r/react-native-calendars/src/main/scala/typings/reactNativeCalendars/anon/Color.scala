package typings.reactNativeCalendars.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Color extends js.Object {
  
  var color: js.UndefOr[String] = js.native
  
  var endingDay: js.UndefOr[Boolean] = js.native
  
  var startingDay: js.UndefOr[Boolean] = js.native
}
object Color {
  
  @scala.inline
  def apply(): Color = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Color]
  }
  
  @scala.inline
  implicit class ColorOps[Self <: Color] (val x: Self) extends AnyVal {
    
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
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setEndingDay(value: Boolean): Self = this.set("endingDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndingDay: Self = this.set("endingDay", js.undefined)
    
    @scala.inline
    def setStartingDay(value: Boolean): Self = this.set("startingDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingDay: Self = this.set("startingDay", js.undefined)
  }
}
