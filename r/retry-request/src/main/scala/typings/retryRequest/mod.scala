package typings.retryRequest

import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequestCallback
import typings.request.mod.RequestResponse
import typings.request.mod.RequiredUriUrl
import typings.retryRequest.anon.Abort
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(requestOpts: typings.request.mod.Options): Abort = ^.asInstanceOf[js.Dynamic].apply(requestOpts.asInstanceOf[js.Any]).asInstanceOf[Abort]
  inline def apply(requestOpts: typings.request.mod.Options, callback: RequestCallback): Abort = (^.asInstanceOf[js.Dynamic].apply(requestOpts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Abort]
  inline def apply(requestOpts: typings.request.mod.Options, opts: Options): Abort = (^.asInstanceOf[js.Dynamic].apply(requestOpts.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Abort]
  inline def apply(requestOpts: typings.request.mod.Options, opts: Options, callback: RequestCallback): Abort = (^.asInstanceOf[js.Dynamic].apply(requestOpts.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Abort]
  
  @JSImport("retry-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNextRetryDelay(retryNumber: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextRetryDelay")(retryNumber.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var currentRetryAttempt: js.UndefOr[Double] = js.undefined
    
    var maxRetryDelay: js.UndefOr[Double] = js.undefined
    
    var noResponseRetries: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var request: js.UndefOr[RequestAPI[Request, CoreOptions, RequiredUriUrl]] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var retryDelayMultiplier: js.UndefOr[Double] = js.undefined
    
    var shouldRetryFn: js.UndefOr[js.Function1[/* response */ RequestResponse, Boolean]] = js.undefined
    
    var totalTimeout: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCurrentRetryAttempt(value: Double): Self = StObject.set(x, "currentRetryAttempt", value.asInstanceOf[js.Any])
      
      inline def setCurrentRetryAttemptUndefined: Self = StObject.set(x, "currentRetryAttempt", js.undefined)
      
      inline def setMaxRetryDelay(value: Double): Self = StObject.set(x, "maxRetryDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryDelayUndefined: Self = StObject.set(x, "maxRetryDelay", js.undefined)
      
      inline def setNoResponseRetries(value: Double): Self = StObject.set(x, "noResponseRetries", value.asInstanceOf[js.Any])
      
      inline def setNoResponseRetriesUndefined: Self = StObject.set(x, "noResponseRetries", js.undefined)
      
      inline def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      inline def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      inline def setRequest(value: RequestAPI[Request, CoreOptions, RequiredUriUrl]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      inline def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      inline def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      inline def setRetryDelayMultiplier(value: Double): Self = StObject.set(x, "retryDelayMultiplier", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayMultiplierUndefined: Self = StObject.set(x, "retryDelayMultiplier", js.undefined)
      
      inline def setShouldRetryFn(value: /* response */ RequestResponse => Boolean): Self = StObject.set(x, "shouldRetryFn", js.Any.fromFunction1(value))
      
      inline def setShouldRetryFnUndefined: Self = StObject.set(x, "shouldRetryFn", js.undefined)
      
      inline def setTotalTimeout(value: Double): Self = StObject.set(x, "totalTimeout", value.asInstanceOf[js.Any])
      
      inline def setTotalTimeoutUndefined: Self = StObject.set(x, "totalTimeout", js.undefined)
    }
  }
}
