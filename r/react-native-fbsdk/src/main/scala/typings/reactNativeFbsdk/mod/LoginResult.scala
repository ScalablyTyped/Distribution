package typings.reactNativeFbsdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoginResult extends js.Object {
  var declinedPermissions: js.UndefOr[js.Array[Permissions]] = js.native
  var error: js.Any = js.native
  var grantedPermissions: js.UndefOr[js.Array[Permissions]] = js.native
  var isCancelled: Boolean = js.native
}

object LoginResult {
  @scala.inline
  def apply(error: js.Any, isCancelled: Boolean): LoginResult = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], isCancelled = isCancelled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginResult]
  }
  @scala.inline
  implicit class LoginResultOps[Self <: LoginResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCancelled(value: Boolean): Self = this.set("isCancelled", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeclinedPermissionsVarargs(value: Permissions*): Self = this.set("declinedPermissions", js.Array(value :_*))
    @scala.inline
    def setDeclinedPermissions(value: js.Array[Permissions]): Self = this.set("declinedPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeclinedPermissions: Self = this.set("declinedPermissions", js.undefined)
    @scala.inline
    def setGrantedPermissionsVarargs(value: Permissions*): Self = this.set("grantedPermissions", js.Array(value :_*))
    @scala.inline
    def setGrantedPermissions(value: js.Array[Permissions]): Self = this.set("grantedPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGrantedPermissions: Self = this.set("grantedPermissions", js.undefined)
  }
  
}

