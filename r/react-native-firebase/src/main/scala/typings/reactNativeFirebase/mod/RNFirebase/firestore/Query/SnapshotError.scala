package typings.reactNativeFirebase.mod.RNFirebase.firestore.Query

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotError extends NativeError {
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
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (nativeErrorCode != null) __obj.updateDynamic("nativeErrorCode")(nativeErrorCode.asInstanceOf[js.Any])
    if (nativeErrorMessage != null) __obj.updateDynamic("nativeErrorMessage")(nativeErrorMessage.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotError]
  }
}

