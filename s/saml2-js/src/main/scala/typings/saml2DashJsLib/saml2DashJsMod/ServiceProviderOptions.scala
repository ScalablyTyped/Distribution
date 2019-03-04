package typings
package saml2DashJsLib.saml2DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceProviderOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[scala.Boolean] = js.undefined
  var alt_certs: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var alt_private_keys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var assert_endpoint: java.lang.String
  var auth_context: js.UndefOr[AuthnContextClassRef] = js.undefined
  var certificate: java.lang.String
  var entity_id: java.lang.String
  var force_authn: js.UndefOr[scala.Boolean] = js.undefined
  var nameid_format: js.UndefOr[java.lang.String] = js.undefined
  var private_key: java.lang.String
  var sign_get_request: js.UndefOr[scala.Boolean] = js.undefined
}

object ServiceProviderOptions {
  @scala.inline
  def apply(
    assert_endpoint: java.lang.String,
    certificate: java.lang.String,
    entity_id: java.lang.String,
    private_key: java.lang.String,
    allow_unencrypted_assertion: js.UndefOr[scala.Boolean] = js.undefined,
    alt_certs: js.Array[java.lang.String] = null,
    alt_private_keys: js.Array[java.lang.String] = null,
    auth_context: AuthnContextClassRef = null,
    force_authn: js.UndefOr[scala.Boolean] = js.undefined,
    nameid_format: java.lang.String = null,
    sign_get_request: js.UndefOr[scala.Boolean] = js.undefined
  ): ServiceProviderOptions = {
    val __obj = js.Dynamic.literal(assert_endpoint = assert_endpoint, certificate = certificate, entity_id = entity_id, private_key = private_key)
    if (!js.isUndefined(allow_unencrypted_assertion)) __obj.updateDynamic("allow_unencrypted_assertion")(allow_unencrypted_assertion)
    if (alt_certs != null) __obj.updateDynamic("alt_certs")(alt_certs)
    if (alt_private_keys != null) __obj.updateDynamic("alt_private_keys")(alt_private_keys)
    if (auth_context != null) __obj.updateDynamic("auth_context")(auth_context)
    if (!js.isUndefined(force_authn)) __obj.updateDynamic("force_authn")(force_authn)
    if (nameid_format != null) __obj.updateDynamic("nameid_format")(nameid_format)
    if (!js.isUndefined(sign_get_request)) __obj.updateDynamic("sign_get_request")(sign_get_request)
    __obj.asInstanceOf[ServiceProviderOptions]
  }
}

