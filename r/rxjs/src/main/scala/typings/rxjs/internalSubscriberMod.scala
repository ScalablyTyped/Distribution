package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.Observer
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalSubscriberMod {
  
  /* Inlined std.Readonly<rxjs.rxjs/dist/types/internal/types.Observer<any>> & {  closed :true} */
  object EMPTY_OBSERVER {
    
    @JSImport("rxjs/internal/Subscriber", "EMPTY_OBSERVER")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/Subscriber", "EMPTY_OBSERVER.closed")
    @js.native
    def closed: true = js.native
    inline def closed_=(x: true): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closed")(x.asInstanceOf[js.Any])
    
    inline def complete(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("complete")().asInstanceOf[Unit]
    
    inline def error(err: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(err.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def next(value: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(value.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("rxjs/internal/Subscriber", "SafeSubscriber")
  @js.native
  open class SafeSubscriber[T] ()
    extends typings.rxjs.distTypesInternalSubscriberMod.SafeSubscriber[T] {
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
  
  @JSImport("rxjs/internal/Subscriber", "Subscriber")
  @js.native
  /**
    * @deprecated Internal implementation detail, do not use directly. Will be made internal in v8.
    * There is no reason to directly create an instance of Subscriber. This type is exported for typings reasons.
    */
  open class Subscriber[T] ()
    extends typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] {
    def this(destination: typings.rxjs.distTypesInternalSubscriberMod.Subscriber[Any]) = this()
    def this(destination: Observer[Any]) = this()
  }
  /* static members */
  object Subscriber {
    
    @JSImport("rxjs/internal/Subscriber", "Subscriber")
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
    inline def create[T](): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit]): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[Any], Unit]
    ): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](
      next: js.Function1[/* x */ js.UndefOr[T], Unit],
      error: js.Function1[/* e */ js.UndefOr[Any], Unit],
      complete: js.Function0[Unit]
    ): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](next: js.Function1[/* x */ js.UndefOr[T], Unit], error: Unit, complete: js.Function0[Unit]): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](next: Unit, error: js.Function1[/* e */ js.UndefOr[Any], Unit]): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](next: Unit, error: js.Function1[/* e */ js.UndefOr[Any], Unit], complete: js.Function0[Unit]): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
    inline def create[T](next: Unit, error: Unit, complete: js.Function0[Unit]): typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(next.asInstanceOf[js.Any], error.asInstanceOf[js.Any], complete.asInstanceOf[js.Any])).asInstanceOf[typings.rxjs.distTypesInternalSubscriberMod.Subscriber[T]]
  }
}
