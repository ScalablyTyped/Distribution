package typings.rxCoreBinding

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.rxCore.Rx.IDisposable
import typings.rxCore.Rx.IScheduler
import typings.rxCore.Rx.Observer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Rx {
  
  type AsyncSubject[T] = Subject[T]
  
  @js.native
  trait AsyncSubjectStatic
    extends StObject
       with Instantiable0[AsyncSubject[js.Object]]
  
  @js.native
  trait BehaviorSubject[T]
    extends StObject
       with ISubject[T] {
    
    def getValue(): T = js.native
  }
  
  @js.native
  trait BehaviorSubjectStatic
    extends StObject
       with Instantiable1[/* initialValue */ js.Object, BehaviorSubject[js.Object]]
  
  @js.native
  trait ConnectableObservable[T]
    extends StObject
       with Observable[T] {
    
    def connect(): IDisposable = js.native
    
    def refCount(): Observable[T] = js.native
  }
  
  @js.native
  trait ConnectableObservableStatic
    extends StObject
       with Instantiable0[ConnectableObservable[js.Object]]
  
  @js.native
  trait ISubject[T]
    extends StObject
       with Observable[T]
       with Observer[T]
       with IDisposable {
    
    def hasObservers(): Boolean = js.native
  }
  
  @js.native
  trait Observable[T] extends StObject {
    
    def multicast(subject: Observable[T]): ConnectableObservable[T] = js.native
    def multicast[TResult](
      subjectSelector: js.Function0[ISubject[T]],
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]]
    ): Observable[T] = js.native
    
    def publish(): ConnectableObservable[T] = js.native
    def publish[TResult](selector: js.Function1[/* source */ ConnectableObservable[T], Observable[TResult]]): Observable[TResult] = js.native
    
    def publishLast(): ConnectableObservable[T] = js.native
    def publishLast[TResult](selector: js.Function1[/* source */ ConnectableObservable[T], Observable[TResult]]): Observable[TResult] = js.native
    
    def publishValue(initialValue: T): ConnectableObservable[T] = js.native
    def publishValue[TResult](
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[TResult]],
      initialValue: T
    ): Observable[TResult] = js.native
    
    def replay(): ConnectableObservable[T] = js.native
    // hack to catch first omitted parameter
    def replay(selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]]): Observable[T] = js.native
    def replay(selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]], bufferSize: Double): Observable[T] = js.native
    def replay(
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
      bufferSize: Double,
      window: Double
    ): Observable[T] = js.native
    def replay(
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
      bufferSize: Double,
      window: Double,
      scheduler: IScheduler
    ): Observable[T] = js.native
    def replay(
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
      bufferSize: Double,
      window: Unit,
      scheduler: IScheduler
    ): Observable[T] = js.native
    def replay(
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
      bufferSize: Unit,
      window: Double
    ): Observable[T] = js.native
    def replay(
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
      bufferSize: Unit,
      window: Double,
      scheduler: IScheduler
    ): Observable[T] = js.native
    def replay(
      selector: js.Function1[/* source */ ConnectableObservable[T], Observable[T]],
      bufferSize: Unit,
      window: Unit,
      scheduler: IScheduler
    ): Observable[T] = js.native
    def replay(selector: Boolean): ConnectableObservable[T] = js.native
    def replay(selector: Boolean, bufferSize: Double): ConnectableObservable[T] = js.native
    def replay(selector: Boolean, bufferSize: Double, window: Double): ConnectableObservable[T] = js.native
    def replay(selector: Boolean, bufferSize: Double, window: Double, scheduler: IScheduler): ConnectableObservable[T] = js.native
    def replay(selector: Boolean, bufferSize: Double, window: Unit, scheduler: IScheduler): ConnectableObservable[T] = js.native
    def replay(selector: Boolean, bufferSize: Unit, window: Double): ConnectableObservable[T] = js.native
    def replay(selector: Boolean, bufferSize: Unit, window: Double, scheduler: IScheduler): ConnectableObservable[T] = js.native
    def replay(selector: Boolean, bufferSize: Unit, window: Unit, scheduler: IScheduler): ConnectableObservable[T] = js.native
    def replay(selector: Unit, bufferSize: Double): ConnectableObservable[T] = js.native
    def replay(selector: Unit, bufferSize: Double, window: Double): ConnectableObservable[T] = js.native
    def replay(selector: Unit, bufferSize: Double, window: Double, scheduler: IScheduler): ConnectableObservable[T] = js.native
    def replay(selector: Unit, bufferSize: Double, window: Unit, scheduler: IScheduler): ConnectableObservable[T] = js.native
    def replay(selector: Unit, bufferSize: Unit, window: Double): ConnectableObservable[T] = js.native
    def replay(selector: Unit, bufferSize: Unit, window: Double, scheduler: IScheduler): ConnectableObservable[T] = js.native
    def replay(selector: Unit, bufferSize: Unit, window: Unit, scheduler: IScheduler): ConnectableObservable[T] = js.native
    
    /**
      * Returns an observable sequence that shares a single subscription to the underlying sequence.
      * This operator is a specialization of publish which creates a subscription when the number of observers goes from zero to one,
      * then shares that subscription with all subsequent observers until the number of observers returns to zero, at which point the subscription is disposed.
      *
      * @example
      * var res = source.share();
      *
      * @returns An observable sequence that contains the elements of a sequence produced by multicasting the source sequence.
      */
    def share(): Observable[T] = js.native
    
    def shareReplay(): Observable[T] = js.native
    def shareReplay(bufferSize: Double): Observable[T] = js.native
    def shareReplay(bufferSize: Double, window: Double): Observable[T] = js.native
    def shareReplay(bufferSize: Double, window: Double, scheduler: IScheduler): Observable[T] = js.native
    def shareReplay(bufferSize: Double, window: Unit, scheduler: IScheduler): Observable[T] = js.native
    def shareReplay(bufferSize: Unit, window: Double): Observable[T] = js.native
    def shareReplay(bufferSize: Unit, window: Double, scheduler: IScheduler): Observable[T] = js.native
    def shareReplay(bufferSize: Unit, window: Unit, scheduler: IScheduler): Observable[T] = js.native
    
    /**
      * Returns an observable sequence that shares a single subscription to the underlying sequence and starts with an initialValue.
      * This operator is a specialization of publishValue which creates a subscription when the number of observers goes from zero to one,
      * then shares that subscription with all subsequent observers until the number of observers returns to zero, at which point the subscription is disposed.
      *
      * @example
      * var res = source.shareValue(42);
      *
      * @param initialValue Initial value received by observers upon subscription.
      * @returns An observable sequence that contains the elements of a sequence produced by multicasting the source sequence.
      */
    def shareValue(initialValue: T): Observable[T] = js.native
  }
  
  type ReplaySubject[T] = Subject[T]
  
  @js.native
  trait ReplaySubjectStatic
    extends StObject
       with Instantiable0[ReplaySubject[js.Object]]
       with Instantiable1[/* bufferSize */ Double, ReplaySubject[js.Object]]
       with Instantiable2[
          (/* bufferSize */ Double) | (/* bufferSize */ Unit), 
          /* window */ Double, 
          ReplaySubject[js.Object]
        ]
       with Instantiable3[
          (/* bufferSize */ Double) | (/* bufferSize */ Unit), 
          (/* window */ Double) | (/* window */ Unit), 
          /* scheduler */ IScheduler, 
          ReplaySubject[js.Object]
        ]
  
  type Subject[T] = ISubject[T]
  
  @js.native
  trait SubjectStatic
    extends StObject
       with Instantiable0[Subject[js.Object]] {
    
    def create[T](): ISubject[T] = js.native
    def create[T](observer: Unit, observable: Observable[T]): ISubject[T] = js.native
    def create[T](observer: Observer[T]): ISubject[T] = js.native
    def create[T](observer: Observer[T], observable: Observable[T]): ISubject[T] = js.native
  }
}
