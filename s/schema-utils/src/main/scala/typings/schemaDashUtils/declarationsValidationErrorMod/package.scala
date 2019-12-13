package typings.schemaDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object declarationsValidationErrorMod {
  import typings.ajv.ajvMod.ErrorObject
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
  import typings.schemaDashUtils.Anon_Children

  type JSONSchema6 = typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
  type JSONSchema7 = typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
  type PostFormatter = js.Function2[/* formattedError */ String, /* error */ ErrorObject with Anon_Children, String]
  type SPECIFICITY = Double
  type Schema = JSONSchema4 | typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6 | typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
  type SchemaUtilErrorObject = ErrorObject with Anon_Children
}
