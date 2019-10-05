package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a Choice field in list form or in list view in grid mode */
trait FieldSchema_InForm_MultiLineText extends FieldSchema_InForm {
  /** A boolean value that specifies whether hyperlinks can be used in this fields. */
  var AllowHyperlink: Boolean
  /** Changes are appended to the existing text. */
  var AppendOnly: Boolean
  /** Number of lines configured to display */
  var NumberOfLines: Double
  /** Specifies whether rich text formatting can be used in the field */
  var RichText: Boolean
  /** Rich text mode for the field */
  var RichTextMode: typings.sharepoint.SPClientTemplates.RichTextMode
  /** WebPartAdderId for the ScriptEditorWebPart */
  var ScriptEditorAdderId: String
}

object FieldSchema_InForm_MultiLineText {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    AllowHyperlink: Boolean,
    AppendOnly: Boolean,
    Description: String,
    Direction: String,
    FieldType: String,
    Hidden: Boolean,
    IMEMode: js.Any,
    Id: String,
    Name: String,
    NumberOfLines: Double,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    RichText: Boolean,
    RichTextMode: RichTextMode,
    ScriptEditorAdderId: String,
    Title: String,
    Type: String,
    UseMinWidth: Boolean
  ): FieldSchema_InForm_MultiLineText = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing, AllowHyperlink = AllowHyperlink, AppendOnly = AppendOnly, Description = Description, Direction = Direction, FieldType = FieldType, Hidden = Hidden, IMEMode = IMEMode, Id = Id, Name = Name, NumberOfLines = NumberOfLines, ReadOnlyField = ReadOnlyField, Required = Required, RestrictedMode = RestrictedMode, RichText = RichText, RichTextMode = RichTextMode, ScriptEditorAdderId = ScriptEditorAdderId, Title = Title, Type = Type, UseMinWidth = UseMinWidth)
  
    __obj.asInstanceOf[FieldSchema_InForm_MultiLineText]
  }
}

