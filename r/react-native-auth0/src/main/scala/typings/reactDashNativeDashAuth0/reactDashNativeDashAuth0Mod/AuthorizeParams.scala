package typings.reactDashNativeDashAuth0.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeParams extends js.Object {
  var audience: js.UndefOr[String] = js.undefined
  var connection: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var nonce: js.UndefOr[String] = js.undefined
  var prompt: js.UndefOr[String] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
}

object AuthorizeParams {
  @scala.inline
  def apply(
    audience: String = null,
    connection: String = null,
    language: String = null,
    nonce: String = null,
    prompt: String = null,
    scope: String = null,
    state: String = null
  ): AuthorizeParams = {
    val __obj = js.Dynamic.literal()
    if (audience != null) __obj.updateDynamic("audience")(audience)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (language != null) __obj.updateDynamic("language")(language)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    if (prompt != null) __obj.updateDynamic("prompt")(prompt)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (state != null) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[AuthorizeParams]
  }
}

