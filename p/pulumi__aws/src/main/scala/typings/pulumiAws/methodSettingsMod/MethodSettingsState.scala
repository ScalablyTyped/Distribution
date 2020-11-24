package typings.pulumiAws.methodSettingsMod

import typings.pulumiAws.apigatewayMod.RestApi
import typings.pulumiAws.inputMod.apigateway.MethodSettingsSettings
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodSettingsState extends js.Object {
  
  /**
    * Method path defined as `{resource_path}/{http_method}` for an individual method override, or `*&#47;*` for overriding all methods in the stage.
    */
  val methodPath: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ID of the REST API
    */
  val restApi: js.UndefOr[Input[String | RestApi]] = js.native
  
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
  def apply(): MethodSettingsState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MethodSettingsState]
  }
  
  @scala.inline
  implicit class MethodSettingsStateOps[Self <: MethodSettingsState] (val x: Self) extends AnyVal {
    
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
    def deleteMethodPath: Self = this.set("methodPath", js.undefined)
    
    @scala.inline
    def setRestApi(value: Input[String | RestApi]): Self = this.set("restApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestApi: Self = this.set("restApi", js.undefined)
    
    @scala.inline
    def setSettings(value: Input[MethodSettingsSettings]): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setStageName(value: Input[String]): Self = this.set("stageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStageName: Self = this.set("stageName", js.undefined)
  }
}
