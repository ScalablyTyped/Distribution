package typings.rotJs

import typings.rotJs.minHeapMod.MinHeap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventqueueMod {
  
  @JSImport("rot-js/lib/eventqueue", JSImport.Default)
  @js.native
  /**
    * @class Generic event queue: stores events and retrieves them based on their time
    */
  open class default[T] ()
    extends StObject
       with EventQueue[T] {
    
    /* CompleteClass */
    var _events: MinHeap[T] = js.native
    
    /* CompleteClass */
    var _time: Double = js.native
    
    /**
      * @param {?} event
      * @param {number} time
      */
    /* CompleteClass */
    override def add(event: T, time: Double): Unit = js.native
    
    /**
      * Clear all scheduled events
      */
    /* CompleteClass */
    override def clear(): this.type = js.native
    
    /**
      * Locates the nearest event, advances time if necessary. Returns that event and removes it from the queue.
      * @returns {? || null} The event previously added by addEvent, null if no event available
      */
    /* CompleteClass */
    override def get(): T | Null = js.native
    
    /**
      * Get the time associated with the given event
      * @param {?} event
      * @returns {number} time
      */
    /* CompleteClass */
    override def getEventTime(event: T): js.UndefOr[Double] = js.native
    
    /**
      * @returns {number} Elapsed time
      */
    /* CompleteClass */
    override def getTime(): Double = js.native
    
    /**
      * Remove an event from the queue
      * @param {?} event
      * @returns {bool} success?
      */
    /* CompleteClass */
    override def remove(event: T): Boolean = js.native
  }
  
  trait EventQueue[T] extends StObject {
    
    var _events: MinHeap[T]
    
    var _time: Double
    
    /**
      * @param {?} event
      * @param {number} time
      */
    def add(event: T, time: Double): Unit
    
    /**
      * Clear all scheduled events
      */
    def clear(): this.type
    
    /**
      * Locates the nearest event, advances time if necessary. Returns that event and removes it from the queue.
      * @returns {? || null} The event previously added by addEvent, null if no event available
      */
    def get(): T | Null
    
    /**
      * Get the time associated with the given event
      * @param {?} event
      * @returns {number} time
      */
    def getEventTime(event: T): js.UndefOr[Double]
    
    /**
      * @returns {number} Elapsed time
      */
    def getTime(): Double
    
    /**
      * Remove an event from the queue
      * @param {?} event
      * @returns {bool} success?
      */
    def remove(event: T): Boolean
  }
  object EventQueue {
    
    inline def apply[T](
      _events: MinHeap[T],
      _time: Double,
      add: (T, Double) => Unit,
      clear: () => EventQueue[T],
      get: () => T | Null,
      getEventTime: T => js.UndefOr[Double],
      getTime: () => Double,
      remove: T => Boolean
    ): EventQueue[T] = {
      val __obj = js.Dynamic.literal(_events = _events.asInstanceOf[js.Any], _time = _time.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction0(get), getEventTime = js.Any.fromFunction1(getEventTime), getTime = js.Any.fromFunction0(getTime), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[EventQueue[T]]
    }
    
    extension [Self <: EventQueue[?], T](x: Self & EventQueue[T]) {
      
      inline def setAdd(value: (T, Double) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      inline def setClear(value: () => EventQueue[T]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: () => T | Null): Self = StObject.set(x, "get", js.Any.fromFunction0(value))
      
      inline def setGetEventTime(value: T => js.UndefOr[Double]): Self = StObject.set(x, "getEventTime", js.Any.fromFunction1(value))
      
      inline def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
      
      inline def setRemove(value: T => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def set_events(value: MinHeap[T]): Self = StObject.set(x, "_events", value.asInstanceOf[js.Any])
      
      inline def set_time(value: Double): Self = StObject.set(x, "_time", value.asInstanceOf[js.Any])
    }
  }
}
