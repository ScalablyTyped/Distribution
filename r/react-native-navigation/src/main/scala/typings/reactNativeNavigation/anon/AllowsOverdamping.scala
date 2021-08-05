package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.optionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowsOverdamping
  extends StObject
     with Interpolation {
  
  var allowsOverdamping: js.UndefOr[Boolean] = js.undefined
  
  var damping: js.UndefOr[Double] = js.undefined
  
  var initialVelocity: js.UndefOr[Double] = js.undefined
  
  var mass: js.UndefOr[Double] = js.undefined
  
  var stiffness: js.UndefOr[Double] = js.undefined
  
  var `type`: spring
}
object AllowsOverdamping {
  
  inline def apply(): AllowsOverdamping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("spring")
    __obj.asInstanceOf[AllowsOverdamping]
  }
  
  extension [Self <: AllowsOverdamping](x: Self) {
    
    inline def setAllowsOverdamping(value: Boolean): Self = StObject.set(x, "allowsOverdamping", value.asInstanceOf[js.Any])
    
    inline def setAllowsOverdampingUndefined: Self = StObject.set(x, "allowsOverdamping", js.undefined)
    
    inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    inline def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    inline def setInitialVelocity(value: Double): Self = StObject.set(x, "initialVelocity", value.asInstanceOf[js.Any])
    
    inline def setInitialVelocityUndefined: Self = StObject.set(x, "initialVelocity", js.undefined)
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    inline def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    inline def setType(value: spring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
