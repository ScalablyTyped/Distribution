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
  
  @scala.inline
  def apply(requestOpts: typings.request.mod.Options): Abort = ^.asInstanceOf[js.Dynamic].apply(requestOpts.asInstanceOf[js.Any]).asInstanceOf[Abort]
  @scala.inline
  def apply(requestOpts: typings.request.mod.Options, callback: RequestCallback): Abort = (^.asInstanceOf[js.Dynamic].apply(requestOpts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Abort]
  @scala.inline
  def apply(requestOpts: typings.request.mod.Options, opts: Options): Abort = (^.asInstanceOf[js.Dynamic].apply(requestOpts.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Abort]
  @scala.inline
  def apply(requestOpts: typings.request.mod.Options, opts: Options, callback: RequestCallback): Abort = (^.asInstanceOf[js.Dynamic].apply(requestOpts.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Abort]
  
  @JSImport("retry-request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getNextRetryDelay(retryNumber: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getNextRetryDelay")(retryNumber.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    var currentRetryAttempt: js.UndefOr[Double] = js.undefined
    
    var noResponseRetries: js.UndefOr[Double] = js.undefined
    
    var objectMode: js.UndefOr[Boolean] = js.undefined
    
    var request: js.UndefOr[RequestAPI[Request, CoreOptions, RequiredUriUrl]] = js.undefined
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var shouldRetryFn: js.UndefOr[js.Function1[/* response */ RequestResponse, Boolean]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentRetryAttempt(value: Double): Self = StObject.set(x, "currentRetryAttempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentRetryAttemptUndefined: Self = StObject.set(x, "currentRetryAttempt", js.undefined)
      
      @scala.inline
      def setNoResponseRetries(value: Double): Self = StObject.set(x, "noResponseRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResponseRetriesUndefined: Self = StObject.set(x, "noResponseRetries", js.undefined)
      
      @scala.inline
      def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
      
      @scala.inline
      def setRequest(value: RequestAPI[Request, CoreOptions, RequiredUriUrl]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setShouldRetryFn(value: /* response */ RequestResponse => Boolean): Self = StObject.set(x, "shouldRetryFn", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldRetryFnUndefined: Self = StObject.set(x, "shouldRetryFn", js.undefined)
    }
  }
}
