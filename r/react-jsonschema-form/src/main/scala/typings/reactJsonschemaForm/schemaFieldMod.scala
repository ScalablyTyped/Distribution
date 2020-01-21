package typings.reactJsonschemaForm

import typings.react.mod.Component
import typings.reactJsonschemaForm.mod.FieldProps
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.errorSchema
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.formData
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.idSchema
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.registry
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.schema
import typings.reactJsonschemaForm.reactJsonschemaFormStrings.uiSchema
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/components/fields/SchemaField", JSImport.Namespace)
@js.native
object schemaFieldMod extends js.Object {
  @js.native
  class default ()
    extends Component[SchemaFieldProps[js.Any], js.Object, js.Any]
  
  type SchemaField = Component[SchemaFieldProps[js.Any], js.Object, js.Any]
  type SchemaFieldProps[T] = Pick[FieldProps[T], schema | uiSchema | idSchema | formData | errorSchema | registry]
}

