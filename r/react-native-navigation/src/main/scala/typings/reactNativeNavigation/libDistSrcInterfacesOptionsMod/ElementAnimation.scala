package typings.reactNativeNavigation.libDistSrcInterfacesOptionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementAnimation extends StObject {
  
  var duration: Double
  
  var interpolation: js.UndefOr[Interpolation] = js.undefined
  
  var startDelay: js.UndefOr[Double] = js.undefined
}
object ElementAnimation {
  
  inline def apply(duration: Double): ElementAnimation = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementAnimation] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setInterpolation(value: Interpolation): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setInterpolationUndefined: Self = StObject.set(x, "interpolation", js.undefined)
    
    inline def setStartDelay(value: Double): Self = StObject.set(x, "startDelay", value.asInstanceOf[js.Any])
    
    inline def setStartDelayUndefined: Self = StObject.set(x, "startDelay", js.undefined)
  }
}
