package typings.rxDashLite.rxDashLiteMod

import typings.rxDashCore.Rx.IDisposable
import typings.rxDashLite.Anon_GetDisposable
import typings.rxDashLite.Rx.IScheduler
import typings.rxDashLite.Rx.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite", "internals")
@js.native
object internals extends js.Object {
  // Priority Queue for Scheduling
  @js.native
  class PriorityQueue[TTime] protected ()
    extends typings.rxDashLite.Rx.internals.PriorityQueue[TTime] {
    def this(capacity: Double) = this()
  }
  
  @js.native
  class ScheduledItem[TTime] protected ()
    extends typings.rxDashLite.Rx.internals.ScheduledItem[TTime] {
    def this(
      scheduler: IScheduler,
      state: js.Any,
      action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
      dueTime: TTime
    ) = this()
    def this(
      scheduler: IScheduler,
      state: js.Any,
      action: js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable],
      dueTime: TTime,
      comparer: js.Function2[/* x */ TTime, /* y */ TTime, Double]
    ) = this()
  }
  
  def addRef[T](xs: Observable[T], r: Anon_GetDisposable): Observable[T] = js.native
  def isEqual(left: js.Any, right: js.Any): Boolean = js.native
  /* static members */
  @js.native
  object PriorityQueue extends js.Object {
    var count: Double = js.native
  }
  
}

