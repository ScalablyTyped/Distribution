package typings.rxjs

import org.scalablytyped.runtime.Instantiable1
import typings.rxjs.anon.FnCall
import typings.rxjs.operatorMod.Operator
import typings.rxjs.subscriberMod.Subscriber
import typings.rxjs.typesMod.OperatorFunction
import typings.rxjs.typesMod.SchedulerLike
import typings.rxjs.typesMod.Subscribable
import typings.rxjs.typesMod.SubscribableOrPromise
import typings.rxjs.typesMod.TeardownLogic
import typings.std.PromiseConstructor
import typings.std.PromiseConstructorLike
import typings.std.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/Observable", JSImport.Namespace)
@js.native
object internalObservableMod extends js.Object {
  
  @js.native
  /**
    * @constructor
    * @param {Function} subscribe the function that is called when the Observable is
    * initially subscribed to. This function is given a Subscriber, to which new values
    * can be `next`ed, or an `error` method can be called to raise an error, or
    * `complete` can be called to notify of a successful completion.
    */
  class Observable[T] () extends Subscribable[T] {
    def this(subscribe: js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]) = this()
    
    /** Internal implementation detail, do not use directly. */
    var _isScalar: Boolean = js.native
    
    /** @internal This is an internal implementation detail, do not use. */
    def _subscribe(subscriber: Subscriber[_]): TeardownLogic = js.native
    
    /** @deprecated This is an internal implementation detail, do not use. */
    def _trySubscribe(sink: Subscriber[T]): TeardownLogic = js.native
    
    /**
      * @method forEach
      * @param {Function} next a handler for each value emitted by the observable
      * @param {PromiseConstructor} [promiseCtor] a constructor function used to instantiate the Promise
      * @return {Promise} a promise that either resolves on observable completion or
      *  rejects with the handled error
      */
    def forEach(next: js.Function1[/* value */ T, Unit]): js.Promise[Unit] = js.native
    def forEach(next: js.Function1[/* value */ T, Unit], promiseCtor: PromiseConstructorLike): js.Promise[Unit] = js.native
    
    /**
      * Creates a new Observable, with this Observable as the source, and the passed
      * operator defined as the new observable's operator.
      * @method lift
      * @param {Operator} operator the operator defining the operation to take on the observable
      * @return {Observable} a new observable with the Operator applied
      */
    def lift[R](operator: Operator[T, R]): Observable[R] = js.native
    
    /** @deprecated This is an internal implementation detail, do not use. */
    var operator: Operator[_, T] = js.native
    
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
      operations: (OperatorFunction[_, _])*
    ): Observable[js.Object] = js.native
    
    /** @deprecated This is an internal implementation detail, do not use. */
    var source: Observable[_] = js.native
    
    def toPromise[T](): js.Promise[T] = js.native
    def toPromise[T](
      PromiseCtor: PromiseConstructor with (Instantiable1[
          /* executor */ js.Function2[
            /* resolve */ js.Function1[
              /* value */ (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]), 
              Unit
            ], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ], 
          Promise[js.Object]
        ])
    ): js.Promise[T] = js.native
    def toPromise[T](PromiseCtor: PromiseConstructorLike): js.Promise[T] = js.native
  }
  /* static members */
  @js.native
  object Observable extends js.Object {
    
    /**
      * Creates a new cold Observable by calling the Observable constructor
      * @static true
      * @owner Observable
      * @method create
      * @param {Function} subscribe? the subscriber function to be passed to the Observable constructor
      * @return {Observable} a new cold observable
      * @nocollapse
      * @deprecated use new Observable() instead
      */
    var create: js.Function = js.native
    
    /**
      * @nocollapse
      * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
      */
    def `if`[T, F](condition: js.Function0[Boolean]): Observable[T | F] = js.native
    def `if`[T, F](
      condition: js.Function0[Boolean],
      trueResult: js.UndefOr[SubscribableOrPromise[T]],
      falseResult: SubscribableOrPromise[F]
    ): Observable[T | F] = js.native
    def `if`[T, F](condition: js.Function0[Boolean], trueResult: SubscribableOrPromise[T]): Observable[T | F] = js.native
    /**
      * @nocollapse
      * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
      */
    @JSName("if")
    var if_Original: FnCall = js.native
    
    /**
      * @nocollapse
      * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
      */
    def `throw`(error: js.Any): Observable[scala.Nothing] = js.native
    def `throw`(error: js.Any, scheduler: SchedulerLike): Observable[scala.Nothing] = js.native
    /**
      * @nocollapse
      * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
      */
    @JSName("throw")
    var throw_Original: js.Function2[
        /* error */ js.Any, 
        /* scheduler */ js.UndefOr[SchedulerLike], 
        Observable[scala.Nothing]
      ] = js.native
  }
}
