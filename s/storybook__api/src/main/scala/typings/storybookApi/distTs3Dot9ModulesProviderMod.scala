package typings.storybookApi

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.std.Record
import typings.storybookApi.anon.sidebarSidebarOptionsunde
import typings.storybookApi.distTs3Dot9LibStoriesMod.Group
import typings.storybookApi.distTs3Dot9LibStoriesMod.Root
import typings.storybookApi.distTs3Dot9LibStoriesMod.Story
import typings.storybookApi.distTs3Dot9ModulesStoriesMod.ViewMode
import typings.storybookApi.mod.API
import typings.storybookApi.mod.ModuleFn
import typings.storybookChannels.mod.Channel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesProviderMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/provider", "init")
  @js.native
  val init: ModuleFn = js.native
  
  type IframeRenderer = js.Function6[
    /* storyId */ String, 
    /* viewMode */ ViewMode & js.UndefOr[String], 
    /* id */ String, 
    /* baseUrl */ String, 
    /* scale */ Double, 
    /* queryParams */ Record[String, Any], 
    ReactNode
  ]
  
  trait Provider
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var channel: js.UndefOr[Channel] = js.undefined
    
    def getConfig(): sidebarSidebarOptionsunde
    
    def handleAPI(api: API): Unit
    
    var renderPreview: js.UndefOr[IframeRenderer] = js.undefined
    
    var serverChannel: js.UndefOr[Channel] = js.undefined
  }
  object Provider {
    
    inline def apply(getConfig: () => sidebarSidebarOptionsunde, handleAPI: API => Unit): Provider = {
      val __obj = js.Dynamic.literal(getConfig = js.Any.fromFunction0(getConfig), handleAPI = js.Any.fromFunction1(handleAPI))
      __obj.asInstanceOf[Provider]
    }
    
    extension [Self <: Provider](x: Self) {
      
      inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setGetConfig(value: () => sidebarSidebarOptionsunde): Self = StObject.set(x, "getConfig", js.Any.fromFunction0(value))
      
      inline def setHandleAPI(value: API => Unit): Self = StObject.set(x, "handleAPI", js.Any.fromFunction1(value))
      
      inline def setRenderPreview(
        value: (/* storyId */ String, /* viewMode */ ViewMode & js.UndefOr[String], /* id */ String, /* baseUrl */ String, /* scale */ Double, /* queryParams */ Record[String, Any]) => ReactNode
      ): Self = StObject.set(x, "renderPreview", js.Any.fromFunction6(value))
      
      inline def setRenderPreviewUndefined: Self = StObject.set(x, "renderPreview", js.undefined)
      
      inline def setServerChannel(value: Channel): Self = StObject.set(x, "serverChannel", value.asInstanceOf[js.Any])
      
      inline def setServerChannelUndefined: Self = StObject.set(x, "serverChannel", js.undefined)
    }
  }
  
  trait SidebarOptions extends StObject {
    
    var collapsedRoots: js.UndefOr[js.Array[String]] = js.undefined
    
    var renderLabel: js.UndefOr[js.Function1[/* item */ Root | Group | Story, ReactNode]] = js.undefined
    
    var showRoots: js.UndefOr[Boolean] = js.undefined
  }
  object SidebarOptions {
    
    inline def apply(): SidebarOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SidebarOptions]
    }
    
    extension [Self <: SidebarOptions](x: Self) {
      
      inline def setCollapsedRoots(value: js.Array[String]): Self = StObject.set(x, "collapsedRoots", value.asInstanceOf[js.Any])
      
      inline def setCollapsedRootsUndefined: Self = StObject.set(x, "collapsedRoots", js.undefined)
      
      inline def setCollapsedRootsVarargs(value: String*): Self = StObject.set(x, "collapsedRoots", js.Array(value*))
      
      inline def setRenderLabel(value: /* item */ Root | Group | Story => ReactNode): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
      
      inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      inline def setShowRoots(value: Boolean): Self = StObject.set(x, "showRoots", value.asInstanceOf[js.Any])
      
      inline def setShowRootsUndefined: Self = StObject.set(x, "showRoots", js.undefined)
    }
  }
  
  trait SubAPI extends StObject {
    
    var renderPreview: js.UndefOr[IframeRenderer] = js.undefined
  }
  object SubAPI {
    
    inline def apply(): SubAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setRenderPreview(
        value: (/* storyId */ String, /* viewMode */ ViewMode & js.UndefOr[String], /* id */ String, /* baseUrl */ String, /* scale */ Double, /* queryParams */ Record[String, Any]) => ReactNode
      ): Self = StObject.set(x, "renderPreview", js.Any.fromFunction6(value))
      
      inline def setRenderPreviewUndefined: Self = StObject.set(x, "renderPreview", js.undefined)
    }
  }
}
