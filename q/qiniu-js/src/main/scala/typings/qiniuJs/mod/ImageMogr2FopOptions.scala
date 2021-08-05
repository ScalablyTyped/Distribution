package typings.qiniuJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageMogr2FopOptions
  extends StObject
     with ImageMogr2Options {
  
  var fop: typings.qiniuJs.qiniuJsStrings.imageMogr2
}
object ImageMogr2FopOptions {
  
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
  ): ImageMogr2FopOptions = {
    val __obj = js.Dynamic.literal(blur = blur.asInstanceOf[js.Any], crop = crop.asInstanceOf[js.Any], fop = "imageMogr2", format = format.asInstanceOf[js.Any], gravity = gravity.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any], strip = strip.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any])
    __obj.updateDynamic("auto-orient")(`auto-orient`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageMogr2FopOptions]
  }
  
  extension [Self <: ImageMogr2FopOptions](x: Self) {
    
    inline def setFop(value: typings.qiniuJs.qiniuJsStrings.imageMogr2): Self = StObject.set(x, "fop", value.asInstanceOf[js.Any])
  }
}
