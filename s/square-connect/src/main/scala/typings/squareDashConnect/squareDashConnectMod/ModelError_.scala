package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.ModelError.CategoryEnum
import typings.squareDashConnect.squareDashConnectMod.ModelError.CodeEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ModelError")
@js.native
class ModelError_ () extends js.Object {
  /**
    * The high-level category for the error.
    * See [ErrorCategory](#type-errorcategory) See [ErrorCategory](#type-errorcategory) for possible values.
    */
  var category: CategoryEnum = js.native
  /**
    * The specific code of the error.
    * See [ErrorCode](#type-errorcode) for possible See [ErrorCode](#type-errorcode) for possible values.
    */
  var code: CodeEnum = js.native
  /**
    * A human-readable description of the error for debugging purposes.
    */
  var detail: js.UndefOr[String] = js.native
  /**
    * The name of the field provided in the original request (if any) that the error pertains to.
    */
  var field: js.UndefOr[String] = js.native
}

