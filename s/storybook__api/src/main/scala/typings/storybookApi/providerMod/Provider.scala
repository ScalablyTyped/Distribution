package typings.storybookApi.providerMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.std.Record
import typings.storybookApi.anon.themeThemeVarsundefinedre
import typings.storybookApi.mod.API
import typings.storybookChannels.mod.Channel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider
  extends /* key */ StringDictionary[js.Any] {
  
  var channel: js.UndefOr[Channel] = js.native
  
  def getConfig(): themeThemeVarsundefinedre = js.native
  
  def handleAPI(api: API): Unit = js.native
  
  var renderPreview: js.UndefOr[IframeRenderer] = js.native
}
object Provider {
  
  @scala.inline
  def apply(getConfig: () => themeThemeVarsundefinedre, handleAPI: API => Unit): Provider = {
    val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), handleAPI = js.Any.fromFunction1(handleAPI))
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderOps[Self <: Provider] (val x: Self) extends AnyVal {
    
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
    def setGetConfig(value: () => themeThemeVarsundefinedre): Self = this.set("getConfig", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHandleAPI(value: API => Unit): Self = this.set("handleAPI", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
    
    @scala.inline
    def setRenderPreview(
      value: (/* storyId */ String, /* import warning: importer.ImportType#apply Failed type conversion: @storybook/api.@storybook/api.State['viewMode'] */ /* viewMode */ js.Any, /* id */ String, /* baseUrl */ String, /* scale */ Double, /* queryParams */ Record[String, js.Any]) => ReactNode
    ): Self = this.set("renderPreview", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteRenderPreview: Self = this.set("renderPreview", js.undefined)
  }
}
