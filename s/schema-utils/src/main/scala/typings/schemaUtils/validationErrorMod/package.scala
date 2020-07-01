package typings.schemaUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationErrorMod {
  type JSONSchema6 = typings.jsonSchema.mod.JSONSchema6
  type JSONSchema7 = typings.jsonSchema.mod.JSONSchema7
  type PostFormatter = js.Function2[
    /* formattedError */ java.lang.String, 
    /* error */ typings.schemaUtils.anon.ErrorObjectchildrenArrayE, 
    java.lang.String
  ]
  type SPECIFICITY = scala.Double
  type Schema = (typings.jsonSchema.mod.JSONSchema4 with typings.schemaUtils.validateMod.Extend) | (typings.jsonSchema.mod.JSONSchema6 with typings.schemaUtils.validateMod.Extend) | (typings.jsonSchema.mod.JSONSchema7 with typings.schemaUtils.validateMod.Extend)
}
