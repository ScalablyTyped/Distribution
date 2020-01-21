package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceProviderOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
  var alt_certs: js.UndefOr[js.Array[String]] = js.undefined
  var alt_private_keys: js.UndefOr[js.Array[String]] = js.undefined
  var assert_endpoint: String
  var auth_context: js.UndefOr[AuthnContextClassRef] = js.undefined
  var certificate: String
  var entity_id: String
  var force_authn: js.UndefOr[Boolean] = js.undefined
  var nameid_format: js.UndefOr[String] = js.undefined
  var private_key: String
  var sign_get_request: js.UndefOr[Boolean] = js.undefined
}

object ServiceProviderOptions {
  @scala.inline
  def apply(
    assert_endpoint: String,
    certificate: String,
    entity_id: String,
    private_key: String,
    allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined,
    alt_certs: js.Array[String] = null,
    alt_private_keys: js.Array[String] = null,
    auth_context: AuthnContextClassRef = null,
    force_authn: js.UndefOr[Boolean] = js.undefined,
    nameid_format: String = null,
    sign_get_request: js.UndefOr[Boolean] = js.undefined
  ): ServiceProviderOptions = {
    val __obj = js.Dynamic.literal(assert_endpoint = assert_endpoint.asInstanceOf[js.Any], certificate = certificate.asInstanceOf[js.Any], entity_id = entity_id.asInstanceOf[js.Any], private_key = private_key.asInstanceOf[js.Any])
    if (!js.isUndefined(allow_unencrypted_assertion)) __obj.updateDynamic("allow_unencrypted_assertion")(allow_unencrypted_assertion.asInstanceOf[js.Any])
    if (alt_certs != null) __obj.updateDynamic("alt_certs")(alt_certs.asInstanceOf[js.Any])
    if (alt_private_keys != null) __obj.updateDynamic("alt_private_keys")(alt_private_keys.asInstanceOf[js.Any])
    if (auth_context != null) __obj.updateDynamic("auth_context")(auth_context.asInstanceOf[js.Any])
    if (!js.isUndefined(force_authn)) __obj.updateDynamic("force_authn")(force_authn.asInstanceOf[js.Any])
    if (nameid_format != null) __obj.updateDynamic("nameid_format")(nameid_format.asInstanceOf[js.Any])
    if (!js.isUndefined(sign_get_request)) __obj.updateDynamic("sign_get_request")(sign_get_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceProviderOptions]
  }
}

