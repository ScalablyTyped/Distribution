package typings.rollup.anon

import typings.rollup.mod.RollupError
import typings.rollup.mod.RollupWatcherEvent
import typings.rollup.rollupStrings.ERROR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Error extends RollupWatcherEvent {
  var code: ERROR = js.native
  var error: RollupError = js.native
}

object Error {
  @scala.inline
  def apply(code: ERROR, error: RollupError): Error = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  @scala.inline
  implicit class ErrorOps[Self <: Error] (val x: Self) extends AnyVal {
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
    def setCode(value: ERROR): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: RollupError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
  
}

