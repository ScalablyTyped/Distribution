package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseInit extends js.Object {
  var headers: js.UndefOr[HeadersInit] = js.native
  var status: js.UndefOr[Double] = js.native
  var statusText: js.UndefOr[java.lang.String] = js.native
}

object ResponseInit {
  @scala.inline
  def apply(): ResponseInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseInit]
  }
  @scala.inline
  implicit class ResponseInitOps[Self <: ResponseInit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeadersVarargs(value: js.Array[java.lang.String]*): Self = this.set("headers", js.Array(value :_*))
    @scala.inline
    def setHeaders(value: HeadersInit): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusText(value: java.lang.String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
  }
  
}

