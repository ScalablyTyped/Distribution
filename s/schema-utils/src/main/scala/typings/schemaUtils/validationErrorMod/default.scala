package typings.schemaUtils.validationErrorMod

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
  def this(errors: js.Array[SchemaUtilErrorObject], schema: Schema) = this()
  def this(
    errors: js.Array[SchemaUtilErrorObject],
    schema: Schema,
    configuration: ValidationErrorConfiguration
  ) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
}

