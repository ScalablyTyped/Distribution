package typings.qrcodeDotReact.qrcodeDotReactMod

import typings.qrcodeDotReact.qrcodeDotReactStrings.H
import typings.qrcodeDotReact.qrcodeDotReactStrings.L
import typings.qrcodeDotReact.qrcodeDotReactStrings.M
import typings.qrcodeDotReact.qrcodeDotReactStrings.Q
import typings.qrcodeDotReact.qrcodeDotReactStrings.canvas
import typings.qrcodeDotReact.qrcodeDotReactStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QRCodeProps extends js.Object {
  var bgColor: js.UndefOr[String] = js.undefined
  var fgColor: js.UndefOr[String] = js.undefined
  var level: js.UndefOr[L | M | Q | H] = js.undefined
  var renderAs: js.UndefOr[svg | canvas] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var value: String
}

object QRCodeProps {
  @scala.inline
  def apply(
    value: String,
    bgColor: String = null,
    fgColor: String = null,
    level: L | M | Q | H = null,
    renderAs: svg | canvas = null,
    size: Int | Double = null
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

