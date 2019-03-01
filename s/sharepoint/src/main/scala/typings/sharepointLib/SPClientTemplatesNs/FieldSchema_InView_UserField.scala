package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldSchema_InView_UserField extends FieldSchema_InView {
  /** Either "TRUE" or "FALSE" */
  var AllowMultipleValues: java.lang.String
  /** Either "1" or "0" */
  var DefaultRender: java.lang.String
  /** Either "TRUE" or "FALSE" */
  var HasPrefix: java.lang.String
  /** Either "1" or "0" */
  var HasUserLink: java.lang.String
  /** Either "TRUE" or "FALSE" */
  var ImnHeader: java.lang.String
}

object FieldSchema_InView_UserField {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    AllowMultipleValues: java.lang.String,
    CalloutMenu: java.lang.String,
    ClassInfo: java.lang.String,
    DefaultRender: java.lang.String,
    DisplayName: java.lang.String,
    Explicit: java.lang.String,
    FieldTitle: java.lang.String,
    FieldType: java.lang.String,
    Filterable: java.lang.String,
    GridActiveAndReadOnly: java.lang.String,
    GroupField: java.lang.String,
    HasPrefix: java.lang.String,
    HasUserLink: java.lang.String,
    ID: java.lang.String,
    ImnHeader: java.lang.String,
    Name: java.lang.String,
    ReadOnly: java.lang.String,
    RealFieldName: java.lang.String,
    ResultType: java.lang.String,
    Sortable: java.lang.String,
    Type: java.lang.String,
    css: java.lang.String,
    fieldRenderer: js.Any,
    listItemMenu: java.lang.String
  ): FieldSchema_InView_UserField = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowGridEditing")(AllowGridEditing)
    __obj.updateDynamic("AllowMultipleValues")(AllowMultipleValues)
    __obj.updateDynamic("CalloutMenu")(CalloutMenu)
    __obj.updateDynamic("ClassInfo")(ClassInfo)
    __obj.updateDynamic("DefaultRender")(DefaultRender)
    __obj.updateDynamic("DisplayName")(DisplayName)
    __obj.updateDynamic("Explicit")(Explicit)
    __obj.updateDynamic("FieldTitle")(FieldTitle)
    __obj.updateDynamic("FieldType")(FieldType)
    __obj.updateDynamic("Filterable")(Filterable)
    __obj.updateDynamic("GridActiveAndReadOnly")(GridActiveAndReadOnly)
    __obj.updateDynamic("GroupField")(GroupField)
    __obj.updateDynamic("HasPrefix")(HasPrefix)
    __obj.updateDynamic("HasUserLink")(HasUserLink)
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("ImnHeader")(ImnHeader)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ReadOnly")(ReadOnly)
    __obj.updateDynamic("RealFieldName")(RealFieldName)
    __obj.updateDynamic("ResultType")(ResultType)
    __obj.updateDynamic("Sortable")(Sortable)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("fieldRenderer")(fieldRenderer)
    __obj.updateDynamic("listItemMenu")(listItemMenu)
    __obj.asInstanceOf[FieldSchema_InView_UserField]
  }
}

