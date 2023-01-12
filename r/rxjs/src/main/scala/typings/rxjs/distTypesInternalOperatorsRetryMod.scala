package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.MonoTypeOperatorFunction
import typings.rxjs.distTypesInternalTypesMod.ObservableInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalOperatorsRetryMod {
  
  @JSImport("rxjs/dist/types/internal/operators/retry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def retry[T](): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")().asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def retry[T](config: RetryConfig): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(config.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  inline def retry[T](count: Double): MonoTypeOperatorFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("retry")(count.asInstanceOf[js.Any]).asInstanceOf[MonoTypeOperatorFunction[T]]
  
  trait RetryConfig extends StObject {
    
    /**
      * The maximum number of times to retry. If `count` is omitted, `retry` will try to
      * resubscribe on errors infinite number of times.
      */
    var count: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of milliseconds to delay before retrying, OR a function to
      * return a notifier for delaying. If a function is given, that function should
      * return a notifier that, when it emits will retry the source. If the notifier
      * completes _without_ emitting, the resulting observable will complete without error,
      * if the notifier errors, the error will be pushed to the result.
      */
    var delay: js.UndefOr[
        Double | (js.Function2[/* error */ Any, /* retryCount */ Double, ObservableInput[Any]])
      ] = js.undefined
    
    /**
      * Whether or not to reset the retry counter when the retried subscription
      * emits its first value.
      */
    var resetOnSuccess: js.UndefOr[Boolean] = js.undefined
  }
  object RetryConfig {
    
    inline def apply(): RetryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryConfig] (val x: Self) extends AnyVal {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDelay(value: Double | (js.Function2[/* error */ Any, /* retryCount */ Double, ObservableInput[Any]])): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayFunction2(value: (/* error */ Any, /* retryCount */ Double) => ObservableInput[Any]): Self = StObject.set(x, "delay", js.Any.fromFunction2(value))
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setResetOnSuccess(value: Boolean): Self = StObject.set(x, "resetOnSuccess", value.asInstanceOf[js.Any])
      
      inline def setResetOnSuccessUndefined: Self = StObject.set(x, "resetOnSuccess", js.undefined)
    }
  }
}
