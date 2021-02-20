package typings.reactNativeFbsdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GraphRequestConfig extends StObject {
  
  /**
    * The access token used by the request.
    */
  var accessToken: js.UndefOr[String] = js.native
  
  /**
    * The httpMethod to use for the request, for example "GET" or "POST".
    */
  var httpMethod: js.UndefOr[String] = js.native
  
  /**
    * The request parameters.
    */
  var parameters: js.UndefOr[GraphRequestParameters] = js.native
  
  /**
    * The Graph API version to use (e.g., "v2.0")
    */
  var version: js.UndefOr[String] = js.native
}
object GraphRequestConfig {
  
  @scala.inline
  def apply(): GraphRequestConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphRequestConfig]
  }
  
  @scala.inline
  implicit class GraphRequestConfigMutableBuilder[Self <: GraphRequestConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
    
    @scala.inline
    def setHttpMethod(value: String): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
    
    @scala.inline
    def setParameters(value: GraphRequestParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
