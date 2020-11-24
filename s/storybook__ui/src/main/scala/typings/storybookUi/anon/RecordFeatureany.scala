package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@storybook/ui.@storybook/ui/dist/settings/shortcuts.Feature, any> */
@js.native
trait RecordFeatureany extends js.Object {
  
  var aboutPage: js.Any = js.native
  
  var collapseAll: js.Any = js.native
  
  var expandAll: js.Any = js.native
  
  var focusIframe: js.Any = js.native
  
  var focusNav: js.Any = js.native
  
  var focusPanel: js.Any = js.native
  
  var fullScreen: js.Any = js.native
  
  var nextComponent: js.Any = js.native
  
  var nextStory: js.Any = js.native
  
  var panelPosition: js.Any = js.native
  
  var prevComponent: js.Any = js.native
  
  var prevStory: js.Any = js.native
  
  var search: js.Any = js.native
  
  var shortcutsPage: js.Any = js.native
  
  var toggleNav: js.Any = js.native
  
  var togglePanel: js.Any = js.native
  
  var toolbar: js.Any = js.native
}
object RecordFeatureany {
  
  @scala.inline
  def apply(
    aboutPage: js.Any,
    collapseAll: js.Any,
    expandAll: js.Any,
    focusIframe: js.Any,
    focusNav: js.Any,
    focusPanel: js.Any,
    fullScreen: js.Any,
    nextComponent: js.Any,
    nextStory: js.Any,
    panelPosition: js.Any,
    prevComponent: js.Any,
    prevStory: js.Any,
    search: js.Any,
    shortcutsPage: js.Any,
    toggleNav: js.Any,
    togglePanel: js.Any,
    toolbar: js.Any
  ): RecordFeatureany = {
    val __obj = js.Dynamic.literal(aboutPage = aboutPage.asInstanceOf[js.Any], collapseAll = collapseAll.asInstanceOf[js.Any], expandAll = expandAll.asInstanceOf[js.Any], focusIframe = focusIframe.asInstanceOf[js.Any], focusNav = focusNav.asInstanceOf[js.Any], focusPanel = focusPanel.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], nextComponent = nextComponent.asInstanceOf[js.Any], nextStory = nextStory.asInstanceOf[js.Any], panelPosition = panelPosition.asInstanceOf[js.Any], prevComponent = prevComponent.asInstanceOf[js.Any], prevStory = prevStory.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], shortcutsPage = shortcutsPage.asInstanceOf[js.Any], toggleNav = toggleNav.asInstanceOf[js.Any], togglePanel = togglePanel.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordFeatureany]
  }
  
  @scala.inline
  implicit class RecordFeatureanyOps[Self <: RecordFeatureany] (val x: Self) extends AnyVal {
    
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
    def setAboutPage(value: js.Any): Self = this.set("aboutPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseAll(value: js.Any): Self = this.set("collapseAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandAll(value: js.Any): Self = this.set("expandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusIframe(value: js.Any): Self = this.set("focusIframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusNav(value: js.Any): Self = this.set("focusNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusPanel(value: js.Any): Self = this.set("focusPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreen(value: js.Any): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextComponent(value: js.Any): Self = this.set("nextComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextStory(value: js.Any): Self = this.set("nextStory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelPosition(value: js.Any): Self = this.set("panelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevComponent(value: js.Any): Self = this.set("prevComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevStory(value: js.Any): Self = this.set("prevStory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: js.Any): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutsPage(value: js.Any): Self = this.set("shortcutsPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleNav(value: js.Any): Self = this.set("toggleNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTogglePanel(value: js.Any): Self = this.set("togglePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar(value: js.Any): Self = this.set("toolbar", value.asInstanceOf[js.Any])
  }
}
