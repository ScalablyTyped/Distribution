package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompressOptions extends js.Object {
      // 压缩图片的最大宽度值
  var maxHeight: Double
      // 图片压缩质量，在图片格式为 image/jpeg 或 image/webp 的情况下生效，其他格式不会生效，可以从 0 到 1 的区间内选择图片的质量。默认值 0.92
  var maxWidh: Double
      // 压缩图片的最大高度值 （注意：当 maxWidth 和 maxHeight 都不设置时，则采用原图尺寸大小）
  var noCompressIfLarger: Boolean
  var quality: Double
}

object CompressOptions {
  @scala.inline
  def apply(maxHeight: Double, maxWidh: Double, noCompressIfLarger: Boolean, quality: Double): CompressOptions = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidh = maxWidh.asInstanceOf[js.Any], noCompressIfLarger = noCompressIfLarger.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressOptions]
  }
}

