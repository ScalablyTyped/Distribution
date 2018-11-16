package typings
package priorityqueuejsLib.priorityqueuejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("priorityqueuejs", JSImport.Namespace)
@js.native
class namespaced[T] () extends PriorityQueue[T] {
  /**
     * Initializes a new empty PriorityQueue with uses the given comparator(a, b) function as the comparator for its elements.
     * The comparator function must return a positive number when a > b, 0 when a == b and a negative number when a < b.
     */
  def this(comparator: priorityqueuejsLib.priorityqueuejsMod.PriorityQueueNs.Comparator[T]) = this()
  /**
     * Dequeues the top element of the priority queue.
     * Throws an Error when the queue is empty.
     */
  /* CompleteClass */
  override def deq(): T = js.native
  /**
     * Enqueues the element at the priority queue and returns its new size.
     * @param element The element to add
     */
  /* CompleteClass */
  override def enq(element: T): scala.Double = js.native
  /**
     * Executes fn on each element.
     * Just be careful to not modify the priorities, since the queue won't reorder itself.
     * @param fn The value to pass to an Array.forEach call
     */
  /* CompleteClass */
  override def forEach(fn: js.Function3[T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]): scala.Unit = js.native
  /**
     * Returns whether the priority queue is empty or not.
     */
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  /**
     * Peeks at the top element of the priority queue.
     * Throws an Error when the queue is empty.
     */
  /* CompleteClass */
  override def peek(): T = js.native
  /**
     * Returns the size of the priority queue.
     */
  /* CompleteClass */
  override def size(): scala.Double = js.native
}

@JSImport("priorityqueuejs", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  /**
     * Compares two Number or String objects.
     */
  @JSName("DEFAULT_COMPARATOR")
  var DEFAULT_COMPARATOR_Original: priorityqueuejsLib.priorityqueuejsMod.PriorityQueueNs.Comparator[scala.Double | java.lang.String] = js.native
  /**
     * Compares two Number or String objects.
     */
  def DEFAULT_COMPARATOR(a: java.lang.String, b: java.lang.String): scala.Double = js.native
  /**
     * Compares two Number or String objects.
     */
  def DEFAULT_COMPARATOR(a: java.lang.String, b: scala.Double): scala.Double = js.native
  /**
     * Compares two Number or String objects.
     */
  def DEFAULT_COMPARATOR(a: scala.Double, b: java.lang.String): scala.Double = js.native
  /**
     * Compares two Number or String objects.
     */
  def DEFAULT_COMPARATOR(a: scala.Double, b: scala.Double): scala.Double = js.native
}

