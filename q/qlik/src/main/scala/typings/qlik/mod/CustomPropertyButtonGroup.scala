package typings.qlik.mod

import typings.qlik.qlikStrings.buttongroup
import typings.qlik.qlikStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyButtonGroup
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: buttongroup
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]]] = js.undefined
  
  @JSName("type")
  var type_CustomPropertyButtonGroup: string
}
object CustomPropertyButtonGroup {
  
  @scala.inline
  def apply(): CustomPropertyButtonGroup = {
    val __obj = js.Dynamic.literal(component = "buttongroup")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[CustomPropertyButtonGroup]
  }
  
  @scala.inline
  implicit class CustomPropertyButtonGroupMutableBuilder[Self <: CustomPropertyButtonGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: buttongroup): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Array[ButtonGroupOption] | js.Function0[js.Array[ButtonGroupOption]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsFunction0(value: () => js.Array[ButtonGroupOption]): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setOptionsVarargs(value: ButtonGroupOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    @scala.inline
    def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
