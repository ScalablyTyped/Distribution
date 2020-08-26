package typings.rxLite.Rx.internals

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Priority Queue for Scheduling
@js.native
trait PriorityQueue[TTime] extends js.Object {
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
  @scala.inline
  implicit class PriorityQueueOps[Self <: PriorityQueue[_], TTime] (val x: Self with PriorityQueue[TTime]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDequeue(value: () => ScheduledItem[TTime]): Self = this.set("dequeue", js.Any.fromFunction0(value))
    @scala.inline
    def setEnqueue(value: ScheduledItem[TTime] => Unit): Self = this.set("enqueue", js.Any.fromFunction1(value))
    @scala.inline
    def setHeapify(value: Double => Unit): Self = this.set("heapify", js.Any.fromFunction1(value))
    @scala.inline
    def setIsHigherPriority(value: (Double, Double) => Boolean): Self = this.set("isHigherPriority", js.Any.fromFunction2(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeek(value: () => ScheduledItem[TTime]): Self = this.set("peek", js.Any.fromFunction0(value))
    @scala.inline
    def setPercolate(value: Double => Unit): Self = this.set("percolate", js.Any.fromFunction1(value))
    @scala.inline
    def setRemove(value: ScheduledItem[TTime] => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveAt(value: Double => Unit): Self = this.set("removeAt", js.Any.fromFunction1(value))
  }
  
}

