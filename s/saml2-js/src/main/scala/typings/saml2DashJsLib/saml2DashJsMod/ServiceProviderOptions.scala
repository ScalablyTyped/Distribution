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

