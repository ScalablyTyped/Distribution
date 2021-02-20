package typings.qlik.mod

import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.switch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomPropertySwitch
  extends CustomPropertyCommon
     with CustomProperty {
  
  var component: switch = js.native
  
  var defaultValue: js.UndefOr[String] = js.native
  
  var options: js.UndefOr[CustomPropertyOptions] = js.native
  
  @JSName("type")
  var type_CustomPropertySwitch: boolean = js.native
}
object CustomPropertySwitch {
  
  @scala.inline
  def apply(component: switch, `type`: boolean): CustomPropertySwitch = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPropertySwitch]
  }
  
  @scala.inline
  implicit class CustomPropertySwitchMutableBuilder[Self <: CustomPropertySwitch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: switch): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setOptions(value: CustomPropertyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsFunction0(value: () => js.Array[CustomPropertyOption]): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: CustomPropertyOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
