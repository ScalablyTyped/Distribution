package typings.reapop.reapopMod

import typings.reapop.DEFAULT_STATUS
import typings.reapop.ERROR_STATUS
import typings.reapop.INFO_STATUS
import typings.reapop.SUCCESS_STATUS
import typings.reapop.WARNING_STATUS
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
    val __obj = js.Dynamic.literal(default = default, error = error, info = info, success = success, warning = warning)
  
    __obj.asInstanceOf[STATUS_TYPES]
  }
}

