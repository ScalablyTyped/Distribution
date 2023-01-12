package typings.reactQuery

import typings.reactQuery.typesCoreTypesMod.CancelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreRetryerMod {
  
  @JSImport("react-query/types/core/retryer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-query/types/core/retryer", "CancelledError")
  @js.native
  open class CancelledError () extends StObject {
    def this(options: CancelOptions) = this()
    
    var revert: js.UndefOr[Boolean] = js.native
    
    var silent: js.UndefOr[Boolean] = js.native
  }
  
  @JSImport("react-query/types/core/retryer", "Retryer")
  @js.native
  open class Retryer[TData, TError] protected () extends StObject {
    def this(config: RetryerConfig[TData, TError]) = this()
    
    /* private */ var abort: Any = js.native
    
    def cancel(): Unit = js.native
    def cancel(options: CancelOptions): Unit = js.native
    
    def cancelRetry(): Unit = js.native
    
    def continue(): Unit = js.native
    
    def continueRetry(): Unit = js.native
    
    var failureCount: Double = js.native
    
    var isPaused: Boolean = js.native
    
    var isResolved: Boolean = js.native
    
    var isTransportCancelable: Boolean = js.native
    
    var promise: js.Promise[TData] = js.native
  }
  
  inline def isCancelable(value: Any): /* is react-query.react-query/types/core/retryer.Cancelable */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancelable")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-query.react-query/types/core/retryer.Cancelable */ Boolean]
  
  inline def isCancelledError(value: Any): /* is react-query.react-query/types/core/retryer.CancelledError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCancelledError")(value.asInstanceOf[js.Any]).asInstanceOf[/* is react-query.react-query/types/core/retryer.CancelledError */ Boolean]
  
  trait Cancelable extends StObject {
    
    def cancel(): Unit
  }
  object Cancelable {
    
    inline def apply(cancel: () => Unit): Cancelable = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[Cancelable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cancelable] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  type RetryDelayFunction[TError] = js.Function2[/* failureCount */ Double, /* error */ TError, Double]
  
  type RetryDelayValue[TError] = Double | RetryDelayFunction[TError]
  
  type RetryValue[TError] = Boolean | Double | ShouldRetryFunction[TError]
  
  trait RetryerConfig[TData, TError] extends StObject {
    
    var abort: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def fn(): TData | js.Promise[TData]
    
    var onContinue: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ TError, Unit]] = js.undefined
    
    var onFail: js.UndefOr[js.Function2[/* failureCount */ Double, /* error */ TError, Unit]] = js.undefined
    
    var onPause: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSuccess: js.UndefOr[js.Function1[/* data */ TData, Unit]] = js.undefined
    
    var retry: js.UndefOr[RetryValue[TError]] = js.undefined
    
    var retryDelay: js.UndefOr[RetryDelayValue[TError]] = js.undefined
  }
  object RetryerConfig {
    
    inline def apply[TData, TError](fn: () => TData | js.Promise[TData]): RetryerConfig[TData, TError] = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction0(fn))
      __obj.asInstanceOf[RetryerConfig[TData, TError]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryerConfig[?, ?], TData, TError] (val x: Self & (RetryerConfig[TData, TError])) extends AnyVal {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setAbortUndefined: Self = StObject.set(x, "abort", js.undefined)
      
      inline def setFn(value: () => TData | js.Promise[TData]): Self = StObject.set(x, "fn", js.Any.fromFunction0(value))
      
      inline def setOnContinue(value: () => Unit): Self = StObject.set(x, "onContinue", js.Any.fromFunction0(value))
      
      inline def setOnContinueUndefined: Self = StObject.set(x, "onContinue", js.undefined)
      
      inline def setOnError(value: /* error */ TError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnFail(value: (/* failureCount */ Double, /* error */ TError) => Unit): Self = StObject.set(x, "onFail", js.Any.fromFunction2(value))
      
      inline def setOnFailUndefined: Self = StObject.set(x, "onFail", js.undefined)
      
      inline def setOnPause(value: () => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction0(value))
      
      inline def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      inline def setOnSuccess(value: /* data */ TData => Unit): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1(value))
      
      inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
      
      inline def setRetry(value: RetryValue[TError]): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryDelay(value: RetryDelayValue[TError]): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayFunction2(value: (/* failureCount */ Double, TError) => Double): Self = StObject.set(x, "retryDelay", js.Any.fromFunction2(value))
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setRetryFunction2(value: (/* failureCount */ Double, TError) => Boolean): Self = StObject.set(x, "retry", js.Any.fromFunction2(value))
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
    }
  }
  
  type ShouldRetryFunction[TError] = js.Function2[/* failureCount */ Double, /* error */ TError, Boolean]
}
