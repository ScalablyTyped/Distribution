package typings.atPulumiAws.apigatewayDeploymentMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentState extends js.Object {
  /**
    * The creation date of the deployment
    */
  val createdDate: js.UndefOr[Input[String]] = js.undefined
  /**
    * The description of the deployment
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The execution ARN to be used in [`lambdaPermission`](https://www.terraform.io/docs/providers/aws/r/lambda_permission.html)'s `sourceArn`
    * when allowing API Gateway to invoke a Lambda function,
    * e.g. `arn:aws:execute-api:eu-west-2:123456789012:z4675bid1j/prod`
    */
  val executionArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The URL to invoke the API pointing to the stage,
    * e.g. `https://z4675bid1j.execute-api.eu-west-2.amazonaws.com/prod`
    */
  val invokeUrl: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: js.UndefOr[Input[RestApi]] = js.undefined
  /**
    * The description of the stage
    */
  val stageDescription: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the stage. If the specified stage already exists, it will be updated to point to the new deployment. If the stage does not exist, a new one will be created and point to this deployment.
    */
  val stageName: js.UndefOr[Input[String]] = js.undefined
  /**
    * A map that defines variables for the stage
    */
  val variables: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}

object DeploymentState {
  @scala.inline
  def apply(
    createdDate: Input[String] = null,
    description: Input[String] = null,
    executionArn: Input[String] = null,
    invokeUrl: Input[String] = null,
    restApi: Input[RestApi] = null,
    stageDescription: Input[String] = null,
    stageName: Input[String] = null,
    variables: Input[StringDictionary[Input[String]]] = null
  ): DeploymentState = {
    val __obj = js.Dynamic.literal()
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (executionArn != null) __obj.updateDynamic("executionArn")(executionArn.asInstanceOf[js.Any])
    if (invokeUrl != null) __obj.updateDynamic("invokeUrl")(invokeUrl.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (stageDescription != null) __obj.updateDynamic("stageDescription")(stageDescription.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentState]
  }
}

