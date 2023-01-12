package typings.serverlessTencentScf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object handlerMod {
  
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[js.Error | String | Null], 
    /* result */ js.UndefOr[TResult], 
    Unit
  ]
  
  trait Context extends StObject {
    
    var callbackWaitsForEmptyEventLoop: Boolean
    
    var environ: String
    
    var environment: String
    
    var function_name: String
    
    var function_version: String
    
    def getRemainingTimeInMillis(): Double
    
    var memory_limit_in_mb: Double
    
    var namespace: String
    
    var request_id: String
    
    var tencentcloud_appid: String
    
    var tencentcloud_region: String
    
    var tencentcloud_uin: String
    
    var time_limit_in_ms: Double
  }
  object Context {
    
    inline def apply(
      callbackWaitsForEmptyEventLoop: Boolean,
      environ: String,
      environment: String,
      function_name: String,
      function_version: String,
      getRemainingTimeInMillis: () => Double,
      memory_limit_in_mb: Double,
      namespace: String,
      request_id: String,
      tencentcloud_appid: String,
      tencentcloud_region: String,
      tencentcloud_uin: String,
      time_limit_in_ms: Double
    ): Context = {
      val __obj = js.Dynamic.literal(callbackWaitsForEmptyEventLoop = callbackWaitsForEmptyEventLoop.asInstanceOf[js.Any], environ = environ.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], function_name = function_name.asInstanceOf[js.Any], function_version = function_version.asInstanceOf[js.Any], getRemainingTimeInMillis = js.Any.fromFunction0(getRemainingTimeInMillis), memory_limit_in_mb = memory_limit_in_mb.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], request_id = request_id.asInstanceOf[js.Any], tencentcloud_appid = tencentcloud_appid.asInstanceOf[js.Any], tencentcloud_region = tencentcloud_region.asInstanceOf[js.Any], tencentcloud_uin = tencentcloud_uin.asInstanceOf[js.Any], time_limit_in_ms = time_limit_in_ms.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setCallbackWaitsForEmptyEventLoop(value: Boolean): Self = StObject.set(x, "callbackWaitsForEmptyEventLoop", value.asInstanceOf[js.Any])
      
      inline def setEnviron(value: String): Self = StObject.set(x, "environ", value.asInstanceOf[js.Any])
      
      inline def setEnvironment(value: String): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      inline def setFunction_name(value: String): Self = StObject.set(x, "function_name", value.asInstanceOf[js.Any])
      
      inline def setFunction_version(value: String): Self = StObject.set(x, "function_version", value.asInstanceOf[js.Any])
      
      inline def setGetRemainingTimeInMillis(value: () => Double): Self = StObject.set(x, "getRemainingTimeInMillis", js.Any.fromFunction0(value))
      
      inline def setMemory_limit_in_mb(value: Double): Self = StObject.set(x, "memory_limit_in_mb", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setRequest_id(value: String): Self = StObject.set(x, "request_id", value.asInstanceOf[js.Any])
      
      inline def setTencentcloud_appid(value: String): Self = StObject.set(x, "tencentcloud_appid", value.asInstanceOf[js.Any])
      
      inline def setTencentcloud_region(value: String): Self = StObject.set(x, "tencentcloud_region", value.asInstanceOf[js.Any])
      
      inline def setTencentcloud_uin(value: String): Self = StObject.set(x, "tencentcloud_uin", value.asInstanceOf[js.Any])
      
      inline def setTime_limit_in_ms(value: Double): Self = StObject.set(x, "time_limit_in_ms", value.asInstanceOf[js.Any])
    }
  }
  
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ Context, 
    /* callback */ Callback[TResult], 
    Unit | js.Promise[TResult]
  ]
}
