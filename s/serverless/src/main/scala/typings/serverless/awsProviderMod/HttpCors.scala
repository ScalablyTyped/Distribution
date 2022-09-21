package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpCors extends StObject {
  
  var allowCredentials: js.UndefOr[Boolean] = js.undefined
  
  var cacheControl: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
  
  var origins: js.UndefOr[String | js.Array[String]] = js.undefined
}
object HttpCors {
  
  inline def apply(): HttpCors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpCors]
  }
  
  extension [Self <: HttpCors](x: Self) {
    
    inline def setAllowCredentials(value: Boolean): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
    
    inline def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
    
    inline def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    inline def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    inline def setHeaders(value: String | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setOrigins(value: String | js.Array[String]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
    
    inline def setOriginsVarargs(value: String*): Self = StObject.set(x, "origins", js.Array(value*))
  }
}
