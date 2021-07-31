package typings.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulerSchedulerMod {
  
  @JSImport("rot-js/lib/scheduler/scheduler", JSImport.Default)
  @js.native
  /**
    * @class Abstract scheduler
    */
  class default[T] ()
    extends StObject
       with Scheduler[T] {
    
    /* CompleteClass */
    var _current: js.Any = js.native
    
    /* CompleteClass */
    var _queue: typings.rotJs.eventqueueMod.default[T] = js.native
    
    /* CompleteClass */
    var _repeat: js.Array[T] = js.native
    
    /**
      * @param {?} item
      * @param {bool} repeat
      */
    /* CompleteClass */
    override def add(item: T, repeat: Boolean): this.type = js.native
    
    /**
      * Clear all items
      */
    /* CompleteClass */
    override def clear(): this.type = js.native
    
    /**
      * @see ROT.EventQueue#getTime
      */
    /* CompleteClass */
    override def getTime(): Double = js.native
    
    /**
      * Get the time the given item is scheduled for
      * @param {?} item
      * @returns {number} time
      */
    /* CompleteClass */
    override def getTimeOf(item: T): js.UndefOr[Double] = js.native
    
    /**
      * Schedule next item
      * @returns {?}
      */
    /* CompleteClass */
    override def next(): js.Any = js.native
    
    /**
      * Remove a previously added item
      * @param {?} item
      * @returns {bool} successful?
      */
    /* CompleteClass */
    override def remove(item: js.Any): Boolean = js.native
  }
  
  trait Scheduler[T] extends StObject {
    
    var _current: js.Any
    
    var _queue: typings.rotJs.eventqueueMod.default[T]
    
    var _repeat: js.Array[T]
    
    /**
      * @param {?} item
      * @param {bool} repeat
      */
    def add(item: T, repeat: Boolean): this.type
    
    /**
      * Clear all items
      */
    def clear(): this.type
    
    /**
      * @see ROT.EventQueue#getTime
      */
    def getTime(): Double
    
    /**
      * Get the time the given item is scheduled for
      * @param {?} item
      * @returns {number} time
      */
    def getTimeOf(item: T): js.UndefOr[Double]
    
    /**
      * Schedule next item
      * @returns {?}
      */
    def next(): js.Any
    
    /**
      * Remove a previously added item
      * @param {?} item
      * @returns {bool} successful?
      */
    def remove(item: js.Any): Boolean
  }
  object Scheduler {
    
    @scala.inline
    def apply[T](
      _current: js.Any,
      _queue: typings.rotJs.eventqueueMod.default[T],
      _repeat: js.Array[T],
      add: (T, Boolean) => Scheduler[T],
      clear: () => Scheduler[T],
      getTime: () => Double,
      getTimeOf: T => js.UndefOr[Double],
      next: () => js.Any,
      remove: js.Any => Boolean
    ): Scheduler[T] = {
      val __obj = js.Dynamic.literal(_current = _current.asInstanceOf[js.Any], _queue = _queue.asInstanceOf[js.Any], _repeat = _repeat.asInstanceOf[js.Any], add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), getTime = js.Any.fromFunction0(getTime), getTimeOf = js.Any.fromFunction1(getTimeOf), next = js.Any.fromFunction0(next), remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[Scheduler[T]]
    }
    
    @scala.inline
    implicit class SchedulerMutableBuilder[Self <: Scheduler[?], T] (val x: Self & Scheduler[T]) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (T, Boolean) => Scheduler[T]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClear(value: () => Scheduler[T]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTimeOf(value: T => js.UndefOr[Double]): Self = StObject.set(x, "getTimeOf", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNext(value: () => js.Any): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRemove(value: js.Any => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_current(value: js.Any): Self = StObject.set(x, "_current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_queue(value: typings.rotJs.eventqueueMod.default[T]): Self = StObject.set(x, "_queue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_repeat(value: js.Array[T]): Self = StObject.set(x, "_repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_repeatVarargs(value: T*): Self = StObject.set(x, "_repeat", js.Array(value :_*))
    }
  }
}
