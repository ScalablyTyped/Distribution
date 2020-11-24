package typings.pulumiAws.apigatewayStageMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.Deployment
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiAws.inputMod.apigateway.StageAccessLogSettings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageArgs extends js.Object {
  
  /**
    * Enables access logs for the API stage. Detailed below.
    */
  val accessLogSettings: js.UndefOr[Input[StageAccessLogSettings]] = js.native
  
  /**
    * Specifies whether a cache cluster is enabled for the stage
    */
  val cacheClusterEnabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The size of the cache cluster for the stage, if enabled. Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
    */
  val cacheClusterSize: js.UndefOr[Input[String]] = js.native
  
  /**
    * The identifier of a client certificate for the stage.
    */
  val clientCertificateId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the deployment that the stage points to
    */
  val deployment: Input[String | Deployment] = js.native
  
  /**
    * The description of the stage
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The version of the associated API documentation
    */
  val documentationVersion: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the associated REST API
    */
  val restApi: Input[String | RestApi] = js.native
  
  /**
    * The name of the stage
    */
  val stageName: Input[String] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A map that defines the stage variables
    */
  val variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Whether active tracing with X-ray is enabled. Defaults to `false`.
    */
  val xrayTracingEnabled: js.UndefOr[Input[Boolean]] = js.native
}
object StageArgs {
  
  @scala.inline
  def apply(deployment: Input[String | Deployment], restApi: Input[String | RestApi], stageName: Input[String]): StageArgs = {
    val __obj = js.Dynamic.literal(deployment = deployment.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StageArgs]
  }
  
  @scala.inline
  implicit class StageArgsOps[Self <: StageArgs] (val x: Self) extends AnyVal {
    
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
    def setDeployment(value: Input[String | Deployment]): Self = this.set("deployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageName(value: Input[String]): Self = this.set("stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessLogSettings(value: Input[StageAccessLogSettings]): Self = this.set("accessLogSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessLogSettings: Self = this.set("accessLogSettings", js.undefined)
    
    @scala.inline
    def setCacheClusterEnabled(value: Input[Boolean]): Self = this.set("cacheClusterEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterEnabled: Self = this.set("cacheClusterEnabled", js.undefined)
    
    @scala.inline
    def setCacheClusterSize(value: Input[String]): Self = this.set("cacheClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheClusterSize: Self = this.set("cacheClusterSize", js.undefined)
    
    @scala.inline
    def setClientCertificateId(value: Input[String]): Self = this.set("clientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificateId: Self = this.set("clientCertificateId", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDocumentationVersion(value: Input[String]): Self = this.set("documentationVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentationVersion: Self = this.set("documentationVersion", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVariables(value: Input[StringDictionary[Input[String]]]): Self = this.set("variables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
    
    @scala.inline
    def setXrayTracingEnabled(value: Input[Boolean]): Self = this.set("xrayTracingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXrayTracingEnabled: Self = this.set("xrayTracingEnabled", js.undefined)
  }
}
