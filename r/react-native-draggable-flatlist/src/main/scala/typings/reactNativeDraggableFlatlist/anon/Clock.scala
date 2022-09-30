package typings.reactNativeDraggableFlatlist.anon

import typings.reactNativeReanimated.mod.Animated.SpringConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Clock extends StObject {
  
  var clock: typings.reactNativeReanimated.mod.Clock
  
  var config: SpringConfig
  
  var state: Finished
}
object Clock {
  
  inline def apply(clock: typings.reactNativeReanimated.mod.Clock, config: SpringConfig, state: Finished): Clock = {
    val __obj = js.Dynamic.literal(clock = clock.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clock]
  }
  
  extension [Self <: Clock](x: Self) {
    
    inline def setClock(value: typings.reactNativeReanimated.mod.Clock): Self = StObject.set(x, "clock", value.asInstanceOf[js.Any])
    
    inline def setConfig(value: SpringConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setState(value: Finished): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
