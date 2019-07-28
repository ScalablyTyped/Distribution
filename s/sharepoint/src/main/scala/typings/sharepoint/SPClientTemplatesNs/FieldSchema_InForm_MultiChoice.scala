package typings.sharepoint.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Choice field in list form or in list view in grid mode */
trait FieldSchema_InForm_MultiChoice extends FieldSchema_InForm {
  /** Indicates wherever fill-in choice is allowed */
  var FillInChoice: Boolean
  /** List of choices for this field. */
  var MultiChoices: js.Array[String]
}

object FieldSchema_InForm_MultiChoice {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    Description: String,
    Direction: String,
    FieldType: String,
    FillInChoice: Boolean,
    Hidden: Boolean,
    IMEMode: js.Any,
    Id: String,
    MultiChoices: js.Array[String],
    Name: String,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    Title: String,
    Type: String,
    UseMinWidth: Boolean
  ): FieldSchema_InForm_MultiChoice = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, Description = Description, Direction = Direction, FieldType = FieldType, FillInChoice = FillInChoice, Hidden = Hidden, IMEMode = IMEMode, Id = Id, MultiChoices = MultiChoices, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_MultiChoice]
  }
}

