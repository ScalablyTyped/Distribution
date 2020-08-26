package typings.reactNativeKeychain.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWebCredentials extends UserCredentials {
  var server: String = js.native
}

object SharedWebCredentials {
  @scala.inline
  def apply(password: String, server: String, service: String, storage: String, username: String): SharedWebCredentials = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWebCredentials]
  }
  @scala.inline
  implicit class SharedWebCredentialsOps[Self <: SharedWebCredentials] (val x: Self) extends AnyVal {
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
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
  }
  
}

