package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationTimeline extends StObject {
  
  val currentTime: Double | Null
}
object AnimationTimeline {
  
  @scala.inline
  def apply(): AnimationTimeline = {
    val __obj = js.Dynamic.literal(currentTime = null)
    __obj.asInstanceOf[AnimationTimeline]
  }
  
  @scala.inline
  implicit class AnimationTimelineMutableBuilder[Self <: AnimationTimeline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTimeNull: Self = StObject.set(x, "currentTime", null)
  }
}
