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

trait TouchIDError extends js.Object {
  var details: js.Any
  var message: String
  var name: LAErrorAuthenticationFailed | LAErrorUserCancel | LAErrorUserFallback | LAErrorSystemCancel | LAErrorPasscodeNotSet | LAErrorTouchIDNotAvailable | LAErrorTouchIDNotEnrolled | RCTTouchIDUnknownError | RCTTouchIDNotSupported
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
}

