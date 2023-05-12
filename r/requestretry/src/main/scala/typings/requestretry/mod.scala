package typings.requestretry

import org.scalablytyped.runtime.Shortcut
import typings.node.httpMod.IncomingMessage
import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import typings.requestretry.anon.FnCall
import typings.requestretry.anon.FnCallOnrejected
import typings.requestretry.anon.HTTPOrNetworkError
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("requestretry", JSImport.Namespace)
  @js.native
  val ^ : RetryRequestAPI = js.native
  
  type DelayStrategy = js.Function3[/* err */ js.Error, /* response */ IncomingMessage, /* body */ Any, Double]
  
  @js.native
  trait RequestPromise extends Request {
    
    def `catch`[TResult](): js.Promise[Any | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ Any, TResult | PromiseLike[TResult]]): js.Promise[Any | TResult] = js.native
    @JSName("catch")
    var catch_Original: FnCallOnrejected = js.native
    
    def promise(): js.Promise[Any] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ Any, TResult1 | PromiseLike[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ Any, TResult1 | PromiseLike[TResult1]],
      onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Unit, onrejected: js.Function1[/* reason */ Any, TResult2 | PromiseLike[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: FnCall = js.native
  }
  
  trait RequestRetryOptions
    extends StObject
       with CoreOptions {
    
    var delayStrategy: js.UndefOr[DelayStrategy] = js.undefined
    
    var fullResponse: js.UndefOr[Boolean] = js.undefined
    
    var maxAttempts: js.UndefOr[Double] = js.undefined
    
    var promiseFactory: js.UndefOr[js.Function1[/* resolver */ Any, Any]] = js.undefined
    
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    var retryStrategy: js.UndefOr[RetryStrategy] = js.undefined
    
    var skipHeaderSanitize: js.UndefOr[Boolean] = js.undefined
  }
  object RequestRetryOptions {
    
    inline def apply(): RequestRetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestRetryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestRetryOptions] (val x: Self) extends AnyVal {
      
      inline def setDelayStrategy(value: (/* err */ js.Error, /* response */ IncomingMessage, /* body */ Any) => Double): Self = StObject.set(x, "delayStrategy", js.Any.fromFunction3(value))
      
      inline def setDelayStrategyUndefined: Self = StObject.set(x, "delayStrategy", js.undefined)
      
      inline def setFullResponse(value: Boolean): Self = StObject.set(x, "fullResponse", value.asInstanceOf[js.Any])
      
      inline def setFullResponseUndefined: Self = StObject.set(x, "fullResponse", js.undefined)
      
      inline def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      inline def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      inline def setPromiseFactory(value: /* resolver */ Any => Any): Self = StObject.set(x, "promiseFactory", js.Any.fromFunction1(value))
      
      inline def setPromiseFactoryUndefined: Self = StObject.set(x, "promiseFactory", js.undefined)
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setRetryStrategy(value: (/* err */ js.Error, /* response */ IncomingMessage, /* body */ Any) => Boolean): Self = StObject.set(x, "retryStrategy", js.Any.fromFunction3(value))
      
      inline def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
      
      inline def setSkipHeaderSanitize(value: Boolean): Self = StObject.set(x, "skipHeaderSanitize", value.asInstanceOf[js.Any])
      
      inline def setSkipHeaderSanitizeUndefined: Self = StObject.set(x, "skipHeaderSanitize", js.undefined)
    }
  }
  
  @js.native
  trait RetryRequestAPI
    extends StObject
       with RequestAPI[RequestPromise, RequestRetryOptions, RequiredUriUrl] {
    
    var RetryStrategies: HTTPOrNetworkError = js.native
  }
  
  type RetryStrategy = js.Function3[/* err */ js.Error, /* response */ IncomingMessage, /* body */ Any, Boolean]
  
  type _To = RetryRequestAPI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RetryRequestAPI = ^
}
