package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents schema for a DateTime field in list form or in list view in grid mode */
trait FieldSchemaInFormGeolocation
  extends StObject
     with FieldSchemaInForm {
  
  var BingMapsKey: String
  
  var IsBingMapBlockedInCurrentRegion: Boolean
}
object FieldSchemaInFormGeolocation {
  
  inline def apply(
    AllowGridEditing: Boolean,
    BingMapsKey: String,
    Description: String,
    Direction: String,
    FieldType: String,
    Hidden: Boolean,
    IMEMode: Any,
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
  
  extension [Self <: FieldSchemaInFormGeolocation](x: Self) {
    
    inline def setBingMapsKey(value: String): Self = StObject.set(x, "BingMapsKey", value.asInstanceOf[js.Any])
    
    inline def setIsBingMapBlockedInCurrentRegion(value: Boolean): Self = StObject.set(x, "IsBingMapBlockedInCurrentRegion", value.asInstanceOf[js.Any])
  }
}
