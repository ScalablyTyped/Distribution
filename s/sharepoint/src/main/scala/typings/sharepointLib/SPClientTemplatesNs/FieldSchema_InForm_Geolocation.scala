package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a DateTime field in list form or in list view in grid mode */
trait FieldSchema_InForm_Geolocation extends FieldSchema_InForm {
  var BingMapsKey: java.lang.String
  var IsBingMapBlockedInCurrentRegion: scala.Boolean
}

object FieldSchema_InForm_Geolocation {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    BingMapsKey: java.lang.String,
    Description: java.lang.String,
    Direction: java.lang.String,
    FieldType: java.lang.String,
    Hidden: scala.Boolean,
    IMEMode: js.Any,
    Id: java.lang.String,
    IsBingMapBlockedInCurrentRegion: scala.Boolean,
    Name: java.lang.String,
    ReadOnlyField: scala.Boolean,
    Required: scala.Boolean,
    RestrictedMode: scala.Boolean,
    Title: java.lang.String,
    Type: java.lang.String,
    UseMinWidth: scala.Boolean
  ): FieldSchema_InForm_Geolocation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowGridEditing")(AllowGridEditing)
    __obj.updateDynamic("BingMapsKey")(BingMapsKey)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Direction")(Direction)
    __obj.updateDynamic("FieldType")(FieldType)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("IMEMode")(IMEMode)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("IsBingMapBlockedInCurrentRegion")(IsBingMapBlockedInCurrentRegion)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("ReadOnlyField")(ReadOnlyField)
    __obj.updateDynamic("Required")(Required)
    __obj.updateDynamic("RestrictedMode")(RestrictedMode)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UseMinWidth")(UseMinWidth)
    __obj.asInstanceOf[FieldSchema_InForm_Geolocation]
  }
}

