package typings.retryAxios

import typings.axios.mod.AxiosAdapter
import typings.axios.mod.AxiosBasicCredentials
import typings.axios.mod.AxiosError
import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosPromise
import typings.axios.mod.AxiosProxyConfig
import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosTransformer
import typings.axios.mod.CancelToken
import typings.axios.mod.Method
import typings.axios.mod.ResponseType
import typings.retryAxios.retryAxiosBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("retry-axios", "attach")
  @js.native
  def attach(): Double = js.native
  @JSImport("retry-axios", "attach")
  @js.native
  def attach(instance: AxiosInstance): Double = js.native
  
  @JSImport("retry-axios", "detach")
  @js.native
  def detach(interceptorId: Double): Unit = js.native
  @JSImport("retry-axios", "detach")
  @js.native
  def detach(interceptorId: Double, instance: AxiosInstance): Unit = js.native
  
  @JSImport("retry-axios", "getConfig")
  @js.native
  def getConfig(err: AxiosError[_]): js.UndefOr[RetryConfig] = js.native
  
  /* Inlined {  raxConfig :retry-axios.retry-axios.RetryConfig} & axios.axios.AxiosRequestConfig */
  @js.native
  trait RaxConfig extends StObject {
    
    var adapter: js.UndefOr[AxiosAdapter] = js.native
    
    var auth: js.UndefOr[AxiosBasicCredentials] = js.native
    
    var baseURL: js.UndefOr[String] = js.native
    
    var cancelToken: js.UndefOr[CancelToken] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var decompress: js.UndefOr[Boolean] = js.native
    
    var headers: js.UndefOr[js.Any] = js.native
    
    var httpAgent: js.UndefOr[js.Any] = js.native
    
    var httpsAgent: js.UndefOr[js.Any] = js.native
    
    var maxBodyLength: js.UndefOr[Double] = js.native
    
    var maxContentLength: js.UndefOr[Double] = js.native
    
    var maxRedirects: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[Method] = js.native
    
    var onDownloadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
    
    var onUploadProgress: js.UndefOr[js.Function1[/* progressEvent */ js.Any, Unit]] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
    
    var paramsSerializer: js.UndefOr[js.Function1[/* params */ js.Any, String]] = js.native
    
    var proxy: js.UndefOr[AxiosProxyConfig | `false`] = js.native
    
    var raxConfig: RetryConfig = js.native
    
    var responseType: js.UndefOr[ResponseType] = js.native
    
    var socketPath: js.UndefOr[String | Null] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var timeoutErrorMessage: js.UndefOr[String] = js.native
    
    var transformRequest: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.native
    
    var transformResponse: js.UndefOr[AxiosTransformer | js.Array[AxiosTransformer]] = js.native
    
    var url: js.UndefOr[String] = js.native
    
    var validateStatus: js.UndefOr[(js.Function1[/* status */ Double, Boolean]) | Null] = js.native
    
    var withCredentials: js.UndefOr[Boolean] = js.native
    
    var xsrfCookieName: js.UndefOr[String] = js.native
    
    var xsrfHeaderName: js.UndefOr[String] = js.native
  }
  object RaxConfig {
    
    @scala.inline
    def apply(raxConfig: RetryConfig): RaxConfig = {
      val __obj = js.Dynamic.literal(raxConfig = raxConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[RaxConfig]
    }
    
    @scala.inline
    implicit class RaxConfigMutableBuilder[Self <: RaxConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: /* config */ AxiosRequestConfig => AxiosPromise[js.Any]): Self = StObject.set(x, "adapter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      @scala.inline
      def setAuth(value: AxiosBasicCredentials): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      @scala.inline
      def setCancelToken(value: CancelToken): Self = StObject.set(x, "cancelToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelTokenUndefined: Self = StObject.set(x, "cancelToken", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      @scala.inline
      def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHttpAgent(value: js.Any): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      @scala.inline
      def setHttpsAgent(value: js.Any): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      @scala.inline
      def setMaxBodyLength(value: Double): Self = StObject.set(x, "maxBodyLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxBodyLengthUndefined: Self = StObject.set(x, "maxBodyLength", js.undefined)
      
      @scala.inline
      def setMaxContentLength(value: Double): Self = StObject.set(x, "maxContentLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxContentLengthUndefined: Self = StObject.set(x, "maxContentLength", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setMethod(value: Method): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setOnDownloadProgress(value: /* progressEvent */ js.Any => Unit): Self = StObject.set(x, "onDownloadProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDownloadProgressUndefined: Self = StObject.set(x, "onDownloadProgress", js.undefined)
      
      @scala.inline
      def setOnUploadProgress(value: /* progressEvent */ js.Any => Unit): Self = StObject.set(x, "onUploadProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnUploadProgressUndefined: Self = StObject.set(x, "onUploadProgress", js.undefined)
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsSerializer(value: /* params */ js.Any => String): Self = StObject.set(x, "paramsSerializer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParamsSerializerUndefined: Self = StObject.set(x, "paramsSerializer", js.undefined)
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setProxy(value: AxiosProxyConfig | `false`): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setRaxConfig(value: RetryConfig): Self = StObject.set(x, "raxConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseType(value: ResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathNull: Self = StObject.set(x, "socketPath", null)
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutErrorMessage(value: String): Self = StObject.set(x, "timeoutErrorMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutErrorMessageUndefined: Self = StObject.set(x, "timeoutErrorMessage", js.undefined)
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setTransformRequest(value: AxiosTransformer | js.Array[AxiosTransformer]): Self = StObject.set(x, "transformRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformRequestFunction2(value: (/* data */ js.Any, /* headers */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "transformRequest", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformRequestUndefined: Self = StObject.set(x, "transformRequest", js.undefined)
      
      @scala.inline
      def setTransformRequestVarargs(value: AxiosTransformer*): Self = StObject.set(x, "transformRequest", js.Array(value :_*))
      
      @scala.inline
      def setTransformResponse(value: AxiosTransformer | js.Array[AxiosTransformer]): Self = StObject.set(x, "transformResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformResponseFunction2(value: (/* data */ js.Any, /* headers */ js.UndefOr[js.Any]) => js.Any): Self = StObject.set(x, "transformResponse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTransformResponseUndefined: Self = StObject.set(x, "transformResponse", js.undefined)
      
      @scala.inline
      def setTransformResponseVarargs(value: AxiosTransformer*): Self = StObject.set(x, "transformResponse", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setValidateStatus(value: /* status */ Double => Boolean): Self = StObject.set(x, "validateStatus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidateStatusNull: Self = StObject.set(x, "validateStatus", null)
      
      @scala.inline
      def setValidateStatusUndefined: Self = StObject.set(x, "validateStatus", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
      
      @scala.inline
      def setXsrfCookieName(value: String): Self = StObject.set(x, "xsrfCookieName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsrfCookieNameUndefined: Self = StObject.set(x, "xsrfCookieName", js.undefined)
      
      @scala.inline
      def setXsrfHeaderName(value: String): Self = StObject.set(x, "xsrfHeaderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXsrfHeaderNameUndefined: Self = StObject.set(x, "xsrfHeaderName", js.undefined)
    }
  }
  
  @js.native
  trait RetryConfig extends StObject {
    
    /**
      * The number of retries already attempted.
      */
    var currentRetryAttempt: js.UndefOr[Double] = js.native
    
    /**
      * The HTTP Methods that will be automatically retried.
      * Defaults to ['GET','PUT','HEAD','OPTIONS','DELETE']
      */
    var httpMethodsToRetry: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The instance of the axios object to which the interceptor is attached.
      */
    var instance: js.UndefOr[AxiosInstance] = js.native
    
    /**
      * When there is no response, the number of retries to attempt. Defaults to 2.
      */
    var noResponseRetries: js.UndefOr[Double] = js.native
    
    /**
      * Function to invoke when a retry attempt is made.
      */
    var onRetryAttempt: js.UndefOr[js.Function1[/* err */ AxiosError[_], Unit]] = js.native
    
    /**
      * The number of times to retry the request.  Defaults to 3.
      */
    var retry: js.UndefOr[Double] = js.native
    
    /**
      * The amount of time to initially delay the retry.  Defaults to 100.
      */
    var retryDelay: js.UndefOr[Double] = js.native
    
    /**
      * Function to invoke which determines if you should retry
      */
    var shouldRetry: js.UndefOr[js.Function1[/* err */ AxiosError[_], Boolean]] = js.native
    
    /**
      * The HTTP response status codes that will automatically be retried.
      * Defaults to: [[100, 199], [429, 429], [500, 599]]
      */
    var statusCodesToRetry: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  }
  object RetryConfig {
    
    @scala.inline
    def apply(): RetryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryConfig]
    }
    
    @scala.inline
    implicit class RetryConfigMutableBuilder[Self <: RetryConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentRetryAttempt(value: Double): Self = StObject.set(x, "currentRetryAttempt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentRetryAttemptUndefined: Self = StObject.set(x, "currentRetryAttempt", js.undefined)
      
      @scala.inline
      def setHttpMethodsToRetry(value: js.Array[String]): Self = StObject.set(x, "httpMethodsToRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodsToRetryUndefined: Self = StObject.set(x, "httpMethodsToRetry", js.undefined)
      
      @scala.inline
      def setHttpMethodsToRetryVarargs(value: String*): Self = StObject.set(x, "httpMethodsToRetry", js.Array(value :_*))
      
      @scala.inline
      def setInstance(value: AxiosInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      @scala.inline
      def setNoResponseRetries(value: Double): Self = StObject.set(x, "noResponseRetries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoResponseRetriesUndefined: Self = StObject.set(x, "noResponseRetries", js.undefined)
      
      @scala.inline
      def setOnRetryAttempt(value: /* err */ AxiosError[_] => Unit): Self = StObject.set(x, "onRetryAttempt", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRetryAttemptUndefined: Self = StObject.set(x, "onRetryAttempt", js.undefined)
      
      @scala.inline
      def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setShouldRetry(value: /* err */ AxiosError[_] => Boolean): Self = StObject.set(x, "shouldRetry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldRetryUndefined: Self = StObject.set(x, "shouldRetry", js.undefined)
      
      @scala.inline
      def setStatusCodesToRetry(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "statusCodesToRetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusCodesToRetryUndefined: Self = StObject.set(x, "statusCodesToRetry", js.undefined)
      
      @scala.inline
      def setStatusCodesToRetryVarargs(value: js.Array[Double]*): Self = StObject.set(x, "statusCodesToRetry", js.Array(value :_*))
    }
  }
}
