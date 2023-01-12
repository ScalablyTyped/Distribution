package typings.qlik.mod

import typings.qlik.qlikStrings.string
import typings.qlik.qlikStrings.textarea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPropertyTextArea
  extends StObject
     with CustomPropertyCommon
     with CustomProperty {
  
  var component: textarea
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var maxlength: js.UndefOr[Double] = js.undefined
  
  var rows: js.UndefOr[Double] = js.undefined
  
  @JSName("type")
  var type_CustomPropertyTextArea: string
}
object CustomPropertyTextArea {
  
  inline def apply(): CustomPropertyTextArea = {
    val __obj = js.Dynamic.literal(component = "textarea")
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[CustomPropertyTextArea]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomPropertyTextArea] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: textarea): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
