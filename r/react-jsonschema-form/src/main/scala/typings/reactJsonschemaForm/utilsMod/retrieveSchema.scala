package typings.reactJsonschemaForm.utilsMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema6Definition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-jsonschema-form/lib/utils", "retrieveSchema")
@js.native
object retrieveSchema extends js.Object {
  def apply[T](schema: JSONSchema6Definition): JSONSchema6 = js.native
  def apply[T](schema: JSONSchema6Definition, definitions: js.UndefOr[scala.Nothing], formData: T): JSONSchema6 = js.native
  def apply[T](schema: JSONSchema6Definition, definitions: StringDictionary[js.Any]): JSONSchema6 = js.native
  def apply[T](schema: JSONSchema6Definition, definitions: StringDictionary[js.Any], formData: T): JSONSchema6 = js.native
}

