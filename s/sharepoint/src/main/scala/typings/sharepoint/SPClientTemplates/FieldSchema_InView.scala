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
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, CalloutMenu = CalloutMenu, ClassInfo = ClassInfo, DisplayName = DisplayName, Explicit = Explicit, FieldTitle = FieldTitle, FieldType = FieldType, Filterable = Filterable, GridActiveAndReadOnly = GridActiveAndReadOnly, GroupField = GroupField, ID = ID, Name = Name, ReadOnly = ReadOnly, RealFieldName = RealFieldName, ResultType = ResultType, Sortable = Sortable, Type = Type, css = css, fieldRenderer = fieldRenderer, listItemMenu = listItemMenu)
  
    __obj.asInstanceOf[FieldSchema_InView]
  }
}

