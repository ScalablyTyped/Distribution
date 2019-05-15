package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToFileStreamOptions extends QRCodeRenderersOptions {
  var rendererOpts: js.UndefOr[qrcodeLib.Anon_DeflateLevel] = js.undefined
  /**
    * Output format. Only png supported for file stream
    */
  var `type`: js.UndefOr[qrcodeLib.qrcodeLibStrings.png] = js.undefined
}

object QRCodeToFileStreamOptions {
  @scala.inline
  def apply(
    color: qrcodeLib.Anon_Dark = null,
    errorCorrectionLevel: QRCodeErrorCorrectionLevel = null,
    margin: scala.Int | scala.Double = null,
    rendererOpts: qrcodeLib.Anon_DeflateLevel = null,
    scale: scala.Int | scala.Double = null,
    toSJISFunc: /* codePoint */ java.lang.String => scala.Double = null,
    `type`: qrcodeLib.qrcodeLibStrings.png = null,
    version: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): QRCodeToFileStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel)
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (rendererOpts != null) __obj.updateDynamic("rendererOpts")(rendererOpts)
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(js.Any.fromFunction1(toSJISFunc))
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeToFileStreamOptions]
  }
}

