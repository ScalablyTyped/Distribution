package typings.ringbufferjs.ringbufferjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ringbufferjs", JSImport.Namespace)
@js.native
class ^[T] protected () extends RingBuffer[T] {
  def this(capacity: Double) = this()
  def this(capacity: Double, evictedCB: js.Function1[/* element */ T, _]) = this()
  /* CompleteClass */
  override var _elements: js.Array[T] = js.native
  /* CompleteClass */
  override var _first: Double = js.native
  /* CompleteClass */
  override var _last: Double = js.native
  /* CompleteClass */
  override var _size: Double = js.native
  /* CompleteClass */
  override def _evictedCb(element: T): js.Any = js.native
  /* CompleteClass */
  override def capacity(): Double = js.native
  /* CompleteClass */
  override def deq(): T = js.native
  /* CompleteClass */
  override def deqN(count: Double): js.Array[T] = js.native
  /* CompleteClass */
  override def enq(element: T): Double = js.native
  /* CompleteClass */
  override def isEmpty(): Boolean = js.native
  /* CompleteClass */
  override def isFull(): Boolean = js.native
  /* CompleteClass */
  override def peek(): T = js.native
  /* CompleteClass */
  override def peekN(count: Double): js.Array[T] = js.native
  /* CompleteClass */
  override def size(): Double = js.native
}

