package typings.rxDashLite.RxNs.internalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Priority Queue for Scheduling
@JSGlobal("Rx.internals.PriorityQueue")
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

/* static members */
@JSGlobal("Rx.internals.PriorityQueue")
@js.native
object PriorityQueue extends js.Object {
  var count: Double = js.native
}

