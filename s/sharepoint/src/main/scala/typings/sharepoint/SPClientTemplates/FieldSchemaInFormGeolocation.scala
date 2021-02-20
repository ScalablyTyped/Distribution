package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents schema for a DateTime field in list form or in list view in grid mode */
@js.native
trait FieldSchemaInFormGeolocation extends FieldSchemaInForm {
  
  var BingMapsKey: String = js.native
  
  var IsBingMapBlockedInCurrentRegion: Boolean = js.native
}
object FieldSchemaInFormGeolocation {
  
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
  ): FieldSchemaInFormGeolocation = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], BingMapsKey = BingMapsKey.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], IsBingMapBlockedInCurrentRegion = IsBingMapBlockedInCurrentRegion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInFormGeolocation]
  }
  
  @scala.inline
  implicit class FieldSchemaInFormGeolocationMutableBuilder[Self <: FieldSchemaInFormGeolocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBingMapsKey(value: String): Self = StObject.set(x, "BingMapsKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsBingMapBlockedInCurrentRegion(value: Boolean): Self = StObject.set(x, "IsBingMapBlockedInCurrentRegion", value.asInstanceOf[js.Any])
  }
}
