package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMogr2Options extends StObject {
  
  var `auto-orient`: Boolean
  
  // 新图的输出格式，取值范围：jpg，gif，png，webp等
  var blur: String
  
  // 缩放操作参数
  var crop: String
  
  // 旋转角度，取值范围1-360，缺省为不旋转。
  var format: String
  
  // 裁剪操作参数
  var gravity: String
  
  // 裁剪锚点参数
  var quality: Double
  
  // 图片质量，取值范围1-100
  var rotate: Double
  
  // 布尔值，是否根据原图EXIF信息自动旋正，便于后续处理，建议放在首位。
  var strip: Boolean
  
  // 布尔值，是否去除图片中的元信息
  var thumbnail: String
}
object ImageMogr2Options {
  
  inline def apply(
    `auto-orient`: Boolean,
    blur: String,
    crop: String,
    format: String,
    gravity: String,
    quality: Double,
    rotate: Double,
    strip: Boolean,
    thumbnail: String
  ): ImageMogr2Options = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.updateDynamic("auto-orient")(`auto-orient`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMogr2Options]
  }
  
  extension [Self <: ImageMogr2Options](x: Self) {
    
    inline def `setAuto-orient`(value: Boolean): Self = StObject.set(x, "auto-orient", value.asInstanceOf[js.Any])
    
    inline def setBlur(value: String): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setCrop(value: String): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
  }
}
