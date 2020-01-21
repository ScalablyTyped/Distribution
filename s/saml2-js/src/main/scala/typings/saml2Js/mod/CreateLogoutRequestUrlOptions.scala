package typings.saml2Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLogoutRequestUrlOptions extends js.Object {
  var allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined
  var name_id: js.UndefOr[String] = js.undefined
  var relay_state: js.UndefOr[String] = js.undefined
  var session_index: js.UndefOr[String] = js.undefined
  var sign_get_request: js.UndefOr[Boolean] = js.undefined
}

object CreateLogoutRequestUrlOptions {
  @scala.inline
  def apply(
    allow_unencrypted_assertion: js.UndefOr[Boolean] = js.undefined,
    name_id: String = null,
    relay_state: String = null,
    session_index: String = null,
    sign_get_request: js.UndefOr[Boolean] = js.undefined
  ): CreateLogoutRequestUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_unencrypted_assertion)) __obj.updateDynamic("allow_unencrypted_assertion")(allow_unencrypted_assertion.asInstanceOf[js.Any])
    if (name_id != null) __obj.updateDynamic("name_id")(name_id.asInstanceOf[js.Any])
    if (relay_state != null) __obj.updateDynamic("relay_state")(relay_state.asInstanceOf[js.Any])
    if (session_index != null) __obj.updateDynamic("session_index")(session_index.asInstanceOf[js.Any])
    if (!js.isUndefined(sign_get_request)) __obj.updateDynamic("sign_get_request")(sign_get_request.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLogoutRequestUrlOptions]
  }
}

