package typings.reactNativeTouchId.mod

import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorAuthenticationFailed
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorPasscodeNotSet
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorSystemCancel
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorTouchIDNotAvailable
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorTouchIDNotEnrolled
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorUserCancel
import typings.reactNativeTouchId.reactNativeTouchIdStrings.LAErrorUserFallback
import typings.reactNativeTouchId.reactNativeTouchIdStrings.RCTTouchIDNotSupported
import typings.reactNativeTouchId.reactNativeTouchIdStrings.RCTTouchIDUnknownError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TouchIDError extends js.Object {
  var details: js.Any = js.native
  var message: String = js.native
  var name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported = js.native
}

object TouchIDError {
  @scala.inline
  def apply(
    details: js.Any,
    message: String,
    name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
  ): TouchIDError = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchIDError]
  }
  @scala.inline
  implicit class TouchIDErrorOps[Self <: TouchIDError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetails(value: js.Any): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(
      value: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
    ): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

