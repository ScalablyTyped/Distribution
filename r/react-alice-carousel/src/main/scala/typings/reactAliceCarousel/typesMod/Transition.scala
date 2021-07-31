package typings.reactAliceCarousel.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transition extends StObject {
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var animationEasingFunction: js.UndefOr[String] = js.undefined
}
object Transition {
  
  @scala.inline
  def apply(): Transition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Transition]
  }
  
  @scala.inline
  implicit class TransitionMutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    @scala.inline
    def setAnimationEasingFunction(value: String): Self = StObject.set(x, "animationEasingFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationEasingFunctionUndefined: Self = StObject.set(x, "animationEasingFunction", js.undefined)
  }
}
