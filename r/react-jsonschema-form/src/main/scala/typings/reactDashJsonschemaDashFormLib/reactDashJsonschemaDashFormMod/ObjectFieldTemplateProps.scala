package typings
package reactDashJsonschemaDashFormLib.reactDashJsonschemaDashFormMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectFieldTemplateProps extends js.Object {
  var DescriptionField: reactLib.reactMod.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Description]
  var TitleField: reactLib.reactMod.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Id]
  var description: java.lang.String
  var formContext: js.Any
  var formData: js.Any
  var idSchema: IdSchema
  var properties: js.Array[reactDashJsonschemaDashFormLib.Anon_Content]
  var required: scala.Boolean
  var schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6
  var title: java.lang.String
  var uiSchema: UiSchema
}

object ObjectFieldTemplateProps {
  @scala.inline
  def apply(
    DescriptionField: reactLib.reactMod.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Description],
    TitleField: reactLib.reactMod.StatelessComponent[reactDashJsonschemaDashFormLib.Anon_Id],
    description: java.lang.String,
    formContext: js.Any,
    formData: js.Any,
    idSchema: IdSchema,
    properties: js.Array[reactDashJsonschemaDashFormLib.Anon_Content],
    required: scala.Boolean,
    schema: jsonDashSchemaLib.jsonDashSchemaMod.JSONSchema6,
    title: java.lang.String,
    uiSchema: UiSchema
  ): ObjectFieldTemplateProps = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField, TitleField = TitleField, description = description, formContext = formContext, formData = formData, idSchema = idSchema, properties = properties, required = required, schema = schema, title = title, uiSchema = uiSchema)
  
    __obj.asInstanceOf[ObjectFieldTemplateProps]
  }
}

