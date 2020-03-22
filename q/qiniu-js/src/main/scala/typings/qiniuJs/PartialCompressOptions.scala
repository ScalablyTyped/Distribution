package typings.qiniuJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.CompressOptions> */
trait PartialCompressOptions extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidh: js.UndefOr[Double] = js.undefined
  var noCompressIfLarger: js.UndefOr[Boolean] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
}

object PartialCompressOptions {
  @scala.inline
  def apply(
    maxHeight: Int | Double = null,
    maxWidh: Int | Double = null,
    noCompressIfLarger: js.UndefOr[Boolean] = js.undefined,
    quality: Int | Double = null
  ): PartialCompressOptions = {
    val __obj = js.Dynamic.literal()
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidh != null) __obj.updateDynamic("maxWidh")(maxWidh.asInstanceOf[js.Any])
    if (!js.isUndefined(noCompressIfLarger)) __obj.updateDynamic("noCompressIfLarger")(noCompressIfLarger.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCompressOptions]
  }
}

