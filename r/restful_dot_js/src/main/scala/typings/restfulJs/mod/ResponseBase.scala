package typings.restfulJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseBase extends js.Object {
  def config(): js.Any = js.native
  def headers(): Headers = js.native
  def status(): Double = js.native
}

object ResponseBase {
  @scala.inline
  def apply(config: () => js.Any, headers: () => Headers, status: () => Double): ResponseBase = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction0(config), headers = js.Any.fromFunction0(headers), status = js.Any.fromFunction0(status))
    __obj.asInstanceOf[ResponseBase]
  }
  @scala.inline
  implicit class ResponseBaseOps[Self <: ResponseBase] (val x: Self) extends AnyVal {
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
    def setConfig(value: () => js.Any): Self = this.set("config", js.Any.fromFunction0(value))
    @scala.inline
    def setHeaders(value: () => Headers): Self = this.set("headers", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: () => Double): Self = this.set("status", js.Any.fromFunction0(value))
  }
  
}

