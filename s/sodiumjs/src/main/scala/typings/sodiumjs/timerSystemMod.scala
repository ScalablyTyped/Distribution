package typings.sodiumjs

import typings.sodiumjs.cellMod.Cell
import typings.sodiumjs.streamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerSystemMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/TimerSystem", "TimerSystem")
  @js.native
  class TimerSystem protected () extends StObject {
    def this(impl: TimerSystemImpl) = this()
    
    /**
      * A timer that fires at the specified time, which can be null, meaning
      * that the alarm is not set.
      */
    def at(tAlarm: Cell[Double]): Stream[Double] = js.native
    
    /* private */ var eventQueue: js.Any = js.native
    
    /* private */ var impl: js.Any = js.native
    
    /* private */ var tMinimum: js.Any = js.native
    
    /**
      * A cell giving the current clock time.
      */
    var time: Cell[Double] = js.native
  }
  
  @JSImport("sodiumjs/dist/typings/sodium/TimerSystem", "TimerSystemImpl")
  @js.native
  abstract class TimerSystemImpl () extends StObject {
    
    /**
      * Return the current clock time.
      */
    def now(): Double = js.native
    
    /**
      * Set a timer that will execute the specified callback at the specified time.
      * @return A function that can be used to cancel the timer.
      */
    def setTimer(t: Double, callback: js.Function0[Unit]): js.Function0[Unit] = js.native
  }
}
