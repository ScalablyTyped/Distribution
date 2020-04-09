package typings.squareConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ModelError")
@js.native
class ModelError () extends js.Object {
  /**
    * The high-level category for the error. See `ErrorCategory` for possible values.
    * See [ErrorCategory](#type-errorcategory) for possible values.
    */
  var category: ErrorCategoryType = js.native
  /**
    * The specific code of the error. See `ErrorCode` for possible values See [ErrorCode](#type-errorcode) for possible values.
    */
  var code: ErrorCodeType = js.native
  /**
    * A human-readable description of the error for debugging purposes.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * The name of the field provided in the original request (if any) that the error pertains to.
    */
  var field: js.UndefOr[String] = js.native
}

