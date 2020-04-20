package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldSchema extends js.Object {
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
  @scala.inline
  def apply(AllowGridEditing: Boolean, FieldType: String, Name: String, Type: String): FieldSchema = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchema]
  }
}

