package typings
package priorityqueuejsLib.priorityqueuejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityQueue[T] extends js.Object {
  /**
    * Dequeues the top element of the priority queue.
    * Throws an Error when the queue is empty.
    */
  def deq(): T
  /**
    * Enqueues the element at the priority queue and returns its new size.
    * @param element The element to add
    */
  def enq(element: T): scala.Double
  /**
    * Executes fn on each element.
    * Just be careful to not modify the priorities, since the queue won't reorder itself.
    * @param fn The value to pass to an Array.forEach call
    */
  def forEach(fn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]): scala.Unit
  /**
    * Returns whether the priority queue is empty or not.
    */
  def isEmpty(): scala.Boolean
  /**
    * Peeks at the top element of the priority queue.
    * Throws an Error when the queue is empty.
    */
  def peek(): T
  /**
    * Returns the size of the priority queue.
    */
  def size(): scala.Double
}

object PriorityQueue {
  @scala.inline
  def apply[T](
    deq: js.Function0[T],
    enq: js.Function1[T, scala.Double],
    forEach: js.Function1[
      js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit], 
      scala.Unit
    ],
    isEmpty: js.Function0[scala.Boolean],
    peek: js.Function0[T],
    size: js.Function0[scala.Double]
  ): PriorityQueue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deq")(deq)
    __obj.updateDynamic("enq")(enq)
    __obj.updateDynamic("forEach")(forEach)
    __obj.updateDynamic("isEmpty")(isEmpty)
    __obj.updateDynamic("peek")(peek)
    __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[PriorityQueue[T]]
  }
}

