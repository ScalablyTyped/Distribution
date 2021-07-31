package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.rxjsStrings.C
import typings.rxjs.rxjsStrings.E
import typings.rxjs.rxjsStrings.N
import typings.rxjs.typesMod.PartialObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("rxjs/internal/Notification", "Notification")
  @js.native
  class Notification[T] protected () extends StObject {
    def this(kind: C) = this()
    def this(kind: E) = this()
    def this(kind: N) = this()
    def this(kind: C, value: T) = this()
    def this(kind: E, value: T) = this()
    def this(kind: N, value: T) = this()
    def this(kind: C, value: T, error: js.Any) = this()
    def this(kind: C, value: Unit, error: js.Any) = this()
    def this(kind: E, value: T, error: js.Any) = this()
    def this(kind: E, value: Unit, error: js.Any) = this()
    def this(kind: N, value: T, error: js.Any) = this()
    def this(kind: N, value: Unit, error: js.Any) = this()
    
    def accept(nextOrObserver: js.Function1[/* value */ T, Unit]): js.Any = js.native
    def accept(nextOrObserver: js.Function1[/* value */ T, Unit], error: js.Function1[/* err */ js.Any, Unit]): js.Any = js.native
    def accept(
      nextOrObserver: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* err */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): js.Any = js.native
    def accept(nextOrObserver: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): js.Any = js.native
    /**
      * Takes an Observer or its individual callback functions, and calls `observe`
      * or `do` methods accordingly.
      * @param {Observer|function(value: T): void} nextOrObserver An Observer or
      * the `next` callback.
      * @param {function(err: any): void} [error] An Observer `error` callback.
      * @param {function(): void} [complete] An Observer `complete` callback.
      * @return {any}
      */
    def accept(nextOrObserver: PartialObserver[T]): js.Any = js.native
    def accept(nextOrObserver: PartialObserver[T], error: js.Function1[/* err */ js.Any, Unit]): js.Any = js.native
    def accept(
      nextOrObserver: PartialObserver[T],
      error: js.Function1[/* err */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): js.Any = js.native
    def accept(nextOrObserver: PartialObserver[T], error: Unit, complete: js.Function0[Unit]): js.Any = js.native
    
    /**
      * Given some {@link Observer} callbacks, deliver the value represented by the
      * current Notification to the correctly corresponding callback.
      * @param {function(value: T): void} next An Observer `next` callback.
      * @param {function(err: any): void} [error] An Observer `error` callback.
      * @param {function(): void} [complete] An Observer `complete` callback.
      * @return {any}
      */
    def `do`(next: js.Function1[/* value */ T, Unit]): js.Any = js.native
    def `do`(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* err */ js.Any, Unit]): js.Any = js.native
    def `do`(
      next: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* err */ js.Any, Unit],
      complete: js.Function0[Unit]
    ): js.Any = js.native
    def `do`(next: js.Function1[/* value */ T, Unit], error: Unit, complete: js.Function0[Unit]): js.Any = js.native
    
    var error: js.UndefOr[js.Any] = js.native
    
    var hasValue: Boolean = js.native
    
    var kind: N | E | C = js.native
    
    /**
      * Delivers to the given `observer` the value wrapped by this Notification.
      * @param {Observer} observer
      * @return
      */
    def observe(observer: PartialObserver[T]): js.Any = js.native
    
    /**
      * Returns a simple Observable that just delivers the notification represented
      * by this Notification instance.
      * @return {any}
      */
    def toObservable(): Observable[T] = js.native
    
    var value: js.UndefOr[T] = js.native
  }
  /* static members */
  object Notification {
    
    @JSImport("rxjs/internal/Notification", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/internal/Notification", "Notification.completeNotification")
    @js.native
    def completeNotification: js.Any = js.native
    @scala.inline
    def completeNotification_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(x.asInstanceOf[js.Any])
    
    /**
      * A shortcut to create a Notification instance of the type `complete`.
      * @return {Notification<any>} The valueless "complete" Notification.
      * @nocollapse
      */
    @scala.inline
    def createComplete(): Notification[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("createComplete")().asInstanceOf[Notification[js.Any]]
    
    /**
      * A shortcut to create a Notification instance of the type `error` from a
      * given error.
      * @param {any} [err] The `error` error.
      * @return {Notification<T>} The "error" Notification representing the
      * argument.
      * @nocollapse
      */
    @scala.inline
    def createError[T](): Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")().asInstanceOf[Notification[T]]
    @scala.inline
    def createError[T](err: js.Any): Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")(err.asInstanceOf[js.Any]).asInstanceOf[Notification[T]]
    
    /**
      * A shortcut to create a Notification instance of the type `next` from a
      * given value.
      * @param {T} value The `next` value.
      * @return {Notification<T>} The "next" Notification representing the
      * argument.
      * @nocollapse
      */
    @scala.inline
    def createNext[T](value: T): Notification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNext")(value.asInstanceOf[js.Any]).asInstanceOf[Notification[T]]
    
    @JSImport("rxjs/internal/Notification", "Notification.undefinedValueNotification")
    @js.native
    def undefinedValueNotification: js.Any = js.native
    @scala.inline
    def undefinedValueNotification_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("undefinedValueNotification")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  sealed trait NotificationKind extends StObject
  @JSImport("rxjs/internal/Notification", "NotificationKind")
  @js.native
  object NotificationKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NotificationKind & String] = js.native
    
    @js.native
    sealed trait COMPLETE
      extends StObject
         with NotificationKind
    /* "C" */ val COMPLETE: typings.rxjs.notificationMod.NotificationKind.COMPLETE & String = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with NotificationKind
    /* "E" */ val ERROR: typings.rxjs.notificationMod.NotificationKind.ERROR & String = js.native
    
    @js.native
    sealed trait NEXT
      extends StObject
         with NotificationKind
    /* "N" */ val NEXT: typings.rxjs.notificationMod.NotificationKind.NEXT & String = js.native
  }
}
