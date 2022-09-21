package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.providerMod.SidebarOptions
import typings.storybookApi.refsMod.ComposedRef
import typings.storybookApi.refsMod.Refs
import typings.storybookApi.storiesMod.StoryInput
import typings.storybookTheming.mod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  sidebar :@storybook/api.@storybook/api/dist/ts3.9/modules/provider.SidebarOptions | undefined,   theme :@storybook/theming.@storybook/theming.ThemeVars | undefined,   refs :@storybook/api.@storybook/api/dist/ts3.9/modules/refs.Refs | undefined,   StoryMapper :@storybook/api.@storybook/api/dist/ts3.9/modules/refs.StoryMapper | undefined, [k: string] : any} & std.Partial<@storybook/api.@storybook/api/dist/ts3.9/modules/layout.UIOptions> */
trait sidebarSidebarOptionsunde
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var StoryMapper: js.UndefOr[typings.storybookApi.refsMod.StoryMapper] = js.undefined
  
  var addonPanelInRight: js.UndefOr[Boolean] = js.undefined
  
  var goFullScreen: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var refs: js.UndefOr[Refs] = js.undefined
  
  var selectedPanel: js.UndefOr[String] = js.undefined
  
  var showAddonPanel: js.UndefOr[Boolean] = js.undefined
  
  var showStoriesPanel: js.UndefOr[Boolean] = js.undefined
  
  var sidebar: js.UndefOr[SidebarOptions] = js.undefined
  
  var theme: js.UndefOr[ThemeVars] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object sidebarSidebarOptionsunde {
  
  inline def apply(): sidebarSidebarOptionsunde = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[sidebarSidebarOptionsunde]
  }
  
  extension [Self <: sidebarSidebarOptionsunde](x: Self) {
    
    inline def setAddonPanelInRight(value: Boolean): Self = StObject.set(x, "addonPanelInRight", value.asInstanceOf[js.Any])
    
    inline def setAddonPanelInRightUndefined: Self = StObject.set(x, "addonPanelInRight", js.undefined)
    
    inline def setGoFullScreen(value: Boolean): Self = StObject.set(x, "goFullScreen", value.asInstanceOf[js.Any])
    
    inline def setGoFullScreenUndefined: Self = StObject.set(x, "goFullScreen", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRefs(value: Refs): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    inline def setRefsUndefined: Self = StObject.set(x, "refs", js.undefined)
    
    inline def setSelectedPanel(value: String): Self = StObject.set(x, "selectedPanel", value.asInstanceOf[js.Any])
    
    inline def setSelectedPanelUndefined: Self = StObject.set(x, "selectedPanel", js.undefined)
    
    inline def setShowAddonPanel(value: Boolean): Self = StObject.set(x, "showAddonPanel", value.asInstanceOf[js.Any])
    
    inline def setShowAddonPanelUndefined: Self = StObject.set(x, "showAddonPanel", js.undefined)
    
    inline def setShowStoriesPanel(value: Boolean): Self = StObject.set(x, "showStoriesPanel", value.asInstanceOf[js.Any])
    
    inline def setShowStoriesPanelUndefined: Self = StObject.set(x, "showStoriesPanel", js.undefined)
    
    inline def setSidebar(value: SidebarOptions): Self = StObject.set(x, "sidebar", value.asInstanceOf[js.Any])
    
    inline def setSidebarUndefined: Self = StObject.set(x, "sidebar", js.undefined)
    
    inline def setStoryMapper(value: (/* ref */ ComposedRef, /* story */ StoryInput) => StoryInput): Self = StObject.set(x, "StoryMapper", js.Any.fromFunction2(value))
    
    inline def setStoryMapperUndefined: Self = StObject.set(x, "StoryMapper", js.undefined)
    
    inline def setTheme(value: ThemeVars): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
