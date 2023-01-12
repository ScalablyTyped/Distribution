package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMRectInit extends StObject {
  
  /* standard dom */
  var height: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var width: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var x: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var y: js.UndefOr[Double] = js.undefined
}
object DOMRectInit {
  
  inline def apply(): DOMRectInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMRectInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMRectInit] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
