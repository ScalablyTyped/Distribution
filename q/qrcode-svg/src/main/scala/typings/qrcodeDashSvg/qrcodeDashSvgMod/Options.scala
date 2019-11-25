package typings.qrcodeDashSvg.qrcodeDashSvgMod

import typings.qrcodeDashSvg.qrcodeDashSvgStrings.H
import typings.qrcodeDashSvg.qrcodeDashSvgStrings.L
import typings.qrcodeDashSvg.qrcodeDashSvgStrings.M
import typings.qrcodeDashSvg.qrcodeDashSvgStrings.Q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /** Default is `"#ffffff"`. */
  var background: js.UndefOr[String] = js.undefined
  /** Default is `"#000000"`. */
  var color: js.UndefOr[String] = js.undefined
  /** The actual content of the QR code */
  var content: String
  /** Default is `"M"`. */
  var ecl: js.UndefOr[L | M | H | Q] = js.undefined
  /** Default is `256`. */
  var height: js.UndefOr[Double] = js.undefined
  /** Default is `4`. */
  var padding: js.UndefOr[Double] = js.undefined
  /** Default is `256`. */
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    content: String,
    background: String = null,
    color: String = null,
    ecl: L | M | H | Q = null,
    height: Int | Double = null,
    padding: Int | Double = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (ecl != null) __obj.updateDynamic("ecl")(ecl.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

