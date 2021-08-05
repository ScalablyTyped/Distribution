package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketCorsRule extends StObject {
  
  /**
    * Specifies which headers are allowed.
    */
  var allowedHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
    */
  var allowedMethods: js.Array[String]
  
  /**
    * Specifies which origins are allowed.
    */
  var allowedOrigins: js.Array[String]
  
  /**
    * Specifies expose header in the response.
    */
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Specifies time in seconds that browser can cache the response for a preflight request.
    */
  var maxAgeSeconds: js.UndefOr[Double] = js.undefined
}
object BucketCorsRule {
  
  inline def apply(allowedMethods: js.Array[String], allowedOrigins: js.Array[String]): BucketCorsRule = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], allowedOrigins = allowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCorsRule]
  }
  
  extension [Self <: BucketCorsRule](x: Self) {
    
    inline def setAllowedHeaders(value: js.Array[String]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
    
    inline def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
    
    inline def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "allowedHeaders", js.Array(value :_*))
    
    inline def setAllowedMethods(value: js.Array[String]): Self = StObject.set(x, "allowedMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedMethodsVarargs(value: String*): Self = StObject.set(x, "allowedMethods", js.Array(value :_*))
    
    inline def setAllowedOrigins(value: js.Array[String]): Self = StObject.set(x, "allowedOrigins", value.asInstanceOf[js.Any])
    
    inline def setAllowedOriginsVarargs(value: String*): Self = StObject.set(x, "allowedOrigins", js.Array(value :_*))
    
    inline def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
    
    inline def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
    
    inline def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value :_*))
    
    inline def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
  }
}
