package typings.reactNativeFirebaseApp.ReactNativeFirebase

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
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], nativeErrorCode = nativeErrorCode.asInstanceOf[js.Any], nativeErrorMessage = nativeErrorMessage.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeFirebaseError]
  }
}

