package typings.schemaUtils.validateMod

import typings.schemaUtils.validationErrorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("schema-utils/declarations/validate", "ValidationError")
@js.native
class ValidationError protected () extends default {
  /**
    * @param {Array<SchemaUtilErrorObject>} errors
    * @param {Schema} schema
    * @param {ValidationErrorConfiguration} configuration
    */
  def this(
    errors: js.Array[typings.schemaUtils.validationErrorMod.SchemaUtilErrorObject],
    schema: typings.schemaUtils.validationErrorMod.Schema
  ) = this()
  def this(
    errors: js.Array[typings.schemaUtils.validationErrorMod.SchemaUtilErrorObject],
    schema: typings.schemaUtils.validationErrorMod.Schema,
    configuration: typings.schemaUtils.validationErrorMod.ValidationErrorConfiguration
  ) = this()
}
