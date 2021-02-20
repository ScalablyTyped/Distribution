package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationDuration extends StObject {
  
  var animationDuration: String = js.native
  
  var transform: String = js.native
  
  var width: String = js.native
}
object AnimationDuration {
  
  @scala.inline
  def apply(animationDuration: String, transform: String, width: String): AnimationDuration = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationDuration]
  }
  
  @scala.inline
  implicit class AnimationDurationMutableBuilder[Self <: AnimationDuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: String): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: String): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
