package typings.setIntervalAsync

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("set-interval-async", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("set-interval-async", "SetIntervalAsyncError")
  @js.native
  open class SetIntervalAsyncError ()
    extends StObject
       with Error {
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def clearIntervalAsync(timer: SetIntervalAsyncTimer): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("clearIntervalAsync")(timer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  object dynamic {
    
    @JSImport("set-interval-async", "dynamic")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def setIntervalAsync(handler: js.Function1[/* repeated */ Any, Any], interval: Double, args: Any*): SetIntervalAsyncTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setIntervalAsync")((scala.List(handler.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[SetIntervalAsyncTimer]
  }
  
  object fixed {
    
    @JSImport("set-interval-async", "fixed")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def setIntervalAsync(handler: js.Function1[/* repeated */ Any, Any], interval: Double, args: Any*): SetIntervalAsyncTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setIntervalAsync")((scala.List(handler.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[SetIntervalAsyncTimer]
  }
  
  object legacy {
    
    @JSImport("set-interval-async", "legacy")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def setIntervalAsync(handler: js.Function1[/* repeated */ Any, Any], interval: Double, args: Any*): SetIntervalAsyncTimer = (^.asInstanceOf[js.Dynamic].applyDynamic("setIntervalAsync")((scala.List(handler.asInstanceOf[js.Any], interval.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[SetIntervalAsyncTimer]
  }
  
  trait SetIntervalAsyncTimer extends StObject {
    
    var id: Double
  }
  object SetIntervalAsyncTimer {
    
    inline def apply(id: Double): SetIntervalAsyncTimer = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[SetIntervalAsyncTimer]
    }
    
    extension [Self <: SetIntervalAsyncTimer](x: Self) {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
