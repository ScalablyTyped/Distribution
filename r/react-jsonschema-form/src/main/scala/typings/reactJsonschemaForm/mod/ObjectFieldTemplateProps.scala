package typings.reactJsonschemaForm.mod

import typings.jsonSchema.mod.JSONSchema6
import typings.react.mod.StatelessComponent
import typings.reactJsonschemaForm.AnonContent
import typings.reactJsonschemaForm.AnonDescription
import typings.reactJsonschemaForm.AnonId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectFieldTemplateProps[T] extends js.Object {
  var DescriptionField: StatelessComponent[AnonDescription]
  var TitleField: StatelessComponent[AnonId]
  var description: String
  var formContext: js.Any
  var formData: T
  var idSchema: IdSchema[_]
  var properties: js.Array[AnonContent]
  var required: Boolean
  var schema: JSONSchema6
  var title: String
  var uiSchema: UiSchema
}

object ObjectFieldTemplateProps {
  @scala.inline
  def apply[T](
    DescriptionField: StatelessComponent[AnonDescription],
    TitleField: StatelessComponent[AnonId],
    description: String,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema[_],
    properties: js.Array[AnonContent],
    required: Boolean,
    schema: JSONSchema6,
    title: String,
    uiSchema: UiSchema
  ): ObjectFieldTemplateProps[T] = {
    val __obj = js.Dynamic.literal(DescriptionField = DescriptionField.asInstanceOf[js.Any], TitleField = TitleField.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectFieldTemplateProps[T]]
  }
}

