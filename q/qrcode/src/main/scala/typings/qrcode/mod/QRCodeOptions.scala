package typings.qrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QRCodeOptions extends js.Object {
  /**
    * Error correction level.
    * Possible values are low, medium, quartile, high or L, M, Q, H.
    * Default: M
    */
  var errorCorrectionLevel: js.UndefOr[QRCodeErrorCorrectionLevel] = js.native
  /**
    * Helper function used internally to convert a kanji to its Shift JIS value.
    * Provide this function if you need support for Kanji mode.
    */
  var toSJISFunc: js.UndefOr[js.Function1[/* codePoint */ String, Double]] = js.native
  /**
    * QR Code version. If not specified the more suitable value will be calculated.
    */
  var version: js.UndefOr[Double] = js.native
}

object QRCodeOptions {
  @scala.inline
  def apply(): QRCodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QRCodeOptions]
  }
  @scala.inline
  implicit class QRCodeOptionsOps[Self <: QRCodeOptions] (val x: Self) extends AnyVal {
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
    def setErrorCorrectionLevel(value: QRCodeErrorCorrectionLevel): Self = this.set("errorCorrectionLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCorrectionLevel: Self = this.set("errorCorrectionLevel", js.undefined)
    @scala.inline
    def setToSJISFunc(value: /* codePoint */ String => Double): Self = this.set("toSJISFunc", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToSJISFunc: Self = this.set("toSJISFunc", js.undefined)
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
  
}

