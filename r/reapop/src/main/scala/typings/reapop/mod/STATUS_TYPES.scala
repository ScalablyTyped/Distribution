package typings.reapop.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait STATUS_TYPES extends js.Object {
  var default: DEFAULT_STATUS = js.native
  var error: ERROR_STATUS = js.native
  var info: INFO_STATUS = js.native
  var success: SUCCESS_STATUS = js.native
  var warning: WARNING_STATUS = js.native
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
  @scala.inline
  implicit class STATUS_TYPESOps[Self <: STATUS_TYPES] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDefault(value: DEFAULT_STATUS): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: ERROR_STATUS): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: INFO_STATUS): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccess(value: SUCCESS_STATUS): Self = this.set("success", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarning(value: WARNING_STATUS): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
  
}

