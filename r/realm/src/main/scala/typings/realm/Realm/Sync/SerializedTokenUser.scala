package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializedTokenUser extends js.Object {
  var adminToken: String = js.native
  var server: String = js.native
}

object SerializedTokenUser {
  @scala.inline
  def apply(adminToken: String, server: String): SerializedTokenUser = {
    val __obj = js.Dynamic.literal(adminToken = adminToken.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializedTokenUser]
  }
  @scala.inline
  implicit class SerializedTokenUserOps[Self <: SerializedTokenUser] (val x: Self) extends AnyVal {
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
    def setAdminToken(value: String): Self = this.set("adminToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
  }
  
}

