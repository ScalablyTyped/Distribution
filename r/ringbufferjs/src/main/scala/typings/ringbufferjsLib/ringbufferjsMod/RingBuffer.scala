package typings
package ringbufferjsLib.ringbufferjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RingBuffer[T] extends js.Object {
  var _elements: js.Array[T]
  var _first: scala.Double
  var _last: scala.Double
  var _size: scala.Double
  def _evictedCb(element: T): js.Any
  def capacity(): scala.Double
  def deq(): T
  def deqN(count: scala.Double): js.Array[T]
  def enq(element: T): scala.Double
  def isEmpty(): scala.Boolean
  def isFull(): scala.Boolean
  def peek(): T
  def peekN(count: scala.Double): js.Array[T]
  def size(): scala.Double
}

object RingBuffer {
  @scala.inline
  def apply[T](
    _elements: js.Array[T],
    _evictedCb: T => js.Any,
    _first: scala.Double,
    _last: scala.Double,
    _size: scala.Double,
    capacity: () => scala.Double,
    deq: () => T,
    deqN: scala.Double => js.Array[T],
    enq: T => scala.Double,
    isEmpty: () => scala.Boolean,
    isFull: () => scala.Boolean,
    peek: () => T,
    peekN: scala.Double => js.Array[T],
    size: () => scala.Double
  ): RingBuffer[T] = {
    val __obj = js.Dynamic.literal(_elements = _elements, _evictedCb = js.Any.fromFunction1(_evictedCb), _first = _first, _last = _last, _size = _size, capacity = js.Any.fromFunction0(capacity), deq = js.Any.fromFunction0(deq), deqN = js.Any.fromFunction1(deqN), enq = js.Any.fromFunction1(enq), isEmpty = js.Any.fromFunction0(isEmpty), isFull = js.Any.fromFunction0(isFull), peek = js.Any.fromFunction0(peek), peekN = js.Any.fromFunction1(peekN), size = js.Any.fromFunction0(size))
  
    __obj.asInstanceOf[RingBuffer[T]]
  }
}

