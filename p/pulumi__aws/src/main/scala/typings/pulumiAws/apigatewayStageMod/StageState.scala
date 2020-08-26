package typings.pulumiAws.apigatewayStageMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.Deployment
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiAws.inputMod.apigateway.StageAccessLogSettings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StageState extends js.Object {
  /**
    * Enables access logs for the API stage. Detailed below.
    */
  val accessLogSettings: js.UndefOr[Input[StageAccessLogSettings]] = js.native
  /**
    * Amazon Resource Name (ARN)
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Specifies whether a cache cluster is enabled for the stage
    */
  val cacheClusterEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The size of the cache cluster for the stage, if enabled.
    * Allowed values include `0.5`, `1.6`, `6.1`, `13.5`, `28.4`, `58.2`, `118` and `237`.
    */
  val cacheClusterSize: js.UndefOr[Input[String]] = js.native
  /**
    * The identifier of a client certificate for the stage.
    */
  val clientCertificateId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the deployment that the stage points to
    */
  val deployment: js.UndefOr[Input[String | Deployment]] = js.native
  /**
    * The description of the stage
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The version of the associated API documentation
    */
  val documentationVersion: js.UndefOr[Input[String]] = js.native
  /**
    * The execution ARN to be used in `lambdaPermission`'s `sourceArn`
    * when allowing API Gateway to invoke a Lambda function,
    * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
    */
  val executionArn: js.UndefOr[Input[String]] = js.native
  /**
    * The URL to invoke the API pointing to the stage,
    * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
    */
  val invokeUrl: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[Input[String | RestApi]] = js.native
  /**
    * The name of the stage
    */
  val stageName: js.UndefOr[Input[String]] = js.native
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

object StageState {
  @scala.inline
  def apply(): StageState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StageState]
  }
  @scala.inline
  implicit class StageStateOps[Self <: StageState] (val x: Self) extends AnyVal {
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
    def setAccessLogSettings(value: Input[StageAccessLogSettings]): Self = this.set("accessLogSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessLogSettings: Self = this.set("accessLogSettings", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
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
    def setDeployment(value: Input[String | Deployment]): Self = this.set("deployment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeployment: Self = this.set("deployment", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDocumentationVersion(value: Input[String]): Self = this.set("documentationVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentationVersion: Self = this.set("documentationVersion", js.undefined)
    @scala.inline
    def setExecutionArn(value: Input[String]): Self = this.set("executionArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionArn: Self = this.set("executionArn", js.undefined)
    @scala.inline
    def setInvokeUrl(value: Input[String]): Self = this.set("invokeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvokeUrl: Self = this.set("invokeUrl", js.undefined)
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestApi: Self = this.set("restApi", js.undefined)
    @scala.inline
    def setStageName(value: Input[String]): Self = this.set("stageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
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

