package typings
package rxDashLiteLib.RxNs.internalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Priority Queue for Scheduling
@JSGlobal("Rx.internals.PriorityQueue")
@js.native
class PriorityQueue[TTime] protected () extends js.Object {
  def this(capacity: scala.Double) = this()
  var length: scala.Double = js.native
  def dequeue(): ScheduledItem[TTime] = js.native
  def enqueue(item: ScheduledItem[TTime]): scala.Unit = js.native
  def heapify(index: scala.Double): scala.Unit = js.native
  def isHigherPriority(left: scala.Double, right: scala.Double): scala.Boolean = js.native
  def peek(): ScheduledItem[TTime] = js.native
  def percolate(index: scala.Double): scala.Unit = js.native
  def remove(item: ScheduledItem[TTime]): scala.Boolean = js.native
  def removeAt(index: scala.Double): scala.Unit = js.native
}

// Priority Queue for Scheduling
@JSGlobal("Rx.internals.PriorityQueue")
@js.native
object PriorityQueue extends js.Object {
  var count: scala.Double = js.native
}

