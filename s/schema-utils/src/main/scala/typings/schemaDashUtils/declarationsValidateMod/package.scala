package typings.schemaDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object declarationsValidateMod {
  import typings.schemaDashUtils.Anon_Children

  type ErrorObject = typings.ajv.ajvMod.ErrorObject
  type JSONSchema4 = typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
  type JSONSchema6 = typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
  type JSONSchema7 = typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
  type PostFormatter = js.Function2[
    /* formattedError */ String, 
    /* error */ typings.ajv.ajvMod.ErrorObject with Anon_Children, 
    String
  ]
  type Schema = typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4 | typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6 | typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
  type SchemaUtilErrorObject = typings.ajv.ajvMod.ErrorObject with Anon_Children
}
