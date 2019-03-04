package typings
package atPulumiAwsLib.apigatewayDeploymentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentArgs extends js.Object {
  /**
    * The description of the deployment
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The ID of the associated REST API
    */
  val restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi]
  /**
    * The description of the stage
    */
  val stageDescription: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of the stage. If the specified stage already exists, it will be updated to point to the new deployment. If the stage does not exist, a new one will be created and point to this deployment. Use `""` to point at the default stage.
    */
  val stageName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * A map that defines variables for the stage
    */
  val variables: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
}

object DeploymentArgs {
  @scala.inline
  def apply(
    restApi: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.apigatewayRestApiMod.RestApi],
    stageName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    description: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    stageDescription: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    variables: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null
  ): DeploymentArgs = {
    val __obj = js.Dynamic.literal(restApi = restApi.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (stageDescription != null) __obj.updateDynamic("stageDescription")(stageDescription.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentArgs]
  }
}

