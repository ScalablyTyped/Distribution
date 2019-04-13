package typings
package qrcodeDotReactLib.qrcodeDotReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeProps extends js.Object {
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  var fgColor: js.UndefOr[java.lang.String] = js.undefined
  var level: js.UndefOr[
    qrcodeDotReactLib.qrcodeDotReactLibStrings.L | qrcodeDotReactLib.qrcodeDotReactLibStrings.M | qrcodeDotReactLib.qrcodeDotReactLibStrings.Q | qrcodeDotReactLib.qrcodeDotReactLibStrings.H
  ] = js.undefined
  var renderAs: js.UndefOr[
    qrcodeDotReactLib.qrcodeDotReactLibStrings.svg | qrcodeDotReactLib.qrcodeDotReactLibStrings.canvas
  ] = js.undefined
  var size: js.UndefOr[scala.Double] = js.undefined
  var value: java.lang.String
}

object QRCodeProps {
  @scala.inline
  def apply(
    value: java.lang.String,
    bgColor: java.lang.String = null,
    fgColor: java.lang.String = null,
    level: qrcodeDotReactLib.qrcodeDotReactLibStrings.L | qrcodeDotReactLib.qrcodeDotReactLibStrings.M | qrcodeDotReactLib.qrcodeDotReactLibStrings.Q | qrcodeDotReactLib.qrcodeDotReactLibStrings.H = null,
    renderAs: qrcodeDotReactLib.qrcodeDotReactLibStrings.svg | qrcodeDotReactLib.qrcodeDotReactLibStrings.canvas = null,
    size: scala.Int | scala.Double = null
  ): QRCodeProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (fgColor != null) __obj.updateDynamic("fgColor")(fgColor)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (renderAs != null) __obj.updateDynamic("renderAs")(renderAs.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[QRCodeProps]
  }
}

