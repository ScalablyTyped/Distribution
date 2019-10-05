package typings.rxDashLite.Rx

import typings.rxDashCore.Rx.IDisposable
import typings.rxDashLite.Anon_GetDisposable
import typings.rxDashLite.Rx.internals.ScheduledItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Rx.internals")
@js.native
object internals extends js.Object {
  // Priority Queue for Scheduling
  @js.native
  class PriorityQueue[TTime] protected () extends js.Object {
    def this(capacity: Double) = this()
    var length: Double = js.native
    def dequeue(): ScheduledItem[TTime] = js.native
    def enqueue(item: ScheduledItem[TTime]): Unit = js.native
    def heapify(index: Double): Unit = js.native
    def isHigherPriority(left: Double, right: Double): Boolean = js.native
    def peek(): ScheduledItem[TTime] = js.native
    def percolate(index: Double): Unit = js.native
    def remove(item: ScheduledItem[TTime]): Boolean = js.native
    def removeAt(index: Double): Unit = js.native
  }
  
  @js.native
  class ScheduledItem[TTime] protected () extends js.Object {
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
    var disposable: SingleAssignmentDisposable = js.native
    var dueTime: TTime = js.native
    var scheduler: IScheduler = js.native
    var state: TTime = js.native
    def action(scheduler: IScheduler, state: js.Any): IDisposable = js.native
    def compareTo(other: ScheduledItem[TTime]): Double = js.native
    def comparer(x: TTime, y: TTime): Double = js.native
    def invoke(): Unit = js.native
    def invokeCore(): IDisposable = js.native
    def isCancelled(): Boolean = js.native
  }
  
  def addRef[T](xs: Observable[T], r: Anon_GetDisposable): Observable[T] = js.native
  def isEqual(left: js.Any, right: js.Any): Boolean = js.native
  /* static members */
  @js.native
  object PriorityQueue extends js.Object {
    var count: Double = js.native
  }
  
}

