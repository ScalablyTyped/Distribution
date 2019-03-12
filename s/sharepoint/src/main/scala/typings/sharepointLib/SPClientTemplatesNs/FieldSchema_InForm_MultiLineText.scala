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
  var RichTextMode: sharepointLib.SPClientTemplatesNs.RichTextMode
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
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, AllowHyperlink = AllowHyperlink, AppendOnly = AppendOnly, Description = Description, Direction = Direction, FieldType = FieldType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, Name = Name, NumberOfLines = NumberOfLines, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, RichText = RichText, RichTextMode = RichTextMode, ScriptEditorAdderId = ScriptEditorAdderId, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_MultiLineText]
  }
}

