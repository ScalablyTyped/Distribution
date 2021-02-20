package typings.rx.Rx

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internals {
  
  @js.native
  trait AbstractObserver[T]
    extends IObserver[T]
       with IDisposable {
    
    def completed(): Unit = js.native
    
    def error(error: js.Any): Unit = js.native
    
    def fail(e: js.Any): Boolean = js.native
    
    var isStopped: Boolean = js.native
    
    // Must be implemented by other observers
    def next(value: T): Unit = js.native
  }
  object AbstractObserver {
    
    @scala.inline
    def apply[T](
      completed: () => Unit,
      dispose: () => Unit,
      error: js.Any => Unit,
      fail: js.Any => Boolean,
      isStopped: Boolean,
      next: T => Unit,
      onCompleted: () => Unit,
      onError: js.Any => Unit,
      onNext: T => Unit
    ): AbstractObserver[T] = {
      val __obj = js.Dynamic.literal(completed = js.Any.fromFunction0(completed), dispose = js.Any.fromFunction0(dispose), error = js.Any.fromFunction1(error), fail = js.Any.fromFunction1(fail), isStopped = isStopped.asInstanceOf[js.Any], next = js.Any.fromFunction1(next), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext))
      __obj.asInstanceOf[AbstractObserver[T]]
    }
    
    @scala.inline
    implicit class AbstractObserverMutableBuilder[Self <: AbstractObserver[_], T] (val x: Self with AbstractObserver[T]) extends AnyVal {
      
      @scala.inline
      def setCompleted(value: () => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setError(value: js.Any => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFail(value: js.Any => Boolean): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsStopped(value: Boolean): Self = StObject.set(x, "isStopped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNext(value: T => Unit): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AbstractObserverStatic
    extends Instantiable0[AbstractObserver[js.Object]]
  
  @js.native
  trait ArgumentOutOfRangeError extends Error
  object ArgumentOutOfRangeError {
    
    @scala.inline
    def apply(message: String, name: String): ArgumentOutOfRangeError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgumentOutOfRangeError]
    }
  }
  
  @js.native
  trait ArgumentOutOfRangeErrorStatic extends Instantiable0[ArgumentOutOfRangeError]
  
  @js.native
  trait EmptyError extends Error
  object EmptyError {
    
    @scala.inline
    def apply(message: String, name: String): EmptyError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmptyError]
    }
  }
  
  @js.native
  trait EmptyErrorStatic extends Instantiable0[EmptyError]
  
  @js.native
  trait NotImplementedError extends Error
  object NotImplementedError {
    
    @scala.inline
    def apply(message: String, name: String): NotImplementedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotImplementedError]
    }
  }
  
  @js.native
  trait NotImplementedErrorStatic extends Instantiable0[NotImplementedError]
  
  @js.native
  trait NotSupportedError extends Error
  object NotSupportedError {
    
    @scala.inline
    def apply(message: String, name: String): NotSupportedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotSupportedError]
    }
  }
  
  @js.native
  trait NotSupportedErrorStatic extends Instantiable0[NotSupportedError]
  
  @js.native
  trait ObjectDisposedError extends Error
  object ObjectDisposedError {
    
    @scala.inline
    def apply(message: String, name: String): ObjectDisposedError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectDisposedError]
    }
  }
  
  @js.native
  trait ObjectDisposedErrorStatic extends Instantiable0[ObjectDisposedError]
  
  @js.native
  trait PriorityQueue[TTime] extends StObject {
    
    def dequeue(): js.Any = js.native
    
    def enqueue(
      item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any
    ): Unit = js.native
    
    def heapify(index: Double): Unit = js.native
    
    def isHigherPriority(left: Double, right: Double): Boolean = js.native
    
    var length: Double = js.native
    
    def peek(): js.Any = js.native
    
    def percolate(index: Double): Unit = js.native
    
    def remove(
      item: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any
    ): Boolean = js.native
    
    def removeAt(index: Double): Unit = js.native
  }
  object PriorityQueue {
    
    @scala.inline
    def apply[TTime](
      dequeue: () => js.Any,
      enqueue: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any => Unit,
      heapify: Double => Unit,
      isHigherPriority: (Double, Double) => Boolean,
      length: Double,
      peek: () => js.Any,
      percolate: Double => Unit,
      remove: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any => Boolean,
      removeAt: Double => Unit
    ): PriorityQueue[TTime] = {
      val __obj = js.Dynamic.literal(dequeue = js.Any.fromFunction0(dequeue), enqueue = js.Any.fromFunction1(enqueue), heapify = js.Any.fromFunction1(heapify), isHigherPriority = js.Any.fromFunction2(isHigherPriority), length = length.asInstanceOf[js.Any], peek = js.Any.fromFunction0(peek), percolate = js.Any.fromFunction1(percolate), remove = js.Any.fromFunction1(remove), removeAt = js.Any.fromFunction1(removeAt))
      __obj.asInstanceOf[PriorityQueue[TTime]]
    }
    
    @scala.inline
    implicit class PriorityQueueMutableBuilder[Self <: PriorityQueue[_], TTime] (val x: Self with PriorityQueue[TTime]) extends AnyVal {
      
      @scala.inline
      def setDequeue(value: () => js.Any): Self = StObject.set(x, "dequeue", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnqueue(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any => Unit
      ): Self = StObject.set(x, "enqueue", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeapify(value: Double => Unit): Self = StObject.set(x, "heapify", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsHigherPriority(value: (Double, Double) => Boolean): Self = StObject.set(x, "isHigherPriority", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeek(value: () => js.Any): Self = StObject.set(x, "peek", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPercolate(value: Double => Unit): Self = StObject.set(x, "percolate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemove(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScheduledItem<TTime> */ js.Any => Boolean
      ): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveAt(value: Double => Unit): Self = StObject.set(x, "removeAt", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait PriorityQueueStatic
    extends Instantiable1[/* capacity */ Double, PriorityQueue[js.Object]] {
    
    var count: Double = js.native
  }
  
  @js.native
  trait SchedulePeriodicRecursive extends StObject {
    
    def start(): IDisposable = js.native
  }
  object SchedulePeriodicRecursive {
    
    @scala.inline
    def apply(start: () => IDisposable): SchedulePeriodicRecursive = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[SchedulePeriodicRecursive]
    }
    
    @scala.inline
    implicit class SchedulePeriodicRecursiveMutableBuilder[Self <: SchedulePeriodicRecursive] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStart(value: () => IDisposable): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SchedulePeriodicRecursiveStatic
    extends Instantiable4[
          /* scheduler */ js.Any, 
          /* state */ js.Any, 
          /* period */ js.Any, 
          /* action */ js.Any, 
          SchedulePeriodicRecursive
        ]
  
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
  
  @js.native
  trait ScheduledItemStatic
    extends Instantiable4[
          /* scheduler */ IScheduler, 
          /* state */ js.Any, 
          /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
          /* dueTime */ js.Object, 
          ScheduledItem[js.Object]
        ]
       with Instantiable5[
          /* scheduler */ IScheduler, 
          /* state */ js.Any, 
          /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
          /* dueTime */ js.Object, 
          /* comparer */ Comparer[js.Object, Double], 
          ScheduledItem[js.Object]
        ]
  
  @js.native
  trait ScheduledObserver[T] extends Observer[T] {
    
    def ensureActive(): Unit = js.native
  }
  object ScheduledObserver {
    
    @scala.inline
    def apply[T](
      asObserver: () => Observer[T],
      checked: () => CheckedObserver[T],
      ensureActive: () => Unit,
      makeSafe: IDisposable => Observer[T],
      notifyOn: IScheduler => Observer[T],
      onCompleted: () => Unit,
      onError: js.Any => Unit,
      onNext: T => Unit,
      toNotifier: () => js.Function1[/* notification */ Notification[T], Unit]
    ): ScheduledObserver[T] = {
      val __obj = js.Dynamic.literal(asObserver = js.Any.fromFunction0(asObserver), checked = js.Any.fromFunction0(checked), ensureActive = js.Any.fromFunction0(ensureActive), makeSafe = js.Any.fromFunction1(makeSafe), notifyOn = js.Any.fromFunction1(notifyOn), onCompleted = js.Any.fromFunction0(onCompleted), onError = js.Any.fromFunction1(onError), onNext = js.Any.fromFunction1(onNext), toNotifier = js.Any.fromFunction0(toNotifier))
      __obj.asInstanceOf[ScheduledObserver[T]]
    }
    
    @scala.inline
    implicit class ScheduledObserverMutableBuilder[Self <: ScheduledObserver[_], T] (val x: Self with ScheduledObserver[T]) extends AnyVal {
      
      @scala.inline
      def setEnsureActive(value: () => Unit): Self = StObject.set(x, "ensureActive", js.Any.fromFunction0(value))
    }
  }
}
