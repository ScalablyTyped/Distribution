package typings.ringbufferjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ringbufferjs", JSImport.Namespace)
  @js.native
  class ^[T] protected () extends RingBuffer[T] {
    def this(capacity: Double) = this()
    def this(capacity: Double, evictedCB: js.Function1[/* element */ T, _]) = this()
  }
  
  @js.native
  trait RingBuffer[T] extends StObject {
    
    var _elements: js.Array[T] = js.native
    
    def _evictedCb(element: T): js.Any = js.native
    
    var _first: Double = js.native
    
    var _last: Double = js.native
    
    var _size: Double = js.native
    
    def capacity(): Double = js.native
    
    def deq(): T = js.native
    
    def deqN(count: Double): js.Array[T] = js.native
    
    def enq(element: T): Double = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isFull(): Boolean = js.native
    
    def peek(): T = js.native
    
    def peekN(count: Double): js.Array[T] = js.native
    
    def size(): Double = js.native
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
    
    @scala.inline
    implicit class RingBufferMutableBuilder[Self <: RingBuffer[_], T] (val x: Self with RingBuffer[T]) extends AnyVal {
      
      @scala.inline
      def setCapacity(value: () => Double): Self = StObject.set(x, "capacity", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeq(value: () => T): Self = StObject.set(x, "deq", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDeqN(value: Double => js.Array[T]): Self = StObject.set(x, "deqN", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEnq(value: T => Double): Self = StObject.set(x, "enq", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsFull(value: () => Boolean): Self = StObject.set(x, "isFull", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPeek(value: () => T): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPeekN(value: Double => js.Array[T]): Self = StObject.set(x, "peekN", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_elements(value: js.Array[T]): Self = StObject.set(x, "_elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_elementsVarargs(value: T*): Self = StObject.set(x, "_elements", js.Array(value :_*))
      
      @scala.inline
      def set_evictedCb(value: T => js.Any): Self = StObject.set(x, "_evictedCb", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_first(value: Double): Self = StObject.set(x, "_first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_last(value: Double): Self = StObject.set(x, "_last", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_size(value: Double): Self = StObject.set(x, "_size", value.asInstanceOf[js.Any])
    }
  }
}
