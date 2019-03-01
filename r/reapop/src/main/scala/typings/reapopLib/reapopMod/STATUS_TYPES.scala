package typings
package reapopLib.reapopMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STATUS_TYPES extends js.Object {
  var default: reapopLib.DEFAULT_STATUS
  var error: reapopLib.ERROR_STATUS
  var info: reapopLib.INFO_STATUS
  var success: reapopLib.SUCCESS_STATUS
  var warning: reapopLib.WARNING_STATUS
}

object STATUS_TYPES {
  @scala.inline
  def apply(
    default: reapopLib.DEFAULT_STATUS,
    error: reapopLib.ERROR_STATUS,
    info: reapopLib.INFO_STATUS,
    success: reapopLib.SUCCESS_STATUS,
    warning: reapopLib.WARNING_STATUS
  ): STATUS_TYPES = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("default")(default)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("info")(info)
    __obj.updateDynamic("success")(success)
    __obj.updateDynamic("warning")(warning)
    __obj.asInstanceOf[STATUS_TYPES]
  }
}

