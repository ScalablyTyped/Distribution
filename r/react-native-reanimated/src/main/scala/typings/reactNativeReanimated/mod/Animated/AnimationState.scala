package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationState extends StObject {
  
  var finished: AnimatedValue[Double]
  
  var position: AnimatedValue[Double]
  
  var time: AnimatedValue[Double]
}
object AnimationState {
  
  inline def apply(finished: AnimatedValue[Double], position: AnimatedValue[Double], time: AnimatedValue[Double]): AnimationState = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationState] (val x: Self) extends AnyVal {
    
    inline def setFinished(value: AnimatedValue[Double]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: AnimatedValue[Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTime(value: AnimatedValue[Double]): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
