package typings.rxLite.Rx

import org.scalablytyped.runtime.Instantiable4
import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchedulerStatic
  extends StObject
     with Instantiable4[
      /* now */ js.Function0[Double], 
      /* schedule */ js.Function2[
        /* state */ Any, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ Any, IDisposable], 
        IDisposable
      ], 
      /* scheduleRelative */ js.Function3[
        /* state */ Any, 
        /* dueTime */ Double, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ Any, IDisposable], 
        IDisposable
      ], 
      /* scheduleAbsolute */ js.Function3[
        /* state */ Any, 
        /* dueTime */ Double, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ Any, IDisposable], 
        IDisposable
      ], 
      Scheduler
    ] {
  
  var default: IScheduler = js.native
  
  var currentThread: ICurrentThreadScheduler = js.native
  
  var immediate: IScheduler = js.native
  
  def normalize(timeSpan: Double): Double = js.native
  
  // alias for Scheduler.timeout
  var timeout: IScheduler = js.native
}
