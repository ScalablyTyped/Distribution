package typings.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STATUS_TYPES extends js.Object {
  var default: DEFAULT_STATUS
  var error: ERROR_STATUS
  var info: INFO_STATUS
  var success: SUCCESS_STATUS
  var warning: WARNING_STATUS
}

object STATUS_TYPES {
  @scala.inline
  def apply(
    default: DEFAULT_STATUS,
    error: ERROR_STATUS,
    info: INFO_STATUS,
    success: SUCCESS_STATUS,
    warning: WARNING_STATUS
  ): STATUS_TYPES = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[STATUS_TYPES]
  }
}

