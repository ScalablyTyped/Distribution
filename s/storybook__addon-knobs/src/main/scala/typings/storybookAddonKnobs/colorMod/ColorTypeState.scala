package typings.storybookAddonKnobs.colorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColorTypeState extends js.Object {
  
  var displayColorPicker: Boolean = js.native
}
object ColorTypeState {
  
  @scala.inline
  def apply(displayColorPicker: Boolean): ColorTypeState = {
    val __obj = js.Dynamic.literal(displayColorPicker = displayColorPicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColorTypeState]
  }
  
  @scala.inline
  implicit class ColorTypeStateOps[Self <: ColorTypeState] (val x: Self) extends AnyVal {
    
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
    def setDisplayColorPicker(value: Boolean): Self = this.set("displayColorPicker", value.asInstanceOf[js.Any])
  }
}
