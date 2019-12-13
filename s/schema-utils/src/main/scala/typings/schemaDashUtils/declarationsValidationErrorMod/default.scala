package typings.schemaDashUtils.declarationsValidationErrorMod

import typings.ajv.ajvMod.ErrorObject
import typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema4
import typings.schemaDashUtils.Anon_Children
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
  def this(errors: js.Array[ErrorObject with Anon_Children], schema: JSONSchema4) = this()
  def this(
    errors: js.Array[ErrorObject with Anon_Children],
    schema: typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6
  ) = this()
  def this(
    errors: js.Array[ErrorObject with Anon_Children],
    schema: typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7
  ) = this()
  def this(
    errors: js.Array[ErrorObject with Anon_Children],
    schema: JSONSchema4,
    configuration: typings.schemaDashUtils.declarationsValidateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObject with Anon_Children],
    schema: typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema6,
    configuration: typings.schemaDashUtils.declarationsValidateMod.ValidationErrorConfiguration
  ) = this()
  def this(
    errors: js.Array[ErrorObject with Anon_Children],
    schema: typings.jsonDashSchema.jsonDashSchemaMod.JSONSchema7,
    configuration: typings.schemaDashUtils.declarationsValidateMod.ValidationErrorConfiguration
  ) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

