package typings.saml2DashJs.saml2DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLogoutResponseUrlOptions extends js.Object {
  var in_response_to: js.UndefOr[String] = js.undefined
  var relay_state: js.UndefOr[String] = js.undefined
  var sign_get_request: js.UndefOr[Boolean] = js.undefined
}

object CreateLogoutResponseUrlOptions {
  @scala.inline
  def apply(
    in_response_to: String = null,
    relay_state: String = null,
    sign_get_request: js.UndefOr[Boolean] = js.undefined
  ): CreateLogoutResponseUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (in_response_to != null) __obj.updateDynamic("in_response_to")(in_response_to)
    if (relay_state != null) __obj.updateDynamic("relay_state")(relay_state)
    if (!js.isUndefined(sign_get_request)) __obj.updateDynamic("sign_get_request")(sign_get_request)
    __obj.asInstanceOf[CreateLogoutResponseUrlOptions]
  }
}

