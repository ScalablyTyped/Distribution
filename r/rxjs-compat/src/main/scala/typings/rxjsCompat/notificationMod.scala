package typings.rxjsCompat

import typings.rxjs.distTypesInternalTypesMod.CompleteNotification
import typings.rxjs.distTypesInternalTypesMod.ErrorNotification
import typings.rxjs.distTypesInternalTypesMod.NextNotification
import typings.rxjsCompat.rxjsCompatStrings.C
import typings.rxjsCompat.rxjsCompatStrings.E
import typings.rxjsCompat.rxjsCompatStrings.N
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object notificationMod {
  
  @JSImport("rxjs-compat/Notification", "Notification")
  @js.native
  open class Notification[T] protected ()
    extends typings.rxjs.mod.Notification[T] {
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
  }
  /* static members */
  object Notification {
    
    @JSImport("rxjs-compat/Notification", "Notification")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rxjs-compat/Notification", "Notification.completeNotification")
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
    inline def createComplete(): typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & CompleteNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createComplete")().asInstanceOf[typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & CompleteNotification]
    
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
    inline def createError(): typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")().asInstanceOf[typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification]
    inline def createError(err: Any): typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification = ^.asInstanceOf[js.Dynamic].applyDynamic("createError")(err.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalNotificationMod.Notification[scala.Nothing] & ErrorNotification]
    
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
    inline def createNext[T](value: T): typings.rxjs.distTypesInternalNotificationMod.Notification[T] & NextNotification[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNext")(value.asInstanceOf[js.Any]).asInstanceOf[typings.rxjs.distTypesInternalNotificationMod.Notification[T] & NextNotification[T]]
  }
}
