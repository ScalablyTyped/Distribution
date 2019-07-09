package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayFieldTemplateProps[T] extends js.Object {
  var DescriptionField: reactLib.reactMod.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Description]
  var TitleField: reactLib.reactMod.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Id]
  var canAdd: scala.Boolean
  var className: java.lang.String
  var disabled: scala.Boolean
  var formContext: js.Any
  var formData: T
  var idSchema: IdSchema
  var items: js.Array[reactDashJsonschemaDashFormLib.Anon_Children]
  var readonly: scala.Boolean
  var registry: reactDashJsonschemaDashFormLib.Anon_Definitions
  var required: scala.Boolean
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  var title: java.lang.String
  var uiSchema: UiSchema
  def onAddClick(event: js.Any): js.Function1[/* event */ js.Any, scala.Unit]
}

object ArrayFieldTemplateProps {
  @scala.inline
  def apply[T](
    DescriptionField: reactLib.reactMod.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Description],
    TitleField: reactLib.reactMod.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Id],
    canAdd: scala.Boolean,
    className: java.lang.String,
    disabled: scala.Boolean,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema,
    items: js.Array[reactDashJsonschemaDashFormLib.Anon_Children],
    onAddClick: js.Any => js.Function1[/* event */ js.Any, scala.Unit],
    readonly: scala.Boolean,
    registry: reactDashJsonschemaDashFormLib.Anon_Definitions,
    required: scala.Boolean,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    title: java.lang.String,
    uiSchema: UiSchema
  ): ArrayFieldTemplateProps[T] = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField, TitleField = TitleField, canAdd = canAdd, className = className, disabled = disabled, formContext = formContext, formData = formData.asInstanceOf[js.Any], idSchema = idSchema, items = items, onAddClick = js.Any.fromFunction1(onAddClick), readonly = readonly, registry = registry, required = required, schema = schema, title = title, uiSchema = uiSchema)
  
    __obj.asInstanceOf[ArrayFieldTemplateProps[T]]
  }
}

