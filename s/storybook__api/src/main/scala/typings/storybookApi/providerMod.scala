package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.std.Record
import typings.storybookApi.anon.themeThemeVarsundefinedre
import typings.storybookApi.mod.API
import typings.storybookApi.mod.ModuleFn
import typings.storybookApi.modulesStoriesMod.ViewMode
import typings.storybookChannels.mod.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerMod {
  
  @JSImport("@storybook/api/dist/modules/provider", "init")
  @js.native
  val init: ModuleFn = js.native
  
  type IframeRenderer = js.Function6[
    /* storyId */ String, 
    /* viewMode */ ViewMode & js.UndefOr[String], 
    /* id */ String, 
    /* baseUrl */ String, 
    /* scale */ Double, 
    /* queryParams */ Record[String, js.Any], 
    ReactNode
  ]
  
  trait Provider
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var channel: js.UndefOr[Channel] = js.undefined
    
    def getConfig(): themeThemeVarsundefinedre
    
    def handleAPI(api: API): Unit
    
    var renderPreview: js.UndefOr[IframeRenderer] = js.undefined
  }
  object Provider {
    
    @scala.inline
    def apply(getConfig: () => themeThemeVarsundefinedre, handleAPI: API => Unit): Provider = {
      val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), handleAPI = js.Any.fromFunction1(handleAPI))
      __obj.asInstanceOf[Provider]
    }
    
    @scala.inline
    implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      @scala.inline
      def setGetConfig(value: () => themeThemeVarsundefinedre): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleAPI(value: API => Unit): Self = StObject.set(x, "handleAPI", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderPreview(
        value: (/* storyId */ String, /* viewMode */ ViewMode & js.UndefOr[String], /* id */ String, /* baseUrl */ String, /* scale */ Double, /* queryParams */ Record[String, js.Any]) => ReactNode
      ): Self = StObject.set(x, "renderPreview", js.Any.fromFunction6(value))
      
      @scala.inline
      def setRenderPreviewUndefined: Self = StObject.set(x, "renderPreview", js.undefined)
    }
  }
  
  trait SubAPI extends StObject {
    
    var renderPreview: js.UndefOr[IframeRenderer] = js.undefined
  }
  object SubAPI {
    
    @scala.inline
    def apply(): SubAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit class SubAPIMutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderPreview(
        value: (/* storyId */ String, /* viewMode */ ViewMode & js.UndefOr[String], /* id */ String, /* baseUrl */ String, /* scale */ Double, /* queryParams */ Record[String, js.Any]) => ReactNode
      ): Self = StObject.set(x, "renderPreview", js.Any.fromFunction6(value))
      
      @scala.inline
      def setRenderPreviewUndefined: Self = StObject.set(x, "renderPreview", js.undefined)
    }
  }
}
