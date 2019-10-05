package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeError extends Error {
  var code: String
  var nativeErrorCode: js.UndefOr[String] = js.undefined
  var nativeErrorMessage: js.UndefOr[String] = js.undefined
}

object NativeError {
  @scala.inline
  def apply(
    code: String,
    message: String,
    name: String,
    nativeErrorCode: String = null,
    nativeErrorMessage: String = null,
    stack: String = null
  ): NativeError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name)
    if (nativeErrorCode != null) __obj.updateDynamic("nativeErrorCode")(nativeErrorCode)
    if (nativeErrorMessage != null) __obj.updateDynamic("nativeErrorMessage")(nativeErrorMessage)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[NativeError]
  }
}

