package typings.sodiumjs

import typings.sodiumjs.distTypingsSodiumCellMod.Cell
import typings.sodiumjs.distTypingsSodiumStreamMod.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypingsSodiumTimerSystemMod {
  
  @JSImport("sodiumjs/dist/typings/sodium/TimerSystem", "TimerSystem")
  @js.native
  open class TimerSystem protected () extends StObject {
    def this(impl: TimerSystemImpl) = this()
    
    /**
      * A timer that fires at the specified time, which can be null, meaning
      * that the alarm is not set.
      */
    def at(tAlarm: Cell[Double]): Stream[Double] = js.native
    
    /* private */ var eventQueue: Any = js.native
    
    /* private */ var impl: Any = js.native
    
    /* private */ var tMinimum: Any = js.native
    
    /**
      * A cell giving the current clock time.
      */
    var time: Cell[Double] = js.native
  }
  
  /* note: abstract class */ @JSImport("sodiumjs/dist/typings/sodium/TimerSystem", "TimerSystemImpl")
  @js.native
  open class TimerSystemImpl () extends StObject {
    
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
