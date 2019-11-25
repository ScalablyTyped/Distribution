package typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod

import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import typings.react.reactMod.StatelessComponent
import typings.reactDashJsonschemaDashForm.Anon_Content
import typings.reactDashJsonschemaDashForm.Anon_Description
import typings.reactDashJsonschemaDashForm.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectFieldTemplateProps[T] extends js.Object {
  var DescriptionField: StatelessComponent[Anon_Description]
  var TitleField: StatelessComponent[Anon_Id]
  var description: String
  var formContext: js.Any
  var formData: T
  var idSchema: IdSchema
  var properties: js.Array[Anon_Content]
  var required: Boolean
  var schema: JSONSchema6
  var title: String
  var uiSchema: UiSchema
}

object ObjectFieldTemplateProps {
  @scala.inline
  def apply[T](
    DescriptionField: StatelessComponent[Anon_Description],
    TitleField: StatelessComponent[Anon_Id],
    description: String,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema,
    properties: js.Array[Anon_Content],
    required: Boolean,
    schema: JSONSchema6,
    title: String,
    uiSchema: UiSchema
  ): ObjectFieldTemplateProps[T] = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField.asInstanceOf[js.Any], TitleField = TitleField.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectFieldTemplateProps[T]]
  }
}

