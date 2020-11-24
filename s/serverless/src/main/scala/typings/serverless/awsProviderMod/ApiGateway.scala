package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApiGateway extends js.Object {
  
  var apiKeySourceType: js.UndefOr[String] = js.native
  
  var binaryMediaTypes: js.UndefOr[js.Array[String]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var metrics: js.UndefOr[Boolean] = js.native
  
  var minimumCompressionSize: js.UndefOr[Double | String] = js.native
  
  var restApiId: js.UndefOr[String] = js.native
  
  var restApiResources: js.UndefOr[StringDictionary[String]] = js.native
  
  var restApiRootResourceId: js.UndefOr[String] = js.native
  
  var shouldStartNameWithService: js.UndefOr[Boolean] = js.native
  
  var websocketApiId: js.UndefOr[js.Any] = js.native
}
object ApiGateway {
  
  @scala.inline
  def apply(): ApiGateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApiGateway]
  }
  
  @scala.inline
  implicit class ApiGatewayOps[Self <: ApiGateway] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiKeySourceType(value: String): Self = this.set("apiKeySourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiKeySourceType: Self = this.set("apiKeySourceType", js.undefined)
    
    @scala.inline
    def setBinaryMediaTypesVarargs(value: String*): Self = this.set("binaryMediaTypes", js.Array(value :_*))
    
    @scala.inline
    def setBinaryMediaTypes(value: js.Array[String]): Self = this.set("binaryMediaTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryMediaTypes: Self = this.set("binaryMediaTypes", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setMetrics(value: Boolean): Self = this.set("metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("metrics", js.undefined)
    
    @scala.inline
    def setMinimumCompressionSize(value: Double | String): Self = this.set("minimumCompressionSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumCompressionSize: Self = this.set("minimumCompressionSize", js.undefined)
    
    @scala.inline
    def setRestApiId(value: String): Self = this.set("restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestApiId: Self = this.set("restApiId", js.undefined)
    
    @scala.inline
    def setRestApiResources(value: StringDictionary[String]): Self = this.set("restApiResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestApiResources: Self = this.set("restApiResources", js.undefined)
    
    @scala.inline
    def setRestApiRootResourceId(value: String): Self = this.set("restApiRootResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestApiRootResourceId: Self = this.set("restApiRootResourceId", js.undefined)
    
    @scala.inline
    def setShouldStartNameWithService(value: Boolean): Self = this.set("shouldStartNameWithService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldStartNameWithService: Self = this.set("shouldStartNameWithService", js.undefined)
    
    @scala.inline
    def setWebsocketApiId(value: js.Any): Self = this.set("websocketApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsocketApiId: Self = this.set("websocketApiId", js.undefined)
  }
}
