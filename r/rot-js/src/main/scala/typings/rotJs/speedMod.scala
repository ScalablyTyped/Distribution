package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speedMod {
  
  @JSImport("rot-js/lib/scheduler/speed", JSImport.Default)
  @js.native
  class default[T /* <: SpeedActor */] () extends Speed[T]
  
  @js.native
  trait Speed[T /* <: SpeedActor */]
    extends typings.rotJs.schedulerSchedulerMod.default[T] {
    
    def add(item: T, repeat: Boolean, time: Double): this.type = js.native
  }
  
  trait SpeedActor extends StObject {
    
    def getSpeed(): Double
  }
  object SpeedActor {
    
    @scala.inline
    def apply(getSpeed: () => Double): SpeedActor = {
      val __obj = js.Dynamic.literal(getSpeed = js.Any.fromFunction0(getSpeed))
      __obj.asInstanceOf[SpeedActor]
    }
    
    @scala.inline
    implicit class SpeedActorMutableBuilder[Self <: SpeedActor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSpeed(value: () => Double): Self = StObject.set(x, "getSpeed", js.Any.fromFunction0(value))
    }
  }
}
