package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasRenderingContext2DSettings extends StObject {
  
  /* standard dom */
  var alpha: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var colorSpace: js.UndefOr[PredefinedColorSpace] = js.undefined
  
  /* standard dom */
  var desynchronized: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var willReadFrequently: js.UndefOr[scala.Boolean] = js.undefined
}
object CanvasRenderingContext2DSettings {
  
  inline def apply(): CanvasRenderingContext2DSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasRenderingContext2DSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasRenderingContext2DSettings] (val x: Self) extends AnyVal {
    
    inline def setAlpha(value: scala.Boolean): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
    
    inline def setColorSpace(value: PredefinedColorSpace): Self = StObject.set(x, "colorSpace", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceUndefined: Self = StObject.set(x, "colorSpace", js.undefined)
    
    inline def setDesynchronized(value: scala.Boolean): Self = StObject.set(x, "desynchronized", value.asInstanceOf[js.Any])
    
    inline def setDesynchronizedUndefined: Self = StObject.set(x, "desynchronized", js.undefined)
    
    inline def setWillReadFrequently(value: scala.Boolean): Self = StObject.set(x, "willReadFrequently", value.asInstanceOf[js.Any])
    
    inline def setWillReadFrequentlyUndefined: Self = StObject.set(x, "willReadFrequently", js.undefined)
  }
}
