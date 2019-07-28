package typings.sharepoint.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Number field in list form or in list view in grid mode */
trait FieldSchema_InForm_Number extends FieldSchema_InForm {
  var ShowAsPercentage: Boolean
}

object FieldSchema_InForm_Number {
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
    ShowAsPercentage: Boolean,
    Title: String,
    Type: String,
    UseMinWidth: Boolean
  ): FieldSchema_InForm_Number = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, Description = Description, Direction = Direction, FieldType = FieldType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, ShowAsPercentage = ShowAsPercentage, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_Number]
  }
}

