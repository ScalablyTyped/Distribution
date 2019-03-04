package typings
package saml2DashJsLib.saml2DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdentityProviderOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[scala.Boolean] = js.undefined
  var certificates: js.Array[java.lang.String]
  var force_authn: js.UndefOr[scala.Boolean] = js.undefined
  var sign_get_request: js.UndefOr[scala.Boolean] = js.undefined
  var sso_login_url: java.lang.String
  var sso_logout_url: java.lang.String
}

object IdentityProviderOptions {
  @scala.inline
  def apply(
    certificates: js.Array[java.lang.String],
    sso_login_url: java.lang.String,
    sso_logout_url: java.lang.String,
    allow_unencrypted_assertion: js.UndefOr[scala.Boolean] = js.undefined,
    force_authn: js.UndefOr[scala.Boolean] = js.undefined,
    sign_get_request: js.UndefOr[scala.Boolean] = js.undefined
  ): IdentityProviderOptions = {
    val __obj = js.Dynamic.literal(certificates = certificates, sso_login_url = sso_login_url, sso_logout_url = sso_logout_url)
    if (!js.isUndefined(allow_unencrypted_assertion)) __obj.updateDynamic("allow_unencrypted_assertion")(allow_unencrypted_assertion)
    if (!js.isUndefined(force_authn)) __obj.updateDynamic("force_authn")(force_authn)
    if (!js.isUndefined(sign_get_request)) __obj.updateDynamic("sign_get_request")(sign_get_request)
    __obj.asInstanceOf[IdentityProviderOptions]
  }
}

