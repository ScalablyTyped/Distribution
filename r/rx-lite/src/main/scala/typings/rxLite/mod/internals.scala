package typings.rxLite.mod

import typings.rxCore.Rx.IDisposable
import typings.rxLite.Rx.IScheduler
import typings.rxLite.anon.GetDisposable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-lite", "internals")
@js.native
object internals extends js.Object {
  // Priority Queue for Scheduling
  @js.native
  class PriorityQueue[TTime] protected ()
    extends typings.rxLite.Rx.internals.PriorityQueue[TTime] {
    def this(capacity: Double) = this()
    /* CompleteClass */
    override var length: Double = js.native
    /* CompleteClass */
    override def dequeue(): typings.rxLite.Rx.internals.ScheduledItem[TTime] = js.native
    /* CompleteClass */
    override def enqueue(item: typings.rxLite.Rx.internals.ScheduledItem[TTime]): Unit = js.native
    /* CompleteClass */
    override def heapify(index: Double): Unit = js.native
    /* CompleteClass */
    override def isHigherPriority(left: Double, right: Double): Boolean = js.native
    /* CompleteClass */
    override def peek(): typings.rxLite.Rx.internals.ScheduledItem[TTime] = js.native
    /* CompleteClass */
    override def percolate(index: Double): Unit = js.native
    /* CompleteClass */
    override def remove(item: typings.rxLite.Rx.internals.ScheduledItem[TTime]): Boolean = js.native
    /* CompleteClass */
    override def removeAt(index: Double): Unit = js.native
  }
  
  @js.native
  class ScheduledItem[TTime] protected ()
    extends typings.rxLite.Rx.internals.ScheduledItem[TTime] {
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
    /* CompleteClass */
    override var disposable: typings.rxLite.Rx.SingleAssignmentDisposable = js.native
    /* CompleteClass */
    override var dueTime: TTime = js.native
    /* CompleteClass */
    override var scheduler: IScheduler = js.native
    /* CompleteClass */
    override var state: TTime = js.native
    /* CompleteClass */
    override def action(scheduler: IScheduler, state: js.Any): IDisposable = js.native
    /* CompleteClass */
    override def compareTo(other: typings.rxLite.Rx.internals.ScheduledItem[TTime]): Double = js.native
    /* CompleteClass */
    override def comparer(x: TTime, y: TTime): Double = js.native
    /* CompleteClass */
    override def invoke(): Unit = js.native
    /* CompleteClass */
    override def invokeCore(): IDisposable = js.native
    /* CompleteClass */
    override def isCancelled(): Boolean = js.native
  }
  
  def addRef[T](xs: typings.rxLite.Rx.Observable[T], r: GetDisposable): typings.rxLite.Rx.Observable[T] = js.native
  def isEqual(left: js.Any, right: js.Any): Boolean = js.native
  /* static members */
  @js.native
  object PriorityQueue extends js.Object {
    var count: Double = js.native
  }
  
}

