package typings.pusherJs

import typings.pusherJs.typesSrcCoreUtilsTimersSchedulingMod.Canceller
import typings.pusherJs.typesSrcCoreUtilsTimersSchedulingMod.Delay
import typings.pusherJs.typesSrcCoreUtilsTimersSchedulingMod.Scheduler
import typings.pusherJs.typesSrcCoreUtilsTimersTimedCallbackMod.TimedCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreUtilsTimersAbstractTimerMod {
  
  /* note: abstract class */ @JSImport("pusher-js/types/src/core/utils/timers/abstract_timer", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Timer {
    def this(set: Scheduler, clear: Canceller, delay: Delay, callback: TimedCallback) = this()
    
    /* protected */ /* CompleteClass */
    override def clear(number: Any): Unit = js.native
    /* protected */ /* CompleteClass */
    @JSName("clear")
    var clear_Original: Canceller = js.native
    
    /* CompleteClass */
    override def ensureAborted(): Unit = js.native
    
    /* CompleteClass */
    override def isRunning(): Boolean = js.native
    
    /* protected */ /* CompleteClass */
    var timer: Double | Unit = js.native
  }
  
  trait Timer extends StObject {
    
    /* protected */ def clear(number: Any): Unit
    /* protected */ @JSName("clear")
    var clear_Original: Canceller
    
    def ensureAborted(): Unit
    
    def isRunning(): Boolean
    
    /* protected */ var timer: Double | Unit
  }
  object Timer {
    
    inline def apply(
      clear: /* number */ Any => Unit,
      ensureAborted: () => Unit,
      isRunning: () => Boolean,
      timer: Double | Unit
    ): Timer = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction1(clear), ensureAborted = js.Any.fromFunction0(ensureAborted), isRunning = js.Any.fromFunction0(isRunning), timer = timer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Timer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
      
      inline def setClear(value: /* number */ Any => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction1(value))
      
      inline def setEnsureAborted(value: () => Unit): Self = StObject.set(x, "ensureAborted", js.Any.fromFunction0(value))
      
      inline def setIsRunning(value: () => Boolean): Self = StObject.set(x, "isRunning", js.Any.fromFunction0(value))
      
      inline def setTimer(value: Double | Unit): Self = StObject.set(x, "timer", value.asInstanceOf[js.Any])
    }
  }
}
