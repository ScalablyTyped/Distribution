package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Choice field in list form or in list view in grid mode */
trait FieldSchema_InForm_MultiChoice extends FieldSchema_InForm {
  /** Indicates wherever fill-in choice is allowed */
  var FillInChoice: scala.Boolean
  /** List of choices for this field. */
  var MultiChoices: js.Array[java.lang.String]
}

object FieldSchema_InForm_MultiChoice {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    Description: java.lang.String,
    Direction: java.lang.String,
    FieldType: java.lang.String,
    FillInChoice: scala.Boolean,
    Hidden: scala.Boolean,
    IMEMode: js.Any,
    Id: java.lang.String,
    MultiChoices: js.Array[java.lang.String],
    Name: java.lang.String,
    ReadOnlyField: scala.Boolean,
    Required: scala.Boolean,
    RestrictedMode: scala.Boolean,
    Title: java.lang.String,
    Type: java.lang.String,
    UseMinWidth: scala.Boolean
  ): FieldSchema_InForm_MultiChoice = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, Description = Description, Direction = Direction, FieldType = FieldType, FillInChoice = FillInChoice, Hidden = Hidden, IMEMode = IMEMode, Id = Id, MultiChoices = MultiChoices, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_MultiChoice]
  }
}

