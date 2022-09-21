package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldSchemaInViewLookupField
  extends StObject
     with FieldSchemaInView {
  
  /** Either "TRUE" or "FALSE" */
  var AllowMultipleValues: String
  
  /** Target lookup list display form URL, including PageType and List attributes. */
  var DispFormUrl: String
  
  /** Either "TRUE" or "FALSE" */
  var HasPrefix: String
}
object FieldSchemaInViewLookupField {
  
  inline def apply(
    AllowGridEditing: Boolean,
    AllowMultipleValues: String,
    CalloutMenu: String,
    ClassInfo: String,
    DispFormUrl: String,
    DisplayName: String,
    Explicit: String,
    FieldTitle: String,
    FieldType: String,
    Filterable: String,
    GridActiveAndReadOnly: String,
    GroupField: String,
    HasPrefix: String,
    ID: String,
    Name: String,
    ReadOnly: String,
    RealFieldName: String,
    ResultType: String,
    Sortable: String,
    Type: String,
    css: String,
    fieldRenderer: Any,
    listItemMenu: String
  ): FieldSchemaInViewLookupField = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], AllowMultipleValues = AllowMultipleValues.asInstanceOf[js.Any], CalloutMenu = CalloutMenu.asInstanceOf[js.Any], ClassInfo = ClassInfo.asInstanceOf[js.Any], DispFormUrl = DispFormUrl.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Explicit = Explicit.asInstanceOf[js.Any], FieldTitle = FieldTitle.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Filterable = Filterable.asInstanceOf[js.Any], GridActiveAndReadOnly = GridActiveAndReadOnly.asInstanceOf[js.Any], GroupField = GroupField.asInstanceOf[js.Any], HasPrefix = HasPrefix.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], RealFieldName = RealFieldName.asInstanceOf[js.Any], ResultType = ResultType.asInstanceOf[js.Any], Sortable = Sortable.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], fieldRenderer = fieldRenderer.asInstanceOf[js.Any], listItemMenu = listItemMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInViewLookupField]
  }
  
  extension [Self <: FieldSchemaInViewLookupField](x: Self) {
    
    inline def setAllowMultipleValues(value: String): Self = StObject.set(x, "AllowMultipleValues", value.asInstanceOf[js.Any])
    
    inline def setDispFormUrl(value: String): Self = StObject.set(x, "DispFormUrl", value.asInstanceOf[js.Any])
    
    inline def setHasPrefix(value: String): Self = StObject.set(x, "HasPrefix", value.asInstanceOf[js.Any])
  }
}
