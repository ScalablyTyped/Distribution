package typings.reactNativeNavigation.anon

import typings.reactNativeNavigation.optionsMod.Interpolation
import typings.reactNativeNavigation.reactNativeNavigationStrings.spring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AllowsOverdamping extends Interpolation {
  
  var allowsOverdamping: js.UndefOr[Boolean] = js.native
  
  var damping: js.UndefOr[Double] = js.native
  
  var initialVelocity: js.UndefOr[Double] = js.native
  
  var mass: js.UndefOr[Double] = js.native
  
  var stiffness: js.UndefOr[Double] = js.native
  
  var `type`: spring = js.native
}
object AllowsOverdamping {
  
  @scala.inline
  def apply(`type`: spring): AllowsOverdamping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowsOverdamping]
  }
  
  @scala.inline
  implicit class AllowsOverdampingMutableBuilder[Self <: AllowsOverdamping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowsOverdamping(value: Boolean): Self = StObject.set(x, "allowsOverdamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowsOverdampingUndefined: Self = StObject.set(x, "allowsOverdamping", js.undefined)
    
    @scala.inline
    def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    @scala.inline
    def setInitialVelocity(value: Double): Self = StObject.set(x, "initialVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialVelocityUndefined: Self = StObject.set(x, "initialVelocity", js.undefined)
    
    @scala.inline
    def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    @scala.inline
    def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
    
    @scala.inline
    def setType(value: spring): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
