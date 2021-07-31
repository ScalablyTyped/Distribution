package typings.reactVis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationParam extends StObject {
  
  var damping: js.UndefOr[Double] = js.undefined
  
  var nonAnimatedProps: js.UndefOr[js.Array[String]] = js.undefined
  
  var stiffness: js.UndefOr[Double] = js.undefined
}
object AnimationParam {
  
  @scala.inline
  def apply(): AnimationParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationParam]
  }
  
  @scala.inline
  implicit class AnimationParamMutableBuilder[Self <: AnimationParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDampingUndefined: Self = StObject.set(x, "damping", js.undefined)
    
    @scala.inline
    def setNonAnimatedProps(value: js.Array[String]): Self = StObject.set(x, "nonAnimatedProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonAnimatedPropsUndefined: Self = StObject.set(x, "nonAnimatedProps", js.undefined)
    
    @scala.inline
    def setNonAnimatedPropsVarargs(value: String*): Self = StObject.set(x, "nonAnimatedProps", js.Array(value :_*))
    
    @scala.inline
    def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStiffnessUndefined: Self = StObject.set(x, "stiffness", js.undefined)
  }
}
