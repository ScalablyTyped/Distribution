package typings.schemaUtils

import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema7
import typings.schemaUtils.validateMod.Extend
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils/declarations/util/hints", JSImport.Namespace)
@js.native
object hintsMod extends js.Object {
  def numberHints(schema: Schema, logic: Boolean): js.Array[String] = js.native
  def stringHints(schema: Schema, logic: Boolean): js.Array[String] = js.native
  type Schema = (JSONSchema4 with Extend) | (JSONSchema6 with Extend) | (JSONSchema7 with Extend)
}

