package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<std.Omit<rc-field-form.rc-field-form/es/interface.InternalFieldData, 'name'>> */
trait FieldData extends StObject {
  
  var errors: js.UndefOr[js.Array[String]] = js.undefined
  
  var name: NamePath
  
  var touched: js.UndefOr[Boolean] = js.undefined
  
  var validating: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[StoreValue] = js.undefined
  
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object FieldData {
  
  inline def apply(name: NamePath): FieldData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldData]
  }
  
  extension [Self <: FieldData](x: Self) {
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: NamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    inline def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
    
    inline def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
    
    inline def setValidatingUndefined: Self = StObject.set(x, "validating", js.undefined)
    
    inline def setValue(value: StoreValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
