package typings.reactDashJsonschemaDashForm.libUtilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6Definition
import typings.reactDashJsonschemaDashForm.reactDashJsonschemaDashFormMod.IdSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/utils", "toIdSchema")
@js.native
object toIdSchema extends js.Object {
  def apply[T](
    schema: JSONSchema6Definition,
    id: String,
    definitions: StringDictionary[js.Any],
    formData: T,
    idPredix: String
  ): IdSchema = js.native
}

