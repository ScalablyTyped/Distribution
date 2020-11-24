package typings.qlik.mod

import typings.qlik.qlikStrings.`color-picker`
import typings.qlik.qlikStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertyColorPicker
  extends CustomPropertyCommon
     with CustomProperty {
  
  var component: `color-picker` = js.native
  
  var defaultValue: js.UndefOr[Double] = js.native
  
  @JSName("type")
  var type_CustomPropertyColorPicker: integer = js.native
}
object CustomPropertyColorPicker {
  
  @scala.inline
  def apply(component: `color-picker`, `type`: integer): CustomPropertyColorPicker = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertyColorPicker]
  }
  
  @scala.inline
  implicit class CustomPropertyColorPickerOps[Self <: CustomPropertyColorPicker] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: `color-picker`): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: integer): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Double): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
  }
}
