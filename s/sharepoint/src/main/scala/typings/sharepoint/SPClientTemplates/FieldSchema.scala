package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSchema extends StObject {
  
  /** Specifies if the field can be edited while list view is in the Grid mode */
  var AllowGridEditing: Boolean
  
  /** String representation of the field type, e.g. "Lookup". Same as SPField.TypeAsString */
  var FieldType: String
  
  /** Internal name of the field */
  var Name: String
  
  /** For OOTB fields, returns the type of field. For "UserMulti" returns "User", for "LookupMulti" returns "Lookup".
    For custom field types, returns base type of the field. */
  var Type: String
}
object FieldSchema {
  
  inline def apply(AllowGridEditing: Boolean, FieldType: String, Name: String, Type: String): FieldSchema = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchema]
  }
  
  extension [Self <: FieldSchema](x: Self) {
    
    inline def setAllowGridEditing(value: Boolean): Self = StObject.set(x, "AllowGridEditing", value.asInstanceOf[js.Any])
    
    inline def setFieldType(value: String): Self = StObject.set(x, "FieldType", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
