package typings.recharts.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Z extends StObject {
  
  var x: js.UndefOr[Double | String] = js.undefined
  
  var y: js.UndefOr[Double | String] = js.undefined
  
  var z: js.UndefOr[Double | String] = js.undefined
}
object Z {
  
  inline def apply(): Z = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Z]
  }
  
  extension [Self <: Z](x: Self) {
    
    inline def setX(value: Double | String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double | String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZ(value: Double | String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    inline def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
