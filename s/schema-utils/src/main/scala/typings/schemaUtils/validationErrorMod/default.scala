package typings.schemaUtils.validationErrorMod

import typings.ajv.mod.ErrorObject
import typings.jsonSchema.mod.JSONSchema4
import typings.schemaUtils.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils/declarations/ValidationError", JSImport.Default)
@js.native
class default protected () extends ValidationError {
  /**
    * @param {Array<SchemaUtilErrorObject>} errors
    * @param {Schema} schema
    * @param {ValidationErrorConfiguration} configuration
    */
  def this(errors: js.Array[ErrorObject with AnonChildren], schema: JSONSchema4) = this()
  def this(errors: js.Array[ErrorObject with AnonChildren], schema: typings.jsonSchema.mod.JSONSchema6) = this()
  def this(errors: js.Array[ErrorObject with AnonChildren], schema: typings.jsonSchema.mod.JSONSchema7) = this()
  def this(
    errors: js.Array[ErrorObject with AnonChildren],
    schema: JSONSchema4,
    configuration: typings.schemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObject with AnonChildren],
    schema: typings.jsonSchema.mod.JSONSchema6,
    configuration: typings.schemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObject with AnonChildren],
    schema: typings.jsonSchema.mod.JSONSchema7,
    configuration: typings.schemaUtils.validateMod.ValidationErrorConfiguration
  ) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

