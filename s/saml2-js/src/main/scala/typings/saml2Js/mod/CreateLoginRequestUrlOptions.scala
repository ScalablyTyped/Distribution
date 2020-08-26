package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoginRequestUrlOptions extends js.Object {
  var auth_context: js.UndefOr[AuthnContextClassRef] = js.native
  var force_authn: js.UndefOr[Boolean] = js.native
  var nameid_format: js.UndefOr[String] = js.native
  var relay_state: js.UndefOr[String] = js.native
  var sign_get_request: js.UndefOr[Boolean] = js.native
}

object CreateLoginRequestUrlOptions {
  @scala.inline
  def apply(): CreateLoginRequestUrlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLoginRequestUrlOptions]
  }
  @scala.inline
  implicit class CreateLoginRequestUrlOptionsOps[Self <: CreateLoginRequestUrlOptions] (val x: Self) extends AnyVal {
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
    def setAuth_context(value: AuthnContextClassRef): Self = this.set("auth_context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth_context: Self = this.set("auth_context", js.undefined)
    @scala.inline
    def setForce_authn(value: Boolean): Self = this.set("force_authn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce_authn: Self = this.set("force_authn", js.undefined)
    @scala.inline
    def setNameid_format(value: String): Self = this.set("nameid_format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameid_format: Self = this.set("nameid_format", js.undefined)
    @scala.inline
    def setRelay_state(value: String): Self = this.set("relay_state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelay_state: Self = this.set("relay_state", js.undefined)
    @scala.inline
    def setSign_get_request(value: Boolean): Self = this.set("sign_get_request", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSign_get_request: Self = this.set("sign_get_request", js.undefined)
  }
  
}

