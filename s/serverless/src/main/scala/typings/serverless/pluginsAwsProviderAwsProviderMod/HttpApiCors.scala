package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpApiCors extends StObject {
  
  var allowCredentials: js.UndefOr[Boolean] = js.undefined
  
  var allowedHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var allowedMethods: js.UndefOr[js.Array[String]] = js.undefined
  
  var allowedOrigins: js.Array[String]
  
  var exposedResponseHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
}
object HttpApiCors {
  
  inline def apply(allowedOrigins: js.Array[String]): HttpApiCors = {
    val __obj = js.Dynamic.literal(allowedOrigins = allowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpApiCors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HttpApiCors] (val x: Self) extends AnyVal {
    
    inline def setAllowCredentials(value: Boolean): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
    
    inline def setAllowedHeaders(value: js.Array[String]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
    
    inline def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
    
    inline def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "allowedHeaders", js.Array(value*))
    
    inline def setAllowedMethods(value: js.Array[String]): Self = StObject.set(x, "allowedMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedMethodsUndefined: Self = StObject.set(x, "allowedMethods", js.undefined)
    
    inline def setAllowedMethodsVarargs(value: String*): Self = StObject.set(x, "allowedMethods", js.Array(value*))
    
    inline def setAllowedOrigins(value: js.Array[String]): Self = StObject.set(x, "allowedOrigins", value.asInstanceOf[js.Any])
    
    inline def setAllowedOriginsVarargs(value: String*): Self = StObject.set(x, "allowedOrigins", js.Array(value*))
    
    inline def setExposedResponseHeaders(value: js.Array[String]): Self = StObject.set(x, "exposedResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setExposedResponseHeadersUndefined: Self = StObject.set(x, "exposedResponseHeaders", js.undefined)
    
    inline def setExposedResponseHeadersVarargs(value: String*): Self = StObject.set(x, "exposedResponseHeaders", js.Array(value*))
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
  }
}
