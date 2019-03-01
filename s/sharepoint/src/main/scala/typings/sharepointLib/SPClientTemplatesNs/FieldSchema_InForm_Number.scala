package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Number field in list form or in list view in grid mode */
trait FieldSchema_InForm_Number extends FieldSchema_InForm {
  var ShowAsPercentage: scala.Boolean
}

object FieldSchema_InForm_Number {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    Description: java.lang.String,
    Direction: java.lang.String,
    FieldType: java.lang.String,
    Hidden: scala.Boolean,
    IMEMode: js.Any,
    Id: java.lang.String,
    Name: java.lang.String,
    ReadOnlyField: scala.Boolean,
    Required: scala.Boolean,
    RestrictedMode: scala.Boolean,
    ShowAsPercentage: scala.Boolean,
    Title: java.lang.String,
    Type: java.lang.String,
    UseMinWidth: scala.Boolean
  ): FieldSchema_InForm_Number = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowGridEditing")(AllowGridEditing)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Direction")(Direction)
    __obj.updateDynamic("FieldType")(FieldType)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("IMEMode")(IMEMode)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ReadOnlyField")(ReadOnlyField)
    __obj.updateDynamic("Required")(Required)
    __obj.updateDynamic("RestrictedMode")(RestrictedMode)
    __obj.updateDynamic("ShowAsPercentage")(ShowAsPercentage)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UseMinWidth")(UseMinWidth)
    __obj.asInstanceOf[FieldSchema_InForm_Number]
  }
}

