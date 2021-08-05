package typings.qlik.mod

import typings.qlik.qlikStrings.boolean
import typings.qlik.qlikStrings.switch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertySwitch
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: switch
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[CustomPropertyOptions] = js.undefined
  
  @JSName("type")
  var type_CustomPropertySwitch: boolean
}
object CustomPropertySwitch {
  
  inline def apply(): CustomPropertySwitch = {
    val __obj = js.Dynamic.literal(component = "switch")
    __obj.updateDynamic("type")("boolean")
    __obj.asInstanceOf[CustomPropertySwitch]
  }
  
  extension [Self <: CustomPropertySwitch](x: Self) {
    
    inline def setComponent(value: switch): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setOptions(value: CustomPropertyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsFunction0(value: () => js.Array[CustomPropertyOption]): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: CustomPropertyOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
