package typings.rxjs

import typings.rxjs.internalObservableMod.Observable
import typings.rxjs.internalTypesMod.CompleteNotification
import typings.rxjs.internalTypesMod.ErrorNotification
import typings.rxjs.internalTypesMod.NextNotification
import typings.rxjs.internalTypesMod.ObservableNotification
import typings.rxjs.internalTypesMod.PartialObserver
import typings.rxjs.rxjsStrings.C
import typings.rxjs.rxjsStrings.E
import typings.rxjs.rxjsStrings.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("rxjs/dist/types/internal/Notification", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/dist/types/internal/Notification", "Notification")
  @js.native
  open class Notification[T] protected () extends StObject {
    /**
      * Creates a "completion" notification object.
      * @param kind Always `'C'`
      * @deprecated Internal implementation detail. Use {@link Notification#createComplete createComplete} instead.
      */
    def this(kind: C) = this()
    /**
      * Creates a "Next" notification object.
      * @param kind Always `'N'`
      * @param value The value to notify with if observed.
      * @deprecated Internal implementation detail. Use {@link Notification#createNext createNext} instead.
      */
    def this(kind: N) = this()
    def this(kind: N, value: T) = this()
    /**
      * Creates an "Error" notification object.
      * @param kind Always `'E'`
      * @param value Always `undefined`
      * @param error The error to notify with if observed.
      * @deprecated Internal implementation detail. Use {@link Notification#createError createError} instead.
      */
    def this(kind: E, value: Unit, error: Any) = this()
    
    /**
      * Executes the next handler if the Notification is of `kind` `"N"`. Otherwise
      * this will not error, and it will be a noop.
      * @param next The next handler
      * @deprecated Replaced with {@link Notification#observe observe}. Will be removed in v8.
      */
    def accept(next: js.Function1[/* value */ T, Unit]): Unit = js.native
    /**
      * Executes a notification on the appropriate handler from a list provided.
      * If a handler is missing for the kind of notification, nothing is called
      * and no error is thrown, it will be a noop.
      * @param next A next handler
      * @param error An error handler
      * @deprecated Replaced with {@link Notification#observe observe}. Will be removed in v8.
      */
    def accept(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* err */ Any, Unit]): Unit = js.native
    /**
      * Executes a notification on the appropriate handler from a list provided.
      * If a handler is missing for the kind of notification, nothing is called
      * and no error is thrown, it will be a noop.
      * @param next A next handler
      * @param error An error handler
      * @param complete A complete handler
      * @deprecated Replaced with {@link Notification#observe observe}. Will be removed in v8.
      */
    def accept(
      next: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* err */ Any, Unit],
      complete: js.Function0[Unit]
    ): Unit = js.native
    /**
      * Executes the appropriate handler on a passed `observer` given the `kind` of notification.
      * If the handler is missing it will do nothing. Even if the notification is an error, if
      * there is no error handler on the observer, an error will not be thrown, it will noop.
      * @param observer The observer to notify.
      * @deprecated Replaced with {@link Notification#observe observe}. Will be removed in v8.
      */
    def accept(observer: PartialObserver[T]): Unit = js.native
    
    /**
      * Executes the next handler if the Notification is of `kind` `"N"`. Otherwise
      * this will not error, and it will be a noop.
      * @param next The next handler
      * @deprecated Replaced with {@link Notification#observe observe}. Will be removed in v8.
      */
    def `do`(next: js.Function1[/* value */ T, Unit]): Unit = js.native
    /**
      * Executes a notification on the appropriate handler from a list provided.
      * If a handler is missing for the kind of notification, nothing is called
      * and no error is thrown, it will be a noop.
      * @param next A next handler
      * @param error An error handler
      * @deprecated Replaced with {@link Notification#observe observe}. Will be removed in v8.
      */
    def `do`(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* err */ Any, Unit]): Unit = js.native
    /**
      * Executes a notification on the appropriate handler from a list provided.
      * If a handler is missing for the kind of notification, nothing is called
      * and no error is thrown, it will be a noop.
      * @param next A next handler
      * @param error An error handler
      * @param complete A complete handler
      * @deprecated Replaced with {@link Notification#observe observe}. Will be removed in v8.
      */
    def `do`(
      next: js.Function1[/* value */ T, Unit],
      error: js.Function1[/* err */ Any, Unit],
      complete: js.Function0[Unit]
    ): Unit = js.native
    
    val error: js.UndefOr[Any] = js.native
    
    /**
      * A value signifying that the notification will "next" if observed. In truth,
      * This is really synonymous with just checking `kind === "N"`.
      * @deprecated Will be removed in v8. Instead, just check to see if the value of `kind` is `"N"`.
      */
    val hasValue: Boolean = js.native
    
    val kind: N | E | C = js.native
    
    /**
      * Executes the appropriate handler on a passed `observer` given the `kind` of notification.
      * If the handler is missing it will do nothing. Even if the notification is an error, if
      * there is no error handler on the observer, an error will not be thrown, it will noop.
      * @param observer The observer to notify.
      */
    def observe(observer: PartialObserver[T]): Unit = js.native
    
    /**
      * Returns a simple Observable that just delivers the notification represented
      * by this Notification instance.
      *
      * @deprecated Will be removed in v8. To convert a `Notification` to an {@link Observable},
      * use {@link of} and {@link dematerialize}: `of(notification).pipe(dematerialize())`.
      */
    def toObservable(): Observable[T] = js.native
    
    val value: js.UndefOr[T] = js.native
  }
  /* static members */
  object Notification {
    
    @JSImport("rxjs/dist/types/internal/Notification", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs/dist/types/internal/Notification", "Notification.completeNotification")
    @js.native
    def completeNotification: Any = js.native
    inline def completeNotification_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("completeNotification")(x.asInstanceOf[js.Any])
    
    /**
      * A shortcut to create a Notification instance of the type `complete`.
      * @return {Notification<any>} The valueless "complete" Notification.
      * @nocollapse
      * @deprecated It is NOT recommended to create instances of `Notification` directly.
      * Rather, try to create POJOs matching the signature outlined in {@link ObservableNotification}.
      * For example: `{ kind: 'N', value: 1 }`, `{ kind: 'E', error: new Error('bad') }`, or `{ kind: 'C' }`.
      * Will be removed in v8.
      */
    inline def createComplete(): Notification[scala.Nothing] & CompleteNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createComplete")().asInstanceOf[Notification[scala.Nothing] & CompleteNotification]
    
    /**
      * A shortcut to create a Notification instance of the type `error` from a
      * given error.
      * @param {any} [err] The `error` error.
      * @return {Notification<T>} The "error" Notification representing the
      * argument.
      * @nocollapse
      * @deprecated It is NOT recommended to create instances of `Notification` directly.
      * Rather, try to create POJOs matching the signature outlined in {@link ObservableNotification}.
      * For example: `{ kind: 'N', value: 1 }`, `{ kind: 'E', error: new Error('bad') }`, or `{ kind: 'C' }`.
      * Will be removed in v8.
      */
    inline def createError(): Notification[scala.Nothing] & ErrorNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")().asInstanceOf[Notification[scala.Nothing] & ErrorNotification]
    inline def createError(err: Any): Notification[scala.Nothing] & ErrorNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")(err.asInstanceOf[js.Any]).asInstanceOf[Notification[scala.Nothing] & ErrorNotification]
    
    /**
      * A shortcut to create a Notification instance of the type `next` from a
      * given value.
      * @param {T} value The `next` value.
      * @return {Notification<T>} The "next" Notification representing the
      * argument.
      * @nocollapse
      * @deprecated It is NOT recommended to create instances of `Notification` directly.
      * Rather, try to create POJOs matching the signature outlined in {@link ObservableNotification}.
      * For example: `{ kind: 'N', value: 1 }`, `{ kind: 'E', error: new Error('bad') }`, or `{ kind: 'C' }`.
      * Will be removed in v8.
      */
    inline def createNext[T](value: T): Notification[T] & NextNotification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNext")(value.asInstanceOf[js.Any]).asInstanceOf[Notification[T] & NextNotification[T]]
  }
  
  @js.native
  sealed trait NotificationKind extends StObject
  @JSImport("rxjs/dist/types/internal/Notification", "NotificationKind")
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
  
  inline def observeNotification[T](notification: ObservableNotification[T], observer: PartialObserver[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("observeNotification")(notification.asInstanceOf[js.Any], observer.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
