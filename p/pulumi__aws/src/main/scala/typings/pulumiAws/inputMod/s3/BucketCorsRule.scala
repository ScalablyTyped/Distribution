package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketCorsRule extends StObject {
  
  /**
    * Specifies which headers are allowed.
    */
  var allowedHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
    */
  var allowedMethods: Input[js.Array[Input[String]]]
  
  /**
    * Specifies which origins are allowed.
    */
  var allowedOrigins: Input[js.Array[Input[String]]]
  
  /**
    * Specifies expose header in the response.
    */
  var exposeHeaders: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  
  /**
    * Specifies time in seconds that browser can cache the response for a preflight request.
    */
  var maxAgeSeconds: js.UndefOr[Input[Double]] = js.undefined
}
object BucketCorsRule {
  
  inline def apply(allowedMethods: Input[js.Array[Input[String]]], allowedOrigins: Input[js.Array[Input[String]]]): BucketCorsRule = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], allowedOrigins = allowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCorsRule]
  }
  
  extension [Self <: BucketCorsRule](x: Self) {
    
    inline def setAllowedHeaders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
    
    inline def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
    
    inline def setAllowedHeadersVarargs(value: Input[String]*): Self = StObject.set(x, "allowedHeaders", js.Array(value :_*))
    
    inline def setAllowedMethods(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedMethods", value.asInstanceOf[js.Any])
    
    inline def setAllowedMethodsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedMethods", js.Array(value :_*))
    
    inline def setAllowedOrigins(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "allowedOrigins", value.asInstanceOf[js.Any])
    
    inline def setAllowedOriginsVarargs(value: Input[String]*): Self = StObject.set(x, "allowedOrigins", js.Array(value :_*))
    
    inline def setExposeHeaders(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
    
    inline def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
    
    inline def setExposeHeadersVarargs(value: Input[String]*): Self = StObject.set(x, "exposeHeaders", js.Array(value :_*))
    
    inline def setMaxAgeSeconds(value: Input[Double]): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
  }
}
