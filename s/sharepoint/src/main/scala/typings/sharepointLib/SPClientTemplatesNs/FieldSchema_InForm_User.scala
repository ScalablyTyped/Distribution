package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Number field in list form or in list view in grid mode */
trait FieldSchema_InForm_User extends FieldSchema_InForm {
  var DefaultRender: scala.Boolean
  var EntitySeparator: java.lang.String
  /** Server relative Url for ~site/_layouts/listform.aspx */
  var ListFormUrl: java.lang.String
  var PictureOnly: scala.Boolean
  var PictureSize: java.lang.String
  var Presence: scala.Boolean
  /** Server relative Url for ~site/_layouts/userdisp.aspx */
  var UserDisplayUrl: java.lang.String
  var WithPicture: scala.Boolean
  var WithPictureDetail: scala.Boolean
}

object FieldSchema_InForm_User {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    DefaultRender: scala.Boolean,
    Description: java.lang.String,
    Direction: java.lang.String,
    EntitySeparator: java.lang.String,
    FieldType: java.lang.String,
    Hidden: scala.Boolean,
    IMEMode: js.Any,
    Id: java.lang.String,
    ListFormUrl: java.lang.String,
    Name: java.lang.String,
    PictureOnly: scala.Boolean,
    PictureSize: java.lang.String,
    Presence: scala.Boolean,
    ReadOnlyField: scala.Boolean,
    Required: scala.Boolean,
    RestrictedMode: scala.Boolean,
    Title: java.lang.String,
    Type: java.lang.String,
    UseMinWidth: scala.Boolean,
    UserDisplayUrl: java.lang.String,
    WithPicture: scala.Boolean,
    WithPictureDetail: scala.Boolean
  ): FieldSchema_InForm_User = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowGridEditing")(AllowGridEditing)
    __obj.updateDynamic("DefaultRender")(DefaultRender)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Direction")(Direction)
    __obj.updateDynamic("EntitySeparator")(EntitySeparator)
    __obj.updateDynamic("FieldType")(FieldType)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("IMEMode")(IMEMode)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("ListFormUrl")(ListFormUrl)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("PictureOnly")(PictureOnly)
    __obj.updateDynamic("PictureSize")(PictureSize)
    __obj.updateDynamic("Presence")(Presence)
    __obj.updateDynamic("ReadOnlyField")(ReadOnlyField)
    __obj.updateDynamic("Required")(Required)
    __obj.updateDynamic("RestrictedMode")(RestrictedMode)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UseMinWidth")(UseMinWidth)
    __obj.updateDynamic("UserDisplayUrl")(UserDisplayUrl)
    __obj.updateDynamic("WithPicture")(WithPicture)
    __obj.updateDynamic("WithPictureDetail")(WithPictureDetail)
    __obj.asInstanceOf[FieldSchema_InForm_User]
  }
}

