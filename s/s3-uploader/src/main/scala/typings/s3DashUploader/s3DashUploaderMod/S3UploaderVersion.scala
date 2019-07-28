package typings.s3DashUploader.s3DashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3UploaderVersion extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var original: js.UndefOr[Boolean] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
  var suffix: js.UndefOr[String] = js.undefined
}

object S3UploaderVersion {
  @scala.inline
  def apply(
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    original: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null,
    suffix: String = null
  ): S3UploaderVersion = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(original)) __obj.updateDynamic("original")(original)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[S3UploaderVersion]
  }
}

