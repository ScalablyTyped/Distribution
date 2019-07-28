package typings.request.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthOptions extends js.Object {
  var bearer: js.UndefOr[String | js.Function0[String]] = js.undefined
  var pass: js.UndefOr[String] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var sendImmediately: js.UndefOr[Boolean] = js.undefined
  var user: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    bearer: String | js.Function0[String] = null,
    pass: String = null,
    password: String = null,
    sendImmediately: js.UndefOr[Boolean] = js.undefined,
    user: String = null,
    username: String = null
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

