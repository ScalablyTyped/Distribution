package typings.reactHotLoader.mod

import typings.react.mod.ErrorInfo
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotError extends js.Object {
  var error: Error
  var errorInfo: js.UndefOr[ErrorInfo] = js.undefined
}

object HotError {
  @scala.inline
  def apply(error: Error, errorInfo: ErrorInfo = null): HotError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (errorInfo != null) __obj.updateDynamic("errorInfo")(errorInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotError]
  }
}

