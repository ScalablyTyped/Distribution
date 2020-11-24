package typings.rxjs

import typings.rxjs.subscriptionMod.Subscription
import typings.rxjs.typesMod.PartialObserver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rxjs/internal/Subscriber", JSImport.Namespace)
@js.native
object subscriberMod extends js.Object {
  
  @js.native
  class SafeSubscriber[T] protected () extends Subscriber[T] {
    def this(_parentSubscriber: Subscriber[T]) = this()
    def this(_parentSubscriber: Subscriber[T], observerOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(_parentSubscriber: Subscriber[T], observerOrNext: PartialObserver[T]) = this()
    def this(
      _parentSubscriber: Subscriber[T],
      observerOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(
      _parentSubscriber: Subscriber[T],
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(
      _parentSubscriber: Subscriber[T],
      observerOrNext: PartialObserver[T],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(
      _parentSubscriber: Subscriber[T],
      observerOrNext: js.UndefOr[scala.Nothing],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      _parentSubscriber: Subscriber[T],
      observerOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      _parentSubscriber: Subscriber[T],
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      _parentSubscriber: Subscriber[T],
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      _parentSubscriber: Subscriber[T],
      observerOrNext: PartialObserver[T],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      _parentSubscriber: Subscriber[T],
      observerOrNext: PartialObserver[T],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    
    var __tryOrSetError: js.Any = js.native
    
    var __tryOrUnsub: js.Any = js.native
    
    var _context: js.Any = js.native
    
    var _parentSubscriber: js.Any = js.native
    
    /** @internal This is an internal implementation detail, do not use. */
    def _unsubscribe(): Unit = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.rxjs.typesMod.Observer because var conflicts: closed. Inlined next, error, complete */ @js.native
  /**
    * @param {Observer|function(value: T): void} [destinationOrNext] A partially
    * defined Observer or a `next` callback function.
    * @param {function(e: ?any): void} [error] The `error` callback of an
    * Observer.
    * @param {function(): void} [complete] The `complete` callback of an
    * Observer.
    */
  class Subscriber[T] () extends Subscription {
    def this(destinationOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(destinationOrNext: PartialObserver[_]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ) = this()
    def this(destinationOrNext: PartialObserver[_], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ) = this()
    def this(
      destinationOrNext: PartialObserver[_],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    
    /* protected */ def _complete(): Unit = js.native
    
    /* protected */ def _error(err: js.Any): Unit = js.native
    
    /* protected */ def _next(value: T): Unit = js.native
    
    /** @deprecated This is an internal implementation detail, do not use. */
    def _unsubscribeAndRecycle(): Subscriber[T] = js.native
    
    /**
      * The {@link Observer} callback to receive a valueless notification of type
      * `complete` from the Observable. Notifies the Observer that the Observable
      * has finished sending push-based notifications.
      * @return {void}
      */
    def complete(): Unit = js.native
    
    var destination: PartialObserver[_] | Subscriber[_] = js.native
    
    /**
      * The {@link Observer} callback to receive notifications of type `error` from
      * the Observable, with an attached `Error`. Notifies the Observer that
      * the Observable has experienced an error condition.
      * @param {any} [err] The `error` exception.
      * @return {void}
      */
    def error(): Unit = js.native
    def error(err: js.Any): Unit = js.native
    
    var isStopped: Boolean = js.native
    
    /**
      * The {@link Observer} callback to receive notifications of type `next` from
      * the Observable, with a value. The Observable may call this method 0 or more
      * times.
      * @param {T} [value] The `next` value.
      * @return {void}
      */
    def next(): Unit = js.native
    def next(value: T): Unit = js.native
    
    /** @internal */ var syncErrorThrowable: Boolean = js.native
    
    /** @internal */ var syncErrorThrown: Boolean = js.native
    
    /** @internal */ var syncErrorValue: js.Any = js.native
  }
  /* static members */
  @js.native
  object Subscriber extends js.Object {
    
    /**
      * A static factory for a Subscriber, given a (potentially partial) definition
      * of an Observer.
      * @param {function(x: ?T): void} [next] The `next` callback of an Observer.
      * @param {function(e: ?any): void} [error] The `error` callback of an
      * Observer.
      * @param {function(): void} [complete] The `complete` callback of an
      * Observer.
      * @return {Subscriber<T>} A Subscriber wrapping the (partially defined)
      * Observer represented by the given arguments.
      * @nocollapse
      */
    def create[T](): Subscriber[T] = js.native
    def create[T](next: js.UndefOr[scala.Nothing], error: js.UndefOr[scala.Nothing], complete: js.Function0[Unit]): Subscriber[T] = js.native
    def create[T](next: js.UndefOr[scala.Nothing], error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Subscriber[T] = js.native
    def create[T](
      next: js.UndefOr[scala.Nothing],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ): Subscriber[T] = js.native
    def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit]): Subscriber[T] = js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.UndefOr[scala.Nothing],
      complete: js.Function0[Unit]
    ): Subscriber[T] = js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
    ): Subscriber[T] = js.native
    def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[js.Any], Unit],
      complete: js.Function0[Unit]
    ): Subscriber[T] = js.native
  }
}
