package typings
package requestLib.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var bearer: js.UndefOr[java.lang.String | js.Function0[java.lang.String]] = js.undefined
  var pass: js.UndefOr[java.lang.String] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  var sendImmediately: js.UndefOr[scala.Boolean] = js.undefined
  var user: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    bearer: java.lang.String | js.Function0[java.lang.String] = null,
    pass: java.lang.String = null,
    password: java.lang.String = null,
    sendImmediately: js.UndefOr[scala.Boolean] = js.undefined,
    user: java.lang.String = null,
    username: java.lang.String = null
  ): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (bearer != null) __obj.updateDynamic("bearer")(bearer.asInstanceOf[js.Any])
    if (pass != null) __obj.updateDynamic("pass")(pass)
    if (password != null) __obj.updateDynamic("password")(password)
    if (!js.isUndefined(sendImmediately)) __obj.updateDynamic("sendImmediately")(sendImmediately)
    if (user != null) __obj.updateDynamic("user")(user)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[AuthOptions]
  }
}

