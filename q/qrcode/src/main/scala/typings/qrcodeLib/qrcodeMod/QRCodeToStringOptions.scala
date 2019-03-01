package typings
package qrcodeLib.qrcodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeToStringOptions extends QRCodeRenderersOptions {
  /**
    * Output format.
    * Default: utf8
    */
  var `type`: js.UndefOr[
    qrcodeLib.qrcodeLibStrings.utf8 | qrcodeLib.qrcodeLibStrings.svg | qrcodeLib.qrcodeLibStrings.terminal
  ] = js.undefined
}

object QRCodeToStringOptions {
  @scala.inline
  def apply(
    color: qrcodeLib.Anon_Dark = null,
    errorCorrectionLevel: qrcodeLib.qrcodeLibStrings.low | qrcodeLib.qrcodeLibStrings.medium | qrcodeLib.qrcodeLibStrings.quartile | qrcodeLib.qrcodeLibStrings.high | qrcodeLib.qrcodeLibStrings.L | qrcodeLib.qrcodeLibStrings.M | qrcodeLib.qrcodeLibStrings.Q | qrcodeLib.qrcodeLibStrings.H = null,
    margin: scala.Int | scala.Double = null,
    scale: scala.Int | scala.Double = null,
    toSJISFunc: js.Function1[/* codePoint */ java.lang.String, scala.Double] = null,
    `type`: qrcodeLib.qrcodeLibStrings.utf8 | qrcodeLib.qrcodeLibStrings.svg | qrcodeLib.qrcodeLibStrings.terminal = null,
    version: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): QRCodeToStringOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (errorCorrectionLevel != null) __obj.updateDynamic("errorCorrectionLevel")(errorCorrectionLevel.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (toSJISFunc != null) __obj.updateDynamic("toSJISFunc")(toSJISFunc)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeToStringOptions]
  }
}

