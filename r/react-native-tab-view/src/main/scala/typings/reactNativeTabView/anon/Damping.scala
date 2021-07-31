package typings.reactNativeTabView.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Damping extends StObject {
  
  var damping: js.UndefOr[Double] = js.undefined
  
  var mass: js.UndefOr[Double] = js.undefined
  
  var restDisplacementThreshold: js.UndefOr[Double] = js.undefined
  
  var restSpeedThreshold: js.UndefOr[Double] = js.undefined
  
  var stiffness: js.UndefOr[Double] = js.undefined
}
object Damping {
  
  @scala.inline
  def apply(): Damping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Damping]
  }
  
  @scala.inline
  implicit class DampingMutableBuilder[Self <: Damping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    @scala.inline
    def setRestDisplacementThreshold(value: Double): Self = StObject.set(x, "restDisplacementThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestDisplacementThresholdUndefined: Self = StObject.set(x, "restDisplacementThreshold", js.undefined)
    
    @scala.inline
    def setRestSpeedThreshold(value: Double): Self = StObject.set(x, "restSpeedThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestSpeedThresholdUndefined: Self = StObject.set(x, "restSpeedThreshold", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
  }
}
