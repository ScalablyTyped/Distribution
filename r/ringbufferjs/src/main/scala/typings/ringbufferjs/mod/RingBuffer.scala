package typings.ringbufferjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RingBuffer[T] extends js.Object {
  var _elements: js.Array[T]
  var _first: Double
  var _last: Double
  var _size: Double
  def _evictedCb(element: T): js.Any
  def capacity(): Double
  def deq(): T
  def deqN(count: Double): js.Array[T]
  def enq(element: T): Double
  def isEmpty(): Boolean
  def isFull(): Boolean
  def peek(): T
  def peekN(count: Double): js.Array[T]
  def size(): Double
}

object RingBuffer {
  @scala.inline
  def apply[T](
    _elements: js.Array[T],
    _evictedCb: T => js.Any,
    _first: Double,
    _last: Double,
    _size: Double,
    capacity: () => Double,
    deq: () => T,
    deqN: Double => js.Array[T],
    enq: T => Double,
    isEmpty: () => Boolean,
    isFull: () => Boolean,
    peek: () => T,
    peekN: Double => js.Array[T],
    size: () => Double
  ): RingBuffer[T] = {
    val __obj = js.Dynamic.literal(_elements = _elements.asInstanceOf[js.Any], _evictedCb = js.Any.fromFunction1(_evictedCb), _first = _first.asInstanceOf[js.Any], _last = _last.asInstanceOf[js.Any], _size = _size.asInstanceOf[js.Any], capacity = js.Any.fromFunction0(capacity), deq = js.Any.fromFunction0(deq), deqN = js.Any.fromFunction1(deqN), enq = js.Any.fromFunction1(enq), isEmpty = js.Any.fromFunction0(isEmpty), isFull = js.Any.fromFunction0(isFull), peek = js.Any.fromFunction0(peek), peekN = js.Any.fromFunction1(peekN), size = js.Any.fromFunction0(size))
    __obj.asInstanceOf[RingBuffer[T]]
  }
}

