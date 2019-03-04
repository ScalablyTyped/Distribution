package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents field schema in a list view. */
trait FieldSchema_InView extends FieldSchema {
  /** Either "TRUE" or "FALSE" */
  var CalloutMenu: java.lang.String
  var ClassInfo: java.lang.String
  var DisplayName: java.lang.String
  /** Either "TRUE" or "FALSE" */
  var Explicit: java.lang.String
  var FieldTitle: java.lang.String
  /** Indicates whether the field can be filtered. Either "TRUE" or "FALSE" */
  var Filterable: java.lang.String
  /** Either "TRUE" or "FALSE" */
  var GridActiveAndReadOnly: java.lang.String
  /** Set to "TRUE" for fields that comply to the following Xpath query:
    ViewFields/FieldRef[@Explicit='TRUE'] | Query/GroupBy/FieldRef[not(@Name=ViewFields/FieldRef/@Name)] */
  var GroupField: java.lang.String
  /** Guid of the field */
  var ID: java.lang.String
  /** Either "TRUE" or "FALSE" */
  var ReadOnly: java.lang.String
  var RealFieldName: java.lang.String
  var ResultType: java.lang.String
  /** Indicates whether the field can be sorted. Either "TRUE" or "FALSE" */
  var Sortable: java.lang.String
   // e.g. "Menu"
  var css: java.lang.String
  var fieldRenderer: js.Any
  /** Specifies if the field contains list item menu.
    Corresponds to ViewFields/FieldRef/@ListItemMenu attribute. Either "TRUE" or "FALSE" and might be missing. */
  var listItemMenu: java.lang.String
}

object FieldSchema_InView {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    CalloutMenu: java.lang.String,
    ClassInfo: java.lang.String,
    DisplayName: java.lang.String,
    Explicit: java.lang.String,
    FieldTitle: java.lang.String,
    FieldType: java.lang.String,
    Filterable: java.lang.String,
    GridActiveAndReadOnly: java.lang.String,
    GroupField: java.lang.String,
    ID: java.lang.String,
    Name: java.lang.String,
    ReadOnly: java.lang.String,
    RealFieldName: java.lang.String,
    ResultType: java.lang.String,
    Sortable: java.lang.String,
    Type: java.lang.String,
    css: java.lang.String,
    fieldRenderer: js.Any,
    listItemMenu: java.lang.String
  ): FieldSchema_InView = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, CalloutMenu = CalloutMenu, ClassInfo = ClassInfo, DisplayName = DisplayName, Explicit = Explicit, FieldTitle = FieldTitle, FieldType = FieldType, Filterable = Filterable, GridActiveAndReadOnly = GridActiveAndReadOnly, GroupField = GroupField, ID = ID, Name = Name, ReadOnly = ReadOnly, RealFieldName = RealFieldName, ResultType = ResultType, Sortable = Sortable, Type = Type, css = css, fieldRenderer = fieldRenderer, listItemMenu = listItemMenu)
  
    __obj.asInstanceOf[FieldSchema_InView]
  }
}

