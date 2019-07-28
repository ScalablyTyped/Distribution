package typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdMod

import typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorAuthenticationFailed
import typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorPasscodeNotSet
import typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorSystemCancel
import typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorTouchIDNotAvailable
import typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorTouchIDNotEnrolled
import typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorUserCancel
import typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.LAErrorUserFallback
import typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.RCTTouchIDNotSupported
import typings.reactDashNativeDashTouchDashId.reactDashNativeDashTouchDashIdStrings.RCTTouchIDUnknownError
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
    val __obj = js.Dynamic.literal(details = details, message = message, name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TouchIDError]
  }
}

