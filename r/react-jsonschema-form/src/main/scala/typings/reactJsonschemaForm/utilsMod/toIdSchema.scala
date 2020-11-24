package typings.reactJsonschemaForm.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6Definition
import typings.reactJsonschemaForm.mod.IdSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-jsonschema-form/lib/utils", "toIdSchema")
@js.native
object toIdSchema extends js.Object {
  
  def apply[T](schema: JSONSchema6Definition, id: String, definitions: StringDictionary[js.Any]): IdSchema[_] | js.Array[IdSchema[_]] = js.native
  def apply[T](schema: JSONSchema6Definition, id: String, definitions: StringDictionary[js.Any], formData: T): IdSchema[_] | js.Array[IdSchema[_]] = js.native
  def apply[T](
    schema: JSONSchema6Definition,
    id: String,
    definitions: StringDictionary[js.Any],
    formData: T,
    idPredix: String
  ): IdSchema[_] | js.Array[IdSchema[_]] = js.native
  def apply[T](
    schema: JSONSchema6Definition,
    id: String,
    definitions: StringDictionary[js.Any],
    formData: js.UndefOr[scala.Nothing],
    idPredix: String
  ): IdSchema[_] | js.Array[IdSchema[_]] = js.native
}
