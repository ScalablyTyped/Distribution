package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ErrorEventInit extends EventInit {
  var colno: js.UndefOr[Double] = js.native
  var error: js.UndefOr[js.Any] = js.native
  var filename: js.UndefOr[java.lang.String] = js.native
  var lineno: js.UndefOr[Double] = js.native
  var message: js.UndefOr[java.lang.String] = js.native
}

object ErrorEventInit {
  @scala.inline
  def apply(): ErrorEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorEventInit]
  }
  @scala.inline
  implicit class ErrorEventInitOps[Self <: ErrorEventInit] (val x: Self) extends AnyVal {
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
    def setColno(value: Double): Self = this.set("colno", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColno: Self = this.set("colno", js.undefined)
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFilename(value: java.lang.String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    @scala.inline
    def setLineno(value: Double): Self = this.set("lineno", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLineno: Self = this.set("lineno", js.undefined)
    @scala.inline
    def setMessage(value: java.lang.String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
  }
  
}

