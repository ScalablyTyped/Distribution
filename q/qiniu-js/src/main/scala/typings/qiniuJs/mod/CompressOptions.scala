package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompressOptions extends StObject {
  
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
  
  @scala.inline
  implicit class CompressOptionsMutableBuilder[Self <: CompressOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidh(value: Double): Self = StObject.set(x, "maxWidh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoCompressIfLarger(value: Boolean): Self = StObject.set(x, "noCompressIfLarger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
  }
}
