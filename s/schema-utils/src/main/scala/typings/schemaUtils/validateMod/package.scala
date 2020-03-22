package typings.schemaUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validateMod {
  type ErrorObject = typings.ajv.mod.ErrorObject
  type JSONSchema4 = typings.jsonSchema.mod.JSONSchema4
  type JSONSchema6 = typings.jsonSchema.mod.JSONSchema6
  type JSONSchema7 = typings.jsonSchema.mod.JSONSchema7
  type PostFormatter = js.Function2[
    /* formattedError */ java.lang.String, 
    /* error */ typings.schemaUtils.ErrorObjectchildrenArrayE, 
    java.lang.String
  ]
  type Schema = typings.jsonSchema.mod.JSONSchema4 | typings.jsonSchema.mod.JSONSchema6 | typings.jsonSchema.mod.JSONSchema7
}
