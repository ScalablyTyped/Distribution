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

trait ArrayFieldTemplateProps[T] extends js.Object {
  var DescriptionField: StatelessComponent[Description]
  var TitleField: StatelessComponent[Id]
  var canAdd: Boolean
  var className: String
  var disabled: Boolean
  var formContext: js.Any
  var formData: T
  var idSchema: IdSchema[_]
  var items: js.Array[Children]
  var readonly: Boolean
  var registry: Definitions
  var required: Boolean
  var schema: JSONSchema6
  var title: String
  var uiSchema: UiSchema
  def onAddClick(event: js.Any): js.Function1[/* event */ js.Any, Unit]
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
}

