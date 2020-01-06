package typings.atPulumiAws.apigatewayMethodSettingsMod

import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiAws.typesInputMod.apigateway.MethodSettingsSettings
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSettingsState extends js.Object {
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the REST API
    */
  val restApi: js.UndefOr[Input[RestApi]] = js.native
  /**
    * The settings block, see below.
    */
  val settings: js.UndefOr[Input[MethodSettingsSettings]] = js.native
  /**
    * The name of the stage
    */
  val stageName: js.UndefOr[Input[String]] = js.native
}

object MethodSettingsState {
  @scala.inline
  def apply(
    methodPath: Input[String] = null,
    restApi: Input[RestApi] = null,
    settings: Input[MethodSettingsSettings] = null,
    stageName: Input[String] = null
  ): MethodSettingsState = {
    val __obj = js.Dynamic.literal()
    if (methodPath != null) __obj.updateDynamic("methodPath")(methodPath.asInstanceOf[js.Any])
    if (restApi != null) __obj.updateDynamic("restApi")(restApi.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (stageName != null) __obj.updateDynamic("stageName")(stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodSettingsState]
  }
}

