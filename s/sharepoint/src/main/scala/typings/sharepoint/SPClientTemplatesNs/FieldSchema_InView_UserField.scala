package typings.sharepoint.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldSchema_InView_UserField extends FieldSchema_InView {
  /** Either "TRUE" or "FALSE" */
  var AllowMultipleValues: String
  /** Either "1" or "0" */
  var DefaultRender: String
  /** Either "TRUE" or "FALSE" */
  var HasPrefix: String
  /** Either "1" or "0" */
  var HasUserLink: String
  /** Either "TRUE" or "FALSE" */
  var ImnHeader: String
}

object FieldSchema_InView_UserField {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    AllowMultipleValues: String,
    CalloutMenu: String,
    ClassInfo: String,
    DefaultRender: String,
    DisplayName: String,
    Explicit: String,
    FieldTitle: String,
    FieldType: String,
    Filterable: String,
    GridActiveAndReadOnly: String,
    GroupField: String,
    HasPrefix: String,
    HasUserLink: String,
    ID: String,
    ImnHeader: String,
    Name: String,
    ReadOnly: String,
    RealFieldName: String,
    ResultType: String,
    Sortable: String,
    Type: String,
    css: String,
    fieldRenderer: js.Any,
    listItemMenu: String
  ): FieldSchema_InView_UserField = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, AllowMultipleValues = AllowMultipleValues, CalloutMenu = CalloutMenu, ClassInfo = ClassInfo, DefaultRender = DefaultRender, DisplayName = DisplayName, Explicit = Explicit, FieldTitle = FieldTitle, FieldType = FieldType, Filterable = Filterable, GridActiveAndReadOnly = GridActiveAndReadOnly, GroupField = GroupField, HasPrefix = HasPrefix, HasUserLink = HasUserLink, ID = ID, ImnHeader = ImnHeader, Name = Name, ReadOnly = ReadOnly, RealFieldName = RealFieldName, ResultType = ResultType, Sortable = Sortable, Type = Type, css = css, fieldRenderer = fieldRenderer, listItemMenu = listItemMenu)
  
    __obj.asInstanceOf[FieldSchema_InView_UserField]
  }
}

