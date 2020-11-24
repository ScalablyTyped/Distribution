package typings.storybookApi.layoutMod

import typings.storybookTheming.typesMod.ThemeVars
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIOptions extends js.Object {
  
  var addonPanelInRight: Boolean = js.native
  
  var goFullScreen: Boolean = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var selectedPanel: js.UndefOr[String] = js.native
  
  var showAddonPanel: Boolean = js.native
  
  var showStoriesPanel: Boolean = js.native
  
  var theme: js.UndefOr[ThemeVars] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object UIOptions {
  
  @scala.inline
  def apply(
    addonPanelInRight: Boolean,
    goFullScreen: Boolean,
    showAddonPanel: Boolean,
    showStoriesPanel: Boolean
  ): UIOptions = {
    val __obj = js.Dynamic.literal(addonPanelInRight = addonPanelInRight.asInstanceOf[js.Any], goFullScreen = goFullScreen.asInstanceOf[js.Any], showAddonPanel = showAddonPanel.asInstanceOf[js.Any], showStoriesPanel = showStoriesPanel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIOptions]
  }
  
  @scala.inline
  implicit class UIOptionsOps[Self <: UIOptions] (val x: Self) extends AnyVal {
    
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
    def setAddonPanelInRight(value: Boolean): Self = this.set("addonPanelInRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoFullScreen(value: Boolean): Self = this.set("goFullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAddonPanel(value: Boolean): Self = this.set("showAddonPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowStoriesPanel(value: Boolean): Self = this.set("showStoriesPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSelectedPanel(value: String): Self = this.set("selectedPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedPanel: Self = this.set("selectedPanel", js.undefined)
    
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
