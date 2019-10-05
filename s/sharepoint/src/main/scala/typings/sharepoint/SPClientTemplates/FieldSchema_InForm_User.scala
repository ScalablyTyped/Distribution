package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Number field in list form or in list view in grid mode */
trait FieldSchema_InForm_User extends FieldSchema_InForm {
  var DefaultRender: Boolean
  var EntitySeparator: String
  /** Server relative Url for ~site/_layouts/listform.aspx */
  var ListFormUrl: String
  var PictureOnly: Boolean
  var PictureSize: String
  var Presence: Boolean
  /** Server relative Url for ~site/_layouts/userdisp.aspx */
  var UserDisplayUrl: String
  var WithPicture: Boolean
  var WithPictureDetail: Boolean
}

object FieldSchema_InForm_User {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    DefaultRender: Boolean,
    Description: String,
    Direction: String,
    EntitySeparator: String,
    FieldType: String,
    Hidden: Boolean,
    IMEMode: js.Any,
    Id: String,
    ListFormUrl: String,
    Name: String,
    PictureOnly: Boolean,
    PictureSize: String,
    Presence: Boolean,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    Title: String,
    Type: String,
    UseMinWidth: Boolean,
    UserDisplayUrl: String,
    WithPicture: Boolean,
    WithPictureDetail: Boolean
  ): FieldSchema_InForm_User = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, DefaultRender = DefaultRender, Description = Description, Direction = Direction, EntitySeparator = EntitySeparator, FieldType = FieldType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, ListFormUrl = ListFormUrl, Name = Name, PictureOnly = PictureOnly, PictureSize = PictureSize, Presence = Presence, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, Title = Title, Type = Type, UseMinWidth = UseMinWidth, UserDisplayUrl = UserDisplayUrl, WithPicture = WithPicture, WithPictureDetail = WithPictureDetail)
  
    __obj.asInstanceOf[FieldSchema_InForm_User]
  }
}

