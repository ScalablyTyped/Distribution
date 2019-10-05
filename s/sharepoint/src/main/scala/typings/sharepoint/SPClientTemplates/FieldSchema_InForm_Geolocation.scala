package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a DateTime field in list form or in list view in grid mode */
trait FieldSchema_InForm_Geolocation extends FieldSchema_InForm {
  var BingMapsKey: String
  var IsBingMapBlockedInCurrentRegion: Boolean
}

object FieldSchema_InForm_Geolocation {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    BingMapsKey: String,
    Description: String,
    Direction: String,
    FieldType: String,
    Hidden: Boolean,
    IMEMode: js.Any,
    Id: String,
    IsBingMapBlockedInCurrentRegion: Boolean,
    Name: String,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    Title: String,
    Type: String,
    UseMinWidth: Boolean
  ): FieldSchema_InForm_Geolocation = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, BingMapsKey = BingMapsKey, Description = Description, Direction = Direction, FieldType = FieldType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, IsBingMapBlockedInCurrentRegion = IsBingMapBlockedInCurrentRegion, Name = Name, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_Geolocation]
  }
}

