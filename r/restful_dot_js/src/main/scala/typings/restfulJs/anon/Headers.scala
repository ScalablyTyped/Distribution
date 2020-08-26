package typings.restfulJs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Headers[T] extends js.Object {
  var data: js.Array[T] = js.native
  var headers: typings.restfulJs.mod.Headers = js.native
  var status: Double = js.native
  var statusText: String = js.native
}

object Headers {
  @scala.inline
  def apply[T](data: js.Array[T], headers: typings.restfulJs.mod.Headers, status: Double, statusText: String): Headers[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Headers[T]]
  }
  @scala.inline
  implicit class HeadersOps[Self <: Headers[_], T] (val x: Self with Headers[T]) extends AnyVal {
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
    def setDataVarargs(value: T*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[T]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: typings.restfulJs.mod.Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: Double): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
  }
  
}

