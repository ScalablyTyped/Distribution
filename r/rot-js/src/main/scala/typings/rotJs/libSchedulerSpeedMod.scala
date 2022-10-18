package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSchedulerSpeedMod {
  
  @JSImport("rot-js/lib/scheduler/speed", JSImport.Default)
  @js.native
  open class default[T /* <: SpeedActor */] () extends Speed[T]
  
  @js.native
  trait Speed[T /* <: SpeedActor */]
    extends typings.rotJs.libSchedulerSchedulerMod.default[T] {
    
    def add(item: T, repeat: Boolean, time: Double): this.type = js.native
  }
  
  trait SpeedActor extends StObject {
    
    def getSpeed(): Double
  }
  object SpeedActor {
    
    inline def apply(getSpeed: () => Double): SpeedActor = {
      val __obj = js.Dynamic.literal(getSpeed = js.Any.fromFunction0(getSpeed))
      __obj.asInstanceOf[SpeedActor]
    }
    
    extension [Self <: SpeedActor](x: Self) {
      
      inline def setGetSpeed(value: () => Double): Self = StObject.set(x, "getSpeed", js.Any.fromFunction0(value))
    }
  }
}
