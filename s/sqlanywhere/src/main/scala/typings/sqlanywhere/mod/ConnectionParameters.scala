package typings.sqlanywhere.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionParameters extends js.Object {
  var AutoStart: js.UndefOr[String] = js.native
  var DatabaseFile: js.UndefOr[String] = js.native
  var Host: js.UndefOr[String] = js.native
  var Password: String = js.native
  var Server: String = js.native
  var UserId: String = js.native
}

object ConnectionParameters {
  @scala.inline
  def apply(Password: String, Server: String, UserId: String): ConnectionParameters = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], Server = Server.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionParameters]
  }
  @scala.inline
  implicit class ConnectionParametersOps[Self <: ConnectionParameters] (val x: Self) extends AnyVal {
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
    def setPassword(value: String): Self = this.set("Password", value.asInstanceOf[js.Any])
    @scala.inline
    def setServer(value: String): Self = this.set("Server", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoStart(value: String): Self = this.set("AutoStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoStart: Self = this.set("AutoStart", js.undefined)
    @scala.inline
    def setDatabaseFile(value: String): Self = this.set("DatabaseFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatabaseFile: Self = this.set("DatabaseFile", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("Host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("Host", js.undefined)
  }
  
}

