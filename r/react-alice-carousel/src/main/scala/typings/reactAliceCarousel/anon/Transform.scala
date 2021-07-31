package typings.reactAliceCarousel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transform extends StObject {
  
  var animationDuration: Unit
  
  var transform: Unit
  
  var width: Double
}
object Transform {
  
  @scala.inline
  def apply(animationDuration: Unit, transform: Unit, width: Double): Transform = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transform]
  }
  
  @scala.inline
  implicit class TransformMutableBuilder[Self <: Transform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Unit): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: Unit): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
