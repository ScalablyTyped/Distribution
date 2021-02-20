package typings.sentryUtils

import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncpromiseMod {
  
  @JSImport("@sentry/utils/dist/syncpromise", "SyncPromise")
  @js.native
  class SyncPromise[T] protected () extends PromiseLike[T] {
    def this(executor: js.Function2[
            /* resolve */ js.Function1[/* value */ js.UndefOr[T | js.Thenable[T] | Null], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
            Unit
          ]) = this()
    
    /** JSDoc */
    val _attachHandler: js.Any = js.native
    
    /** JSDoc */
    val _executeHandlers: js.Any = js.native
    
    var _handlers: js.Any = js.native
    
    /** JSDoc */
    val _reject: js.Any = js.native
    
    /** JSDoc */
    val _resolve: js.Any = js.native
    
    /** JSDoc */
    val _setResult: js.Any = js.native
    
    var _state: js.Any = js.native
    
    var _value: js.Any = js.native
    
    /** JSDoc */
    def `catch`[TResult](): js.Thenable[T | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Thenable[T | TResult] = js.native
    
    /** JSDoc */
    def `finally`[TResult](): js.Thenable[TResult] = js.native
    def `finally`[TResult](onfinally: js.Function0[Unit]): js.Thenable[TResult] = js.native
  }
  object SyncPromise {
    
    /** JSDoc */
    /* static member */
    @JSImport("@sentry/utils/dist/syncpromise", "SyncPromise.all")
    @js.native
    def all[U](collection: js.Array[U | js.Thenable[U]]): js.Thenable[js.Array[U]] = js.native
    
    /** JSDoc */
    /* static member */
    @JSImport("@sentry/utils/dist/syncpromise", "SyncPromise.reject")
    @js.native
    def reject[T](): js.Thenable[T] = js.native
    @JSImport("@sentry/utils/dist/syncpromise", "SyncPromise.reject")
    @js.native
    def reject[T](reason: js.Any): js.Thenable[T] = js.native
    
    /** JSDoc */
    /* static member */
    @JSImport("@sentry/utils/dist/syncpromise", "SyncPromise.resolve")
    @js.native
    def resolve[T](value: T): js.Thenable[T] = js.native
    @JSImport("@sentry/utils/dist/syncpromise", "SyncPromise.resolve")
    @js.native
    def resolve[T](value: js.Thenable[T]): js.Thenable[T] = js.native
  }
}
