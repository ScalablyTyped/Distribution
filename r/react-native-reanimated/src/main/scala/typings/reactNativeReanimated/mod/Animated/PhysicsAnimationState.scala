package typings.reactNativeReanimated.mod.Animated

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhysicsAnimationState
  extends StObject
     with AnimationState {
  
  var velocity: AnimatedValue[Double]
}
object PhysicsAnimationState {
  
  inline def apply(
    finished: AnimatedValue[Double],
    position: AnimatedValue[Double],
    time: AnimatedValue[Double],
    velocity: AnimatedValue[Double]
  ): PhysicsAnimationState = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhysicsAnimationState]
  }
  
  extension [Self <: PhysicsAnimationState](x: Self) {
    
    inline def setVelocity(value: AnimatedValue[Double]): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
