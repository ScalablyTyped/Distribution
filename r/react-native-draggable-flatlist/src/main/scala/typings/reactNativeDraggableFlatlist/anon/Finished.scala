package typings.reactNativeDraggableFlatlist.anon

import typings.reactNativeReanimated.mod.Animated.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Finished extends StObject {
  
  var finished: Value
  
  var position: Value
  
  var time: Value
  
  var velocity: Value
}
object Finished {
  
  inline def apply(finished: Value, position: Value, time: Value, velocity: Value): Finished = {
    val __obj = js.Dynamic.literal(finished = finished.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Finished]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Finished] (val x: Self) extends AnyVal {
    
    inline def setFinished(value: Value): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Value): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Value): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setVelocity(value: Value): Self = StObject.set(x, "velocity", value.asInstanceOf[js.Any])
  }
}
