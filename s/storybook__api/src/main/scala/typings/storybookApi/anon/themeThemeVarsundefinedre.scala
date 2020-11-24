package typings.storybookApi.anon

import org.scalablytyped.runtime.StringDictionary
import typings.storybookApi.refsMod.ComposedRef
import typings.storybookApi.refsMod.Refs
import typings.storybookApi.storiesMod.StoryInput
import typings.storybookTheming.typesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  theme :@storybook/theming.@storybook/theming.ThemeVars | undefined,   refs :@storybook/api.@storybook/api/dist/modules/refs.Refs | undefined,   StoryMapper :@storybook/api.@storybook/api/dist/modules/refs.StoryMapper | undefined, [k: string] : any} & std.Partial<@storybook/api.@storybook/api/dist/modules/layout.UIOptions> */
@js.native
trait themeThemeVarsundefinedre
  extends /* key */ StringDictionary[js.Any] {
  
  var StoryMapper: js.UndefOr[typings.storybookApi.refsMod.StoryMapper] = js.native
  
  var addonPanelInRight: js.UndefOr[Boolean] = js.native
  
  var goFullScreen: js.UndefOr[Boolean] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var refs: js.UndefOr[Refs] = js.native
  
  var selectedPanel: js.UndefOr[String] = js.native
  
  var showAddonPanel: js.UndefOr[Boolean] = js.native
  
  var showStoriesPanel: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[ThemeVars] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object themeThemeVarsundefinedre {
  
  @scala.inline
  def apply(): themeThemeVarsundefinedre = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[themeThemeVarsundefinedre]
  }
  
  @scala.inline
  implicit class themeThemeVarsundefinedreOps[Self <: themeThemeVarsundefinedre] (val x: Self) extends AnyVal {
    
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
    def setStoryMapper(value: (/* ref */ ComposedRef, /* story */ StoryInput) => StoryInput): Self = this.set("StoryMapper", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStoryMapper: Self = this.set("StoryMapper", js.undefined)
    
    @scala.inline
    def setAddonPanelInRight(value: Boolean): Self = this.set("addonPanelInRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddonPanelInRight: Self = this.set("addonPanelInRight", js.undefined)
    
    @scala.inline
    def setGoFullScreen(value: Boolean): Self = this.set("goFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoFullScreen: Self = this.set("goFullScreen", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRefs(value: Refs): Self = this.set("refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefs: Self = this.set("refs", js.undefined)
    
    @scala.inline
    def setSelectedPanel(value: String): Self = this.set("selectedPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedPanel: Self = this.set("selectedPanel", js.undefined)
    
    @scala.inline
    def setShowAddonPanel(value: Boolean): Self = this.set("showAddonPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAddonPanel: Self = this.set("showAddonPanel", js.undefined)
    
    @scala.inline
    def setShowStoriesPanel(value: Boolean): Self = this.set("showStoriesPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowStoriesPanel: Self = this.set("showStoriesPanel", js.undefined)
    
    @scala.inline
    def setTheme(value: ThemeVars): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
