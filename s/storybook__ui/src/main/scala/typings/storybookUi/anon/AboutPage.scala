package typings.storybookUi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AboutPage extends js.Object {
  
  var aboutPage: String = js.native
  
  var collapseAll: String = js.native
  
  var expandAll: String = js.native
  
  var focusIframe: String = js.native
  
  var focusNav: String = js.native
  
  var focusPanel: String = js.native
  
  var fullScreen: String = js.native
  
  var nextComponent: String = js.native
  
  var nextStory: String = js.native
  
  var panelPosition: String = js.native
  
  var prevComponent: String = js.native
  
  var prevStory: String = js.native
  
  var search: String = js.native
  
  var shortcutsPage: String = js.native
  
  var toggleNav: String = js.native
  
  var togglePanel: String = js.native
  
  var toolbar: String = js.native
}
object AboutPage {
  
  @scala.inline
  def apply(
    aboutPage: String,
    collapseAll: String,
    expandAll: String,
    focusIframe: String,
    focusNav: String,
    focusPanel: String,
    fullScreen: String,
    nextComponent: String,
    nextStory: String,
    panelPosition: String,
    prevComponent: String,
    prevStory: String,
    search: String,
    shortcutsPage: String,
    toggleNav: String,
    togglePanel: String,
    toolbar: String
  ): AboutPage = {
    val __obj = js.Dynamic.literal(aboutPage = aboutPage.asInstanceOf[js.Any], collapseAll = collapseAll.asInstanceOf[js.Any], expandAll = expandAll.asInstanceOf[js.Any], focusIframe = focusIframe.asInstanceOf[js.Any], focusNav = focusNav.asInstanceOf[js.Any], focusPanel = focusPanel.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], nextComponent = nextComponent.asInstanceOf[js.Any], nextStory = nextStory.asInstanceOf[js.Any], panelPosition = panelPosition.asInstanceOf[js.Any], prevComponent = prevComponent.asInstanceOf[js.Any], prevStory = prevStory.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], shortcutsPage = shortcutsPage.asInstanceOf[js.Any], toggleNav = toggleNav.asInstanceOf[js.Any], togglePanel = togglePanel.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboutPage]
  }
  
  @scala.inline
  implicit class AboutPageOps[Self <: AboutPage] (val x: Self) extends AnyVal {
    
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
    def setAboutPage(value: String): Self = this.set("aboutPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollapseAll(value: String): Self = this.set("collapseAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandAll(value: String): Self = this.set("expandAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusIframe(value: String): Self = this.set("focusIframe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusNav(value: String): Self = this.set("focusNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusPanel(value: String): Self = this.set("focusPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullScreen(value: String): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextComponent(value: String): Self = this.set("nextComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextStory(value: String): Self = this.set("nextStory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPanelPosition(value: String): Self = this.set("panelPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevComponent(value: String): Self = this.set("prevComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevStory(value: String): Self = this.set("prevStory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = this.set("search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortcutsPage(value: String): Self = this.set("shortcutsPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleNav(value: String): Self = this.set("toggleNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTogglePanel(value: String): Self = this.set("togglePanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbar(value: String): Self = this.set("toolbar", value.asInstanceOf[js.Any])
  }
}
