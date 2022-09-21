package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents field schema in a list view. */
trait FieldSchemaInView
  extends StObject
     with FieldSchema {
  
  /** Either "TRUE" or "FALSE" */
  var CalloutMenu: String
  
  var ClassInfo: String
  
  var DisplayName: String
  
  /** Either "TRUE" or "FALSE" */
  var Explicit: String
  
  var FieldTitle: String
  
  /** Indicates whether the field can be filtered. Either "TRUE" or "FALSE" */
  var Filterable: String
  
  /** Either "TRUE" or "FALSE" */
  var GridActiveAndReadOnly: String
  
  /** Set to "TRUE" for fields that comply to the following Xpath query:
    ViewFields/FieldRef[@Explicit='TRUE'] | Query/GroupBy/FieldRef[not(@Name=ViewFields/FieldRef/@Name)] */
  var GroupField: String
  
  /** Guid of the field */
  var ID: String
  
  /** Either "TRUE" or "FALSE" */
  var ReadOnly: String
  
  var RealFieldName: String
  
  var ResultType: String
  
  /** Indicates whether the field can be sorted. Either "TRUE" or "FALSE" */
  var Sortable: String
  
  // e.g. "Menu"
  var css: String
  
  var fieldRenderer: Any
  
  /** Specifies if the field contains list item menu.
    Corresponds to ViewFields/FieldRef/@ListItemMenu attribute. Either "TRUE" or "FALSE" and might be missing. */
  var listItemMenu: String
}
object FieldSchemaInView {
  
  inline def apply(
    AllowGridEditing: Boolean,
    CalloutMenu: String,
    ClassInfo: String,
    DisplayName: String,
    Explicit: String,
    FieldTitle: String,
    FieldType: String,
    Filterable: String,
    GridActiveAndReadOnly: String,
    GroupField: String,
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
  ): FieldSchemaInView = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], CalloutMenu = CalloutMenu.asInstanceOf[js.Any], ClassInfo = ClassInfo.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Explicit = Explicit.asInstanceOf[js.Any], FieldTitle = FieldTitle.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Filterable = Filterable.asInstanceOf[js.Any], GridActiveAndReadOnly = GridActiveAndReadOnly.asInstanceOf[js.Any], GroupField = GroupField.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], RealFieldName = RealFieldName.asInstanceOf[js.Any], ResultType = ResultType.asInstanceOf[js.Any], Sortable = Sortable.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], fieldRenderer = fieldRenderer.asInstanceOf[js.Any], listItemMenu = listItemMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInView]
  }
  
  extension [Self <: FieldSchemaInView](x: Self) {
    
    inline def setCalloutMenu(value: String): Self = StObject.set(x, "CalloutMenu", value.asInstanceOf[js.Any])
    
    inline def setClassInfo(value: String): Self = StObject.set(x, "ClassInfo", value.asInstanceOf[js.Any])
    
    inline def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    inline def setExplicit(value: String): Self = StObject.set(x, "Explicit", value.asInstanceOf[js.Any])
    
    inline def setFieldRenderer(value: Any): Self = StObject.set(x, "fieldRenderer", value.asInstanceOf[js.Any])
    
    inline def setFieldTitle(value: String): Self = StObject.set(x, "FieldTitle", value.asInstanceOf[js.Any])
    
    inline def setFilterable(value: String): Self = StObject.set(x, "Filterable", value.asInstanceOf[js.Any])
    
    inline def setGridActiveAndReadOnly(value: String): Self = StObject.set(x, "GridActiveAndReadOnly", value.asInstanceOf[js.Any])
    
    inline def setGroupField(value: String): Self = StObject.set(x, "GroupField", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setListItemMenu(value: String): Self = StObject.set(x, "listItemMenu", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: String): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setRealFieldName(value: String): Self = StObject.set(x, "RealFieldName", value.asInstanceOf[js.Any])
    
    inline def setResultType(value: String): Self = StObject.set(x, "ResultType", value.asInstanceOf[js.Any])
    
    inline def setSortable(value: String): Self = StObject.set(x, "Sortable", value.asInstanceOf[js.Any])
  }
}
