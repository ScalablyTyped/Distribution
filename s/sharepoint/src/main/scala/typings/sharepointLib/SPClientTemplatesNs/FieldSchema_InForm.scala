package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents field schema in Grid mode and on list forms.
  Consider casting objects of this type to more specific field types, e.g. FieldSchemaInForm_Lookup */
trait FieldSchema_InForm extends FieldSchema {
  /** Description for this field. */
  var Description: java.lang.String
  /** Direction of the reading order for the field. */
  var Direction: java.lang.String
  /** Indicates whether the field is hidden */
  var Hidden: scala.Boolean
  /** Specifies Input Method Editor (IME) mode bias to use for the field.
    The IME enables conversion of keystrokes between languages when one writing system has more characters than can be encoded for the given keyboard. */
  var IMEMode: js.Any
  /** Guid of the field */
  var Id: java.lang.String
  /** Specifies if the field is read only */
  var ReadOnlyField: scala.Boolean
  /** Specifies wherever field requires values */
  var Required: scala.Boolean
  var RestrictedMode: scala.Boolean
  /** Title of the field */
  var Title: java.lang.String
  /** If SPFarm.Local.UseMinWidthForHtmlPicker is true, UseMinWidth will be set to true. Undefined in other cases. */
  var UseMinWidth: scala.Boolean
}

object FieldSchema_InForm {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    Description: java.lang.String,
    Direction: java.lang.String,
    FieldType: java.lang.String,
    Hidden: scala.Boolean,
    IMEMode: js.Any,
    Id: java.lang.String,
    Name: java.lang.String,
    ReadOnlyField: scala.Boolean,
    Required: scala.Boolean,
    RestrictedMode: scala.Boolean,
    Title: java.lang.String,
    Type: java.lang.String,
    UseMinWidth: scala.Boolean
  ): FieldSchema_InForm = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowGridEditing")(AllowGridEditing)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Direction")(Direction)
    __obj.updateDynamic("FieldType")(FieldType)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("IMEMode")(IMEMode)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ReadOnlyField")(ReadOnlyField)
    __obj.updateDynamic("Required")(Required)
    __obj.updateDynamic("RestrictedMode")(RestrictedMode)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UseMinWidth")(UseMinWidth)
    __obj.asInstanceOf[FieldSchema_InForm]
  }
}

