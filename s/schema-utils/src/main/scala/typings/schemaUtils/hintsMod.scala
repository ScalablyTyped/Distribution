package typings.schemaUtils

import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema7
import typings.schemaUtils.validateMod.Extend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hintsMod {
  
  @JSImport("schema-utils/declarations/util/hints", "numberHints")
  @js.native
  def numberHints(schema: Schema, logic: Boolean): js.Array[String] = js.native
  
  @JSImport("schema-utils/declarations/util/hints", "stringHints")
  @js.native
  def stringHints(schema: Schema, logic: Boolean): js.Array[String] = js.native
  
  type Schema = (JSONSchema4 with Extend) | (JSONSchema6 with Extend) | (JSONSchema7 with Extend)
}
