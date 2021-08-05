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
  
  inline def apply(): ApiGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiGateway]
  }
  
  extension [Self <: ApiGateway](x: Self) {
    
    inline def setApiKeySourceType(value: String): Self = StObject.set(x, "apiKeySourceType", value.asInstanceOf[js.Any])
    
    inline def setApiKeySourceTypeUndefined: Self = StObject.set(x, "apiKeySourceType", js.undefined)
    
    inline def setBinaryMediaTypes(value: js.Array[String]): Self = StObject.set(x, "binaryMediaTypes", value.asInstanceOf[js.Any])
    
    inline def setBinaryMediaTypesUndefined: Self = StObject.set(x, "binaryMediaTypes", js.undefined)
    
    inline def setBinaryMediaTypesVarargs(value: String*): Self = StObject.set(x, "binaryMediaTypes", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMetrics(value: Boolean): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMinimumCompressionSize(value: Double | String): Self = StObject.set(x, "minimumCompressionSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumCompressionSizeUndefined: Self = StObject.set(x, "minimumCompressionSize", js.undefined)
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
    
    inline def setRestApiResources(value: StringDictionary[String]): Self = StObject.set(x, "restApiResources", value.asInstanceOf[js.Any])
    
    inline def setRestApiResourcesUndefined: Self = StObject.set(x, "restApiResources", js.undefined)
    
    inline def setRestApiRootResourceId(value: String): Self = StObject.set(x, "restApiRootResourceId", value.asInstanceOf[js.Any])
    
    inline def setRestApiRootResourceIdUndefined: Self = StObject.set(x, "restApiRootResourceId", js.undefined)
    
    inline def setShouldStartNameWithService(value: Boolean): Self = StObject.set(x, "shouldStartNameWithService", value.asInstanceOf[js.Any])
    
    inline def setShouldStartNameWithServiceUndefined: Self = StObject.set(x, "shouldStartNameWithService", js.undefined)
    
    inline def setWebsocketApiId(value: js.Any): Self = StObject.set(x, "websocketApiId", value.asInstanceOf[js.Any])
    
    inline def setWebsocketApiIdUndefined: Self = StObject.set(x, "websocketApiId", js.undefined)
  }
}
