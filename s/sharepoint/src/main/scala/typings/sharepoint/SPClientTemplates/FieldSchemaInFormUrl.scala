package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents schema for a Number field in list form or in list view in grid mode */
trait FieldSchemaInFormUrl
  extends StObject
     with FieldSchemaInForm {
  
  var DisplayFormat: UrlFormatType
}
object FieldSchemaInFormUrl {
  
  inline def apply(
    AllowGridEditing: Boolean,
    Description: String,
    Direction: String,
    DisplayFormat: UrlFormatType,
    FieldType: String,
    Hidden: Boolean,
    IMEMode: Any,
    Id: String,
    Name: String,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    Title: String,
    Type: String,
    UseMinWidth: Boolean
  ): FieldSchemaInFormUrl = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], DisplayFormat = DisplayFormat.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInFormUrl]
  }
  
  extension [Self <: FieldSchemaInFormUrl](x: Self) {
    
    inline def setDisplayFormat(value: UrlFormatType): Self = StObject.set(x, "DisplayFormat", value.asInstanceOf[js.Any])
  }
}
