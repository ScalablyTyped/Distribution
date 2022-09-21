package typings.retryAxios

import typings.axios.mod.AxiosError
import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosRequestConfig
import typings.retryAxios.retryAxiosStrings.exponential
import typings.retryAxios.retryAxiosStrings.linear
import typings.retryAxios.retryAxiosStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("retry-axios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attach(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")().asInstanceOf[Double]
  inline def attach(instance: AxiosInstance): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(instance.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def detach(interceptorId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(interceptorId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def detach(interceptorId: Double, instance: AxiosInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(interceptorId.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getConfig(err: AxiosError[Any, Any]): js.UndefOr[RetryConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(err.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RetryConfig]]
  
  inline def shouldRetryRequest(err: AxiosError[Any, Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldRetryRequest")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait RaxConfig
    extends StObject
       with AxiosRequestConfig[Any] {
    
    var raxConfig: RetryConfig
  }
  object RaxConfig {
    
    inline def apply(raxConfig: RetryConfig): RaxConfig = {
      val __obj = js.Dynamic.literal(raxConfig = raxConfig.asInstanceOf[js.Any])
      __obj.asInstanceOf[RaxConfig]
    }
    
    extension [Self <: RaxConfig](x: Self) {
      
      inline def setRaxConfig(value: RetryConfig): Self = StObject.set(x, "raxConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetryConfig extends StObject {
    
    /**
      * Backoff Type; 'linear', 'static' or 'exponential'.
      */
    var backoffType: js.UndefOr[linear | static | exponential] = js.undefined
    
    /**
      * Whether to check for 'Retry-After' header in response and use value as delay. Defaults to true.
      */
    var checkRetryAfter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of retries already attempted.
      */
    var currentRetryAttempt: js.UndefOr[Double] = js.undefined
    
    /**
      * The HTTP Methods that will be automatically retried.
      * Defaults to ['GET','PUT','HEAD','OPTIONS','DELETE']
      */
    var httpMethodsToRetry: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The instance of the axios object to which the interceptor is attached.
      */
    var instance: js.UndefOr[AxiosInstance] = js.undefined
    
    /**
      * Max permitted Retry-After value (in ms) - rejects if greater. Defaults to 5 mins.
      */
    var maxRetryAfter: js.UndefOr[Double] = js.undefined
    
    /**
      * Ceiling for calculated delay (in ms) - delay will not exceed this value.
      */
    var maxRetryDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * When there is no response, the number of retries to attempt. Defaults to 2.
      */
    var noResponseRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * Function to invoke when a retry attempt is made.
      */
    var onRetryAttempt: js.UndefOr[js.Function1[/* err */ AxiosError[Any, Any], Unit]] = js.undefined
    
    /**
      * The number of times to retry the request.  Defaults to 3.
      */
    var retry: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time to initially delay the retry.  Defaults to 100.
      */
    var retryDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Function to invoke which determines if you should retry
      */
    var shouldRetry: js.UndefOr[js.Function1[/* err */ AxiosError[Any, Any], Boolean]] = js.undefined
    
    /**
      * The HTTP response status codes that will automatically be retried.
      * Defaults to: [[100, 199], [429, 429], [500, 599]]
      */
    var statusCodesToRetry: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  }
  object RetryConfig {
    
    inline def apply(): RetryConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RetryConfig]
    }
    
    extension [Self <: RetryConfig](x: Self) {
      
      inline def setBackoffType(value: linear | static | exponential): Self = StObject.set(x, "backoffType", value.asInstanceOf[js.Any])
      
      inline def setBackoffTypeUndefined: Self = StObject.set(x, "backoffType", js.undefined)
      
      inline def setCheckRetryAfter(value: Boolean): Self = StObject.set(x, "checkRetryAfter", value.asInstanceOf[js.Any])
      
      inline def setCheckRetryAfterUndefined: Self = StObject.set(x, "checkRetryAfter", js.undefined)
      
      inline def setCurrentRetryAttempt(value: Double): Self = StObject.set(x, "currentRetryAttempt", value.asInstanceOf[js.Any])
      
      inline def setCurrentRetryAttemptUndefined: Self = StObject.set(x, "currentRetryAttempt", js.undefined)
      
      inline def setHttpMethodsToRetry(value: js.Array[String]): Self = StObject.set(x, "httpMethodsToRetry", value.asInstanceOf[js.Any])
      
      inline def setHttpMethodsToRetryUndefined: Self = StObject.set(x, "httpMethodsToRetry", js.undefined)
      
      inline def setHttpMethodsToRetryVarargs(value: String*): Self = StObject.set(x, "httpMethodsToRetry", js.Array(value*))
      
      inline def setInstance(value: AxiosInstance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInstanceUndefined: Self = StObject.set(x, "instance", js.undefined)
      
      inline def setMaxRetryAfter(value: Double): Self = StObject.set(x, "maxRetryAfter", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryAfterUndefined: Self = StObject.set(x, "maxRetryAfter", js.undefined)
      
      inline def setMaxRetryDelay(value: Double): Self = StObject.set(x, "maxRetryDelay", value.asInstanceOf[js.Any])
      
      inline def setMaxRetryDelayUndefined: Self = StObject.set(x, "maxRetryDelay", js.undefined)
      
      inline def setNoResponseRetries(value: Double): Self = StObject.set(x, "noResponseRetries", value.asInstanceOf[js.Any])
      
      inline def setNoResponseRetriesUndefined: Self = StObject.set(x, "noResponseRetries", js.undefined)
      
      inline def setOnRetryAttempt(value: /* err */ AxiosError[Any, Any] => Unit): Self = StObject.set(x, "onRetryAttempt", js.Any.fromFunction1(value))
      
      inline def setOnRetryAttemptUndefined: Self = StObject.set(x, "onRetryAttempt", js.undefined)
      
      inline def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryDelay(value: Double): Self = StObject.set(x, "retryDelay", value.asInstanceOf[js.Any])
      
      inline def setRetryDelayUndefined: Self = StObject.set(x, "retryDelay", js.undefined)
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setShouldRetry(value: /* err */ AxiosError[Any, Any] => Boolean): Self = StObject.set(x, "shouldRetry", js.Any.fromFunction1(value))
      
      inline def setShouldRetryUndefined: Self = StObject.set(x, "shouldRetry", js.undefined)
      
      inline def setStatusCodesToRetry(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "statusCodesToRetry", value.asInstanceOf[js.Any])
      
      inline def setStatusCodesToRetryUndefined: Self = StObject.set(x, "statusCodesToRetry", js.undefined)
      
      inline def setStatusCodesToRetryVarargs(value: js.Array[Double]*): Self = StObject.set(x, "statusCodesToRetry", js.Array(value*))
    }
  }
  
  /* augmented module */
  object axiosAugmentingMod {
    
    trait AxiosRequestConfig extends StObject {
      
      var raxConfig: js.UndefOr[RetryConfig] = js.undefined
    }
    object AxiosRequestConfig {
      
      inline def apply(): typings.retryAxios.mod.axiosAugmentingMod.AxiosRequestConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[typings.retryAxios.mod.axiosAugmentingMod.AxiosRequestConfig]
      }
      
      extension [Self <: typings.retryAxios.mod.axiosAugmentingMod.AxiosRequestConfig](x: Self) {
        
        inline def setRaxConfig(value: RetryConfig): Self = StObject.set(x, "raxConfig", value.asInstanceOf[js.Any])
        
        inline def setRaxConfigUndefined: Self = StObject.set(x, "raxConfig", js.undefined)
      }
    }
  }
}
