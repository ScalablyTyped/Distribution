package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldSchema_InView_LookupField extends FieldSchema_InView {
  /** Either "TRUE" or "FALSE" */
  var AllowMultipleValues: String
  /** Target lookup list display form URL, including PageType and List attributes. */
  var DispFormUrl: String
  /** Either "TRUE" or "FALSE" */
  var HasPrefix: String
}

object FieldSchema_InView_LookupField {
  @scala.inline
  def apply(
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
    fieldRenderer: js.Any,
    listItemMenu: String
  ): FieldSchema_InView_LookupField = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, AllowMultipleValues = AllowMultipleValues, CalloutMenu = CalloutMenu, ClassInfo = ClassInfo, DispFormUrl = DispFormUrl, DisplayName = DisplayName, Explicit = Explicit, FieldTitle = FieldTitle, FieldType = FieldType, Filterable = Filterable, GridActiveAndReadOnly = GridActiveAndReadOnly, GroupField = GroupField, HasPrefix = HasPrefix, ID = ID, Name = Name, ReadOnly = ReadOnly, RealFieldName = RealFieldName, ResultType = ResultType, Sortable = Sortable, Type = Type, css = css, fieldRenderer = fieldRenderer, listItemMenu = listItemMenu)
  
    __obj.asInstanceOf[FieldSchema_InView_LookupField]
  }
}

