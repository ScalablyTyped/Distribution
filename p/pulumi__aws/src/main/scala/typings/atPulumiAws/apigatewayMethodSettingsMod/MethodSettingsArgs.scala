package typings.atPulumiAws.apigatewayMethodSettingsMod

import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiAws.typesInputMod.apigateway.MethodSettingsSettings
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodSettingsArgs extends js.Object {
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: Input[String]
  /**
    * The ID of the REST API
    */
  val restApi: Input[RestApi]
  /**
    * The settings block, see below.
    */
  val settings: Input[MethodSettingsSettings]
  /**
    * The name of the stage
    */
  val stageName: Input[String]
}

object MethodSettingsArgs {
  @scala.inline
  def apply(
    methodPath: Input[String],
    restApi: Input[RestApi],
    settings: Input[MethodSettingsSettings],
    stageName: Input[String]
  ): MethodSettingsArgs = {
    val __obj = js.Dynamic.literal(methodPath = methodPath.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MethodSettingsArgs]
  }
}

