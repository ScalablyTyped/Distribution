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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("requestretry", JSImport.Namespace)
  @js.native
  val ^ : RetryRequestAPI = js.native
  
  type DelayStrategy = js.Function3[/* err */ Error, /* response */ IncomingMessage, /* body */ js.Any, Double]
  
  @js.native
  trait RequestPromise extends Request {
    
    def `catch`[TResult](): js.Promise[_ | TResult] = js.native
    def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult]]): js.Promise[_ | TResult] = js.native
    @JSName("catch")
    var catch_Original: FnCallOnrejected = js.native
    
    def promise(): js.Promise[_] = js.native
    
    def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.UndefOr[scala.Nothing],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ js.Any, TResult1 | js.Thenable[TResult1]]): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](
      onfulfilled: js.Function1[/* value */ js.Any, TResult1 | js.Thenable[TResult1]],
      onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
    ): js.Promise[TResult1 | TResult2] = js.native
    def `then`[TResult1, TResult2](onfulfilled: Null, onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]): js.Promise[TResult1 | TResult2] = js.native
    @JSName("then")
    var then_Original: FnCall = js.native
  }
  
  @js.native
  trait RequestRetryOptions extends CoreOptions {
    
    var delayStrategy: js.UndefOr[DelayStrategy] = js.native
    
    var fullResponse: js.UndefOr[Boolean] = js.native
    
    var maxAttempts: js.UndefOr[Double] = js.native
    
    var promiseFactory: js.UndefOr[js.Function1[/* resolver */ js.Any, _]] = js.native
    
    var retryDelay: js.UndefOr[Double] = js.native
    
    var retryStrategy: js.UndefOr[RetryStrategy] = js.native
  }
  object RequestRetryOptions {
    
    @scala.inline
    def apply(): RequestRetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestRetryOptions]
    }
    
    @scala.inline
    implicit class RequestRetryOptionsMutableBuilder[Self <: RequestRetryOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelayStrategy(value: (/* err */ Error, /* response */ IncomingMessage, /* body */ js.Any) => Double): Self = StObject.set(x, "delayStrategy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDelayStrategyUndefined: Self = StObject.set(x, "delayStrategy", js.undefined)
      
      @scala.inline
      def setFullResponse(value: Boolean): Self = StObject.set(x, "fullResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullResponseUndefined: Self = StObject.set(x, "fullResponse", js.undefined)
      
      @scala.inline
      def setMaxAttempts(value: Double): Self = StObject.set(x, "maxAttempts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAttemptsUndefined: Self = StObject.set(x, "maxAttempts", js.undefined)
      
      @scala.inline
      def setPromiseFactory(value: /* resolver */ js.Any => _): Self = StObject.set(x, "promiseFactory", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPromiseFactoryUndefined: Self = StObject.set(x, "promiseFactory", js.undefined)
      
      @scala.inline
      def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      @scala.inline
      def setRetryStrategy(value: (/* err */ Error, /* response */ IncomingMessage, /* body */ js.Any) => Boolean): Self = StObject.set(x, "retryStrategy", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRetryStrategyUndefined: Self = StObject.set(x, "retryStrategy", js.undefined)
    }
  }
  
  @js.native
  trait RetryRequestAPI extends RequestAPI[RequestPromise, RequestRetryOptions, RequiredUriUrl] {
    
    var RetryStrategies: HTTPOrNetworkError = js.native
  }
  
  type RetryStrategy = js.Function3[/* err */ Error, /* response */ IncomingMessage, /* body */ js.Any, Boolean]
  
  type _To = RetryRequestAPI
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: RetryRequestAPI = ^
}
