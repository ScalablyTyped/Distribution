package typings.schemaUtils

import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema7
import typings.schemaUtils.validateMod.ValidationErrorConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(schema: JSONSchema4, options: js.Array[js.Object]): Unit = js.native
  def apply(schema: JSONSchema4, options: js.Array[js.Object], configuration: ValidationErrorConfiguration): Unit = js.native
  /**
    * @param {Schema} schema
    * @param {Array<object> | object} options
    * @param {ValidationErrorConfiguration=} configuration
    * @returns {void}
    */
  def apply(schema: JSONSchema4, options: js.Object): Unit = js.native
  def apply(schema: JSONSchema4, options: js.Object, configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: JSONSchema6, options: js.Array[js.Object]): Unit = js.native
  def apply(schema: JSONSchema6, options: js.Array[js.Object], configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: JSONSchema6, options: js.Object): Unit = js.native
  def apply(schema: JSONSchema6, options: js.Object, configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: JSONSchema7, options: js.Array[js.Object]): Unit = js.native
  def apply(schema: JSONSchema7, options: js.Array[js.Object], configuration: ValidationErrorConfiguration): Unit = js.native
  def apply(schema: JSONSchema7, options: js.Object): Unit = js.native
  def apply(schema: JSONSchema7, options: js.Object, configuration: ValidationErrorConfiguration): Unit = js.native
}

