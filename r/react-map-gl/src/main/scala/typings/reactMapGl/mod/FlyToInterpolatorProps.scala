package typings.reactMapGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlyToInterpolatorProps extends StObject {
  
  var curve: js.UndefOr[Double] = js.native
  
  var maxDuration: js.UndefOr[Double] = js.native
  
  var screenSpeed: js.UndefOr[Double] = js.native
  
  var speed: js.UndefOr[Double] = js.native
}
object FlyToInterpolatorProps {
  
  @scala.inline
  def apply(): FlyToInterpolatorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlyToInterpolatorProps]
  }
  
  @scala.inline
  implicit class FlyToInterpolatorPropsMutableBuilder[Self <: FlyToInterpolatorProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurve(value: Double): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    @scala.inline
    def setMaxDuration(value: Double): Self = StObject.set(x, "maxDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxDurationUndefined: Self = StObject.set(x, "maxDuration", js.undefined)
    
    @scala.inline
    def setScreenSpeed(value: Double): Self = StObject.set(x, "screenSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenSpeedUndefined: Self = StObject.set(x, "screenSpeed", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
