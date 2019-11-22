package typings.qrcodeDotReact.qrcodeDotReactMod

import typings.qrcodeDotReact.qrcodeDotReactStrings.H
import typings.qrcodeDotReact.qrcodeDotReactStrings.L
import typings.qrcodeDotReact.qrcodeDotReactStrings.M
import typings.qrcodeDotReact.qrcodeDotReactStrings.Q
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseQRCodeProps extends js.Object {
  var bgColor: js.UndefOr[String] = js.undefined
  var fgColor: js.UndefOr[String] = js.undefined
  var imageSettings: js.UndefOr[ImageSettings] = js.undefined
  var includeMargin: js.UndefOr[Boolean] = js.undefined
  var level: js.UndefOr[L | M | Q | H] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var value: String
}

object BaseQRCodeProps {
  @scala.inline
  def apply(
    value: String,
    bgColor: String = null,
    fgColor: String = null,
    imageSettings: ImageSettings = null,
    includeMargin: js.UndefOr[Boolean] = js.undefined,
    level: L | M | Q | H = null,
    size: Int | Double = null
  ): BaseQRCodeProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (fgColor != null) __obj.updateDynamic("fgColor")(fgColor)
    if (imageSettings != null) __obj.updateDynamic("imageSettings")(imageSettings)
    if (!js.isUndefined(includeMargin)) __obj.updateDynamic("includeMargin")(includeMargin)
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseQRCodeProps]
  }
}

