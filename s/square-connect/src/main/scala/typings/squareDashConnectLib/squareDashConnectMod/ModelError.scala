package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "ModelError")
@js.native
class ModelError () extends js.Object {
  /**
    * The error's high-level category. See [ErrorCategory](#type-errorcategory) for possible values.
    */
  var category: squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CategoryEnum = js.native
  /**
    * The error's specific code. See [ErrorCode](#type-errorcode) for possible values
    */
  var code: squareDashConnectLib.squareDashConnectMod.ModelErrorNs.CodeEnum = js.native
  /**
    * A human-readable description of the error for debugging purposes.
    */
  var detail: js.UndefOr[java.lang.String] = js.native
  /**
    * The name of the field provided in the original request that the error pertains to, if any.
    */
  var field: js.UndefOr[java.lang.String] = js.native
}

