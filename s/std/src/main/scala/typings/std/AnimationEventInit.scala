package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationEventInit extends EventInit {
  
  var animationName: js.UndefOr[java.lang.String] = js.native
  
  var elapsedTime: js.UndefOr[Double] = js.native
  
  var pseudoElement: js.UndefOr[java.lang.String] = js.native
}
object AnimationEventInit {
  
  @scala.inline
  def apply(): AnimationEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnimationEventInit]
  }
  
  @scala.inline
  implicit class AnimationEventInitMutableBuilder[Self <: AnimationEventInit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationName(value: java.lang.String): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationNameUndefined: Self = StObject.set(x, "animationName", js.undefined)
    
    @scala.inline
    def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsedTimeUndefined: Self = StObject.set(x, "elapsedTime", js.undefined)
    
    @scala.inline
    def setPseudoElement(value: java.lang.String): Self = StObject.set(x, "pseudoElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoElementUndefined: Self = StObject.set(x, "pseudoElement", js.undefined)
  }
}
