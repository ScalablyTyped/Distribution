package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutAnimationAnim extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var initialVelocity: js.UndefOr[Double] = js.undefined
  
  var property: js.UndefOr[LayoutAnimationProperty] = js.undefined
  
  var springDamping: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[LayoutAnimationType] = js.undefined
}
object LayoutAnimationAnim {
  
  inline def apply(): LayoutAnimationAnim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutAnimationAnim]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutAnimationAnim] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setInitialVelocity(value: Double): Self = StObject.set(x, "initialVelocity", value.asInstanceOf[js.Any])
    
    inline def setInitialVelocityUndefined: Self = StObject.set(x, "initialVelocity", js.undefined)
    
    inline def setProperty(value: LayoutAnimationProperty): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    inline def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    inline def setSpringDamping(value: Double): Self = StObject.set(x, "springDamping", value.asInstanceOf[js.Any])
    
    inline def setSpringDampingUndefined: Self = StObject.set(x, "springDamping", js.undefined)
    
    inline def setType(value: LayoutAnimationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
