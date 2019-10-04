package typings.atReactDashNativeDashFirebaseApp.ReactNativeFirebaseNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeFirebaseError extends Error {
  /**
    * Firebase error code, e.g. `auth/invalid-email`
    */
  val code: String
  /**
    * The firebase module namespace that this error originated from, e.g. 'analytics'
    */
  val namespace: String
  /**
    * The native sdks returned error code, different per platform
    */
  val nativeErrorCode: String | Double
  /**
    * The native sdks returned error message, different per platform
    */
  val nativeErrorMessage: String
}

object NativeFirebaseError {
  @scala.inline
  def apply(
    code: String,
    message: String,
    name: String,
    namespace: String,
    nativeErrorCode: String | Double,
    nativeErrorMessage: String,
    stack: String = null
  ): NativeFirebaseError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name, namespace = namespace, nativeErrorCode = nativeErrorCode.asInstanceOf[js.Any], nativeErrorMessage = nativeErrorMessage)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[NativeFirebaseError]
  }
}

