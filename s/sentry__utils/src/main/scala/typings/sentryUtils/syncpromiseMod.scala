package typings.sentryUtils

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncpromiseMod {
  
  @JSImport("@sentry/utils/types/syncpromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Thenable class that behaves like a Promise and follows it's interface
    * but is not async internally
    */
  @JSImport("@sentry/utils/types/syncpromise", "SyncPromise")
  @js.native
  open class SyncPromise[T] protected ()
    extends StObject
       with PromiseLike[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T] | Null], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            Unit
          ]) = this()
    
    /** JSDoc */
    /* private */ val _executeHandlers: Any = js.native
    
    /* private */ var _handlers: Any = js.native
    
    /** JSDoc */
    /* private */ val _reject: Any = js.native
    
    /** JSDoc */
    /* private */ val _resolve: Any = js.native
    
    /** JSDoc */
    /* private */ val _setResult: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _value: Any = js.native
    
    /** JSDoc */
    def `catch`[TResult](): js.Thenable[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | js.Thenable[TResult]]): js.Thenable[T | TResult] = js.native
    
    /** JSDoc */
    def `finally`[TResult](): js.Thenable[TResult] = js.native
    def `finally`[TResult](onfinally: js.Function0[Unit]): js.Thenable[TResult] = js.native
  }
  
  inline def rejectedSyncPromise[T](): js.Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("rejectedSyncPromise")().asInstanceOf[js.Thenable[T]]
  inline def rejectedSyncPromise[T](reason: Any): js.Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("rejectedSyncPromise")(reason.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[T]]
  
  inline def resolvedSyncPromise(): js.Thenable[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvedSyncPromise")().asInstanceOf[js.Thenable[Unit]]
  inline def resolvedSyncPromise[T](value: T): js.Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvedSyncPromise")(value.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[T]]
  inline def resolvedSyncPromise[T](value: js.Thenable[T]): js.Thenable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvedSyncPromise")(value.asInstanceOf[js.Any]).asInstanceOf[js.Thenable[T]]
}
