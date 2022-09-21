package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointersTime extends StObject {
  
  var pointers: js.UndefOr[Double] = js.undefined
  
  var time: Any
}
object PointersTime {
  
  inline def apply(time: Any): PointersTime = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointersTime]
  }
  
  extension [Self <: PointersTime](x: Self) {
    
    inline def setPointers(value: Double): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    
    inline def setPointersUndefined: Self = StObject.set(x, "pointers", js.undefined)
    
    inline def setTime(value: Any): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
