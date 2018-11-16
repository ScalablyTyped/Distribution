package typings
package rxDashLiteLib.rxDashLiteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite", "internals")
@js.native
object internalsNs extends js.Object {
  // Priority Queue for Scheduling
  @js.native
  class PriorityQueue[TTime] protected ()
    extends rxDashLiteLib.RxNs.internalsNs.PriorityQueue[TTime] {
    def this(capacity: scala.Double) = this()
  }
  
  @js.native
  class ScheduledItem[TTime] protected ()
    extends rxDashLiteLib.RxNs.internalsNs.ScheduledItem[TTime] {
    def this(scheduler: rxDashLiteLib.RxNs.IScheduler, state: js.Any, action: js.Function2[
          /* scheduler */ rxDashLiteLib.RxNs.IScheduler, 
          /* state */ js.Any, 
          rxDashCoreLib.RxNs.IDisposable
        ], dueTime: TTime) = this()
    def this(scheduler: rxDashLiteLib.RxNs.IScheduler, state: js.Any, action: js.Function2[
          /* scheduler */ rxDashLiteLib.RxNs.IScheduler, 
          /* state */ js.Any, 
          rxDashCoreLib.RxNs.IDisposable
        ], dueTime: TTime, comparer: js.Function2[/* x */ TTime, /* y */ TTime, scala.Double]) = this()
  }
  
  def addRef[T](xs: rxDashLiteLib.RxNs.Observable[T], r: rxDashLiteLib.Anon_GetDisposable): rxDashLiteLib.RxNs.Observable[T] = js.native
  def isEqual(left: js.Any, right: js.Any): scala.Boolean = js.native
  // Priority Queue for Scheduling
  @js.native
  object PriorityQueue extends js.Object {
    var count: scala.Double = js.native
  }
  
}

