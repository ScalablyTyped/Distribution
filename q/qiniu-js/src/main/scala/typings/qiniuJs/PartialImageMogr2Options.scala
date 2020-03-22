package typings.qiniuJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.ImageMogr2Options> */
trait PartialImageMogr2Options extends js.Object {
  var `auto-orient`: js.UndefOr[Boolean] = js.undefined
  var blur: js.UndefOr[String] = js.undefined
  var crop: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[String] = js.undefined
  var gravity: js.UndefOr[String] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var strip: js.UndefOr[Boolean] = js.undefined
  var thumbnail: js.UndefOr[String] = js.undefined
}

object PartialImageMogr2Options {
  @scala.inline
  def apply(
    `auto-orient`: js.UndefOr[Boolean] = js.undefined,
    blur: String = null,
    crop: String = null,
    format: String = null,
    gravity: String = null,
    quality: Int | Double = null,
    rotate: Int | Double = null,
    strip: js.UndefOr[Boolean] = js.undefined,
    thumbnail: String = null
  ): PartialImageMogr2Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`auto-orient`)) __obj.updateDynamic("auto-orient")(`auto-orient`.asInstanceOf[js.Any])
    if (blur != null) __obj.updateDynamic("blur")(blur.asInstanceOf[js.Any])
    if (crop != null) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (gravity != null) __obj.updateDynamic("gravity")(gravity.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(strip)) __obj.updateDynamic("strip")(strip.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialImageMogr2Options]
  }
}

