package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldSchema_InView_LookupField extends FieldSchema_InView {
  /** Either "TRUE" or "FALSE" */
  var AllowMultipleValues: java.lang.String
  /** Target lookup list display form URL, including PageType and List attributes. */
  var DispFormUrl: java.lang.String
  /** Either "TRUE" or "FALSE" */
  var HasPrefix: java.lang.String
}

object FieldSchema_InView_LookupField {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    AllowMultipleValues: java.lang.String,
    CalloutMenu: java.lang.String,
    ClassInfo: java.lang.String,
    DispFormUrl: java.lang.String,
    DisplayName: java.lang.String,
    Explicit: java.lang.String,
    FieldTitle: java.lang.String,
    FieldType: java.lang.String,
    Filterable: java.lang.String,
    GridActiveAndReadOnly: java.lang.String,
    GroupField: java.lang.String,
    HasPrefix: java.lang.String,
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
  ): FieldSchema_InView_LookupField = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, AllowMultipleValues = AllowMultipleValues, CalloutMenu = CalloutMenu, ClassInfo = ClassInfo, DispFormUrl = DispFormUrl, DisplayName = DisplayName, Explicit = Explicit, FieldTitle = FieldTitle, FieldType = FieldType, Filterable = Filterable, GridActiveAndReadOnly = GridActiveAndReadOnly, GroupField = GroupField, HasPrefix = HasPrefix, ID = ID, Name = Name, ReadOnly = ReadOnly, RealFieldName = RealFieldName, ResultType = ResultType, Sortable = Sortable, Type = Type, css = css, fieldRenderer = fieldRenderer, listItemMenu = listItemMenu)
  
    __obj.asInstanceOf[FieldSchema_InView_LookupField]
  }
}

