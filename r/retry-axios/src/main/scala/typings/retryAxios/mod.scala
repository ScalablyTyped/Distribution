package typings.retryAxios

import typings.axios.mod.AxiosError
import typings.axios.mod.AxiosInstance
import typings.axios.mod.AxiosRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("retry-axios", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def attach(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")().asInstanceOf[Double]
  @scala.inline
  def attach(instance: AxiosInstance): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("attach")(instance.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def detach(interceptorId: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detach")(interceptorId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def detach(interceptorId: Double, instance: AxiosInstance): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("detach")(interceptorId.asInstanceOf[js.Any], instance.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def getConfig(err: AxiosError[js.Any]): js.UndefOr[RetryConfig] = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(err.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[RetryConfig]]
  
  trait RaxConfig
    extends StObject
       with AxiosRequestConfig {
    
    var raxConfig: RetryConfig
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
      def setRaxConfig(value: RetryConfig): Self = StObject.set(x, "raxConfig", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetryConfig extends StObject {
    
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
      * When there is no response, the number of retries to attempt. Defaults to 2.
      */
    var noResponseRetries: js.UndefOr[Double] = js.undefined
    
    /**
      * Function to invoke when a retry attempt is made.
      */
    var onRetryAttempt: js.UndefOr[js.Function1[/* err */ AxiosError[js.Any], Unit]] = js.undefined
    
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
    var shouldRetry: js.UndefOr[js.Function1[/* err */ AxiosError[js.Any], Boolean]] = js.undefined
    
    /**
      * The HTTP response status codes that will automatically be retried.
      * Defaults to: [[100, 199], [429, 429], [500, 599]]
      */
    var statusCodesToRetry: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
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
      def setOnRetryAttempt(value: /* err */ AxiosError[js.Any] => Unit): Self = StObject.set(x, "onRetryAttempt", js.Any.fromFunction1(value))
      
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
      def setShouldRetry(value: /* err */ AxiosError[js.Any] => Boolean): Self = StObject.set(x, "shouldRetry", js.Any.fromFunction1(value))
      
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
