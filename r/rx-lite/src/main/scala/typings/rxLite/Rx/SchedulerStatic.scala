package typings.rxLite.Rx

import org.scalablytyped.runtime.Instantiable4
import typings.rxCore.Rx.IDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerStatic
  extends Instantiable4[
      /* now */ js.Function0[Double], 
      /* schedule */ js.Function2[
        /* state */ js.Any, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
        IDisposable
      ], 
      /* scheduleRelative */ js.Function3[
        /* state */ js.Any, 
        /* dueTime */ Double, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
        IDisposable
      ], 
      /* scheduleAbsolute */ js.Function3[
        /* state */ js.Any, 
        /* dueTime */ Double, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
        IDisposable
      ], 
      Scheduler
    ] {
  var currentThread: ICurrentThreadScheduler = js.native
  var default: IScheduler = js.native
  var immediate: IScheduler = js.native
   // alias for Scheduler.timeout
  var timeout: IScheduler = js.native
  def normalize(timeSpan: Double): Double = js.native
}

