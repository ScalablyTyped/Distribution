package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Choice field in list form or in list view in grid mode */
trait FieldSchema_InForm_Choice extends FieldSchema_InForm {
  /** List of choices for this field. */
  var Choices: js.Array[String]
  /** Display format for the choice field */
  var FormatType: ChoiceFormatType
}

object FieldSchema_InForm_Choice {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    Choices: js.Array[String],
    Description: String,
    Direction: String,
    FieldType: String,
    FormatType: ChoiceFormatType,
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
  ): FieldSchema_InForm_Choice = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, Choices = Choices, Description = Description, Direction = Direction, FieldType = FieldType, FormatType = FormatType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_Choice]
  }
}

