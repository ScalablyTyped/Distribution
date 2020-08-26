package typings.request.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HawkOptions extends js.Object {
  var credentials: js.Any = js.native
}

object HawkOptions {
  @scala.inline
  def apply(credentials: js.Any): HawkOptions = {
    val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[HawkOptions]
  }
  @scala.inline
  implicit class HawkOptionsOps[Self <: HawkOptions] (val x: Self) extends AnyVal {
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
    def setCredentials(value: js.Any): Self = this.set("credentials", value.asInstanceOf[js.Any])
  }
  
}

