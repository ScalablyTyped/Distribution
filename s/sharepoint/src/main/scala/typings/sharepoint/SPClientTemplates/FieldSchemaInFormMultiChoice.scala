package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents schema for a Choice field in list form or in list view in grid mode */
@js.native
trait FieldSchemaInFormMultiChoice extends FieldSchemaInForm {
  
  /** Indicates wherever fill-in choice is allowed */
  var FillInChoice: Boolean = js.native
  
  /** List of choices for this field. */
  var MultiChoices: js.Array[String] = js.native
}
object FieldSchemaInFormMultiChoice {
  
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    Description: String,
    Direction: String,
    FieldType: String,
    FillInChoice: Boolean,
    Hidden: Boolean,
    IMEMode: js.Any,
    Id: String,
    MultiChoices: js.Array[String],
    Name: String,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    Title: String,
    Type: String,
    UseMinWidth: Boolean
  ): FieldSchemaInFormMultiChoice = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], FillInChoice = FillInChoice.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], MultiChoices = MultiChoices.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInFormMultiChoice]
  }
  
  @scala.inline
  implicit class FieldSchemaInFormMultiChoiceOps[Self <: FieldSchemaInFormMultiChoice] (val x: Self) extends AnyVal {
    
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
    def setFillInChoice(value: Boolean): Self = this.set("FillInChoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiChoicesVarargs(value: String*): Self = this.set("MultiChoices", js.Array(value :_*))
    
    @scala.inline
    def setMultiChoices(value: js.Array[String]): Self = this.set("MultiChoices", value.asInstanceOf[js.Any])
  }
}
