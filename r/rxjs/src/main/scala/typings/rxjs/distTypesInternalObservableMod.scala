package typings.rxjs

import typings.rxjs.distTypesInternalOperatorMod.Operator
import typings.rxjs.distTypesInternalSubscriberMod.Subscriber
import typings.rxjs.distTypesInternalSubscriptionMod.Subscription
import typings.rxjs.distTypesInternalTypesMod.Observer
import typings.rxjs.distTypesInternalTypesMod.OperatorFunction
import typings.rxjs.distTypesInternalTypesMod.Subscribable
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.rxjs.distTypesInternalTypesMod.Unsubscribable
import typings.rxjs.distTypesInternalTypesMod._ObservableInput
import typings.std.Partial
import typings.std.PromiseConstructor
import typings.std.PromiseConstructorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalObservableMod {
  
  @JSImport("rxjs/dist/types/internal/Observable", "Observable")
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  open class Observable[T] ()
    extends StObject
       with Subscribable[T]
       with _ObservableInput[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
    
    /**
      * Used as a NON-CANCELLABLE means of subscribing to an observable, for use with
      * APIs that expect promises, like `async/await`. You cannot unsubscribe from this.
      *
      * **WARNING**: Only use this with observables you *know* will complete. If the source
      * observable does not complete, you will end up with a promise that is hung up, and
      * potentially all of the state of an async function hanging out in memory. To avoid
      * this situation, look into adding something like {@link timeout}, {@link take},
      * {@link takeWhile}, or {@link takeUntil} amongst others.
      *
      * #### Example
      *
      * ```ts
      * import { interval, take } from 'rxjs';
      *
      * const source$ = interval(1000).pipe(take(4));
      *
      * async function getTotal() {
      *   let total = 0;
      *
      *   await source$.forEach(value => {
      *     total += value;
      *     console.log('observable -> ' + value);
      *   });
      *
      *   return total;
      * }
      *
      * getTotal().then(
      *   total => console.log('Total: ' + total)
      * );
      *
      * // Expected:
      * // 'observable -> 0'
      * // 'observable -> 1'
      * // 'observable -> 2'
      * // 'observable -> 3'
      * // 'Total: 6'
      * ```
      *
      * @param next a handler for each value emitted by the observable
      * @return a promise that either resolves on observable completion or
      *  rejects with the handled error
      */
    def forEach(next: js.Function1[/* value */ T, Unit]): js.Promise[Unit] = js.native
    /**
      * @param next a handler for each value emitted by the observable
      * @param promiseCtor a constructor function used to instantiate the Promise
      * @return a promise that either resolves on observable completion or
      *  rejects with the handled error
      * @deprecated Passing a Promise constructor will no longer be available
      * in upcoming versions of RxJS. This is because it adds weight to the library, for very
      * little benefit. If you need this functionality, it is recommended that you either
      * polyfill Promise, or you create an adapter to convert the returned native promise
      * to whatever promise implementation you wanted. Will be removed in v8.
      */
    def forEach(next: js.Function1[/* value */ T, Unit], promiseCtor: PromiseConstructorLike): js.Promise[Unit] = js.native
    
    /**
      * Creates a new Observable, with this Observable instance as the source, and the passed
      * operator defined as the new observable's operator.
      * @method lift
      * @param operator the operator defining the operation to take on the observable
      * @return a new observable with the Operator applied
      * @deprecated Internal implementation detail, do not use directly. Will be made internal in v8.
      * If you have implemented an operator using `lift`, it is recommended that you create an
      * operator by simply returning `new Observable()` directly. See "Creating new operators from
      * scratch" section here: https://rxjs.dev/guide/operators
      */
    def lift[R](): Observable[R] = js.native
    def lift[R](operator: Operator[T, R]): Observable[R] = js.native
    
    /**
      * @deprecated Internal implementation detail, do not use directly. Will be made internal in v8.
      */
    var operator: js.UndefOr[Operator[Any, T]] = js.native
    
    def pipe(): Observable[T] = js.native
    def pipe[A](op1: OperatorFunction[T, A]): Observable[A] = js.native
    def pipe[A, B](op1: OperatorFunction[T, A], op2: OperatorFunction[A, B]): Observable[B] = js.native
    def pipe[A, B, C](op1: OperatorFunction[T, A], op2: OperatorFunction[A, B], op3: OperatorFunction[B, C]): Observable[C] = js.native
    def pipe[A, B, C, D](
      op1: OperatorFunction[T, A],
      op2: OperatorFunction[A, B],
      op3: OperatorFunction[B, C],
      op4: OperatorFunction[C, D]
    ): Observable[D] = js.native
    def pipe[A, B, C, D, E](
      op1: OperatorFunction[T, A],
      op2: OperatorFunction[A, B],
      op3: OperatorFunction[B, C],
      op4: OperatorFunction[C, D],
      op5: OperatorFunction[D, E]
    ): Observable[E] = js.native
    def pipe[A, B, C, D, E, F](
      op1: OperatorFunction[T, A],
      op2: OperatorFunction[A, B],
      op3: OperatorFunction[B, C],
      op4: OperatorFunction[C, D],
      op5: OperatorFunction[D, E],
      op6: OperatorFunction[E, F]
    ): Observable[F] = js.native
    def pipe[A, B, C, D, E, F, G](
      op1: OperatorFunction[T, A],
      op2: OperatorFunction[A, B],
      op3: OperatorFunction[B, C],
      op4: OperatorFunction[C, D],
      op5: OperatorFunction[D, E],
      op6: OperatorFunction[E, F],
      op7: OperatorFunction[F, G]
    ): Observable[G] = js.native
    def pipe[A, B, C, D, E, F, G, H](
      op1: OperatorFunction[T, A],
      op2: OperatorFunction[A, B],
      op3: OperatorFunction[B, C],
      op4: OperatorFunction[C, D],
      op5: OperatorFunction[D, E],
      op6: OperatorFunction[E, F],
      op7: OperatorFunction[F, G],
      op8: OperatorFunction[G, H]
    ): Observable[H] = js.native
    def pipe[A, B, C, D, E, F, G, H, I](
      op1: OperatorFunction[T, A],
      op2: OperatorFunction[A, B],
      op3: OperatorFunction[B, C],
      op4: OperatorFunction[C, D],
      op5: OperatorFunction[D, E],
      op6: OperatorFunction[E, F],
      op7: OperatorFunction[F, G],
      op8: OperatorFunction[G, H],
      op9: OperatorFunction[H, I]
    ): Observable[I] = js.native
    def pipe[A, B, C, D, E, F, G, H, I](
      op1: OperatorFunction[T, A],
      op2: OperatorFunction[A, B],
      op3: OperatorFunction[B, C],
      op4: OperatorFunction[C, D],
      op5: OperatorFunction[D, E],
      op6: OperatorFunction[E, F],
      op7: OperatorFunction[F, G],
      op8: OperatorFunction[G, H],
      op9: OperatorFunction[H, I],
      operations: (OperatorFunction[Any, Any])*
    ): Observable[Any] = js.native
    
    /**
      * @deprecated Internal implementation detail, do not use directly. Will be made internal in v8.
      */
    var source: js.UndefOr[Observable[Any]] = js.native
    
    def subscribe(): Subscription = js.native
    def subscribe(next: js.Function1[/* value */ T, Unit]): Subscription = js.native
    def subscribe(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ Any, Unit]): Subscription = js.native
    def subscribe(
      next: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* error */ Any, Unit],
      complete: js.Function0[Unit]
    ): Subscription = js.native
    def subscribe(next: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]): Subscription = js.native
    def subscribe(next: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): Subscription = js.native
    def subscribe(next: Null, error: js.Function1[/* error */ Any, Unit]): Subscription = js.native
    def subscribe(next: Null, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): Subscription = js.native
    def subscribe(next: Null, error: Null, complete: js.Function0[Unit]): Subscription = js.native
    def subscribe(next: Null, error: Unit, complete: js.Function0[Unit]): Subscription = js.native
    def subscribe(next: Unit, error: js.Function1[/* error */ Any, Unit]): Subscription = js.native
    def subscribe(next: Unit, error: js.Function1[/* error */ Any, Unit], complete: js.Function0[Unit]): Subscription = js.native
    def subscribe(next: Unit, error: Null, complete: js.Function0[Unit]): Subscription = js.native
    def subscribe(next: Unit, error: Unit, complete: js.Function0[Unit]): Subscription = js.native
    /* CompleteClass */
    override def subscribe(observer: Partial[Observer[T]]): Unsubscribable = js.native
    
    /** @deprecated Replaced with {@link firstValueFrom} and {@link lastValueFrom}. Will be removed in v8. Details: https://rxjs.dev/deprecations/to-promise */
    def toPromise(): js.Promise[js.UndefOr[T]] = js.native
    /** @deprecated Replaced with {@link firstValueFrom} and {@link lastValueFrom}. Will be removed in v8. Details: https://rxjs.dev/deprecations/to-promise */
    def toPromise(PromiseCtor: PromiseConstructor): js.Promise[js.UndefOr[T]] = js.native
    /** @deprecated Replaced with {@link firstValueFrom} and {@link lastValueFrom}. Will be removed in v8. Details: https://rxjs.dev/deprecations/to-promise */
    def toPromise(PromiseCtor: PromiseConstructorLike): js.Promise[js.UndefOr[T]] = js.native
  }
  /* static members */
  object Observable {
    
    @JSImport("rxjs/dist/types/internal/Observable", "Observable")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Observable by calling the Observable constructor
      * @owner Observable
      * @method create
      * @param {Function} subscribe? the subscriber function to be passed to the Observable constructor
      * @return {Observable} a new observable
      * @nocollapse
      * @deprecated Use `new Observable()` instead. Will be removed in v8.
      */
    inline def create(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  }
}
