package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents schema for a Number field in list form or in list view in grid mode */
@js.native
trait FieldSchemaInFormUser extends FieldSchemaInForm {
  
  var DefaultRender: Boolean = js.native
  
  var EntitySeparator: String = js.native
  
  /** Server relative Url for ~site/_layouts/listform.aspx */
  var ListFormUrl: String = js.native
  
  var PictureOnly: Boolean = js.native
  
  var PictureSize: String = js.native
  
  var Presence: Boolean = js.native
  
  /** Server relative Url for ~site/_layouts/userdisp.aspx */
  var UserDisplayUrl: String = js.native
  
  var WithPicture: Boolean = js.native
  
  var WithPictureDetail: Boolean = js.native
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
  
  @scala.inline
  implicit class FieldSchemaInFormUserMutableBuilder[Self <: FieldSchemaInFormUser] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultRender(value: Boolean): Self = StObject.set(x, "DefaultRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitySeparator(value: String): Self = StObject.set(x, "EntitySeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFormUrl(value: String): Self = StObject.set(x, "ListFormUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureOnly(value: Boolean): Self = StObject.set(x, "PictureOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPictureSize(value: String): Self = StObject.set(x, "PictureSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresence(value: Boolean): Self = StObject.set(x, "Presence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDisplayUrl(value: String): Self = StObject.set(x, "UserDisplayUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithPicture(value: Boolean): Self = StObject.set(x, "WithPicture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithPictureDetail(value: Boolean): Self = StObject.set(x, "WithPictureDetail", value.asInstanceOf[js.Any])
  }
}
