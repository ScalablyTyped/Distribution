package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents field schema in Grid mode and on list forms.
  Consider casting objects of this type to more specific field types, e.g. FieldSchemaInForm_Lookup */
trait FieldSchemaInForm extends FieldSchema {
  /** Description for this field. */
  var Description: String
  /** Direction of the reading order for the field. */
  var Direction: String
  /** Indicates whether the field is hidden */
  var Hidden: Boolean
  /** Specifies Input Method Editor (IME) mode bias to use for the field.
    The IME enables conversion of keystrokes between languages when one writing system has more characters than can be encoded for the given keyboard. */
  var IMEMode: js.Any
  /** Guid of the field */
  var Id: String
  /** Specifies if the field is read only */
  var ReadOnlyField: Boolean
  /** Specifies wherever field requires values */
  var Required: Boolean
  var RestrictedMode: Boolean
  /** Title of the field */
  var Title: String
  /** If SPFarm.Local.UseMinWidthForHtmlPicker is true, UseMinWidth will be set to true. Undefined in other cases. */
  var UseMinWidth: Boolean
}

object FieldSchemaInForm {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    Description: String,
    Direction: String,
    FieldType: String,
    Hidden: Boolean,
    IMEMode: js.Any,
    Id: String,
    Name: String,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    Title: String,
    Type: String,
    UseMinWidth: Boolean
  ): FieldSchemaInForm = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldSchemaInForm]
  }
}

