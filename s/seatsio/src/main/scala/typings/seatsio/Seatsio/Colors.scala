package typings.seatsio.Seatsio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Colors extends js.Object {
  
  var colorSelected: js.UndefOr[String] = js.native
  
  var colorTitle: js.UndefOr[String] = js.native
  
  var cursorTooltipBackgroundColor: js.UndefOr[String] = js.native
}
object Colors {
  
  @scala.inline
  def apply(): Colors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit class ColorsOps[Self <: Colors] (val x: Self) extends AnyVal {
    
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
    def setColorSelected(value: String): Self = this.set("colorSelected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSelected: Self = this.set("colorSelected", js.undefined)
    
    @scala.inline
    def setColorTitle(value: String): Self = this.set("colorTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorTitle: Self = this.set("colorTitle", js.undefined)
    
    @scala.inline
    def setCursorTooltipBackgroundColor(value: String): Self = this.set("cursorTooltipBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorTooltipBackgroundColor: Self = this.set("cursorTooltipBackgroundColor", js.undefined)
  }
}
