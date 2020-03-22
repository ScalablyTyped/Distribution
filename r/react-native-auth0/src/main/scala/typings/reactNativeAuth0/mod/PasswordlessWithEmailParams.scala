package typings.reactNativeAuth0.mod

import typings.reactNativeAuth0.reactNativeAuth0Strings.code
import typings.reactNativeAuth0.reactNativeAuth0Strings.link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PasswordlessWithEmailParams extends js.Object {
  var authParams: js.UndefOr[String] = js.undefined
  var email: String
  var send: js.UndefOr[link | code] = js.undefined
}

object PasswordlessWithEmailParams {
  @scala.inline
  def apply(email: String, authParams: String = null, send: link | code = null): PasswordlessWithEmailParams = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    if (authParams != null) __obj.updateDynamic("authParams")(authParams.asInstanceOf[js.Any])
    if (send != null) __obj.updateDynamic("send")(send.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordlessWithEmailParams]
  }
}

