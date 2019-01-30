package typings
package rxjsLib.internalObservableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs/internal/Observable", "Observable")
@js.native
/**
  * @constructor
  * @param {Function} subscribe the function that is called when the Observable is
  * initially subscribed to. This function is given a Subscriber, to which new values
  * can be `next`ed, or an `error` method can be called to raise an error, or
  * `complete` can be called to notify of a successful completion.
  */
class Observable[T] ()
  extends rxjsLib.internalTypesMod.Subscribable[T] {
  def this(subscribe: js.ThisFunction1[
      /* this */ Observable[T], 
      /* subscriber */ rxjsLib.internalSubscriberMod.Subscriber[T], 
      rxjsLib.internalTypesMod.TeardownLogic
    ]) = this()
  /** Internal implementation detail, do not use directly. */
  var _isScalar: scala.Boolean = js.native
  /** @deprecated This is an internal implementation detail, do not use. */
  var operator: rxjsLib.internalOperatorMod.Operator[_, T] = js.native
  /** @deprecated This is an internal implementation detail, do not use. */
  var source: Observable[_] = js.native
  /** @internal This is an internal implementation detail, do not use. */
  def _subscribe(subscriber: rxjsLib.internalSubscriberMod.Subscriber[_]): rxjsLib.internalTypesMod.TeardownLogic = js.native
  /** @deprecated This is an internal implementation detail, do not use. */
  def _trySubscribe(sink: rxjsLib.internalSubscriberMod.Subscriber[T]): rxjsLib.internalTypesMod.TeardownLogic = js.native
  /**
    * @method forEach
    * @param {Function} next a handler for each value emitted by the observable
    * @param {PromiseConstructor} [promiseCtor] a constructor function used to instantiate the Promise
    * @return {Promise} a promise that either resolves on observable completion or
    *  rejects with the handled error
    */
  def forEach(next: js.Function1[/* value */ T, scala.Unit]): js.Promise[scala.Unit] = js.native
  def forEach(next: js.Function1[/* value */ T, scala.Unit], promiseCtor: stdLib.PromiseConstructorLike): js.Promise[scala.Unit] = js.native
  /**
    * Creates a new Observable, with this Observable as the source, and the passed
    * operator defined as the new observable's operator.
    * @method lift
    * @param {Operator} operator the operator defining the operation to take on the observable
    * @return {Observable} a new observable with the Operator applied
    */
  def lift[R](operator: rxjsLib.internalOperatorMod.Operator[T, R]): Observable[R] = js.native
  def pipe(): Observable[T] = js.native
  def pipe[A](op1: rxjsLib.internalTypesMod.OperatorFunction[T, A]): Observable[A] = js.native
  def pipe[A, B](
    op1: rxjsLib.internalTypesMod.OperatorFunction[T, A],
    op2: rxjsLib.internalTypesMod.OperatorFunction[A, B]
  ): Observable[B] = js.native
  def pipe[A, B, C](
    op1: rxjsLib.internalTypesMod.OperatorFunction[T, A],
    op2: rxjsLib.internalTypesMod.OperatorFunction[A, B],
    op3: rxjsLib.internalTypesMod.OperatorFunction[B, C]
  ): Observable[C] = js.native
  def pipe[A, B, C, D](
    op1: rxjsLib.internalTypesMod.OperatorFunction[T, A],
    op2: rxjsLib.internalTypesMod.OperatorFunction[A, B],
    op3: rxjsLib.internalTypesMod.OperatorFunction[B, C],
    op4: rxjsLib.internalTypesMod.OperatorFunction[C, D]
  ): Observable[D] = js.native
  def pipe[A, B, C, D, E](
    op1: rxjsLib.internalTypesMod.OperatorFunction[T, A],
    op2: rxjsLib.internalTypesMod.OperatorFunction[A, B],
    op3: rxjsLib.internalTypesMod.OperatorFunction[B, C],
    op4: rxjsLib.internalTypesMod.OperatorFunction[C, D],
    op5: rxjsLib.internalTypesMod.OperatorFunction[D, E]
  ): Observable[E] = js.native
  def pipe[A, B, C, D, E, F](
    op1: rxjsLib.internalTypesMod.OperatorFunction[T, A],
    op2: rxjsLib.internalTypesMod.OperatorFunction[A, B],
    op3: rxjsLib.internalTypesMod.OperatorFunction[B, C],
    op4: rxjsLib.internalTypesMod.OperatorFunction[C, D],
    op5: rxjsLib.internalTypesMod.OperatorFunction[D, E],
    op6: rxjsLib.internalTypesMod.OperatorFunction[E, F]
  ): Observable[F] = js.native
  def pipe[A, B, C, D, E, F, G](
    op1: rxjsLib.internalTypesMod.OperatorFunction[T, A],
    op2: rxjsLib.internalTypesMod.OperatorFunction[A, B],
    op3: rxjsLib.internalTypesMod.OperatorFunction[B, C],
    op4: rxjsLib.internalTypesMod.OperatorFunction[C, D],
    op5: rxjsLib.internalTypesMod.OperatorFunction[D, E],
    op6: rxjsLib.internalTypesMod.OperatorFunction[E, F],
    op7: rxjsLib.internalTypesMod.OperatorFunction[F, G]
  ): Observable[G] = js.native
  def pipe[A, B, C, D, E, F, G, H](
    op1: rxjsLib.internalTypesMod.OperatorFunction[T, A],
    op2: rxjsLib.internalTypesMod.OperatorFunction[A, B],
    op3: rxjsLib.internalTypesMod.OperatorFunction[B, C],
    op4: rxjsLib.internalTypesMod.OperatorFunction[C, D],
    op5: rxjsLib.internalTypesMod.OperatorFunction[D, E],
    op6: rxjsLib.internalTypesMod.OperatorFunction[E, F],
    op7: rxjsLib.internalTypesMod.OperatorFunction[F, G],
    op8: rxjsLib.internalTypesMod.OperatorFunction[G, H]
  ): Observable[H] = js.native
  def pipe[A, B, C, D, E, F, G, H, I](
    op1: rxjsLib.internalTypesMod.OperatorFunction[T, A],
    op2: rxjsLib.internalTypesMod.OperatorFunction[A, B],
    op3: rxjsLib.internalTypesMod.OperatorFunction[B, C],
    op4: rxjsLib.internalTypesMod.OperatorFunction[C, D],
    op5: rxjsLib.internalTypesMod.OperatorFunction[D, E],
    op6: rxjsLib.internalTypesMod.OperatorFunction[E, F],
    op7: rxjsLib.internalTypesMod.OperatorFunction[F, G],
    op8: rxjsLib.internalTypesMod.OperatorFunction[G, H],
    op9: rxjsLib.internalTypesMod.OperatorFunction[H, I]
  ): Observable[I] = js.native
  def pipe[A, B, C, D, E, F, G, H, I](
    op1: rxjsLib.internalTypesMod.OperatorFunction[T, A],
    op2: rxjsLib.internalTypesMod.OperatorFunction[A, B],
    op3: rxjsLib.internalTypesMod.OperatorFunction[B, C],
    op4: rxjsLib.internalTypesMod.OperatorFunction[C, D],
    op5: rxjsLib.internalTypesMod.OperatorFunction[D, E],
    op6: rxjsLib.internalTypesMod.OperatorFunction[E, F],
    op7: rxjsLib.internalTypesMod.OperatorFunction[F, G],
    op8: rxjsLib.internalTypesMod.OperatorFunction[G, H],
    op9: rxjsLib.internalTypesMod.OperatorFunction[H, I],
    operations: (rxjsLib.internalTypesMod.OperatorFunction[_, _])*
  ): Observable[js.Object] = js.native
  def toPromise[T](`this`: Observable[T]): js.Promise[T] = js.native
  def toPromise[T](`this`: Observable[T], PromiseCtor: stdLib.PromiseConstructor): js.Promise[T] = js.native
  def toPromise[T](`this`: Observable[T], PromiseCtor: stdLib.PromiseConstructorLike): js.Promise[T] = js.native
}

