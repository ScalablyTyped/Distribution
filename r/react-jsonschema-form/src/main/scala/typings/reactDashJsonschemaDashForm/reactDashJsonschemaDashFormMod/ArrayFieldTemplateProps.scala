package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import typings.react.reactMod.StatelessComponent
import typings.reactDashJsonschemaDashForm.Anon_Children
import typings.reactDashJsonschemaDashForm.Anon_Definitions
import typings.reactDashJsonschemaDashForm.Anon_Description
import typings.reactDashJsonschemaDashForm.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayFieldTemplateProps[T] extends js.Object {
  var DescriptionField: StatelessComponent[Anon_Description]
  var TitleField: StatelessComponent[Anon_Id]
  var canAdd: Boolean
  var className: String
  var disabled: Boolean
  var formContext: js.Any
  var formData: T
  var idSchema: IdSchema
  var items: js.Array[Anon_Children]
  var readonly: Boolean
  var registry: Anon_Definitions
  var required: Boolean
  var schema: JSONSchema6
  var title: String
  var uiSchema: UiSchema
  def onAddClick(event: js.Any): js.Function1[/* event */ js.Any, Unit]
}

object ArrayFieldTemplateProps {
  @scala.inline
  def apply[T](
    DescriptionField: StatelessComponent[Anon_Description],
    TitleField: StatelessComponent[Anon_Id],
    canAdd: Boolean,
    className: String,
    disabled: Boolean,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema,
    items: js.Array[Anon_Children],
    onAddClick: js.Any => js.Function1[/* event */ js.Any, Unit],
    readonly: Boolean,
    registry: Anon_Definitions,
    required: Boolean,
    schema: JSONSchema6,
    title: String,
    uiSchema: UiSchema
  ): ArrayFieldTemplateProps[T] = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField.asInstanceOf[js.Any], TitleField = TitleField.asInstanceOf[js.Any], canAdd = canAdd.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onAddClick = js.Any.fromFunction1(onAddClick), readonly = readonly.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArrayFieldTemplateProps[T]]
  }
}

