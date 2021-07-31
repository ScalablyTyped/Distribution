package typings.rxCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx {
  
  @js.native
  trait GroupedObservable[TKey, TElement]
    extends StObject
       with Observable[TElement] {
    
    var key: TKey = js.native
    
    var underlyingObservable: Observable[TElement] = js.native
  }
  
  trait IDisposable extends StObject {
    
    def dispose(): Unit
  }
  object IDisposable {
    
    @scala.inline
    def apply(dispose: () => Unit): IDisposable = {
      val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
      __obj.asInstanceOf[IDisposable]
    }
    
    @scala.inline
    implicit class IDisposableMutableBuilder[Self <: IDisposable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Promise A+
    */
  @js.native
  trait IPromise[T] extends StObject {
    
    def `then`[R](): IPromise[R] = js.native
    def `then`[R](onFulfilled: js.Function1[/* value */ T, IPromise[R] | R]): IPromise[R] = js.native
    def `then`[R](
      onFulfilled: js.Function1[/* value */ T, IPromise[R] | R],
      onRejected: js.Function1[/* reason */ js.Any, IPromise[R] | R]
    ): IPromise[R] = js.native
    def `then`[R](onFulfilled: Unit, onRejected: js.Function1[/* reason */ js.Any, R]): IPromise[R] = js.native
  }
  
  trait IScheduler extends StObject {
    
    def `catch`(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler
    
    def catchException(handler: js.Function1[/* exception */ js.Any, Boolean]): IScheduler
  }
  object IScheduler {
    
    @scala.inline
    def apply(
      `catch`: js.Function1[/* exception */ js.Any, Boolean] => IScheduler,
      catchException: js.Function1[/* exception */ js.Any, Boolean] => IScheduler
    ): IScheduler = {
      val __obj = js.Dynamic.literal(catchException = js.Any.fromFunction1(catchException))
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.asInstanceOf[IScheduler]
    }
    
    @scala.inline
    implicit class ISchedulerMutableBuilder[Self <: IScheduler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: js.Function1[/* exception */ js.Any, Boolean] => IScheduler): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCatchException(value: js.Function1[/* exception */ js.Any, Boolean] => IScheduler): Self = StObject.set(x, "catchException", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Observable[T] extends StObject {
    
    def amb(rightSource: IPromise[T]): Observable[T] = js.native
    def amb(rightSource: Observable[T]): Observable[T] = js.native
    
    def bufferWithCount(count: Double): Observable[js.Array[T]] = js.native
    def bufferWithCount(count: Double, skip: Double): Observable[js.Array[T]] = js.native
    
    def defaultIfEmpty(): Observable[T] = js.native
    def defaultIfEmpty(defaultValue: T): Observable[T] = js.native
    
    def distinct(skipParameter: Boolean, valueSerializer: js.Function1[/* value */ T, String]): Observable[T] = js.native
    def distinct[TKey](): Observable[T] = js.native
    def distinct[TKey](keySelector: js.Function1[/* value */ T, TKey]): Observable[T] = js.native
    def distinct[TKey](
      keySelector: js.Function1[/* value */ T, TKey],
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[T] = js.native
    def distinct[TKey](keySelector: Unit, keySerializer: js.Function1[/* key */ TKey, String]): Observable[T] = js.native
    
    def groupBy[TKey, TElement](keySelector: js.Function1[/* value */ T, TKey]): Observable[GroupedObservable[TKey, T]] = js.native
    def groupBy[TKey, TElement](
      keySelector: js.Function1[/* value */ T, TKey],
      elementSelector: js.Function1[/* value */ T, TElement]
    ): Observable[GroupedObservable[TKey, TElement]] = js.native
    def groupBy[TKey, TElement](
      keySelector: js.Function1[/* value */ T, TKey],
      elementSelector: js.Function1[/* value */ T, TElement],
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[GroupedObservable[TKey, TElement]] = js.native
    def groupBy[TKey, TElement](keySelector: js.Function1[/* value */ T, TKey], skipElementSelector: Boolean): Observable[GroupedObservable[TKey, T]] = js.native
    def groupBy[TKey, TElement](
      keySelector: js.Function1[/* value */ T, TKey],
      skipElementSelector: Boolean,
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[GroupedObservable[TKey, T]] = js.native
    def groupBy[TKey, TElement](
      keySelector: js.Function1[/* value */ T, TKey],
      skipElementSelector: Unit,
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[GroupedObservable[TKey, T]] = js.native
    
    def groupByUntil[TKey, TDuration](
      keySelector: js.Function1[/* value */ T, TKey],
      skipElementSelector: Boolean,
      durationSelector: js.Function1[/* group */ GroupedObservable[TKey, T], Observable[TDuration]]
    ): Observable[GroupedObservable[TKey, T]] = js.native
    def groupByUntil[TKey, TDuration](
      keySelector: js.Function1[/* value */ T, TKey],
      skipElementSelector: Boolean,
      durationSelector: js.Function1[/* group */ GroupedObservable[TKey, T], Observable[TDuration]],
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[GroupedObservable[TKey, T]] = js.native
    def groupByUntil[TKey, TElement, TDuration](
      keySelector: js.Function1[/* value */ T, TKey],
      elementSelector: js.Function1[/* value */ T, TElement],
      durationSelector: js.Function1[/* group */ GroupedObservable[TKey, TElement], Observable[TDuration]]
    ): Observable[GroupedObservable[TKey, TElement]] = js.native
    def groupByUntil[TKey, TElement, TDuration](
      keySelector: js.Function1[/* value */ T, TKey],
      elementSelector: js.Function1[/* value */ T, TElement],
      durationSelector: js.Function1[/* group */ GroupedObservable[TKey, TElement], Observable[TDuration]],
      keySerializer: js.Function1[/* key */ TKey, String]
    ): Observable[GroupedObservable[TKey, TElement]] = js.native
    
    def observeOn(scheduler: IScheduler): Observable[T] = js.native
    
    def onErrorResumeNext(second: IPromise[T]): Observable[T] = js.native
    def onErrorResumeNext(second: Observable[T]): Observable[T] = js.native
    
    def subscribeOn(scheduler: IScheduler): Observable[T] = js.native
    
    def windowWithCount(count: Double): Observable[Observable[T]] = js.native
    def windowWithCount(count: Double, skip: Double): Observable[Observable[T]] = js.native
  }
  
  @js.native
  trait ObservableStatic extends StObject {
    
    def amb[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
    def amb[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
    
    def onErrorResumeNext[T](sources: (IPromise[T] | Observable[T])*): Observable[T] = js.native
    def onErrorResumeNext[T](sources: js.Array[IPromise[T] | Observable[T]]): Observable[T] = js.native
    
    def `using`[TSource, TResource /* <: IDisposable */](
      resourceFactory: js.Function0[TResource],
      observableFactory: js.Function1[/* resource */ TResource, Observable[TSource]]
    ): Observable[TSource] = js.native
  }
  
  // Observer
  trait Observer[T] extends StObject {
    
    def checked(): Observer[js.Any]
  }
  object Observer {
    
    @scala.inline
    def apply[T](checked: () => Observer[js.Any]): Observer[T] = {
      val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked))
      __obj.asInstanceOf[Observer[T]]
    }
    
    @scala.inline
    implicit class ObserverMutableBuilder[Self <: Observer[?], T] (val x: Self & Observer[T]) extends AnyVal {
      
      @scala.inline
      def setChecked(value: () => Observer[js.Any]): Self = StObject.set(x, "checked", js.Any.fromFunction0(value))
    }
  }
  
  trait ObserverStatic extends StObject {
    
    /**
      * Schedules the invocation of observer methods on the given scheduler.
      * @param scheduler Scheduler to schedule observer messages on.
      * @returns Observer whose messages are scheduled on the given scheduler.
      */
    def notifyOn[T](scheduler: IScheduler): Observer[T]
  }
  object ObserverStatic {
    
    @scala.inline
    def apply(notifyOn: IScheduler => Observer[js.Any]): ObserverStatic = {
      val __obj = js.Dynamic.literal(notifyOn = js.Any.fromFunction1(notifyOn))
      __obj.asInstanceOf[ObserverStatic]
    }
    
    @scala.inline
    implicit class ObserverStaticMutableBuilder[Self <: ObserverStatic] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNotifyOn(value: IScheduler => Observer[js.Any]): Self = StObject.set(x, "notifyOn", js.Any.fromFunction1(value))
    }
  }
}
