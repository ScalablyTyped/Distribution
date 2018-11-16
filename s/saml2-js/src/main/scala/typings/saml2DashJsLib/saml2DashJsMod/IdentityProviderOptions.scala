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

