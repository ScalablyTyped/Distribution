package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.StatelessComponent
import typings.reactJsonschemaForm.anon.Children
import typings.reactJsonschemaForm.anon.Definitions
import typings.reactJsonschemaForm.anon.Description
import typings.reactJsonschemaForm.anon.Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayFieldTemplateProps[T] extends js.Object {
  var DescriptionField: StatelessComponent[Description] = js.native
  var TitleField: StatelessComponent[Id] = js.native
  var canAdd: Boolean = js.native
  var className: String = js.native
  var disabled: Boolean = js.native
  var formContext: js.Any = js.native
  var formData: T = js.native
  var idSchema: IdSchema[_] = js.native
  var items: js.Array[Children] = js.native
  var readonly: Boolean = js.native
  var registry: Definitions = js.native
  var required: Boolean = js.native
  var schema: JSONSchema6 = js.native
  var title: String = js.native
  var uiSchema: UiSchema = js.native
  def onAddClick(event: js.Any): js.Function1[/* event */ js.Any, Unit] = js.native
}

object ArrayFieldTemplateProps {
  @scala.inline
  def apply[T](
    DescriptionField: StatelessComponent[Description],
    TitleField: StatelessComponent[Id],
    canAdd: Boolean,
    className: String,
    disabled: Boolean,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema[_],
    items: js.Array[Children],
    onAddClick: js.Any => js.Function1[/* event */ js.Any, Unit],
    readonly: Boolean,
    registry: Definitions,
    required: Boolean,
    schema: JSONSchema6,
    title: String,
    uiSchema: UiSchema
  ): ArrayFieldTemplateProps[T] = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField.asInstanceOf[js.Any], TitleField = TitleField.asInstanceOf[js.Any], canAdd = canAdd.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onAddClick = js.Any.fromFunction1(onAddClick), readonly = readonly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayFieldTemplateProps[T]]
  }
  @scala.inline
  implicit class ArrayFieldTemplatePropsOps[Self <: ArrayFieldTemplateProps[_], T] (val x: Self with ArrayFieldTemplateProps[T]) extends AnyVal {
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
    def setDescriptionField(value: StatelessComponent[Description]): Self = this.set("DescriptionField", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleField(value: StatelessComponent[Id]): Self = this.set("TitleField", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanAdd(value: Boolean): Self = this.set("canAdd", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormContext(value: js.Any): Self = this.set("formContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormData(value: T): Self = this.set("formData", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdSchema(value: IdSchema[_]): Self = this.set("idSchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: Children*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[Children]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnAddClick(value: js.Any => js.Function1[/* event */ js.Any, Unit]): Self = this.set("onAddClick", js.Any.fromFunction1(value))
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegistry(value: Definitions): Self = this.set("registry", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: JSONSchema6): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUiSchema(value: UiSchema): Self = this.set("uiSchema", value.asInstanceOf[js.Any])
  }
  
}

