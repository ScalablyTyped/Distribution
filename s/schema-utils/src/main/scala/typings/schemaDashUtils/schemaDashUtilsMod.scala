package typings.schemaDashUtils

import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
import typings.schemaDashUtils.declarationsValidateMod.ValidationErrorConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils", JSImport.Namespace)
@js.native
object schemaDashUtilsMod extends js.Object {
  /**
    * @param {Schema} schema
    * @param {Array<object> | object} options
    * @param {ValidationErrorConfiguration=} configuration
    * @returns {void}
    */
  def apply(schema: JSONSchema4, options: js.Any): Unit = js.native
  def apply(schema: JSONSchema4, options: js.Any, configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: JSONSchema6, options: js.Any): Unit = js.native
  def apply(schema: JSONSchema6, options: js.Any, configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: JSONSchema7, options: js.Any): Unit = js.native
  def apply(schema: JSONSchema7, options: js.Any, configuration: ValidationErrorConfiguration): Unit = js.native
}

