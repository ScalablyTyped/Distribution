package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketCorsRule extends StObject {
  
  /**
    * Specifies which headers are allowed.
    */
  var allowedHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies which methods are allowed. Can be `GET`, `PUT`, `POST`, `DELETE` or `HEAD`.
    */
  var allowedMethods: js.Array[String] = js.native
  
  /**
    * Specifies which origins are allowed.
    */
  var allowedOrigins: js.Array[String] = js.native
  
  /**
    * Specifies expose header in the response.
    */
  var exposeHeaders: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Specifies time in seconds that browser can cache the response for a preflight request.
    */
  var maxAgeSeconds: js.UndefOr[Double] = js.native
}
object BucketCorsRule {
  
  @scala.inline
  def apply(allowedMethods: js.Array[String], allowedOrigins: js.Array[String]): BucketCorsRule = {
    val __obj = js.Dynamic.literal(allowedMethods = allowedMethods.asInstanceOf[js.Any], allowedOrigins = allowedOrigins.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketCorsRule]
  }
  
  @scala.inline
  implicit class BucketCorsRuleMutableBuilder[Self <: BucketCorsRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedHeaders(value: js.Array[String]): Self = StObject.set(x, "allowedHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedHeadersUndefined: Self = StObject.set(x, "allowedHeaders", js.undefined)
    
    @scala.inline
    def setAllowedHeadersVarargs(value: String*): Self = StObject.set(x, "allowedHeaders", js.Array(value :_*))
    
    @scala.inline
    def setAllowedMethods(value: js.Array[String]): Self = StObject.set(x, "allowedMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedMethodsVarargs(value: String*): Self = StObject.set(x, "allowedMethods", js.Array(value :_*))
    
    @scala.inline
    def setAllowedOrigins(value: js.Array[String]): Self = StObject.set(x, "allowedOrigins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedOriginsVarargs(value: String*): Self = StObject.set(x, "allowedOrigins", js.Array(value :_*))
    
    @scala.inline
    def setExposeHeaders(value: js.Array[String]): Self = StObject.set(x, "exposeHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExposeHeadersUndefined: Self = StObject.set(x, "exposeHeaders", js.undefined)
    
    @scala.inline
    def setExposeHeadersVarargs(value: String*): Self = StObject.set(x, "exposeHeaders", js.Array(value :_*))
    
    @scala.inline
    def setMaxAgeSeconds(value: Double): Self = StObject.set(x, "maxAgeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeSecondsUndefined: Self = StObject.set(x, "maxAgeSeconds", js.undefined)
  }
}
