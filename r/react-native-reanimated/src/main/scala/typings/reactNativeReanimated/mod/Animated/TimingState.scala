package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimingState
  extends StObject
     with AnimationState {
  
  var frameTime: AnimatedValue[Double]
}
object TimingState {
  
  inline def apply(
    finished: AnimatedValue[Double],
    frameTime: AnimatedValue[Double],
    position: AnimatedValue[Double],
    time: AnimatedValue[Double]
  ): TimingState = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], frameTime = frameTime.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimingState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimingState] (val x: Self) extends AnyVal {
    
    inline def setFrameTime(value: AnimatedValue[Double]): Self = StObject.set(x, "frameTime", value.asInstanceOf[js.Any])
  }
}
