package typings.reactDashJsonschemaDashForm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsFieldsSchemaFieldMod {
  import typings.react.reactMod.Component
  import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.FieldProps
  import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.errorSchema
  import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.formData
  import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.idSchema
  import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.registry
  import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.schema
  import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.uiSchema
  import typings.std.Pick

  type SchemaField = Component[SchemaFieldProps[js.Any], js.Object, js.Any]
  type SchemaFieldProps[T] = Pick[FieldProps[T], schema | uiSchema | idSchema | formData | errorSchema | registry]
}
