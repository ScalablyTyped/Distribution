package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMQuadInit extends StObject {
  
  /* standard dom */
  var p1: js.UndefOr[DOMPointInit] = js.undefined
  
  /* standard dom */
  var p2: js.UndefOr[DOMPointInit] = js.undefined
  
  /* standard dom */
  var p3: js.UndefOr[DOMPointInit] = js.undefined
  
  /* standard dom */
  var p4: js.UndefOr[DOMPointInit] = js.undefined
}
object DOMQuadInit {
  
  inline def apply(): DOMQuadInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMQuadInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMQuadInit] (val x: Self) extends AnyVal {
    
    inline def setP1(value: DOMPointInit): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
    
    inline def setP1Undefined: Self = StObject.set(x, "p1", js.undefined)
    
    inline def setP2(value: DOMPointInit): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
    
    inline def setP2Undefined: Self = StObject.set(x, "p2", js.undefined)
    
    inline def setP3(value: DOMPointInit): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    
    inline def setP3Undefined: Self = StObject.set(x, "p3", js.undefined)
    
    inline def setP4(value: DOMPointInit): Self = StObject.set(x, "p4", value.asInstanceOf[js.Any])
    
    inline def setP4Undefined: Self = StObject.set(x, "p4", js.undefined)
  }
}
