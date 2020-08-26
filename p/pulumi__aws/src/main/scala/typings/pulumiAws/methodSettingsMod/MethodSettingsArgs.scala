package typings.pulumiAws.methodSettingsMod

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiAws.inputMod.apigateway.MethodSettingsSettings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MethodSettingsArgs extends js.Object {
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: Input[String] = js.native
  /**
    * The ID of the REST API
    */
  val restApi: Input[String | RestApi] = js.native
  /**
    * The settings block, see below.
    */
  val settings: Input[MethodSettingsSettings] = js.native
  /**
    * The name of the stage
    */
  val stageName: Input[String] = js.native
}

object MethodSettingsArgs {
  @scala.inline
  def apply(
    methodPath: Input[String],
    restApi: Input[String | RestApi],
    settings: Input[MethodSettingsSettings],
    stageName: Input[String]
  ): MethodSettingsArgs = {
    val __obj = js.Dynamic.literal(methodPath = methodPath.asInstanceOf[js.Any], restApi = restApi.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], stageName = stageName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodSettingsArgs]
  }
  @scala.inline
  implicit class MethodSettingsArgsOps[Self <: MethodSettingsArgs] (val x: Self) extends AnyVal {
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
    def setMethodPath(value: Input[String]): Self = this.set("methodPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: Input[MethodSettingsSettings]): Self = this.set("settings", value.asInstanceOf[js.Any])
    @scala.inline
    def setStageName(value: Input[String]): Self = this.set("stageName", value.asInstanceOf[js.Any])
  }
  
}

