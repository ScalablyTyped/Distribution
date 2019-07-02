package typings
package atReactDashNativeDashFirebaseAppDashTypesLib.atReactDashNativeDashFirebaseAppDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NativeFirebaseError
  extends stdLib.Error {
  /**
    * Firebase error code, e.g. `auth/invalid-email`
    */
  val code: java.lang.String
  /**
    * The firebase module namespace that this error originated from, e.g. 'analytics'
    */
  val namespace: java.lang.String
  /**
    * The native sdks returned error code, different per platform
    */
  val nativeErrorCode: java.lang.String | scala.Double
  /**
    * The native sdks returned error message, different per platform
    */
  val nativeErrorMessage: java.lang.String
}

object NativeFirebaseError {
  @scala.inline
  def apply(
    code: java.lang.String,
    message: java.lang.String,
    name: java.lang.String,
    namespace: java.lang.String,
    nativeErrorCode: java.lang.String | scala.Double,
    nativeErrorMessage: java.lang.String,
    stack: java.lang.String = null
  ): NativeFirebaseError = {
    val __obj = js.Dynamic.literal(code = code, message = message, name = name, namespace = namespace, nativeErrorCode = nativeErrorCode.asInstanceOf[js.Any], nativeErrorMessage = nativeErrorMessage)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[NativeFirebaseError]
  }
}

