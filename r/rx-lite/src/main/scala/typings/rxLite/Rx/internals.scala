package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internals {
  
  // Priority Queue for Scheduling
  @js.native
  trait PriorityQueue[TTime] extends StObject {
    
    def dequeue(): ScheduledItem[TTime] = js.native
    
    def enqueue(item: ScheduledItem[TTime]): Unit = js.native
    
    def heapify(index: Double): Unit = js.native
    
    def isHigherPriority(left: Double, right: Double): Boolean = js.native
    
    var length: Double = js.native
    
    def peek(): ScheduledItem[TTime] = js.native
    
    def percolate(index: Double): Unit = js.native
    
    def remove(item: ScheduledItem[TTime]): Boolean = js.native
    
    def removeAt(index: Double): Unit = js.native
  }
  object PriorityQueue {
    
    @scala.inline
    def apply[TTime](
      dequeue: () => ScheduledItem[TTime],
      enqueue: ScheduledItem[TTime] => Unit,
      heapify: Double => Unit,
      isHigherPriority: (Double, Double) => Boolean,
      length: Double,
      peek: () => ScheduledItem[TTime],
      percolate: Double => Unit,
      remove: ScheduledItem[TTime] => Boolean,
      removeAt: Double => Unit
    ): PriorityQueue[TTime] = {
      val __obj = js.Dynamic.literal(dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), heapify = js.Any.fromFunction1(heapify), isHigherPriority = js.Any.fromFunction2(isHigherPriority), length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), percolate = js.Any.fromFunction1(percolate), remove = js.Any.fromFunction1(remove), removeAt = js.Any.fromFunction1(removeAt))
      __obj.asInstanceOf[PriorityQueue[TTime]]
    }
    
    @scala.inline
    implicit class PriorityQueueMutableBuilder[Self <: PriorityQueue[_], TTime] (val x: Self with PriorityQueue[TTime]) extends AnyVal {
      
      @scala.inline
      def setDequeue(value: () => ScheduledItem[TTime]): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnqueue(value: ScheduledItem[TTime] => Unit): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeapify(value: Double => Unit): Self = StObject.set(x, "heapify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsHigherPriority(value: (Double, Double) => Boolean): Self = StObject.set(x, "isHigherPriority", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeek(value: () => ScheduledItem[TTime]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPercolate(value: Double => Unit): Self = StObject.set(x, "percolate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(value: ScheduledItem[TTime] => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAt(value: Double => Unit): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ScheduledItem[TTime] extends StObject {
    
    def action(scheduler: IScheduler, state: js.Any): IDisposable = js.native
    
    def compareTo(other: ScheduledItem[TTime]): Double = js.native
    
    def comparer(x: TTime, y: TTime): Double = js.native
    
    var disposable: SingleAssignmentDisposable = js.native
    
    var dueTime: TTime = js.native
    
    def invoke(): Unit = js.native
    
    def invokeCore(): IDisposable = js.native
    
    def isCancelled(): Boolean = js.native
    
    var scheduler: IScheduler = js.native
    
    var state: TTime = js.native
  }
  object ScheduledItem {
    
    @scala.inline
    def apply[TTime](
      action: (IScheduler, js.Any) => IDisposable,
      compareTo: ScheduledItem[TTime] => Double,
      comparer: (TTime, TTime) => Double,
      disposable: SingleAssignmentDisposable,
      dueTime: TTime,
      invoke: () => Unit,
      invokeCore: () => IDisposable,
      isCancelled: () => Boolean,
      scheduler: IScheduler,
      state: TTime
    ): ScheduledItem[TTime] = {
      val __obj = js.Dynamic.literal(action = js.Any.fromFunction2(action), compareTo = js.Any.fromFunction1(compareTo), comparer = js.Any.fromFunction2(comparer), disposable = disposable.asInstanceOf[js.Any], dueTime = dueTime.asInstanceOf[js.Any], invoke = js.Any.fromFunction0(invoke), invokeCore = js.Any.fromFunction0(invokeCore), isCancelled = js.Any.fromFunction0(isCancelled), scheduler = scheduler.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScheduledItem[TTime]]
    }
    
    @scala.inline
    implicit class ScheduledItemMutableBuilder[Self <: ScheduledItem[_], TTime] (val x: Self with ScheduledItem[TTime]) extends AnyVal {
      
      @scala.inline
      def setAction(value: (IScheduler, js.Any) => IDisposable): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCompareTo(value: ScheduledItem[TTime] => Double): Self = StObject.set(x, "compareTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComparer(value: (TTime, TTime) => Double): Self = StObject.set(x, "comparer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDisposable(value: SingleAssignmentDisposable): Self = StObject.set(x, "disposable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDueTime(value: TTime): Self = StObject.set(x, "dueTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoke(value: () => Unit): Self = StObject.set(x, "invoke", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInvokeCore(value: () => IDisposable): Self = StObject.set(x, "invokeCore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsCancelled(value: () => Boolean): Self = StObject.set(x, "isCancelled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setScheduler(value: IScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: TTime): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
