package typings
package reactDashNativeDashAuth0Lib.reactDashNativeDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeParams extends js.Object {
  var audience: js.UndefOr[java.lang.String] = js.undefined
  var connection: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var nonce: js.UndefOr[java.lang.String] = js.undefined
  var prompt: js.UndefOr[java.lang.String] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var state: js.UndefOr[java.lang.String] = js.undefined
}

object AuthorizeParams {
  @scala.inline
  def apply(
    audience: java.lang.String = null,
    connection: java.lang.String = null,
    language: java.lang.String = null,
    nonce: java.lang.String = null,
    prompt: java.lang.String = null,
    scope: java.lang.String = null,
    state: java.lang.String = null
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

