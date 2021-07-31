package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiGateway extends StObject {
  
  var apiKeySourceType: js.UndefOr[String] = js.undefined
  
  var binaryMediaTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var metrics: js.UndefOr[Boolean] = js.undefined
  
  var minimumCompressionSize: js.UndefOr[Double | String] = js.undefined
  
  var restApiId: js.UndefOr[String] = js.undefined
  
  var restApiResources: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var restApiRootResourceId: js.UndefOr[String] = js.undefined
  
  var shouldStartNameWithService: js.UndefOr[Boolean] = js.undefined
  
  var websocketApiId: js.UndefOr[js.Any] = js.undefined
}
object ApiGateway {
  
  @scala.inline
  def apply(): ApiGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiGateway]
  }
  
  @scala.inline
  implicit class ApiGatewayMutableBuilder[Self <: ApiGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKeySourceType(value: String): Self = StObject.set(x, "apiKeySourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiKeySourceTypeUndefined: Self = StObject.set(x, "apiKeySourceType", js.undefined)
    
    @scala.inline
    def setBinaryMediaTypes(value: js.Array[String]): Self = StObject.set(x, "binaryMediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryMediaTypesUndefined: Self = StObject.set(x, "binaryMediaTypes", js.undefined)
    
    @scala.inline
    def setBinaryMediaTypesVarargs(value: String*): Self = StObject.set(x, "binaryMediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setMetrics(value: Boolean): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    @scala.inline
    def setMinimumCompressionSize(value: Double | String): Self = StObject.set(x, "minimumCompressionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumCompressionSizeUndefined: Self = StObject.set(x, "minimumCompressionSize", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
    
    @scala.inline
    def setRestApiResources(value: StringDictionary[String]): Self = StObject.set(x, "restApiResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiResourcesUndefined: Self = StObject.set(x, "restApiResources", js.undefined)
    
    @scala.inline
    def setRestApiRootResourceId(value: String): Self = StObject.set(x, "restApiRootResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiRootResourceIdUndefined: Self = StObject.set(x, "restApiRootResourceId", js.undefined)
    
    @scala.inline
    def setShouldStartNameWithService(value: Boolean): Self = StObject.set(x, "shouldStartNameWithService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldStartNameWithServiceUndefined: Self = StObject.set(x, "shouldStartNameWithService", js.undefined)
    
    @scala.inline
    def setWebsocketApiId(value: js.Any): Self = StObject.set(x, "websocketApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebsocketApiIdUndefined: Self = StObject.set(x, "websocketApiId", js.undefined)
  }
}
