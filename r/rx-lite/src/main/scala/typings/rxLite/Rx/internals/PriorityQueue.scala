package typings.rxLite.Rx.internals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Priority Queue for Scheduling
trait PriorityQueue[TTime] extends js.Object {
  var length: Double
  def dequeue(): ScheduledItem[TTime]
  def enqueue(item: ScheduledItem[TTime]): Unit
  def heapify(index: Double): Unit
  def isHigherPriority(left: Double, right: Double): Boolean
  def peek(): ScheduledItem[TTime]
  def percolate(index: Double): Unit
  def remove(item: ScheduledItem[TTime]): Boolean
  def removeAt(index: Double): Unit
}

object PriorityQueue {
  @scala.inline
  def apply[TTime](
    dequeue: () => ScheduledItem[TTime],
    enqueue: ScheduledItem[TTime] => Unit,
    heapify: Double => Unit,
    isHigherPriority: (Double, Double) => Boolean,
    length: Double,
    peek: () => ScheduledItem[TTime],
    percolate: Double => Unit,
    remove: ScheduledItem[TTime] => Boolean,
    removeAt: Double => Unit
  ): PriorityQueue[TTime] = {
    val __obj = js.Dynamic.literal(dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), heapify = js.Any.fromFunction1(heapify), isHigherPriority = js.Any.fromFunction2(isHigherPriority), length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), percolate = js.Any.fromFunction1(percolate), remove = js.Any.fromFunction1(remove), removeAt = js.Any.fromFunction1(removeAt))
    __obj.asInstanceOf[PriorityQueue[TTime]]
  }
}

