package typings.schemaDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object schemaDashUtilsMod {
  import typings.ajv.ajvMod.ErrorObject
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
  import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7

  type PostFormatter = js.Function2[/* formattedError */ String, /* error */ ErrorObject, String]
  type Schema = JSONSchema4 | JSONSchema6 | JSONSchema7
}
