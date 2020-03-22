package typings.reactJsonschemaForm.schemaFieldMod

import typings.jsonSchema.mod.JSONSchema6
import typings.reactJsonschemaForm.AnonDefinitions
import typings.reactJsonschemaForm.mod.ErrorSchema
import typings.reactJsonschemaForm.mod.IdSchema
import typings.reactJsonschemaForm.mod.UiSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<react-jsonschema-form.react-jsonschema-form.FieldProps<T>, 'schema' | 'uiSchema' | 'idSchema' | 'formData' | 'errorSchema' | 'registry' | 'formContext'> */
trait SchemaFieldProps[T] extends js.Object {
  var errorSchema: ErrorSchema
  var formContext: js.Any
  var formData: T
  var idSchema: IdSchema[_]
  var registry: AnonDefinitions
  var schema: JSONSchema6
  var uiSchema: UiSchema
}

object SchemaFieldProps {
  @scala.inline
  def apply[T](
    errorSchema: ErrorSchema,
    formContext: js.Any,
    formData: T,
    idSchema: IdSchema[_],
    registry: AnonDefinitions,
    schema: JSONSchema6,
    uiSchema: UiSchema
  ): SchemaFieldProps[T] = {
    val __obj = js.Dynamic.literal(errorSchema = errorSchema.asInstanceOf[js.Any], formContext = formContext.asInstanceOf[js.Any], formData = formData.asInstanceOf[js.Any], idSchema = idSchema.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], uiSchema = uiSchema.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SchemaFieldProps[T]]
  }
}

