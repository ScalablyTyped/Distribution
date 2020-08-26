package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedUser extends js.Object {
  var identity: String = js.native
  var isAdmin: Boolean = js.native
  var refreshToken: String = js.native
  var server: String = js.native
}

object SerializedUser {
  @scala.inline
  def apply(identity: String, isAdmin: Boolean, refreshToken: String, server: String): SerializedUser = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isAdmin = isAdmin.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedUser]
  }
  @scala.inline
  implicit class SerializedUserOps[Self <: SerializedUser] (val x: Self) extends AnyVal {
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
    def setIdentity(value: String): Self = this.set("identity", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsAdmin(value: Boolean): Self = this.set("isAdmin", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefreshToken(value: String): Self = this.set("refreshToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
  }
  
}

