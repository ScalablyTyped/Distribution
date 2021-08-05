package typings.roslib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X extends StObject {
  
  var x: js.UndefOr[Double | Null] = js.undefined
  
  var y: js.UndefOr[Double | Null] = js.undefined
  
  var z: js.UndefOr[Double | Null] = js.undefined
}
object X {
  
  inline def apply(): X = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[X]
  }
  
  extension [Self <: X](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZNull: Self = StObject.set(x, "z", null)
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
