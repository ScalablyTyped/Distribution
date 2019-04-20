package typings
package ringbufferjsLib.ringbufferjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ringbufferjs", JSImport.Namespace)
@js.native
class ^[T] protected () extends RingBuffer[T] {
  def this(capacity: scala.Double) = this()
  def this(capacity: scala.Double, evictedCB: js.Function1[/* element */ T, _]) = this()
  /* CompleteClass */
  override var _elements: js.Array[T] = js.native
  /* CompleteClass */
  override var _first: scala.Double = js.native
  /* CompleteClass */
  override var _last: scala.Double = js.native
  /* CompleteClass */
  override var _size: scala.Double = js.native
  /* CompleteClass */
  override def _evictedCb(element: T): js.Any = js.native
  /* CompleteClass */
  override def capacity(): scala.Double = js.native
  /* CompleteClass */
  override def deq(): T = js.native
  /* CompleteClass */
  override def deqN(count: scala.Double): js.Array[T] = js.native
  /* CompleteClass */
  override def enq(element: T): scala.Double = js.native
  /* CompleteClass */
  override def isEmpty(): scala.Boolean = js.native
  /* CompleteClass */
  override def isFull(): scala.Boolean = js.native
  /* CompleteClass */
  override def peek(): T = js.native
  /* CompleteClass */
  override def peekN(count: scala.Double): js.Array[T] = js.native
  /* CompleteClass */
  override def size(): scala.Double = js.native
}

