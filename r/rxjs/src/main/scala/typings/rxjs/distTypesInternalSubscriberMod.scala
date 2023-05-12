package typings.rxjs

import typings.rxjs.distTypesInternalSubscriptionMod.Subscription
import typings.rxjs.distTypesInternalTypesMod.Observer
import typings.rxjs.rxjsBooleans.`true`
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSubscriberMod {
  
  /* Inlined std.Readonly<rxjs.rxjs/dist/types/internal/types.Observer<any>> & {  closed :true} */
  object EMPTY_OBSERVER {
    
    @JSImport("rxjs/dist/types/internal/Subscriber", "EMPTY_OBSERVER")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/dist/types/internal/Subscriber", "EMPTY_OBSERVER.closed")
    @js.native
    def closed: `true` = js.native
    inline def closed_=(x: `true`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closed")(x.asInstanceOf[js.Any])
    
    inline def complete(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("complete")().asInstanceOf[Unit]
    
    inline def error(err: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def next(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("rxjs/dist/types/internal/Subscriber", "SafeSubscriber")
  @js.native
  open class SafeSubscriber[T] () extends Subscriber[T] {
    def this(observerOrNext: js.Function1[/* value */ T, Unit]) = this()
    def this(observerOrNext: Partial[Observer[T]]) = this()
    def this(
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[Any], Unit]
    ) = this()
    def this(observerOrNext: Null, error: js.Function1[/* e */ js.UndefOr[Any], Unit]) = this()
    def this(observerOrNext: Unit, error: js.Function1[/* e */ js.UndefOr[Any], Unit]) = this()
    def this(observerOrNext: Partial[Observer[T]], error: js.Function1[/* e */ js.UndefOr[Any], Unit]) = this()
    def this(
      observerOrNext: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* e */ js.UndefOr[Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(observerOrNext: js.Function1[/* value */ T, Unit], error: Null, complete: js.Function0[Unit]) = this()
    def this(observerOrNext: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]) = this()
    def this(
      observerOrNext: Null,
      error: js.Function1[/* e */ js.UndefOr[Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(observerOrNext: Null, error: Null, complete: js.Function0[Unit]) = this()
    def this(observerOrNext: Null, error: Unit, complete: js.Function0[Unit]) = this()
    def this(
      observerOrNext: Unit,
      error: js.Function1[/* e */ js.UndefOr[Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(observerOrNext: Unit, error: Null, complete: js.Function0[Unit]) = this()
    def this(observerOrNext: Unit, error: Unit, complete: js.Function0[Unit]) = this()
    def this(
      observerOrNext: Partial[Observer[T]],
      error: js.Function1[/* e */ js.UndefOr[Any], Unit],
      complete: js.Function0[Unit]
    ) = this()
    def this(observerOrNext: Partial[Observer[T]], error: Null, complete: js.Function0[Unit]) = this()
    def this(observerOrNext: Partial[Observer[T]], error: Unit, complete: js.Function0[Unit]) = this()
  }
  
  @JSImport("rxjs/dist/types/internal/Subscriber", "Subscriber")
  @js.native
  /**
    * @deprecated Internal implementation detail, do not use directly. Will be made internal in v8.
    * There is no reason to directly create an instance of Subscriber. This type is exported for typings reasons.
    */
  open class Subscriber[T] ()
    extends Subscription
       with Observer[T] {
    def this(destination: Subscriber[Any]) = this()
    def this(destination: Observer[Any]) = this()
    
    /* protected */ def _complete(): Unit = js.native
    
    /* protected */ def _error(err: Any): Unit = js.native
    
    /* protected */ def _next(value: T): Unit = js.native
    
    /**
      * A callback function that gets called by the producer if and when it has no more
      * values to provide (by calling `next` callback function). This means that no error
      * has happened. This callback can't be called more than one time, it can't be called
      * if the `error` callback function have been called previously, nor it can't be called
      * if the consumer has unsubscribed.
      *
      * For more info, please refer to {@link guide/glossary-and-semantics#complete this guide}.
      */
    /* CompleteClass */
    override def complete(): Unit = js.native
    
    /** @deprecated Internal implementation detail, do not use directly. Will be made internal in v8. */
    /* protected */ var destination: Subscriber[Any] | Observer[Any] = js.native
    
    /**
      * The {@link Observer} callback to receive notifications of type `error` from
      * the Observable, with an attached `Error`. Notifies the Observer that
      * the Observable has experienced an error condition.
      * @param {any} [err] The `error` exception.
      * @return {void}
      */
    def error(): Unit = js.native
    /**
      * A callback function that gets called by the producer if and when it encountered a
      * problem of any kind. The errored value will be provided through the `err` parameter.
      * This callback can't be called more than one time, it can't be called if the
      * `complete` callback function have been called previously, nor it can't be called if
      * the consumer has unsubscribed.
      *
      * For more info, please refer to {@link guide/glossary-and-semantics#error this guide}.
      */
    /* CompleteClass */
    override def error(err: Any): Unit = js.native
    
    /** @deprecated Internal implementation detail, do not use directly. Will be made internal in v8. */
    /* protected */ var isStopped: Boolean = js.native
    
    /**
      * The {@link Observer} callback to receive notifications of type `next` from
      * the Observable, with a value. The Observable may call this method 0 or more
      * times.
      * @param {T} [value] The `next` value.
      * @return {void}
      */
    def next(): Unit = js.native
    /**
      * A callback function that gets called by the producer during the subscription when
      * the producer "has" the `value`. It won't be called if `error` or `complete` callback
      * functions have been called, nor after the consumer has unsubscribed.
      *
      * For more info, please refer to {@link guide/glossary-and-semantics#next this guide}.
      */
    /* CompleteClass */
    override def next(value: T): Unit = js.native
  }
  /* static members */
  object Subscriber {
    
    @JSImport("rxjs/dist/types/internal/Subscriber", "Subscriber")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A static factory for a Subscriber, given a (potentially partial) definition
      * of an Observer.
      * @param next The `next` callback of an Observer.
      * @param error The `error` callback of an
      * Observer.
      * @param complete The `complete` callback of an
      * Observer.
      * @return A Subscriber wrapping the (partially defined)
      * Observer represented by the given arguments.
      * @nocollapse
      * @deprecated Do not use. Will be removed in v8. There is no replacement for this
      * method, and there is no reason to be creating instances of `Subscriber` directly.
      * If you have a specific use case, please file an issue.
      */
    inline def create[T](): Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Subscriber[T]]
    inline def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit]): Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any]).asInstanceOf[Subscriber[T]]
    inline def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[Any], Unit]
    ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
    inline def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[Any], Unit],
      complete: js.Function0[Unit]
    ): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
    inline def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit], error: Unit, complete: js.Function0[Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
    inline def create[T](next: Unit, error: js.Function1[/* e */ js.UndefOr[Any], Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
    inline def create[T](next: Unit, error: js.Function1[/* e */ js.UndefOr[Any], Unit], complete: js.Function0[Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
    inline def create[T](next: Unit, error: Unit, complete: js.Function0[Unit]): Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[Subscriber[T]]
  }
}
