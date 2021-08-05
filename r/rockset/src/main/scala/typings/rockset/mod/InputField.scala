package typings.rockset.mod

import typings.rockset.rocksetStrings.PASS
import typings.rockset.rocksetStrings.SKIP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputField extends StObject {
  
  // The name of a field, parsed as a SQL qualified name
  var field_name: js.UndefOr[String] = js.undefined
  
  // Define the behaviour if fieldName is missing or is null
  var if_missing: js.UndefOr[SKIP | PASS] = js.undefined
  
  // If true, then drop fieldName from the document
  var is_drop: js.UndefOr[Boolean] = js.undefined
  
  // Sql parameter name
  var param: js.UndefOr[String] = js.undefined
}
object InputField {
  
  inline def apply(): InputField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputField]
  }
  
  extension [Self <: InputField](x: Self) {
    
    inline def setField_name(value: String): Self = StObject.set(x, "field_name", value.asInstanceOf[js.Any])
    
    inline def setField_nameUndefined: Self = StObject.set(x, "field_name", js.undefined)
    
    inline def setIf_missing(value: SKIP | PASS): Self = StObject.set(x, "if_missing", value.asInstanceOf[js.Any])
    
    inline def setIf_missingUndefined: Self = StObject.set(x, "if_missing", js.undefined)
    
    inline def setIs_drop(value: Boolean): Self = StObject.set(x, "is_drop", value.asInstanceOf[js.Any])
    
    inline def setIs_dropUndefined: Self = StObject.set(x, "is_drop", js.undefined)
    
    inline def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
  }
}
