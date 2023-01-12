package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlyToInterpolatorProps extends StObject {
  
  var curve: js.UndefOr[Double] = js.undefined
  
  var maxDuration: js.UndefOr[Double] = js.undefined
  
  var screenSpeed: js.UndefOr[Double] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
}
object FlyToInterpolatorProps {
  
  inline def apply(): FlyToInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlyToInterpolatorProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlyToInterpolatorProps] (val x: Self) extends AnyVal {
    
    inline def setCurve(value: Double): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    inline def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    inline def setScreenSpeed(value: Double): Self = StObject.set(x, "screenSpeed", value.asInstanceOf[js.Any])
    
    inline def setScreenSpeedUndefined: Self = StObject.set(x, "screenSpeed", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
