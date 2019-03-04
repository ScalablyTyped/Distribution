package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Choice field in list form or in list view in grid mode */
trait FieldSchema_InForm_Choice extends FieldSchema_InForm {
  /** List of choices for this field. */
  var Choices: js.Array[java.lang.String]
  /** Display format for the choice field */
  var FormatType: ChoiceFormatType
}

object FieldSchema_InForm_Choice {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    Choices: js.Array[java.lang.String],
    Description: java.lang.String,
    Direction: java.lang.String,
    FieldType: java.lang.String,
    FormatType: ChoiceFormatType,
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
  ): FieldSchema_InForm_Choice = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, Choices = Choices, Description = Description, Direction = Direction, FieldType = FieldType, FormatType = FormatType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_Choice]
  }
}

