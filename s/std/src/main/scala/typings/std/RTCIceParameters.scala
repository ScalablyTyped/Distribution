package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCIceParameters extends js.Object {
  var password: js.UndefOr[java.lang.String] = js.native
  var usernameFragment: js.UndefOr[java.lang.String] = js.native
}

object RTCIceParameters {
  @scala.inline
  def apply(): RTCIceParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RTCIceParameters]
  }
  @scala.inline
  implicit class RTCIceParametersOps[Self <: RTCIceParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPassword(value: java.lang.String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setUsernameFragment(value: java.lang.String): Self = this.set("usernameFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsernameFragment: Self = this.set("usernameFragment", js.undefined)
  }
  
}

