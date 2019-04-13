package typings
package s3DashUploaderLib.s3DashUploaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3UploaderVersion extends js.Object {
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var original: js.UndefOr[scala.Boolean] = js.undefined
  var quality: js.UndefOr[scala.Double] = js.undefined
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object S3UploaderVersion {
  @scala.inline
  def apply(
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    original: js.UndefOr[scala.Boolean] = js.undefined,
    quality: scala.Int | scala.Double = null,
    suffix: java.lang.String = null
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

