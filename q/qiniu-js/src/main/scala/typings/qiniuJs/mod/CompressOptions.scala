package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompressOptions extends js.Object {
  
      // 压缩图片的最大宽度值
  var maxHeight: Double = js.native
  
      // 图片压缩质量，在图片格式为 image/jpeg 或 image/webp 的情况下生效，其他格式不会生效，可以从 0 到 1 的区间内选择图片的质量。默认值 0.92
  var maxWidh: Double = js.native
  
      // 压缩图片的最大高度值 （注意：当 maxWidth 和 maxHeight 都不设置时，则采用原图尺寸大小）
  var noCompressIfLarger: Boolean = js.native
  
  var quality: Double = js.native
}
object CompressOptions {
  
  @scala.inline
  def apply(maxHeight: Double, maxWidh: Double, noCompressIfLarger: Boolean, quality: Double): CompressOptions = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidh = maxWidh.asInstanceOf[js.Any], noCompressIfLarger = noCompressIfLarger.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompressOptions]
  }
  
  @scala.inline
  implicit class CompressOptionsOps[Self <: CompressOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidh(value: Double): Self = this.set("maxWidh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCompressIfLarger(value: Boolean): Self = this.set("noCompressIfLarger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
  }
}
