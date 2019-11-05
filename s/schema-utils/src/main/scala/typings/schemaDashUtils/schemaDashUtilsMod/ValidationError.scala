package typings.schemaDashUtils.schemaDashUtilsMod

import typings.ajv.ajvMod.ErrorObject
import typings.schemaDashUtils.schemaDashUtilsMod.SchemaUtils.ValidationErrorConfiguration
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schema-utils", "ValidationError")
@js.native
class ValidationError protected ()
  extends typings.schemaDashUtils.schemaDashUtilsMod.SchemaUtils.ValidationError {
  def this(errors: js.Array[ErrorObject], schema: Schema) = this()
  def this(
    errors: js.Array[ErrorObject],
    schema: Schema,
    configuration: Partial[ValidationErrorConfiguration]
  ) = this()
  /* CompleteClass */
  override var baseDataPath: String = js.native
  /* CompleteClass */
  override var errors: js.Array[ErrorObject] = js.native
  /* CompleteClass */
  override var headerName: String = js.native
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  /* CompleteClass */
  override var postFormatter: PostFormatter | Null = js.native
  /* CompleteClass */
  override var schema: Schema = js.native
}

