package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents field schema in a list view. */
@js.native
trait FieldSchemaInView extends FieldSchema {
  
  /** Either "TRUE" or "FALSE" */
  var CalloutMenu: String = js.native
  
  var ClassInfo: String = js.native
  
  var DisplayName: String = js.native
  
  /** Either "TRUE" or "FALSE" */
  var Explicit: String = js.native
  
  var FieldTitle: String = js.native
  
  /** Indicates whether the field can be filtered. Either "TRUE" or "FALSE" */
  var Filterable: String = js.native
  
  /** Either "TRUE" or "FALSE" */
  var GridActiveAndReadOnly: String = js.native
  
  /** Set to "TRUE" for fields that comply to the following Xpath query:
    ViewFields/FieldRef[@Explicit='TRUE'] | Query/GroupBy/FieldRef[not(@Name=ViewFields/FieldRef/@Name)] */
  var GroupField: String = js.native
  
  /** Guid of the field */
  var ID: String = js.native
  
  /** Either "TRUE" or "FALSE" */
  var ReadOnly: String = js.native
  
  var RealFieldName: String = js.native
  
  var ResultType: String = js.native
  
  /** Indicates whether the field can be sorted. Either "TRUE" or "FALSE" */
  var Sortable: String = js.native
  
  // e.g. "Menu"
  var css: String = js.native
  
  var fieldRenderer: js.Any = js.native
  
  /** Specifies if the field contains list item menu.
    Corresponds to ViewFields/FieldRef/@ListItemMenu attribute. Either "TRUE" or "FALSE" and might be missing. */
  var listItemMenu: String = js.native
}
object FieldSchemaInView {
  
  @scala.inline
  def apply(
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
    fieldRenderer: js.Any,
    listItemMenu: String
  ): FieldSchemaInView = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], CalloutMenu = CalloutMenu.asInstanceOf[js.Any], ClassInfo = ClassInfo.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Explicit = Explicit.asInstanceOf[js.Any], FieldTitle = FieldTitle.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Filterable = Filterable.asInstanceOf[js.Any], GridActiveAndReadOnly = GridActiveAndReadOnly.asInstanceOf[js.Any], GroupField = GroupField.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], RealFieldName = RealFieldName.asInstanceOf[js.Any], ResultType = ResultType.asInstanceOf[js.Any], Sortable = Sortable.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], fieldRenderer = fieldRenderer.asInstanceOf[js.Any], listItemMenu = listItemMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInView]
  }
  
  @scala.inline
  implicit class FieldSchemaInViewMutableBuilder[Self <: FieldSchemaInView] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalloutMenu(value: String): Self = StObject.set(x, "CalloutMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassInfo(value: String): Self = StObject.set(x, "ClassInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCss(value: String): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicit(value: String): Self = StObject.set(x, "Explicit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldRenderer(value: js.Any): Self = StObject.set(x, "fieldRenderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldTitle(value: String): Self = StObject.set(x, "FieldTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterable(value: String): Self = StObject.set(x, "Filterable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridActiveAndReadOnly(value: String): Self = StObject.set(x, "GridActiveAndReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupField(value: String): Self = StObject.set(x, "GroupField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemMenu(value: String): Self = StObject.set(x, "listItemMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnly(value: String): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealFieldName(value: String): Self = StObject.set(x, "RealFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultType(value: String): Self = StObject.set(x, "ResultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortable(value: String): Self = StObject.set(x, "Sortable", value.asInstanceOf[js.Any])
  }
}
