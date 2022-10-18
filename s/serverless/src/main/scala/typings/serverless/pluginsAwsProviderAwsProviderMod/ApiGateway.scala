package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StringDictionary
import typings.serverless.serverlessStrings.AUTHORIZER
import typings.serverless.serverlessStrings.HEADER
import typings.serverless.serverlessStrings.authorizer_
import typings.serverless.serverlessStrings.header_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiGateway extends StObject {
  
  var apiKeySourceType: js.UndefOr[HEADER | AUTHORIZER | header_ | authorizer_] = js.undefined
  
  var apiKeys: js.UndefOr[js.Array[String]] = js.undefined
  
  var binaryMediaTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var metrics: js.UndefOr[Boolean] = js.undefined
  
  var minimumCompressionSize: js.UndefOr[Double | String] = js.undefined
  
  var resourcePolicy: js.UndefOr[js.Array[ResourcePolicy]] = js.undefined
  
  var restApiId: js.UndefOr[String] = js.undefined
  
  var restApiResources: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var restApiRootResourceId: js.UndefOr[String] = js.undefined
  
  var shouldStartNameWithService: js.UndefOr[Boolean] = js.undefined
  
  var usagePlan: js.UndefOr[UsagePlan] = js.undefined
  
  var websocketApiId: js.UndefOr[Any] = js.undefined
}
object ApiGateway {
  
  inline def apply(): ApiGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiGateway]
  }
  
  extension [Self <: ApiGateway](x: Self) {
    
    inline def setApiKeySourceType(value: HEADER | AUTHORIZER | header_ | authorizer_): Self = StObject.set(x, "apiKeySourceType", value.asInstanceOf[js.Any])
    
    inline def setApiKeySourceTypeUndefined: Self = StObject.set(x, "apiKeySourceType", js.undefined)
    
    inline def setApiKeys(value: js.Array[String]): Self = StObject.set(x, "apiKeys", value.asInstanceOf[js.Any])
    
    inline def setApiKeysUndefined: Self = StObject.set(x, "apiKeys", js.undefined)
    
    inline def setApiKeysVarargs(value: String*): Self = StObject.set(x, "apiKeys", js.Array(value*))
    
    inline def setBinaryMediaTypes(value: js.Array[String]): Self = StObject.set(x, "binaryMediaTypes", value.asInstanceOf[js.Any])
    
    inline def setBinaryMediaTypesUndefined: Self = StObject.set(x, "binaryMediaTypes", js.undefined)
    
    inline def setBinaryMediaTypesVarargs(value: String*): Self = StObject.set(x, "binaryMediaTypes", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setMetrics(value: Boolean): Self = StObject.set(x, "metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "metrics", js.undefined)
    
    inline def setMinimumCompressionSize(value: Double | String): Self = StObject.set(x, "minimumCompressionSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumCompressionSizeUndefined: Self = StObject.set(x, "minimumCompressionSize", js.undefined)
    
    inline def setResourcePolicy(value: js.Array[ResourcePolicy]): Self = StObject.set(x, "resourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "resourcePolicy", js.undefined)
    
    inline def setResourcePolicyVarargs(value: ResourcePolicy*): Self = StObject.set(x, "resourcePolicy", js.Array(value*))
    
    inline def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    inline def setRestApiIdUndefined: Self = StObject.set(x, "restApiId", js.undefined)
    
    inline def setRestApiResources(value: StringDictionary[String]): Self = StObject.set(x, "restApiResources", value.asInstanceOf[js.Any])
    
    inline def setRestApiResourcesUndefined: Self = StObject.set(x, "restApiResources", js.undefined)
    
    inline def setRestApiRootResourceId(value: String): Self = StObject.set(x, "restApiRootResourceId", value.asInstanceOf[js.Any])
    
    inline def setRestApiRootResourceIdUndefined: Self = StObject.set(x, "restApiRootResourceId", js.undefined)
    
    inline def setShouldStartNameWithService(value: Boolean): Self = StObject.set(x, "shouldStartNameWithService", value.asInstanceOf[js.Any])
    
    inline def setShouldStartNameWithServiceUndefined: Self = StObject.set(x, "shouldStartNameWithService", js.undefined)
    
    inline def setUsagePlan(value: UsagePlan): Self = StObject.set(x, "usagePlan", value.asInstanceOf[js.Any])
    
    inline def setUsagePlanUndefined: Self = StObject.set(x, "usagePlan", js.undefined)
    
    inline def setWebsocketApiId(value: Any): Self = StObject.set(x, "websocketApiId", value.asInstanceOf[js.Any])
    
    inline def setWebsocketApiIdUndefined: Self = StObject.set(x, "websocketApiId", js.undefined)
  }
}
