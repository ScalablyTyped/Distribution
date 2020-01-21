package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoginRequestUrlOptions extends js.Object {
  var auth_context: js.UndefOr[AuthnContextClassRef] = js.undefined
  var force_authn: js.UndefOr[Boolean] = js.undefined
  var nameid_format: js.UndefOr[String] = js.undefined
  var relay_state: js.UndefOr[String] = js.undefined
  var sign_get_request: js.UndefOr[Boolean] = js.undefined
}

object CreateLoginRequestUrlOptions {
  @scala.inline
  def apply(
    auth_context: AuthnContextClassRef = null,
    force_authn: js.UndefOr[Boolean] = js.undefined,
    nameid_format: String = null,
    relay_state: String = null,
    sign_get_request: js.UndefOr[Boolean] = js.undefined
  ): CreateLoginRequestUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (auth_context != null) __obj.updateDynamic("auth_context")(auth_context.asInstanceOf[js.Any])
    if (!js.isUndefined(force_authn)) __obj.updateDynamic("force_authn")(force_authn.asInstanceOf[js.Any])
    if (nameid_format != null) __obj.updateDynamic("nameid_format")(nameid_format.asInstanceOf[js.Any])
    if (relay_state != null) __obj.updateDynamic("relay_state")(relay_state.asInstanceOf[js.Any])
    if (!js.isUndefined(sign_get_request)) __obj.updateDynamic("sign_get_request")(sign_get_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoginRequestUrlOptions]
  }
}

