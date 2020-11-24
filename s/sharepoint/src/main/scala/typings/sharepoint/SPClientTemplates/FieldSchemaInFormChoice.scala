package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents schema for a Choice field in list form or in list view in grid mode */
@js.native
trait FieldSchemaInFormChoice extends FieldSchemaInForm {
  
  /** List of choices for this field. */
  var Choices: js.Array[String] = js.native
  
  /** Display format for the choice field */
  var FormatType: ChoiceFormatType = js.native
}
object FieldSchemaInFormChoice {
  
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    Choices: js.Array[String],
    Description: String,
    Direction: String,
    FieldType: String,
    FormatType: ChoiceFormatType,
    Hidden: Boolean,
    IMEMode: js.Any,
    Id: String,
    Name: String,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    Title: String,
    Type: String,
    UseMinWidth: Boolean
  ): FieldSchemaInFormChoice = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], Choices = Choices.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], FormatType = FormatType.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInFormChoice]
  }
  
  @scala.inline
  implicit class FieldSchemaInFormChoiceOps[Self <: FieldSchemaInFormChoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChoicesVarargs(value: String*): Self = this.set("Choices", js.Array(value :_*))
    
    @scala.inline
    def setChoices(value: js.Array[String]): Self = this.set("Choices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatType(value: ChoiceFormatType): Self = this.set("FormatType", value.asInstanceOf[js.Any])
  }
}
