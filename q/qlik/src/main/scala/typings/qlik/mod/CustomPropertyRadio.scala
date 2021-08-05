package typings.qlik.mod

import typings.qlik.qlikStrings.radiobuttons
import typings.qlik.qlikStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyRadio
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: radiobuttons
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[CustomPropertyOptions] = js.undefined
  
  @JSName("type")
  var type_CustomPropertyRadio: string
}
object CustomPropertyRadio {
  
  inline def apply(): CustomPropertyRadio = {
    val __obj = js.Dynamic.literal(component = "radiobuttons")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[CustomPropertyRadio]
  }
  
  extension [Self <: CustomPropertyRadio](x: Self) {
    
    inline def setComponent(value: radiobuttons): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setOptions(value: CustomPropertyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsFunction0(value: () => js.Array[CustomPropertyOption]): Self = StObject.set(x, "options", js.Any.fromFunction0(value))
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setOptionsVarargs(value: CustomPropertyOption*): Self = StObject.set(x, "options", js.Array(value :_*))
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
