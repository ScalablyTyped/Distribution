package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILOGIN extends js.Object {
  var data: js.Object = js.native
  var user: SFSUser = js.native
}

object ILOGIN {
  @scala.inline
  def apply(data: js.Object, user: SFSUser): ILOGIN = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILOGIN]
  }
  @scala.inline
  implicit class ILOGINOps[Self <: ILOGIN] (val x: Self) extends AnyVal {
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
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: SFSUser): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

