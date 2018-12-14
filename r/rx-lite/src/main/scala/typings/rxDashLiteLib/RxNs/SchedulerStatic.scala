package typings
package rxDashLiteLib.RxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchedulerStatic
  extends org.scalablytyped.runtime.Instantiable4[
      /* now */ js.Function0[scala.Double], 
      /* schedule */ js.Function2[
        /* state */ js.Any, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, rxDashCoreLib.RxNs.IDisposable], 
        rxDashCoreLib.RxNs.IDisposable
      ], 
      /* scheduleRelative */ js.Function3[
        /* state */ js.Any, 
        /* dueTime */ scala.Double, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, rxDashCoreLib.RxNs.IDisposable], 
        rxDashCoreLib.RxNs.IDisposable
      ], 
      /* scheduleAbsolute */ js.Function3[
        /* state */ js.Any, 
        /* dueTime */ scala.Double, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, rxDashCoreLib.RxNs.IDisposable], 
        rxDashCoreLib.RxNs.IDisposable
      ], 
      Scheduler
    ] {
  var currentThread: ICurrentThreadScheduler = js.native
  var default: IScheduler = js.native
  var immediate: IScheduler = js.native
   // alias for Scheduler.timeout
  var timeout: IScheduler = js.native
  def normalize(timeSpan: scala.Double): scala.Double = js.native
}

