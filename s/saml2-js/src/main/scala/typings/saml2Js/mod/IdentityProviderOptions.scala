package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityProviderOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
  var certificates: js.Array[String]
  var force_authn: js.UndefOr[Boolean] = js.undefined
  var sign_get_request: js.UndefOr[Boolean] = js.undefined
  var sso_login_url: String
  var sso_logout_url: String
}

object IdentityProviderOptions {
  @scala.inline
  def apply(
    certificates: js.Array[String],
    sso_login_url: String,
    sso_logout_url: String,
    allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined,
    force_authn: js.UndefOr[Boolean] = js.undefined,
    sign_get_request: js.UndefOr[Boolean] = js.undefined
  ): IdentityProviderOptions = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], sso_login_url = sso_login_url.asInstanceOf[js.Any], sso_logout_url = sso_logout_url.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_unencrypted_assertion)) __obj.updateDynamic("allow_unencrypted_assertion")(allow_unencrypted_assertion.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force_authn)) __obj.updateDynamic("force_authn")(force_authn.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sign_get_request)) __obj.updateDynamic("sign_get_request")(sign_get_request.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityProviderOptions]
  }
}

