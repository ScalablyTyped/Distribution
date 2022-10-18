package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionUrlConfigCors extends StObject {
  
  var allowCredentials: js.UndefOr[Boolean] = js.undefined
  
  var allowedHeaders: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var allowedMethods: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var allowedOrigins: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var exposedResponseHeaders: js.UndefOr[Boolean | js.Array[String]] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
}
object FunctionUrlConfigCors {
  
  inline def apply(): FunctionUrlConfigCors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FunctionUrlConfigCors]
  }
  
  extension [Self <: FunctionUrlConfigCors](x: Self) {
    
    inline def setAllowCredentials(value: Boolean): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
    
    inline def setAllowedHeaders(value: Boolean | js.Array[String]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
    
    inline def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
    
    inline def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "allowedHeaders", js.Array(value*))
    
    inline def setAllowedMethods(value: Boolean | js.Array[String]): Self = StObject.set(x, "allowedMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedMethodsUndefined: Self = StObject.set(x, "allowedMethods", js.undefined)
    
    inline def setAllowedMethodsVarargs(value: String*): Self = StObject.set(x, "allowedMethods", js.Array(value*))
    
    inline def setAllowedOrigins(value: Boolean | js.Array[String]): Self = StObject.set(x, "allowedOrigins", value.asInstanceOf[js.Any])
    
    inline def setAllowedOriginsUndefined: Self = StObject.set(x, "allowedOrigins", js.undefined)
    
    inline def setAllowedOriginsVarargs(value: String*): Self = StObject.set(x, "allowedOrigins", js.Array(value*))
    
    inline def setExposedResponseHeaders(value: Boolean | js.Array[String]): Self = StObject.set(x, "exposedResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setExposedResponseHeadersUndefined: Self = StObject.set(x, "exposedResponseHeaders", js.undefined)
    
    inline def setExposedResponseHeadersVarargs(value: String*): Self = StObject.set(x, "exposedResponseHeaders", js.Array(value*))
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
  }
}
