package typings.restify.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAgentRegExp extends js.Object {
  var userAgentRegExp: js.Any = js.native
}

object UserAgentRegExp {
  @scala.inline
  def apply(userAgentRegExp: js.Any): UserAgentRegExp = {
    val __obj = js.Dynamic.literal(userAgentRegExp = userAgentRegExp.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAgentRegExp]
  }
  @scala.inline
  implicit class UserAgentRegExpOps[Self <: UserAgentRegExp] (val x: Self) extends AnyVal {
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
    def setUserAgentRegExp(value: js.Any): Self = this.set("userAgentRegExp", value.asInstanceOf[js.Any])
  }
  
}

