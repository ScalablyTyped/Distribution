package typings.qlik.mod

import typings.qlik.qlikStrings.`color-picker`
import typings.qlik.qlikStrings.integer
import org.scalablytyped.runtime.StObject
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
  implicit class CustomPropertyColorPickerMutableBuilder[Self <: CustomPropertyColorPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: `color-picker`): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
