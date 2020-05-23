package typings.reactNativeHtmlToPdf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var base64: js.UndefOr[Boolean] = js.undefined
  var bgColor: js.UndefOr[String] = js.undefined
  var directory: js.UndefOr[String] = js.undefined
  var fileName: js.UndefOr[String] = js.undefined
  // android only
  var fonts: js.UndefOr[js.Array[String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var html: String
  var padding: js.UndefOr[Double] = js.undefined
  var paddingBottom: js.UndefOr[Double] = js.undefined
  // iOS only
  var paddingLeft: js.UndefOr[Double] = js.undefined
  var paddingRight: js.UndefOr[Double] = js.undefined
  var paddingTop: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    html: String,
    base64: js.UndefOr[Boolean] = js.undefined,
    bgColor: String = null,
    directory: String = null,
    fileName: String = null,
    fonts: js.Array[String] = null,
    height: js.UndefOr[Double] = js.undefined,
    padding: js.UndefOr[Double] = js.undefined,
    paddingBottom: js.UndefOr[Double] = js.undefined,
    paddingLeft: js.UndefOr[Double] = js.undefined,
    paddingRight: js.UndefOr[Double] = js.undefined,
    paddingTop: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any])
    if (!js.isUndefined(base64)) __obj.updateDynamic("base64")(base64.get.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor.asInstanceOf[js.Any])
    if (directory != null) __obj.updateDynamic("directory")(directory.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingBottom)) __obj.updateDynamic("paddingBottom")(paddingBottom.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingLeft)) __obj.updateDynamic("paddingLeft")(paddingLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingRight)) __obj.updateDynamic("paddingRight")(paddingRight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingTop)) __obj.updateDynamic("paddingTop")(paddingTop.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

