package typings.qrcode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeOptions extends js.Object {
  /**
    * Error correction level.
    * Possible values are low, medium, quartile, high or L, M, Q, H.
    * Default: M
    */
  var errorCorrectionLevel: js.UndefOr[QRCodeErrorCorrectionLevel] = js.undefined
  /**
    * Helper function used internally to convert a kanji to its Shift JIS value.
    * Provide this function if you need support for Kanji mode.
    */
  var toSJISFunc: js.UndefOr[js.Function1[/* codePoint */ String, Double]] = js.undefined
  /**
    * QR Code version. If not specified the more suitable value will be calculated.
    */
  var version: js.UndefOr[Double] = js.undefined
}

object QRCodeOptions {
  @scala.inline
  def apply(
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    toSJISFunc: /* codePoint */ String => Double = null,
    version: Int | Double = null
  ): QRCodeOptions = {
    val __obj = js.Dynamic.literal()
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1(toSJISFunc))
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeOptions]
  }
}

