package typings.storybookApi

import typings.std.KeyboardEvent
import typings.storybookApi.anon.AddEventListener
import typings.storybookApi.mod.ModuleFn
import typings.storybookApi.storybookApiStrings.control
import typings.storybookApi.storybookApiStrings.meta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shortcutsMod {
  
  @JSImport("@storybook/api/dist/modules/shortcuts", "controlOrMetaKey")
  @js.native
  def controlOrMetaKey(): meta | control = js.native
  
  @JSImport("@storybook/api/dist/modules/shortcuts", "defaultShortcuts")
  @js.native
  val defaultShortcuts: Shortcuts = js.native
  
  @JSImport("@storybook/api/dist/modules/shortcuts", "init")
  @js.native
  val init: ModuleFn = js.native
  
  @JSImport("@storybook/api/dist/modules/shortcuts", "isMacLike")
  @js.native
  def isMacLike(): Boolean = js.native
  
  @JSImport("@storybook/api/dist/modules/shortcuts", "keys")
  @js.native
  def keys[O](o: O): js.Array[/* keyof O */ String] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookApi.storybookApiStrings.fullScreen
    - typings.storybookApi.storybookApiStrings.togglePanel
    - typings.storybookApi.storybookApiStrings.panelPosition
    - typings.storybookApi.storybookApiStrings.toggleNav
    - typings.storybookApi.storybookApiStrings.toolbar
    - typings.storybookApi.storybookApiStrings.search
    - typings.storybookApi.storybookApiStrings.focusNav
    - typings.storybookApi.storybookApiStrings.focusIframe
    - typings.storybookApi.storybookApiStrings.focusPanel
    - typings.storybookApi.storybookApiStrings.prevComponent
    - typings.storybookApi.storybookApiStrings.nextComponent
    - typings.storybookApi.storybookApiStrings.prevStory
    - typings.storybookApi.storybookApiStrings.nextStory
    - typings.storybookApi.storybookApiStrings.shortcutsPage
    - typings.storybookApi.storybookApiStrings.aboutPage
    - typings.storybookApi.storybookApiStrings.escape
    - typings.storybookApi.storybookApiStrings.collapseAll
    - typings.storybookApi.storybookApiStrings.expandAll
  */
  trait Action extends StObject
  
  @js.native
  trait Event extends KeyboardEvent {
    
    @JSName("target")
    var target_Event: AddEventListener = js.native
  }
  
  type KeyCollection = js.Array[String]
  
  @js.native
  trait Shortcuts extends StObject {
    
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
    implicit class ShortcutsMutableBuilder[Self <: Shortcuts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAboutPage(value: KeyCollection): Self = StObject.set(x, "aboutPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutPageVarargs(value: String*): Self = StObject.set(x, "aboutPage", js.Array(value :_*))
      
      @scala.inline
      def setCollapseAll(value: KeyCollection): Self = StObject.set(x, "collapseAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollapseAllVarargs(value: String*): Self = StObject.set(x, "collapseAll", js.Array(value :_*))
      
      @scala.inline
      def setEscape(value: KeyCollection): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeVarargs(value: String*): Self = StObject.set(x, "escape", js.Array(value :_*))
      
      @scala.inline
      def setExpandAll(value: KeyCollection): Self = StObject.set(x, "expandAll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandAllVarargs(value: String*): Self = StObject.set(x, "expandAll", js.Array(value :_*))
      
      @scala.inline
      def setFocusIframe(value: KeyCollection): Self = StObject.set(x, "focusIframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusIframeVarargs(value: String*): Self = StObject.set(x, "focusIframe", js.Array(value :_*))
      
      @scala.inline
      def setFocusNav(value: KeyCollection): Self = StObject.set(x, "focusNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusNavVarargs(value: String*): Self = StObject.set(x, "focusNav", js.Array(value :_*))
      
      @scala.inline
      def setFocusPanel(value: KeyCollection): Self = StObject.set(x, "focusPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusPanelVarargs(value: String*): Self = StObject.set(x, "focusPanel", js.Array(value :_*))
      
      @scala.inline
      def setFullScreen(value: KeyCollection): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullScreenVarargs(value: String*): Self = StObject.set(x, "fullScreen", js.Array(value :_*))
      
      @scala.inline
      def setNextComponent(value: KeyCollection): Self = StObject.set(x, "nextComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextComponentVarargs(value: String*): Self = StObject.set(x, "nextComponent", js.Array(value :_*))
      
      @scala.inline
      def setNextStory(value: KeyCollection): Self = StObject.set(x, "nextStory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextStoryVarargs(value: String*): Self = StObject.set(x, "nextStory", js.Array(value :_*))
      
      @scala.inline
      def setPanelPosition(value: KeyCollection): Self = StObject.set(x, "panelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelPositionVarargs(value: String*): Self = StObject.set(x, "panelPosition", js.Array(value :_*))
      
      @scala.inline
      def setPrevComponent(value: KeyCollection): Self = StObject.set(x, "prevComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevComponentVarargs(value: String*): Self = StObject.set(x, "prevComponent", js.Array(value :_*))
      
      @scala.inline
      def setPrevStory(value: KeyCollection): Self = StObject.set(x, "prevStory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevStoryVarargs(value: String*): Self = StObject.set(x, "prevStory", js.Array(value :_*))
      
      @scala.inline
      def setSearch(value: KeyCollection): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchVarargs(value: String*): Self = StObject.set(x, "search", js.Array(value :_*))
      
      @scala.inline
      def setShortcutsPage(value: KeyCollection): Self = StObject.set(x, "shortcutsPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortcutsPageVarargs(value: String*): Self = StObject.set(x, "shortcutsPage", js.Array(value :_*))
      
      @scala.inline
      def setToggleNav(value: KeyCollection): Self = StObject.set(x, "toggleNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleNavVarargs(value: String*): Self = StObject.set(x, "toggleNav", js.Array(value :_*))
      
      @scala.inline
      def setTogglePanel(value: KeyCollection): Self = StObject.set(x, "togglePanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTogglePanelVarargs(value: String*): Self = StObject.set(x, "togglePanel", js.Array(value :_*))
      
      @scala.inline
      def setToolbar(value: KeyCollection): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarVarargs(value: String*): Self = StObject.set(x, "toolbar", js.Array(value :_*))
    }
  }
  
  @js.native
  trait SubAPI extends StObject {
    
    def getShortcutKeys(): Shortcuts = js.native
    
    def handleKeydownEvent(event: Event): Unit = js.native
    
    def handleShortcutFeature(feature: Action): Unit = js.native
    
    def restoreAllDefaultShortcuts(): js.Promise[Shortcuts] = js.native
    
    def restoreDefaultShortcut(action: Action): js.Promise[KeyCollection] = js.native
    
    def setShortcut(action: Action, value: KeyCollection): js.Promise[KeyCollection] = js.native
    
    def setShortcuts(shortcuts: Shortcuts): js.Promise[Shortcuts] = js.native
  }
  object SubAPI {
    
    @scala.inline
    def apply(
      getShortcutKeys: () => Shortcuts,
      handleKeydownEvent: Event => Unit,
      handleShortcutFeature: Action => Unit,
      restoreAllDefaultShortcuts: () => js.Promise[Shortcuts],
      restoreDefaultShortcut: Action => js.Promise[KeyCollection],
      setShortcut: (Action, KeyCollection) => js.Promise[KeyCollection],
      setShortcuts: Shortcuts => js.Promise[Shortcuts]
    ): SubAPI = {
      val __obj = js.Dynamic.literal(getShortcutKeys = js.Any.fromFunction0(getShortcutKeys), handleKeydownEvent = js.Any.fromFunction1(handleKeydownEvent), handleShortcutFeature = js.Any.fromFunction1(handleShortcutFeature), restoreAllDefaultShortcuts = js.Any.fromFunction0(restoreAllDefaultShortcuts), restoreDefaultShortcut = js.Any.fromFunction1(restoreDefaultShortcut), setShortcut = js.Any.fromFunction2(setShortcut), setShortcuts = js.Any.fromFunction1(setShortcuts))
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit class SubAPIMutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetShortcutKeys(value: () => Shortcuts): Self = StObject.set(x, "getShortcutKeys", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHandleKeydownEvent(value: Event => Unit): Self = StObject.set(x, "handleKeydownEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHandleShortcutFeature(value: Action => Unit): Self = StObject.set(x, "handleShortcutFeature", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRestoreAllDefaultShortcuts(value: () => js.Promise[Shortcuts]): Self = StObject.set(x, "restoreAllDefaultShortcuts", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRestoreDefaultShortcut(value: Action => js.Promise[KeyCollection]): Self = StObject.set(x, "restoreDefaultShortcut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetShortcut(value: (Action, KeyCollection) => js.Promise[KeyCollection]): Self = StObject.set(x, "setShortcut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetShortcuts(value: Shortcuts => js.Promise[Shortcuts]): Self = StObject.set(x, "setShortcuts", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SubState extends StObject {
    
    var shortcuts: Shortcuts = js.native
  }
  object SubState {
    
    @scala.inline
    def apply(shortcuts: Shortcuts): SubState = {
      val __obj = js.Dynamic.literal(shortcuts = shortcuts.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    @scala.inline
    implicit class SubStateMutableBuilder[Self <: SubState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShortcuts(value: Shortcuts): Self = StObject.set(x, "shortcuts", value.asInstanceOf[js.Any])
    }
  }
}
