package typings.servicenowLondon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlideServletResponse extends js.Object {
  def setContentType(`type`: String): Unit = js.native
  def setHeader(name: String, value: String): Unit = js.native
  def setStatus(value: Double): Unit = js.native
}

object GlideServletResponse {
  @scala.inline
  def apply(setContentType: String => Unit, setHeader: (String, String) => Unit, setStatus: Double => Unit): GlideServletResponse = {
    val __obj = js.Dynamic.literal(setContentType = js.Any.fromFunction1(setContentType), setHeader = js.Any.fromFunction2(setHeader), setStatus = js.Any.fromFunction1(setStatus))
    __obj.asInstanceOf[GlideServletResponse]
  }
  @scala.inline
  implicit class GlideServletResponseOps[Self <: GlideServletResponse] (val x: Self) extends AnyVal {
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
    def setSetContentType(value: String => Unit): Self = this.set("setContentType", js.Any.fromFunction1(value))
    @scala.inline
    def setSetHeader(value: (String, String) => Unit): Self = this.set("setHeader", js.Any.fromFunction2(value))
    @scala.inline
    def setSetStatus(value: Double => Unit): Self = this.set("setStatus", js.Any.fromFunction1(value))
  }
  
}

