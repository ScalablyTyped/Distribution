package typings.reactAlert.mod

import typings.reactAlert.reactAlertStrings.`bottom center`
import typings.reactAlert.reactAlertStrings.`bottom left`
import typings.reactAlert.reactAlertStrings.`bottom right`
import typings.reactAlert.reactAlertStrings.`middle left`
import typings.reactAlert.reactAlertStrings.`middle right`
import typings.reactAlert.reactAlertStrings.`top center`
import typings.reactAlert.reactAlertStrings.`top left`
import typings.reactAlert.reactAlertStrings.`top right`
import typings.reactAlert.reactAlertStrings.middle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Positions_ extends js.Object {
  
  var BOTTOM_CENTER: `bottom center` = js.native
  
  var BOTTOM_LEFT: `bottom left` = js.native
  
  var BOTTOM_RIGHT: `bottom right` = js.native
  
  var MIDDLE: middle = js.native
  
  var MIDDLE_LEFT: `middle left` = js.native
  
  var MIDDLE_RIGHT: `middle right` = js.native
  
  var TOP_CENTER: `top center` = js.native
  
  var TOP_LEFT: `top left` = js.native
  
  var TOP_RIGHT: `top right` = js.native
}
object Positions_ {
  
  @scala.inline
  def apply(
    BOTTOM_CENTER: `bottom center`,
    BOTTOM_LEFT: `bottom left`,
    BOTTOM_RIGHT: `bottom right`,
    MIDDLE: middle,
    MIDDLE_LEFT: `middle left`,
    MIDDLE_RIGHT: `middle right`,
    TOP_CENTER: `top center`,
    TOP_LEFT: `top left`,
    TOP_RIGHT: `top right`
  ): Positions_ = {
    val __obj = js.Dynamic.literal(BOTTOM_CENTER = BOTTOM_CENTER.asInstanceOf[js.Any], BOTTOM_LEFT = BOTTOM_LEFT.asInstanceOf[js.Any], BOTTOM_RIGHT = BOTTOM_RIGHT.asInstanceOf[js.Any], MIDDLE = MIDDLE.asInstanceOf[js.Any], MIDDLE_LEFT = MIDDLE_LEFT.asInstanceOf[js.Any], MIDDLE_RIGHT = MIDDLE_RIGHT.asInstanceOf[js.Any], TOP_CENTER = TOP_CENTER.asInstanceOf[js.Any], TOP_LEFT = TOP_LEFT.asInstanceOf[js.Any], TOP_RIGHT = TOP_RIGHT.asInstanceOf[js.Any])
    __obj.asInstanceOf[Positions_]
  }
  
  @scala.inline
  implicit class Positions_Ops[Self <: Positions_] (val x: Self) extends AnyVal {
    
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
    def setBOTTOM_CENTER(value: `bottom center`): Self = this.set("BOTTOM_CENTER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBOTTOM_LEFT(value: `bottom left`): Self = this.set("BOTTOM_LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBOTTOM_RIGHT(value: `bottom right`): Self = this.set("BOTTOM_RIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIDDLE(value: middle): Self = this.set("MIDDLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIDDLE_LEFT(value: `middle left`): Self = this.set("MIDDLE_LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMIDDLE_RIGHT(value: `middle right`): Self = this.set("MIDDLE_RIGHT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOP_CENTER(value: `top center`): Self = this.set("TOP_CENTER", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOP_LEFT(value: `top left`): Self = this.set("TOP_LEFT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTOP_RIGHT(value: `top right`): Self = this.set("TOP_RIGHT", value.asInstanceOf[js.Any])
  }
}
