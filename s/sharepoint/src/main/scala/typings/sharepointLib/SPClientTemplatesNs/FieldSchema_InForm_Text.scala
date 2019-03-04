package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Number field in list form or in list view in grid mode */
trait FieldSchema_InForm_Text extends FieldSchema_InForm {
  var MaxLength: scala.Double
}

object FieldSchema_InForm_Text {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    Description: java.lang.String,
    Direction: java.lang.String,
    FieldType: java.lang.String,
    Hidden: scala.Boolean,
    IMEMode: js.Any,
    Id: java.lang.String,
    MaxLength: scala.Double,
    Name: java.lang.String,
    ReadOnlyField: scala.Boolean,
    Required: scala.Boolean,
    RestrictedMode: scala.Boolean,
    Title: java.lang.String,
    Type: java.lang.String,
    UseMinWidth: scala.Boolean
  ): FieldSchema_InForm_Text = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, Description = Description, Direction = Direction, FieldType = FieldType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, MaxLength = MaxLength, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_Text]
  }
}

