package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageEncodeOptions extends StObject {
  
  /* standard dom */
  var quality: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}
object ImageEncodeOptions {
  
  inline def apply(): ImageEncodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageEncodeOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageEncodeOptions] (val x: Self) extends AnyVal {
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setType(value: java.lang.String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
