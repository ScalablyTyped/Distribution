package typings.reactDashJsonschemaDashForm

import typings.react.reactMod.Component
import typings.reactDashJsonschemaDashForm.libComponentsFieldsSchemaFieldMod.SchemaFieldProps
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.FieldProps
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.errorSchema
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.formData
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.idSchema
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.registry
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.schema
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormStrings.uiSchema
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/components/fields/SchemaField", JSImport.Namespace)
@js.native
object libComponentsFieldsSchemaFieldMod extends js.Object {
  @js.native
  class default ()
    extends Component[SchemaFieldProps[js.Any], js.Object, js.Any]
  
  type SchemaField = Component[SchemaFieldProps[js.Any], js.Object, js.Any]
  type SchemaFieldProps[T] = Pick[FieldProps[T], schema | uiSchema | idSchema | formData | errorSchema | registry]
}

