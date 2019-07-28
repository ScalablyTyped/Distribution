package typings.atPulumiAws.apigatewayMethodSettingsMod

import typings.atPulumiAws.Anon_CacheDataEncryptedCacheTtlInSeconds
import typings.atPulumiAws.apigatewayRestApiMod.RestApi
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodSettingsState extends js.Object {
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the REST API
    */
  val restApi: js.UndefOr[Input[RestApi]] = js.undefined
  /**
    * The settings block, see below.
    */
  val settings: js.UndefOr[Input[Anon_CacheDataEncryptedCacheTtlInSeconds]] = js.undefined
  /**
    * The name of the stage
    */
  val stageName: js.UndefOr[Input[String]] = js.undefined
}

object MethodSettingsState {
  @scala.inline
  def apply(
    methodPath: Input[String] = null,
    restApi: Input[RestApi] = null,
    settings: Input[Anon_CacheDataEncryptedCacheTtlInSeconds] = null,
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

