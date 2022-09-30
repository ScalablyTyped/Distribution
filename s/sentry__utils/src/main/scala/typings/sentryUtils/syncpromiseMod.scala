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
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | PromiseLike[T] | Null], Unit], 
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
    def `catch`[TResult](): PromiseLike[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): PromiseLike[T | TResult] = js.native
    
    /** JSDoc */
    def `finally`[TResult](): PromiseLike[TResult] = js.native
    def `finally`[TResult](onfinally: js.Function0[Unit]): PromiseLike[TResult] = js.native
  }
  
  inline def rejectedSyncPromise[T](): PromiseLike[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("rejectedSyncPromise")().asInstanceOf[PromiseLike[T]]
  inline def rejectedSyncPromise[T](reason: Any): PromiseLike[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("rejectedSyncPromise")(reason.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[T]]
  
  inline def resolvedSyncPromise(): PromiseLike[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvedSyncPromise")().asInstanceOf[PromiseLike[Unit]]
  inline def resolvedSyncPromise[T](value: T): PromiseLike[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvedSyncPromise")(value.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[T]]
  inline def resolvedSyncPromise[T](value: PromiseLike[T]): PromiseLike[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvedSyncPromise")(value.asInstanceOf[js.Any]).asInstanceOf[PromiseLike[T]]
}
