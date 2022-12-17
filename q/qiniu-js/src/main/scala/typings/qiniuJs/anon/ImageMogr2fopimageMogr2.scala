package typings.qiniuJs.anon

import typings.qiniuJs.esmImageMod.Pipeline_
import typings.qiniuJs.qiniuJsStrings.imageMogr2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined qiniu-js.qiniu-js/esm/image.ImageMogr2 & {  fop :'imageMogr2'} */
trait ImageMogr2fopimageMogr2
  extends StObject
     with Pipeline_ {
  
  var `auto-orient`: js.UndefOr[Boolean] = js.undefined
  
  var blur: js.UndefOr[Double] = js.undefined
  
  var crop: js.UndefOr[Double] = js.undefined
  
  var fop: imageMogr2
  
  var format: js.UndefOr[Double] = js.undefined
  
  var gravity: js.UndefOr[Double] = js.undefined
  
  var quality: js.UndefOr[Double] = js.undefined
  
  var rotate: js.UndefOr[Double] = js.undefined
  
  var strip: js.UndefOr[Boolean] = js.undefined
  
  var thumbnail: js.UndefOr[Double] = js.undefined
}
object ImageMogr2fopimageMogr2 {
  
  inline def apply(): ImageMogr2fopimageMogr2 = {
    val __obj = js.Dynamic.literal(fop = "imageMogr2")
    __obj.asInstanceOf[ImageMogr2fopimageMogr2]
  }
  
  extension [Self <: ImageMogr2fopimageMogr2](x: Self) {
    
    inline def `setAuto-orient`(value: Boolean): Self = StObject.set(x, "auto-orient", value.asInstanceOf[js.Any])
    
    inline def `setAuto-orientUndefined`: Self = StObject.set(x, "auto-orient", js.undefined)
    
    inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
    
    inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
    
    inline def setCrop(value: Double): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setFop(value: imageMogr2): Self = StObject.set(x, "fop", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
    
    inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    
    inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
    
    inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
    
    inline def setThumbnail(value: Double): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
    
    inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
  }
}
