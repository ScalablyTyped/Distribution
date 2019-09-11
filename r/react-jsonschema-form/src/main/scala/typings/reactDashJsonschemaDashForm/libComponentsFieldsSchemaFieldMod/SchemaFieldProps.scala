package typings.reactDashJsonschemaDashForm.libComponentsFieldsSchemaFieldMod

import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import typings.reactDashJsonschemaDashForm.Anon_Definitions
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.FormValidation
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.IdSchema
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.UiSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaFieldProps[T] extends js.Object {
  var errorSchema: FormValidation
  var formData: T
  var idSchema: IdSchema
  var registry: Anon_Definitions
  var schema: JSONSchema6
  var uiSchema: UiSchema
}

object SchemaFieldProps {
  @scala.inline
  def apply[T](
    errorSchema: FormValidation,
    formData: T,
    idSchema: IdSchema,
    registry: Anon_Definitions,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): SchemaFieldProps[T] = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema, formData = formData.asInstanceOf[js.Any], idSchema = idSchema, registry = registry, schema = schema, uiSchema = uiSchema)
  
    __obj.asInstanceOf[SchemaFieldProps[T]]
  }
}

