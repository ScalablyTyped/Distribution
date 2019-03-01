package typings
package saml2DashJsLib.saml2DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLogoutRequestUrlOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[scala.Boolean] = js.undefined
  var name_id: js.UndefOr[java.lang.String] = js.undefined
  var relay_state: js.UndefOr[java.lang.String] = js.undefined
  var session_index: js.UndefOr[java.lang.String] = js.undefined
  var sign_get_request: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateLogoutRequestUrlOptions {
  @scala.inline
  def apply(
    allow_unencrypted_assertion: js.UndefOr[scala.Boolean] = js.undefined,
    name_id: java.lang.String = null,
    relay_state: java.lang.String = null,
    session_index: java.lang.String = null,
    sign_get_request: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateLogoutRequestUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_unencrypted_assertion)) __obj.updateDynamic("allow_unencrypted_assertion")(allow_unencrypted_assertion)
    if (name_id != null) __obj.updateDynamic("name_id")(name_id)
    if (relay_state != null) __obj.updateDynamic("relay_state")(relay_state)
    if (session_index != null) __obj.updateDynamic("session_index")(session_index)
    if (!js.isUndefined(sign_get_request)) __obj.updateDynamic("sign_get_request")(sign_get_request)
    __obj.asInstanceOf[CreateLogoutRequestUrlOptions]
  }
}

