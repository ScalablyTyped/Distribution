package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEncodeOptions extends StObject {
  
  var quality: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
object ImageEncodeOptions {
  
  inline def apply(): ImageEncodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEncodeOptions]
  }
  
  extension [Self <: ImageEncodeOptions](x: Self) {
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
