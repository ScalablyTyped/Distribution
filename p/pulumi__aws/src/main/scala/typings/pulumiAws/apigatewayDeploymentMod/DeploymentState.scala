package typings.pulumiAws.apigatewayDeploymentMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentState extends js.Object {
  /**
    * The creation date of the deployment
    */
  val createdDate: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the deployment
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The execution ARN to be used in `lambdaPermission` resource's `sourceArn`
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
    * The description of the stage
    */
  val stageDescription: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the stage. If the specified stage already exists, it will be updated to point to the new deployment. If the stage does not exist, a new one will be created and point to this deployment.
    */
  val stageName: js.UndefOr[Input[String]] = js.native
  /**
    * A map of arbitrary keys and values that, when changed, will trigger a redeployment.
    */
  val triggers: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * A map that defines variables for the stage
    */
  val variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object DeploymentState {
  @scala.inline
  def apply(): DeploymentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentState]
  }
  @scala.inline
  implicit class DeploymentStateOps[Self <: DeploymentState] (val x: Self) extends AnyVal {
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
    def setCreatedDate(value: Input[String]): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
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
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestApi: Self = this.set("restApi", js.undefined)
    @scala.inline
    def setStageDescription(value: Input[String]): Self = this.set("stageDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageDescription: Self = this.set("stageDescription", js.undefined)
    @scala.inline
    def setStageName(value: Input[String]): Self = this.set("stageName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
    @scala.inline
    def setTriggers(value: Input[StringDictionary[Input[String]]]): Self = this.set("triggers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTriggers: Self = this.set("triggers", js.undefined)
    @scala.inline
    def setVariables(value: Input[StringDictionary[Input[String]]]): Self = this.set("variables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariables: Self = this.set("variables", js.undefined)
  }
  
}

