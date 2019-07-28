package typings.reactDashNativeDashFbsdk.reactDashNativeDashFbsdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginResult extends js.Object {
  var declinedPermissions: js.UndefOr[js.Array[Permissions]] = js.undefined
  var error: js.Any
  var grantedPermissions: js.UndefOr[js.Array[Permissions]] = js.undefined
  var isCancelled: Boolean
}

object LoginResult {
  @scala.inline
  def apply(
    error: js.Any,
    isCancelled: Boolean,
    declinedPermissions: js.Array[Permissions] = null,
    grantedPermissions: js.Array[Permissions] = null
  ): LoginResult = {
    val __obj = js.Dynamic.literal(error = error, isCancelled = isCancelled)
    if (declinedPermissions != null) __obj.updateDynamic("declinedPermissions")(declinedPermissions)
    if (grantedPermissions != null) __obj.updateDynamic("grantedPermissions")(grantedPermissions)
    __obj.asInstanceOf[LoginResult]
  }
}

