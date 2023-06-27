package typings.smithyTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRetryMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.smithyTypes.smithyTypesStrings.DEFAULT
    - typings.smithyTypes.smithyTypesStrings.NONE
    - typings.smithyTypes.smithyTypesStrings.FULL
    - typings.smithyTypes.smithyTypesStrings.DECORRELATED
  */
  trait ExponentialBackoffJitterType extends StObject
  object ExponentialBackoffJitterType {
    
    inline def DECORRELATED: typings.smithyTypes.smithyTypesStrings.DECORRELATED = "DECORRELATED".asInstanceOf[typings.smithyTypes.smithyTypesStrings.DECORRELATED]
    
    inline def DEFAULT: typings.smithyTypes.smithyTypesStrings.DEFAULT = "DEFAULT".asInstanceOf[typings.smithyTypes.smithyTypesStrings.DEFAULT]
    
    inline def FULL: typings.smithyTypes.smithyTypesStrings.FULL = "FULL".asInstanceOf[typings.smithyTypes.smithyTypesStrings.FULL]
    
    inline def NONE: typings.smithyTypes.smithyTypesStrings.NONE = "NONE".asInstanceOf[typings.smithyTypes.smithyTypesStrings.NONE]
  }
  
  trait ExponentialBackoffStrategyOptions extends StObject {
    
    var backoffScaleValue: js.UndefOr[Double] = js.undefined
    
    var jitterType: ExponentialBackoffJitterType
  }
  object ExponentialBackoffStrategyOptions {
    
    inline def apply(jitterType: ExponentialBackoffJitterType): ExponentialBackoffStrategyOptions = {
      val __obj = js.Dynamic.literal(jitterType = jitterType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExponentialBackoffStrategyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExponentialBackoffStrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setBackoffScaleValue(value: Double): Self = StObject.set(x, "backoffScaleValue", value.asInstanceOf[js.Any])
      
      inline def setBackoffScaleValueUndefined: Self = StObject.set(x, "backoffScaleValue", js.undefined)
      
      inline def setJitterType(value: ExponentialBackoffJitterType): Self = StObject.set(x, "jitterType", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetryBackoffStrategy extends StObject {
    
    /**
      * @returns the number of milliseconds to wait before retrying an action.
      */
    def computeNextBackoffDelay(retryAttempt: Double): Double
  }
  object RetryBackoffStrategy {
    
    inline def apply(computeNextBackoffDelay: Double => Double): RetryBackoffStrategy = {
      val __obj = js.Dynamic.literal(computeNextBackoffDelay = js.Any.fromFunction1(computeNextBackoffDelay))
      __obj.asInstanceOf[RetryBackoffStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryBackoffStrategy] (val x: Self) extends AnyVal {
      
      inline def setComputeNextBackoffDelay(value: Double => Double): Self = StObject.set(x, "computeNextBackoffDelay", js.Any.fromFunction1(value))
    }
  }
  
  trait RetryErrorInfo extends StObject {
    
    var errorType: RetryErrorType
    
    /**
      * Protocol hint. This could come from Http's 'retry-after' header or
      * something from MQTT or any other protocol that has the ability to convey
      * retry info from a peer.
      *
      * @returns the Date after which a retry should be attempted.
      */
    var retryAfterHint: js.UndefOr[js.Date] = js.undefined
  }
  object RetryErrorInfo {
    
    inline def apply(errorType: RetryErrorType): RetryErrorInfo = {
      val __obj = js.Dynamic.literal(errorType = errorType.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryErrorInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryErrorInfo] (val x: Self) extends AnyVal {
      
      inline def setErrorType(value: RetryErrorType): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
      
      inline def setRetryAfterHint(value: js.Date): Self = StObject.set(x, "retryAfterHint", value.asInstanceOf[js.Any])
      
      inline def setRetryAfterHintUndefined: Self = StObject.set(x, "retryAfterHint", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.smithyTypes.smithyTypesStrings.TRANSIENT
    - typings.smithyTypes.smithyTypesStrings.THROTTLING
    - typings.smithyTypes.smithyTypesStrings.SERVER_ERROR
    - typings.smithyTypes.smithyTypesStrings.CLIENT_ERROR
  */
  trait RetryErrorType extends StObject
  object RetryErrorType {
    
    inline def CLIENT_ERROR: typings.smithyTypes.smithyTypesStrings.CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[typings.smithyTypes.smithyTypesStrings.CLIENT_ERROR]
    
    inline def SERVER_ERROR: typings.smithyTypes.smithyTypesStrings.SERVER_ERROR = "SERVER_ERROR".asInstanceOf[typings.smithyTypes.smithyTypesStrings.SERVER_ERROR]
    
    inline def THROTTLING: typings.smithyTypes.smithyTypesStrings.THROTTLING = "THROTTLING".asInstanceOf[typings.smithyTypes.smithyTypesStrings.THROTTLING]
    
    inline def TRANSIENT: typings.smithyTypes.smithyTypesStrings.TRANSIENT = "TRANSIENT".asInstanceOf[typings.smithyTypes.smithyTypesStrings.TRANSIENT]
  }
  
  trait RetryStrategyOptions extends StObject {
    
    var backoffStrategy: RetryBackoffStrategy
    
    var maxRetriesBase: Double
  }
  object RetryStrategyOptions {
    
    inline def apply(backoffStrategy: RetryBackoffStrategy, maxRetriesBase: Double): RetryStrategyOptions = {
      val __obj = js.Dynamic.literal(backoffStrategy = backoffStrategy.asInstanceOf[js.Any], maxRetriesBase = maxRetriesBase.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetryStrategyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryStrategyOptions] (val x: Self) extends AnyVal {
      
      inline def setBackoffStrategy(value: RetryBackoffStrategy): Self = StObject.set(x, "backoffStrategy", value.asInstanceOf[js.Any])
      
      inline def setMaxRetriesBase(value: Double): Self = StObject.set(x, "maxRetriesBase", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetryStrategyV2 extends StObject {
    
    /**
      * Called before any retries (for the first call to the operation). It either
      * returns a retry token or an error upon the failure to acquire a token prior.
      *
      * tokenScope is arbitrary and out of scope for this component. However,
      * adding it here offers us a lot of future flexibility for outage detection.
      * For example, it could be "us-east-1" on a shared retry strategy, or
      * "us-west-2-c:dynamodb".
      */
    def acquireInitialRetryToken(retryTokenScope: String): js.Promise[RetryToken]
    
    /**
      * Upon successful completion of the operation, this function is called
      * to record that the operation was successful.
      */
    def recordSuccess(token: RetryToken): Unit
    
    /**
      * After a failed operation call, this function is invoked to refresh the
      * retryToken returned by acquireInitialRetryToken(). This function can
      * either choose to allow another retry and send a new or updated token,
      * or reject the retry attempt and report the error either in an exception
      * or returning an error.
      */
    def refreshRetryTokenForRetry(tokenToRenew: RetryToken, errorInfo: RetryErrorInfo): js.Promise[RetryToken]
  }
  object RetryStrategyV2 {
    
    inline def apply(
      acquireInitialRetryToken: String => js.Promise[RetryToken],
      recordSuccess: RetryToken => Unit,
      refreshRetryTokenForRetry: (RetryToken, RetryErrorInfo) => js.Promise[RetryToken]
    ): RetryStrategyV2 = {
      val __obj = js.Dynamic.literal(acquireInitialRetryToken = js.Any.fromFunction1(acquireInitialRetryToken), recordSuccess = js.Any.fromFunction1(recordSuccess), refreshRetryTokenForRetry = js.Any.fromFunction2(refreshRetryTokenForRetry))
      __obj.asInstanceOf[RetryStrategyV2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryStrategyV2] (val x: Self) extends AnyVal {
      
      inline def setAcquireInitialRetryToken(value: String => js.Promise[RetryToken]): Self = StObject.set(x, "acquireInitialRetryToken", js.Any.fromFunction1(value))
      
      inline def setRecordSuccess(value: RetryToken => Unit): Self = StObject.set(x, "recordSuccess", js.Any.fromFunction1(value))
      
      inline def setRefreshRetryTokenForRetry(value: (RetryToken, RetryErrorInfo) => js.Promise[RetryToken]): Self = StObject.set(x, "refreshRetryTokenForRetry", js.Any.fromFunction2(value))
    }
  }
  
  trait RetryToken extends StObject {
    
    /**
      * @returns the current count of retry.
      */
    def getRetryCount(): Double
    
    /**
      * @returns the number of milliseconds to wait before retrying an action.
      */
    def getRetryDelay(): Double
  }
  object RetryToken {
    
    inline def apply(getRetryCount: () => Double, getRetryDelay: () => Double): RetryToken = {
      val __obj = js.Dynamic.literal(getRetryCount = js.Any.fromFunction0(getRetryCount), getRetryDelay = js.Any.fromFunction0(getRetryDelay))
      __obj.asInstanceOf[RetryToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetryToken] (val x: Self) extends AnyVal {
      
      inline def setGetRetryCount(value: () => Double): Self = StObject.set(x, "getRetryCount", js.Any.fromFunction0(value))
      
      inline def setGetRetryDelay(value: () => Double): Self = StObject.set(x, "getRetryDelay", js.Any.fromFunction0(value))
    }
  }
  
  trait StandardRetryBackoffStrategy
    extends StObject
       with RetryBackoffStrategy {
    
    /**
      * Sets the delayBase used to compute backoff delays.
      * @param delayBase -
      */
    def setDelayBase(delayBase: Double): Unit
  }
  object StandardRetryBackoffStrategy {
    
    inline def apply(computeNextBackoffDelay: Double => Double, setDelayBase: Double => Unit): StandardRetryBackoffStrategy = {
      val __obj = js.Dynamic.literal(computeNextBackoffDelay = js.Any.fromFunction1(computeNextBackoffDelay), setDelayBase = js.Any.fromFunction1(setDelayBase))
      __obj.asInstanceOf[StandardRetryBackoffStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StandardRetryBackoffStrategy] (val x: Self) extends AnyVal {
      
      inline def setSetDelayBase(value: Double => Unit): Self = StObject.set(x, "setDelayBase", js.Any.fromFunction1(value))
    }
  }
  
  trait StandardRetryToken
    extends StObject
       with RetryToken {
    
    /**
      * @returns the cost of the last retry attempt.
      */
    def getRetryCost(): js.UndefOr[Double]
  }
  object StandardRetryToken {
    
    inline def apply(getRetryCost: () => js.UndefOr[Double], getRetryCount: () => Double, getRetryDelay: () => Double): StandardRetryToken = {
      val __obj = js.Dynamic.literal(getRetryCost = js.Any.fromFunction0(getRetryCost), getRetryCount = js.Any.fromFunction0(getRetryCount), getRetryDelay = js.Any.fromFunction0(getRetryDelay))
      __obj.asInstanceOf[StandardRetryToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StandardRetryToken] (val x: Self) extends AnyVal {
      
      inline def setGetRetryCost(value: () => js.UndefOr[Double]): Self = StObject.set(x, "getRetryCost", js.Any.fromFunction0(value))
    }
  }
}
