package typings
package sharepointLib.SPClientTemplatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Choice field in list form or in list view in grid mode */
trait FieldSchema_InForm_MultiLineText extends FieldSchema_InForm {
  /** A boolean value that specifies whether hyperlinks can be used in this fields. */
  var AllowHyperlink: scala.Boolean
  /** Changes are appended to the existing text. */
  var AppendOnly: scala.Boolean
  /** Number of lines configured to display */
  var NumberOfLines: scala.Double
  /** Specifies whether rich text formatting can be used in the field */
  var RichText: scala.Boolean
  /** Rich text mode for the field */
  var RichTextMode: RichTextMode
  /** WebPartAdderId for the ScriptEditorWebPart */
  var ScriptEditorAdderId: java.lang.String
}

object FieldSchema_InForm_MultiLineText {
  @scala.inline
  def apply(
    AllowGridEditing: scala.Boolean,
    AllowHyperlink: scala.Boolean,
    AppendOnly: scala.Boolean,
    Description: java.lang.String,
    Direction: java.lang.String,
    FieldType: java.lang.String,
    Hidden: scala.Boolean,
    IMEMode: js.Any,
    Id: java.lang.String,
    Name: java.lang.String,
    NumberOfLines: scala.Double,
    ReadOnlyField: scala.Boolean,
    Required: scala.Boolean,
    RestrictedMode: scala.Boolean,
    RichText: scala.Boolean,
    RichTextMode: RichTextMode,
    ScriptEditorAdderId: java.lang.String,
    Title: java.lang.String,
    Type: java.lang.String,
    UseMinWidth: scala.Boolean
  ): FieldSchema_InForm_MultiLineText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AllowGridEditing")(AllowGridEditing)
    __obj.updateDynamic("AllowHyperlink")(AllowHyperlink)
    __obj.updateDynamic("AppendOnly")(AppendOnly)
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Direction")(Direction)
    __obj.updateDynamic("FieldType")(FieldType)
    __obj.updateDynamic("Hidden")(Hidden)
    __obj.updateDynamic("IMEMode")(IMEMode)
    __obj.updateDynamic("Id")(Id)
    __obj.updateDynamic("Name")(Name)
    __obj.updateDynamic("NumberOfLines")(NumberOfLines)
    __obj.updateDynamic("ReadOnlyField")(ReadOnlyField)
    __obj.updateDynamic("Required")(Required)
    __obj.updateDynamic("RestrictedMode")(RestrictedMode)
    __obj.updateDynamic("RichText")(RichText)
    __obj.updateDynamic("RichTextMode")(RichTextMode)
    __obj.updateDynamic("ScriptEditorAdderId")(ScriptEditorAdderId)
    __obj.updateDynamic("Title")(Title)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UseMinWidth")(UseMinWidth)
    __obj.asInstanceOf[FieldSchema_InForm_MultiLineText]
  }
}

