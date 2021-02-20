package typings.rockset.mod

import typings.rockset.rocksetStrings.PASS
import typings.rockset.rocksetStrings.SKIP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputField extends StObject {
  
  // The name of a field, parsed as a SQL qualified name
  var field_name: js.UndefOr[String] = js.native
  
  // Define the behaviour if fieldName is missing or is null
  var if_missing: js.UndefOr[SKIP | PASS] = js.native
  
  // If true, then drop fieldName from the document
  var is_drop: js.UndefOr[Boolean] = js.native
  
  // Sql parameter name
  var param: js.UndefOr[String] = js.native
}
object InputField {
  
  @scala.inline
  def apply(): InputField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputField]
  }
  
  @scala.inline
  implicit class InputFieldMutableBuilder[Self <: InputField] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField_name(value: String): Self = StObject.set(x, "field_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField_nameUndefined: Self = StObject.set(x, "field_name", js.undefined)
    
    @scala.inline
    def setIf_missing(value: SKIP | PASS): Self = StObject.set(x, "if_missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIf_missingUndefined: Self = StObject.set(x, "if_missing", js.undefined)
    
    @scala.inline
    def setIs_drop(value: Boolean): Self = StObject.set(x, "is_drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_dropUndefined: Self = StObject.set(x, "is_drop", js.undefined)
    
    @scala.inline
    def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
  }
}
