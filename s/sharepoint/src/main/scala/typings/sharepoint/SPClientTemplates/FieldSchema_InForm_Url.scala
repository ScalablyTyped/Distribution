package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Number field in list form or in list view in grid mode */
trait FieldSchema_InForm_Url extends FieldSchema_InForm {
  var DisplayFormat: UrlFormatType
}

object FieldSchema_InForm_Url {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    Description: String,
    Direction: String,
    DisplayFormat: UrlFormatType,
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
  ): FieldSchema_InForm_Url = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, Description = Description, Direction = Direction, DisplayFormat = DisplayFormat, FieldType = FieldType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_Url]
  }
}

