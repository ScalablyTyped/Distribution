package typings.rxLite.Rx

import typings.rxCore.Rx.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internals {
  
  // Priority Queue for Scheduling
  trait PriorityQueue[TTime] extends StObject {
    
    def dequeue(): ScheduledItem[TTime]
    
    def enqueue(item: ScheduledItem[TTime]): Unit
    
    def heapify(index: Double): Unit
    
    def isHigherPriority(left: Double, right: Double): Boolean
    
    var length: Double
    
    def peek(): ScheduledItem[TTime]
    
    def percolate(index: Double): Unit
    
    def remove(item: ScheduledItem[TTime]): Boolean
    
    def removeAt(index: Double): Unit
  }
  object PriorityQueue {
    
    inline def apply[TTime](
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
    
    extension [Self <: PriorityQueue[?], TTime](x: Self & PriorityQueue[TTime]) {
      
      inline def setDequeue(value: () => ScheduledItem[TTime]): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
      
      inline def setEnqueue(value: ScheduledItem[TTime] => Unit): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
      
      inline def setHeapify(value: Double => Unit): Self = StObject.set(x, "heapify", js.Any.fromFunction1(value))
      
      inline def setIsHigherPriority(value: (Double, Double) => Boolean): Self = StObject.set(x, "isHigherPriority", js.Any.fromFunction2(value))
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setPeek(value: () => ScheduledItem[TTime]): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      inline def setPercolate(value: Double => Unit): Self = StObject.set(x, "percolate", js.Any.fromFunction1(value))
      
      inline def setRemove(value: ScheduledItem[TTime] => Boolean): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveAt(value: Double => Unit): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
    }
  }
  
  trait ScheduledItem[TTime] extends StObject {
    
    def action(scheduler: IScheduler, state: js.Any): IDisposable
    
    def compareTo(other: ScheduledItem[TTime]): Double
    
    def comparer(x: TTime, y: TTime): Double
    
    var disposable: SingleAssignmentDisposable
    
    var dueTime: TTime
    
    def invoke(): Unit
    
    def invokeCore(): IDisposable
    
    def isCancelled(): Boolean
    
    var scheduler: IScheduler
    
    var state: TTime
  }
  object ScheduledItem {
    
    inline def apply[TTime](
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
    
    extension [Self <: ScheduledItem[?], TTime](x: Self & ScheduledItem[TTime]) {
      
      inline def setAction(value: (IScheduler, js.Any) => IDisposable): Self = StObject.set(x, "action", js.Any.fromFunction2(value))
      
      inline def setCompareTo(value: ScheduledItem[TTime] => Double): Self = StObject.set(x, "compareTo", js.Any.fromFunction1(value))
      
      inline def setComparer(value: (TTime, TTime) => Double): Self = StObject.set(x, "comparer", js.Any.fromFunction2(value))
      
      inline def setDisposable(value: SingleAssignmentDisposable): Self = StObject.set(x, "disposable", value.asInstanceOf[js.Any])
      
      inline def setDueTime(value: TTime): Self = StObject.set(x, "dueTime", value.asInstanceOf[js.Any])
      
      inline def setInvoke(value: () => Unit): Self = StObject.set(x, "invoke", js.Any.fromFunction0(value))
      
      inline def setInvokeCore(value: () => IDisposable): Self = StObject.set(x, "invokeCore", js.Any.fromFunction0(value))
      
      inline def setIsCancelled(value: () => Boolean): Self = StObject.set(x, "isCancelled", js.Any.fromFunction0(value))
      
      inline def setScheduler(value: IScheduler): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setState(value: TTime): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
