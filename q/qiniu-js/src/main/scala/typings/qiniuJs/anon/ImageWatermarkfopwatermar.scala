package typings.qiniuJs.anon

import typings.qiniuJs.esmImageMod.Pipeline_
import typings.qiniuJs.qiniuJsStrings.watermark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined qiniu-js.qiniu-js/esm/image.ImageWatermark & {  fop :'watermark'} */
trait ImageWatermarkfopwatermar
  extends StObject
     with Pipeline_ {
  
  var dissolve: js.UndefOr[Double] = js.undefined
  
  var dx: js.UndefOr[Double] = js.undefined
  
  var dy: js.UndefOr[Double] = js.undefined
  
  var fill: js.UndefOr[String] = js.undefined
  
  var font: js.UndefOr[String] = js.undefined
  
  var fontsize: js.UndefOr[Double] = js.undefined
  
  var fop: watermark
  
  var gravity: js.UndefOr[String] = js.undefined
  
  var image: String
  
  var mode: Double
  
  var text: js.UndefOr[String] = js.undefined
}
object ImageWatermarkfopwatermar {
  
  inline def apply(image: String, mode: Double): ImageWatermarkfopwatermar = {
    val __obj = js.Dynamic.literal(fop = "watermark", image = image.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageWatermarkfopwatermar]
  }
  
  extension [Self <: ImageWatermarkfopwatermar](x: Self) {
    
    inline def setDissolve(value: Double): Self = StObject.set(x, "dissolve", value.asInstanceOf[js.Any])
    
    inline def setDissolveUndefined: Self = StObject.set(x, "dissolve", js.undefined)
    
    inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
    
    inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
    
    inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
    
    inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    
    inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setFontsize(value: Double): Self = StObject.set(x, "fontsize", value.asInstanceOf[js.Any])
    
    inline def setFontsizeUndefined: Self = StObject.set(x, "fontsize", js.undefined)
    
    inline def setFop(value: watermark): Self = StObject.set(x, "fop", value.asInstanceOf[js.Any])
    
    inline def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
    
    inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
