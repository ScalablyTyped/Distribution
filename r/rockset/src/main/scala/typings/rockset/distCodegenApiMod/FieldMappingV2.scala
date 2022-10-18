package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldMappingV2 extends StObject {
  
  /**
    * A List of InputField for this mapping
    * @type {Array<InputField>}
    * @memberof FieldMappingV2
    */
  var input_fields: js.UndefOr[js.Array[InputField]] = js.undefined
  
  /**
    * A boolean that determines whether to drop all fields in this document. If set, input and output fields should not be set
    * @type {boolean}
    * @memberof FieldMappingV2
    */
  var is_drop_all_fields: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A user specified string that is a name for this mapping
    * @type {string}
    * @memberof FieldMappingV2
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * An OutputField for this mapping
    * @type {OutputField}
    * @memberof FieldMappingV2
    */
  var output_field: js.UndefOr[OutputField] = js.undefined
}
object FieldMappingV2 {
  
  inline def apply(): FieldMappingV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldMappingV2]
  }
  
  extension [Self <: FieldMappingV2](x: Self) {
    
    inline def setInput_fields(value: js.Array[InputField]): Self = StObject.set(x, "input_fields", value.asInstanceOf[js.Any])
    
    inline def setInput_fieldsUndefined: Self = StObject.set(x, "input_fields", js.undefined)
    
    inline def setInput_fieldsVarargs(value: InputField*): Self = StObject.set(x, "input_fields", js.Array(value*))
    
    inline def setIs_drop_all_fields(value: Boolean): Self = StObject.set(x, "is_drop_all_fields", value.asInstanceOf[js.Any])
    
    inline def setIs_drop_all_fieldsUndefined: Self = StObject.set(x, "is_drop_all_fields", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutput_field(value: OutputField): Self = StObject.set(x, "output_field", value.asInstanceOf[js.Any])
    
    inline def setOutput_fieldUndefined: Self = StObject.set(x, "output_field", js.undefined)
  }
}
