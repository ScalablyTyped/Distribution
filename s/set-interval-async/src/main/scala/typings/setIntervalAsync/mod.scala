package typings.setIntervalAsync

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("set-interval-async", "SetIntervalAsyncError")
  @js.native
  class SetIntervalAsyncError () extends Error
  
  @JSImport("set-interval-async", "clearIntervalAsync")
  @js.native
  def clearIntervalAsync(timer: SetIntervalAsyncTimer): js.Promise[Unit] = js.native
  
  object dynamic {
    
    /**
      * Attempts to execute the given handler at regular intervals, while preventing
      * multiple concurrent executions. The handler will never be executed concurrently
      * more than once in any given moment. If the running time of any execution exceeds
      * the desired interval, the following execution will be scheduled as soon as
      * possible; ie. immediately after the previous execution concludes.
      *
      * @param handler - Handler function to be executed in intervals. May be asynchronous.
      * @param interval - Interval in milliseconds. Must be at least 10 ms.
      * @param args - Any number of arguments to pass on to the handler.
      */
    @JSImport("set-interval-async", "dynamic.setIntervalAsync")
    @js.native
    def setIntervalAsync(handler: js.Function1[/* repeated */ js.Any, _], interval: Double, args: js.Any*): SetIntervalAsyncTimer = js.native
  }
  
  object fixed {
    
    /**
      * Executes the given handler at fixed intervals, while preventing
      * multiple concurrent executions. The handler will never be executed
      * concurrently more than once in any given moment, providing a fixed
      * time interval between the end of a given execution and the start of
      * the following one.
      *
      * @param handler - Handler function to be executed in intervals. May be asynchronous.
      * @param interval - Interval in milliseconds. Must be at least 10 ms.
      * @param args - Any number of arguments to pass on to the handler.
      */
    @JSImport("set-interval-async", "fixed.setIntervalAsync")
    @js.native
    def setIntervalAsync(handler: js.Function1[/* repeated */ js.Any, _], interval: Double, args: js.Any*): SetIntervalAsyncTimer = js.native
  }
  
  object legacy {
    
    /**
      * Executes the given handler at fixed intervals; ie. the start time
      * between consecutive executions is always a fixed amount of time.
      * If a given execution takes longer than the given time interval to
      * complete, then the handler will be invoked again without waiting
      * for the previous one to finish. In this scenario, multiple concurrent
      * executions can and will ocurr, so this function should only be used
      * when the given handler is reentrancy-safe.
      *
      * @param handler - Handler function to be executed in intervals. May be asynchronous.
      * @param interval - Interval in milliseconds. Must be at least 10 ms.
      * @param args - Any number of arguments to pass on to the handler.
      */
    @JSImport("set-interval-async", "legacy.setIntervalAsync")
    @js.native
    def setIntervalAsync(handler: js.Function1[/* repeated */ js.Any, _], interval: Double, args: js.Any*): SetIntervalAsyncTimer = js.native
  }
  
  @js.native
  trait SetIntervalAsyncTimer extends StObject {
    
    var id: Double = js.native
  }
  object SetIntervalAsyncTimer {
    
    @scala.inline
    def apply(id: Double): SetIntervalAsyncTimer = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetIntervalAsyncTimer]
    }
    
    @scala.inline
    implicit class SetIntervalAsyncTimerMutableBuilder[Self <: SetIntervalAsyncTimer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
