package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMPointInit extends StObject {
  
  /* standard dom */
  var w: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var x: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var y: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var z: js.UndefOr[Double] = js.undefined
}
object DOMPointInit {
  
  inline def apply(): DOMPointInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMPointInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMPointInit] (val x: Self) extends AnyVal {
    
    inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
    
    inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
