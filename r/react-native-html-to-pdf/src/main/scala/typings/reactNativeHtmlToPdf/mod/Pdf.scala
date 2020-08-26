package typings.reactNativeHtmlToPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pdf extends js.Object {
  var base64: js.UndefOr[String] = js.native
  var filePath: js.UndefOr[String] = js.native
}

object Pdf {
  @scala.inline
  def apply(): Pdf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pdf]
  }
  @scala.inline
  implicit class PdfOps[Self <: Pdf] (val x: Self) extends AnyVal {
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
    def setBase64(value: String): Self = this.set("base64", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase64: Self = this.set("base64", js.undefined)
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilePath: Self = this.set("filePath", js.undefined)
  }
  
}

