package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Number field in list form or in list view in grid mode */
trait FieldSchemaInFormUser extends FieldSchemaInForm {
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

object FieldSchemaInFormUser {
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
  ): FieldSchemaInFormUser = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], DefaultRender = DefaultRender.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], EntitySeparator = EntitySeparator.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], ListFormUrl = ListFormUrl.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], PictureOnly = PictureOnly.asInstanceOf[js.Any], PictureSize = PictureSize.asInstanceOf[js.Any], Presence = Presence.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any], UserDisplayUrl = UserDisplayUrl.asInstanceOf[js.Any], WithPicture = WithPicture.asInstanceOf[js.Any], WithPictureDetail = WithPictureDetail.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldSchemaInFormUser]
  }
}

