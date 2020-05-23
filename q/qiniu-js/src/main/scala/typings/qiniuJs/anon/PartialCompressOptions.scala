package typings.qiniuJs.anon

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
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidh: js.UndefOr[Double] = js.undefined,
    noCompressIfLarger: js.UndefOr[Boolean] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined
  ): PartialCompressOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidh)) __obj.updateDynamic("maxWidh")(maxWidh.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noCompressIfLarger)) __obj.updateDynamic("noCompressIfLarger")(noCompressIfLarger.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCompressOptions]
  }
}

