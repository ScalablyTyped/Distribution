package typings
package saml2DashJsLib.saml2DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLoginRequestUrlOptions extends js.Object {
  var auth_context: js.UndefOr[AuthnContextClassRef] = js.undefined
  var force_authn: js.UndefOr[scala.Boolean] = js.undefined
  var nameid_format: js.UndefOr[java.lang.String] = js.undefined
  var relay_state: js.UndefOr[java.lang.String] = js.undefined
  var sign_get_request: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateLoginRequestUrlOptions {
  @scala.inline
  def apply(
    auth_context: AuthnContextClassRef = null,
    force_authn: js.UndefOr[scala.Boolean] = js.undefined,
    nameid_format: java.lang.String = null,
    relay_state: java.lang.String = null,
    sign_get_request: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateLoginRequestUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (auth_context != null) __obj.updateDynamic("auth_context")(auth_context)
    if (!js.isUndefined(force_authn)) __obj.updateDynamic("force_authn")(force_authn)
    if (nameid_format != null) __obj.updateDynamic("nameid_format")(nameid_format)
    if (relay_state != null) __obj.updateDynamic("relay_state")(relay_state)
    if (!js.isUndefined(sign_get_request)) __obj.updateDynamic("sign_get_request")(sign_get_request)
    __obj.asInstanceOf[CreateLoginRequestUrlOptions]
  }
}

