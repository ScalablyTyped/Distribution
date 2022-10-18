package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedElementTransition extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var fromId: String
  
  var interpolation: js.UndefOr[Interpolation] = js.undefined
  
  var toId: String
}
object SharedElementTransition {
  
  inline def apply(fromId: String, toId: String): SharedElementTransition = {
    val __obj = js.Dynamic.literal(fromId = fromId.asInstanceOf[js.Any], toId = toId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedElementTransition]
  }
  
  extension [Self <: SharedElementTransition](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setFromId(value: String): Self = StObject.set(x, "fromId", value.asInstanceOf[js.Any])
    
    inline def setInterpolation(value: Interpolation): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setToId(value: String): Self = StObject.set(x, "toId", value.asInstanceOf[js.Any])
  }
}
