package typings.socketclusterServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignedAuthToken extends js.Object {
  var signedAuthToken: String = js.native
}

object SignedAuthToken {
  @scala.inline
  def apply(signedAuthToken: String): SignedAuthToken = {
    val __obj = js.Dynamic.literal(signedAuthToken = signedAuthToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedAuthToken]
  }
  @scala.inline
  implicit class SignedAuthTokenOps[Self <: SignedAuthToken] (val x: Self) extends AnyVal {
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
    def setSignedAuthToken(value: String): Self = this.set("signedAuthToken", value.asInstanceOf[js.Any])
  }
  
}