@JSImport("rxjs/internal/Observable", "Observable")
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
  @JSName("if")
  var if_Original: rxjsLib.Anon_Condition = js.native
  /**
    * @nocollapse
    * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
    */
  @JSName("throw")
  var throw_Original: js.Function2[
    /* error */ js.Any, 
    /* scheduler */ js.UndefOr[rxjsLib.internalTypesMod.SchedulerLike], 
    rxjsLib.internalObservableMod.Observable[scala.Nothing]
  ] = js.native
  /**
    * @nocollapse
    * @deprecated In favor of iif creation function: import { iif } from 'rxjs';
    */
  def `if`[T, F](condition: js.Function0[scala.Boolean]): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  def `if`[T, F](
    condition: js.Function0[scala.Boolean],
    trueResult: rxjsLib.internalTypesMod.SubscribableOrPromise[T]
  ): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  def `if`[T, F](
    condition: js.Function0[scala.Boolean],
    trueResult: rxjsLib.internalTypesMod.SubscribableOrPromise[T],
    falseResult: rxjsLib.internalTypesMod.SubscribableOrPromise[F]
  ): rxjsLib.internalObservableMod.Observable[T | F] = js.native
  /**
    * @nocollapse
    * @deprecated In favor of throwError creation function: import { throwError } from 'rxjs';
    */
  def `throw`(error: js.Any): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
  def `throw`(error: js.Any, scheduler: rxjsLib.internalTypesMod.SchedulerLike): rxjsLib.internalObservableMod.Observable[scala.Nothing] = js.native
}

