package typings.qiniuJs.anon

import typings.qiniuJs.imageMod.Pipeline_
import typings.qiniuJs.qiniuJsStrings.imageView2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined qiniu-js.qiniu-js/esm/image.ImageViewOptions & {  fop :'imageView2'} */
trait ImageViewOptionsfopimageV
  extends StObject
     with Pipeline_ {
  
  var fop: imageView2
  
  var format: js.UndefOr[String] = js.undefined
  
  var h: js.UndefOr[Double] = js.undefined
  
  var mode: Double
  
  var q: js.UndefOr[Double] = js.undefined
  
  var w: js.UndefOr[Double] = js.undefined
}
object ImageViewOptionsfopimageV {
  
  inline def apply(mode: Double): ImageViewOptionsfopimageV = {
    val __obj = js.Dynamic.literal(fop = "imageView2", mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageViewOptionsfopimageV]
  }
  
  extension [Self <: ImageViewOptionsfopimageV](x: Self) {
    
    inline def setFop(value: imageView2): Self = StObject.set(x, "fop", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
    
    inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
  }
}
