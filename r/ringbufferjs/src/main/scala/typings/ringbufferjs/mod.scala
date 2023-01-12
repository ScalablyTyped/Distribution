package typings.ringbufferjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ringbufferjs", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with RingBuffer[T] {
    def this(capacity: Double) = this()
    def this(capacity: Double, evictedCB: js.Function1[/* element */ T, Any]) = this()
    
    /* CompleteClass */
    var _elements: js.Array[T] = js.native
    
    /* CompleteClass */
    override def _evictedCb(element: T): Any = js.native
    
    /* CompleteClass */
    var _first: Double = js.native
    
    /* CompleteClass */
    var _last: Double = js.native
    
    /* CompleteClass */
    var _size: Double = js.native
    
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
  
  trait RingBuffer[T] extends StObject {
    
    var _elements: js.Array[T]
    
    def _evictedCb(element: T): Any
    
    var _first: Double
    
    var _last: Double
    
    var _size: Double
    
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
    
    inline def apply[T](
      _elements: js.Array[T],
      _evictedCb: T => Any,
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
    implicit open class MutableBuilder[Self <: RingBuffer[?], T] (val x: Self & RingBuffer[T]) extends AnyVal {
      
      inline def setCapacity(value: () => Double): Self = StObject.set(x, "capacity", js.Any.fromFunction0(value))
      
      inline def setDeq(value: () => T): Self = StObject.set(x, "deq", js.Any.fromFunction0(value))
      
      inline def setDeqN(value: Double => js.Array[T]): Self = StObject.set(x, "deqN", js.Any.fromFunction1(value))
      
      inline def setEnq(value: T => Double): Self = StObject.set(x, "enq", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setIsFull(value: () => Boolean): Self = StObject.set(x, "isFull", js.Any.fromFunction0(value))
      
      inline def setPeek(value: () => T): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      inline def setPeekN(value: Double => js.Array[T]): Self = StObject.set(x, "peekN", js.Any.fromFunction1(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      inline def set_elements(value: js.Array[T]): Self = StObject.set(x, "_elements", value.asInstanceOf[js.Any])
      
      inline def set_elementsVarargs(value: T*): Self = StObject.set(x, "_elements", js.Array(value*))
      
      inline def set_evictedCb(value: T => Any): Self = StObject.set(x, "_evictedCb", js.Any.fromFunction1(value))
      
      inline def set_first(value: Double): Self = StObject.set(x, "_first", value.asInstanceOf[js.Any])
      
      inline def set_last(value: Double): Self = StObject.set(x, "_last", value.asInstanceOf[js.Any])
      
      inline def set_size(value: Double): Self = StObject.set(x, "_size", value.asInstanceOf[js.Any])
    }
  }
}
