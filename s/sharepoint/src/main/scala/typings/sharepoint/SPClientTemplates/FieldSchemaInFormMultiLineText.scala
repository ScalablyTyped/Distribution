package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents schema for a Choice field in list form or in list view in grid mode */
trait FieldSchemaInFormMultiLineText
  extends StObject
     with FieldSchemaInForm {
  
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
object FieldSchemaInFormMultiLineText {
  
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
  ): FieldSchemaInFormMultiLineText = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], AllowHyperlink = AllowHyperlink.asInstanceOf[js.Any], AppendOnly = AppendOnly.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberOfLines = NumberOfLines.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], RichText = RichText.asInstanceOf[js.Any], RichTextMode = RichTextMode.asInstanceOf[js.Any], ScriptEditorAdderId = ScriptEditorAdderId.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInFormMultiLineText]
  }
  
  @scala.inline
  implicit class FieldSchemaInFormMultiLineTextMutableBuilder[Self <: FieldSchemaInFormMultiLineText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowHyperlink(value: Boolean): Self = StObject.set(x, "AllowHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendOnly(value: Boolean): Self = StObject.set(x, "AppendOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfLines(value: Double): Self = StObject.set(x, "NumberOfLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichText(value: Boolean): Self = StObject.set(x, "RichText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRichTextMode(value: RichTextMode): Self = StObject.set(x, "RichTextMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScriptEditorAdderId(value: String): Self = StObject.set(x, "ScriptEditorAdderId", value.asInstanceOf[js.Any])
  }
}
