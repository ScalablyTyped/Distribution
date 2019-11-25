package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents field schema in a list view. */
trait FieldSchema_InView extends FieldSchema {
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
  var fieldRenderer: js.Any
  /** Specifies if the field contains list item menu.
    Corresponds to ViewFields/FieldRef/@ListItemMenu attribute. Either "TRUE" or "FALSE" and might be missing. */
  var listItemMenu: String
}

object FieldSchema_InView {
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
  ): FieldSchema_InView = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], CalloutMenu = CalloutMenu.asInstanceOf[js.Any], ClassInfo = ClassInfo.asInstanceOf[js.Any], DisplayName = DisplayName.asInstanceOf[js.Any], Explicit = Explicit.asInstanceOf[js.Any], FieldTitle = FieldTitle.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Filterable = Filterable.asInstanceOf[js.Any], GridActiveAndReadOnly = GridActiveAndReadOnly.asInstanceOf[js.Any], GroupField = GroupField.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], RealFieldName = RealFieldName.asInstanceOf[js.Any], ResultType = ResultType.asInstanceOf[js.Any], Sortable = Sortable.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any], fieldRenderer = fieldRenderer.asInstanceOf[js.Any], listItemMenu = listItemMenu.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldSchema_InView]
  }
}

