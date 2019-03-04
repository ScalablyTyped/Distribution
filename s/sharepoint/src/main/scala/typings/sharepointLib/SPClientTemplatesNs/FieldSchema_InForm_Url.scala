package typings
package sharepointLib.SPClientTemplatesNs

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
    AllowGridEditing: scala.Boolean,
    Description: java.lang.String,
    Direction: java.lang.String,
    DisplayFormat: UrlFormatType,
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
  ): FieldSchema_InForm_Url = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, Description = Description, Direction = Direction, DisplayFormat = DisplayFormat, FieldType = FieldType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_Url]
  }
}

