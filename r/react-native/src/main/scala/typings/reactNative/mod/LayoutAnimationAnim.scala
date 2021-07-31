package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutAnimationAnim extends StObject {
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var initialVelocity: js.UndefOr[Double] = js.undefined
  
  //LayoutAnimationTypes
  var property: js.UndefOr[String] = js.undefined
  
  var springDamping: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object LayoutAnimationAnim {
  
  @scala.inline
  def apply(): LayoutAnimationAnim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutAnimationAnim]
  }
  
  @scala.inline
  implicit class LayoutAnimationAnimMutableBuilder[Self <: LayoutAnimationAnim] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setInitialVelocity(value: Double): Self = StObject.set(x, "initialVelocity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialVelocityUndefined: Self = StObject.set(x, "initialVelocity", js.undefined)
    
    @scala.inline
    def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
    
    @scala.inline
    def setSpringDamping(value: Double): Self = StObject.set(x, "springDamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpringDampingUndefined: Self = StObject.set(x, "springDamping", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
