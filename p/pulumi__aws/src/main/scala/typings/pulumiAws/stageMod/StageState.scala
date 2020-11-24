package typings.pulumiAws.stageMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.apigatewayv2.StageAccessLogSettings
import typings.pulumiAws.inputMod.apigatewayv2.StageDefaultRouteSettings
import typings.pulumiAws.inputMod.apigatewayv2.StageRouteSetting
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StageState extends js.Object {
  
  /**
    * Settings for logging access in this stage.
    * Use the `aws.apigateway.Account` resource to configure [permissions for CloudWatch Logging](https://docs.aws.amazon.com/apigateway/latest/developerguide/set-up-logging.html#set-up-access-logging-permissions).
    */
  val accessLogSettings: js.UndefOr[Input[StageAccessLogSettings]] = js.native
  
  /**
    * The API identifier.
    */
  val apiId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the stage.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Whether updates to an API automatically trigger a new deployment. Defaults to `false`.
    */
  val autoDeploy: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The identifier of a client certificate for the stage. Use the `aws.apigateway.ClientCertificate` resource to configure a client certificate.
    * Supported only for WebSocket APIs.
    */
  val clientCertificateId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The default route settings for the stage.
    */
  val defaultRouteSettings: js.UndefOr[Input[StageDefaultRouteSettings]] = js.native
  
  /**
    * The deployment identifier of the stage. Use the [`aws.apigatewayv2.Deployment`](https://www.terraform.io/docs/providers/aws/r/apigatewayv2_deployment.html) resource to configure a deployment.
    */
  val deploymentId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The description for the stage. Must be less than or equal to 1024 characters in length.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN prefix to be used in an `aws.lambda.Permission` `sourceArn` attribute.
    * For WebSocket APIs this attribute can additionally be used in an `aws.iam.Policy` to authorize access to the [`@connections` API](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-how-to-call-websocket-api-connections.html).
    * See the [Amazon API Gateway Developer Guide](https://docs.aws.amazon.com/apigateway/latest/developerguide/apigateway-websocket-control-access-iam.html) for details.
    */
  val executionArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The URL to invoke the API pointing to the stage,
    * e.g. `wss://z4675bid1j.execute-api.eu-west-2.amazonaws.com/example-stage`, or `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/`
    */
  val invokeUrl: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the stage. Must be between 1 and 128 characters in length.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Route settings for the stage.
    */
  val routeSettings: js.UndefOr[Input[js.Array[Input[StageRouteSetting]]]] = js.native
  
  /**
    * A map that defines the stage variables for the stage.
    */
  val stageVariables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * A map of tags to assign to the stage.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
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
    def setApiId(value: Input[String]): Self = this.set("apiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiId: Self = this.set("apiId", js.undefined)
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setAutoDeploy(value: Input[Boolean]): Self = this.set("autoDeploy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoDeploy: Self = this.set("autoDeploy", js.undefined)
    
    @scala.inline
    def setClientCertificateId(value: Input[String]): Self = this.set("clientCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientCertificateId: Self = this.set("clientCertificateId", js.undefined)
    
    @scala.inline
    def setDefaultRouteSettings(value: Input[StageDefaultRouteSettings]): Self = this.set("defaultRouteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouteSettings: Self = this.set("defaultRouteSettings", js.undefined)
    
    @scala.inline
    def setDeploymentId(value: Input[String]): Self = this.set("deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentId: Self = this.set("deploymentId", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExecutionArn(value: Input[String]): Self = this.set("executionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionArn: Self = this.set("executionArn", js.undefined)
    
    @scala.inline
    def setInvokeUrl(value: Input[String]): Self = this.set("invokeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvokeUrl: Self = this.set("invokeUrl", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRouteSettingsVarargs(value: Input[StageRouteSetting]*): Self = this.set("routeSettings", js.Array(value :_*))
    
    @scala.inline
    def setRouteSettings(value: Input[js.Array[Input[StageRouteSetting]]]): Self = this.set("routeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteSettings: Self = this.set("routeSettings", js.undefined)
    
    @scala.inline
    def setStageVariables(value: Input[StringDictionary[Input[String]]]): Self = this.set("stageVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageVariables: Self = this.set("stageVariables", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
