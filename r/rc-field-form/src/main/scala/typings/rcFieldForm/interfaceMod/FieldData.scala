package typings.rcFieldForm.interfaceMod

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
}
object FieldData {
  
  @scala.inline
  def apply(name: NamePath): FieldData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldData]
  }
  
  @scala.inline
  implicit class FieldDataMutableBuilder[Self <: FieldData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    @scala.inline
    def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
    
    @scala.inline
    def setName(value: NamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value :_*))
    
    @scala.inline
    def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
    
    @scala.inline
    def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatingUndefined: Self = StObject.set(x, "validating", js.undefined)
    
    @scala.inline
    def setValue(value: StoreValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
