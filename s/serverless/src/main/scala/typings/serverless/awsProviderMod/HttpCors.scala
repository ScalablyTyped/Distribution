package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpCors extends StObject {
  
  var allowCredentials: js.UndefOr[Boolean] = js.native
  
  var cacheControl: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[String | js.Array[String]] = js.native
  
  var maxAge: js.UndefOr[Double] = js.native
  
  var origins: js.UndefOr[String | js.Array[String]] = js.native
}
object HttpCors {
  
  @scala.inline
  def apply(): HttpCors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpCors]
  }
  
  @scala.inline
  implicit class HttpCorsMutableBuilder[Self <: HttpCors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowCredentials(value: Boolean): Self = StObject.set(x, "allowCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCredentialsUndefined: Self = StObject.set(x, "allowCredentials", js.undefined)
    
    @scala.inline
    def setCacheControl(value: String): Self = StObject.set(x, "cacheControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheControlUndefined: Self = StObject.set(x, "cacheControl", js.undefined)
    
    @scala.inline
    def setHeaders(value: String | js.Array[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: String*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    @scala.inline
    def setOrigins(value: String | js.Array[String]): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
    
    @scala.inline
    def setOriginsVarargs(value: String*): Self = StObject.set(x, "origins", js.Array(value :_*))
  }
}
