package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldSchema extends js.Object {
  
  /** Specifies if the field can be edited while list view is in the Grid mode */
  var AllowGridEditing: Boolean = js.native
  
  /** String representation of the field type, e.g. "Lookup". Same as SPField.TypeAsString */
  var FieldType: String = js.native
  
  /** Internal name of the field */
  var Name: String = js.native
  
  /** For OOTB fields, returns the type of field. For "UserMulti" returns "User", for "LookupMulti" returns "Lookup".
    For custom field types, returns base type of the field. */
  var Type: String = js.native
}
object FieldSchema {
  
  @scala.inline
  def apply(AllowGridEditing: Boolean, FieldType: String, Name: String, Type: String): FieldSchema = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchema]
  }
  
  @scala.inline
  implicit class FieldSchemaOps[Self <: FieldSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowGridEditing(value: Boolean): Self = this.set("AllowGridEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldType(value: String): Self = this.set("FieldType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
