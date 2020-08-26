package typings.storybookApi.shortcutsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shortcuts extends js.Object {
  var aboutPage: KeyCollection = js.native
  var collapseAll: KeyCollection = js.native
  var escape: KeyCollection = js.native
  var expandAll: KeyCollection = js.native
  var focusIframe: KeyCollection = js.native
  var focusNav: KeyCollection = js.native
  var focusPanel: KeyCollection = js.native
  var fullScreen: KeyCollection = js.native
  var nextComponent: KeyCollection = js.native
  var nextStory: KeyCollection = js.native
  var panelPosition: KeyCollection = js.native
  var prevComponent: KeyCollection = js.native
  var prevStory: KeyCollection = js.native
  var search: KeyCollection = js.native
  var shortcutsPage: KeyCollection = js.native
  var toggleNav: KeyCollection = js.native
  var togglePanel: KeyCollection = js.native
  var toolbar: KeyCollection = js.native
}

object Shortcuts {
  @scala.inline
  def apply(
    aboutPage: KeyCollection,
    collapseAll: KeyCollection,
    escape: KeyCollection,
    expandAll: KeyCollection,
    focusIframe: KeyCollection,
    focusNav: KeyCollection,
    focusPanel: KeyCollection,
    fullScreen: KeyCollection,
    nextComponent: KeyCollection,
    nextStory: KeyCollection,
    panelPosition: KeyCollection,
    prevComponent: KeyCollection,
    prevStory: KeyCollection,
    search: KeyCollection,
    shortcutsPage: KeyCollection,
    toggleNav: KeyCollection,
    togglePanel: KeyCollection,
    toolbar: KeyCollection
  ): Shortcuts = {
    val __obj = js.Dynamic.literal(aboutPage = aboutPage.asInstanceOf[js.Any], collapseAll = collapseAll.asInstanceOf[js.Any], escape = escape.asInstanceOf[js.Any], expandAll = expandAll.asInstanceOf[js.Any], focusIframe = focusIframe.asInstanceOf[js.Any], focusNav = focusNav.asInstanceOf[js.Any], focusPanel = focusPanel.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], nextComponent = nextComponent.asInstanceOf[js.Any], nextStory = nextStory.asInstanceOf[js.Any], panelPosition = panelPosition.asInstanceOf[js.Any], prevComponent = prevComponent.asInstanceOf[js.Any], prevStory = prevStory.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], shortcutsPage = shortcutsPage.asInstanceOf[js.Any], toggleNav = toggleNav.asInstanceOf[js.Any], togglePanel = togglePanel.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shortcuts]
  }
  @scala.inline
  implicit class ShortcutsOps[Self <: Shortcuts] (val x: Self) extends AnyVal {
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
    def setAboutPageVarargs(value: String*): Self = this.set("aboutPage", js.Array(value :_*))
    @scala.inline
    def setAboutPage(value: KeyCollection): Self = this.set("aboutPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapseAllVarargs(value: String*): Self = this.set("collapseAll", js.Array(value :_*))
    @scala.inline
    def setCollapseAll(value: KeyCollection): Self = this.set("collapseAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setEscapeVarargs(value: String*): Self = this.set("escape", js.Array(value :_*))
    @scala.inline
    def setEscape(value: KeyCollection): Self = this.set("escape", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpandAllVarargs(value: String*): Self = this.set("expandAll", js.Array(value :_*))
    @scala.inline
    def setExpandAll(value: KeyCollection): Self = this.set("expandAll", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusIframeVarargs(value: String*): Self = this.set("focusIframe", js.Array(value :_*))
    @scala.inline
    def setFocusIframe(value: KeyCollection): Self = this.set("focusIframe", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusNavVarargs(value: String*): Self = this.set("focusNav", js.Array(value :_*))
    @scala.inline
    def setFocusNav(value: KeyCollection): Self = this.set("focusNav", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusPanelVarargs(value: String*): Self = this.set("focusPanel", js.Array(value :_*))
    @scala.inline
    def setFocusPanel(value: KeyCollection): Self = this.set("focusPanel", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullScreenVarargs(value: String*): Self = this.set("fullScreen", js.Array(value :_*))
    @scala.inline
    def setFullScreen(value: KeyCollection): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextComponentVarargs(value: String*): Self = this.set("nextComponent", js.Array(value :_*))
    @scala.inline
    def setNextComponent(value: KeyCollection): Self = this.set("nextComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextStoryVarargs(value: String*): Self = this.set("nextStory", js.Array(value :_*))
    @scala.inline
    def setNextStory(value: KeyCollection): Self = this.set("nextStory", value.asInstanceOf[js.Any])
    @scala.inline
    def setPanelPositionVarargs(value: String*): Self = this.set("panelPosition", js.Array(value :_*))
    @scala.inline
    def setPanelPosition(value: KeyCollection): Self = this.set("panelPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevComponentVarargs(value: String*): Self = this.set("prevComponent", js.Array(value :_*))
    @scala.inline
    def setPrevComponent(value: KeyCollection): Self = this.set("prevComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrevStoryVarargs(value: String*): Self = this.set("prevStory", js.Array(value :_*))
    @scala.inline
    def setPrevStory(value: KeyCollection): Self = this.set("prevStory", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchVarargs(value: String*): Self = this.set("search", js.Array(value :_*))
    @scala.inline
    def setSearch(value: KeyCollection): Self = this.set("search", value.asInstanceOf[js.Any])
    @scala.inline
    def setShortcutsPageVarargs(value: String*): Self = this.set("shortcutsPage", js.Array(value :_*))
    @scala.inline
    def setShortcutsPage(value: KeyCollection): Self = this.set("shortcutsPage", value.asInstanceOf[js.Any])
    @scala.inline
    def setToggleNavVarargs(value: String*): Self = this.set("toggleNav", js.Array(value :_*))
    @scala.inline
    def setToggleNav(value: KeyCollection): Self = this.set("toggleNav", value.asInstanceOf[js.Any])
    @scala.inline
    def setTogglePanelVarargs(value: String*): Self = this.set("togglePanel", js.Array(value :_*))
    @scala.inline
    def setTogglePanel(value: KeyCollection): Self = this.set("togglePanel", value.asInstanceOf[js.Any])
    @scala.inline
    def setToolbarVarargs(value: String*): Self = this.set("toolbar", js.Array(value :_*))
    @scala.inline
    def setToolbar(value: KeyCollection): Self = this.set("toolbar", value.asInstanceOf[js.Any])
  }
  
}

