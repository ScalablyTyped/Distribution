package typings.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents field schema in Grid mode and on list forms.
  Consider casting objects of this type to more specific field types, e.g. FieldSchemaInForm_Lookup */
@js.native
trait FieldSchemaInForm extends FieldSchema {
  /** Description for this field. */
  var Description: String = js.native
  /** Direction of the reading order for the field. */
  var Direction: String = js.native
  /** Indicates whether the field is hidden */
  var Hidden: Boolean = js.native
  /** Specifies Input Method Editor (IME) mode bias to use for the field.
    The IME enables conversion of keystrokes between languages when one writing system has more characters than can be encoded for the given keyboard. */
  var IMEMode: js.Any = js.native
  /** Guid of the field */
  var Id: String = js.native
  /** Specifies if the field is read only */
  var ReadOnlyField: Boolean = js.native
  /** Specifies wherever field requires values */
  var Required: Boolean = js.native
  var RestrictedMode: Boolean = js.native
  /** Title of the field */
  var Title: String = js.native
  /** If SPFarm.Local.UseMinWidthForHtmlPicker is true, UseMinWidth will be set to true. Undefined in other cases. */
  var UseMinWidth: Boolean = js.native
}

object FieldSchemaInForm {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    Description: String,
    Direction: String,
    FieldType: String,
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
  ): FieldSchemaInForm = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInForm]
  }
  @scala.inline
  implicit class FieldSchemaInFormOps[Self <: FieldSchemaInForm] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("Direction", value.asInstanceOf[js.Any])
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("Hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setIMEMode(value: js.Any): Self = this.set("IMEMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setReadOnlyField(value: Boolean): Self = this.set("ReadOnlyField", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("Required", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestrictedMode(value: Boolean): Self = this.set("RestrictedMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("Title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseMinWidth(value: Boolean): Self = this.set("UseMinWidth", value.asInstanceOf[js.Any])
  }
  
}

