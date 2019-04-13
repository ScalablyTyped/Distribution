package typings
package qrcodeDashSvgLib.qrcodeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Default is `"#ffffff"`. */
  var background: js.UndefOr[java.lang.String] = js.undefined
  /** Default is `"#000000"`. */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /** The actual content of the QR code */
  var content: java.lang.String
  /** Default is `"M"`. */
  var ecl: js.UndefOr[
    qrcodeDashSvgLib.qrcodeDashSvgLibStrings.L | qrcodeDashSvgLib.qrcodeDashSvgLibStrings.M | qrcodeDashSvgLib.qrcodeDashSvgLibStrings.H | qrcodeDashSvgLib.qrcodeDashSvgLibStrings.Q
  ] = js.undefined
  /** Default is `256`. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /** Default is `4`. */
  var padding: js.UndefOr[scala.Double] = js.undefined
  /** Default is `256`. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    content: java.lang.String,
    background: java.lang.String = null,
    color: java.lang.String = null,
    ecl: qrcodeDashSvgLib.qrcodeDashSvgLibStrings.L | qrcodeDashSvgLib.qrcodeDashSvgLibStrings.M | qrcodeDashSvgLib.qrcodeDashSvgLibStrings.H | qrcodeDashSvgLib.qrcodeDashSvgLibStrings.Q = null,
    height: scala.Int | scala.Double = null,
    padding: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(content = content)
    if (background != null) __obj.updateDynamic("background")(background)
    if (color != null) __obj.updateDynamic("color")(color)
    if (ecl != null) __obj.updateDynamic("ecl")(ecl.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

