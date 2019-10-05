package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotError
  extends typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.firestore.Query.NativeError {
  var appName: String
  var path: String
}

object SnapshotError {
  @scala.inline
  def apply(
    appName: String,
    code: String,
    message: String,
    name: String,
    path: String,
    nativeErrorCode: String = null,
    nativeErrorMessage: String = null,
    stack: String = null
  ): SnapshotError = {
    val __obj = js.Dynamic.literal(appName = appName, code = code, message = message, name = name, path = path)
    if (nativeErrorCode != null) __obj.updateDynamic("nativeErrorCode")(nativeErrorCode)
    if (nativeErrorMessage != null) __obj.updateDynamic("nativeErrorMessage")(nativeErrorMessage)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[SnapshotError]
  }
}

