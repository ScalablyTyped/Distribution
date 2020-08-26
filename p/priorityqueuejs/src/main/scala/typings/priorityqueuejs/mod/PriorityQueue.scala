package typings.priorityqueuejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PriorityQueue[T] extends js.Object {
  /**
    * Dequeues the top element of the priority queue.
    * Throws an Error when the queue is empty.
    */
  def deq(): T = js.native
  /**
    * Enqueues the element at the priority queue and returns its new size.
    * @param element The element to add
    */
  def enq(element: T): Double = js.native
  /**
    * Executes fn on each element.
    * Just be careful to not modify the priorities, since the queue won't reorder itself.
    * @param fn The value to pass to an Array.forEach call
    */
  def forEach(fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit = js.native
  /**
    * Returns whether the priority queue is empty or not.
    */
  def isEmpty(): Boolean = js.native
  /**
    * Peeks at the top element of the priority queue.
    * Throws an Error when the queue is empty.
    */
  def peek(): T = js.native
  /**
    * Returns the size of the priority queue.
    */
  def size(): Double = js.native
}

object PriorityQueue {
  @scala.inline
  def apply[T](
    deq: () => T,
    enq: T => Double,
    forEach: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit] => Unit,
    isEmpty: () => Boolean,
    peek: () => T,
    size: () => Double
  ): PriorityQueue[T] = {
    val __obj = js.Dynamic.literal(deq = js.Any.fromFunction0(deq), enq = js.Any.fromFunction1(enq), forEach = js.Any.fromFunction1(forEach), isEmpty = js.Any.fromFunction0(isEmpty), peek = js.Any.fromFunction0(peek), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[PriorityQueue[T]]
  }
  @scala.inline
  implicit class PriorityQueueOps[Self <: PriorityQueue[_], T] (val x: Self with PriorityQueue[T]) extends AnyVal {
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
    def setDeq(value: () => T): Self = this.set("deq", js.Any.fromFunction0(value))
    @scala.inline
    def setEnq(value: T => Double): Self = this.set("enq", js.Any.fromFunction1(value))
    @scala.inline
    def setForEach(value: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = this.set("isEmpty", js.Any.fromFunction0(value))
    @scala.inline
    def setPeek(value: () => T): Self = this.set("peek", js.Any.fromFunction0(value))
    @scala.inline
    def setSize(value: () => Double): Self = this.set("size", js.Any.fromFunction0(value))
  }
  
}

