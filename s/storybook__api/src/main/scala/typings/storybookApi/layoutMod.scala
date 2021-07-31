package typings.storybookApi

import typings.storybookApi.mod.ModuleFn
import typings.storybookApi.storybookApiStrings.addons
import typings.storybookApi.storybookApiStrings.canvas
import typings.storybookApi.storybookApiStrings.sidebar
import typings.storybookTheming.typesMod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod {
  
  object ActiveTabs {
    
    @JSImport("@storybook/api/dist/modules/layout", "ActiveTabs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/api/dist/modules/layout", "ActiveTabs.ADDONS")
    @js.native
    def ADDONS: addons = js.native
    @scala.inline
    def ADDONS_=(x: addons): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDONS")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/api/dist/modules/layout", "ActiveTabs.CANVAS")
    @js.native
    def CANVAS: canvas = js.native
    @scala.inline
    def CANVAS_=(x: canvas): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CANVAS")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/api/dist/modules/layout", "ActiveTabs.SIDEBAR")
    @js.native
    def SIDEBAR: sidebar = js.native
    @scala.inline
    def SIDEBAR_=(x: sidebar): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SIDEBAR")(x.asInstanceOf[js.Any])
  }
  
  object focusableUIElements {
    
    @JSImport("@storybook/api/dist/modules/layout", "focusableUIElements")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/api/dist/modules/layout", "focusableUIElements.storyListMenu")
    @js.native
    def storyListMenu: String = js.native
    @scala.inline
    def storyListMenu_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyListMenu")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/api/dist/modules/layout", "focusableUIElements.storyPanelRoot")
    @js.native
    def storyPanelRoot: String = js.native
    @scala.inline
    def storyPanelRoot_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storyPanelRoot")(x.asInstanceOf[js.Any])
    
    @JSImport("@storybook/api/dist/modules/layout", "focusableUIElements.storySearchField")
    @js.native
    def storySearchField: String = js.native
    @scala.inline
    def storySearchField_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storySearchField")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/api/dist/modules/layout", "init")
  @js.native
  val init: ModuleFn = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookApi.storybookApiStrings.sidebar
    - typings.storybookApi.storybookApiStrings.canvas
    - typings.storybookApi.storybookApiStrings.addons
  */
  trait ActiveTabsType extends StObject
  object ActiveTabsType {
    
    @scala.inline
    def addons: typings.storybookApi.storybookApiStrings.addons = "addons".asInstanceOf[typings.storybookApi.storybookApiStrings.addons]
    
    @scala.inline
    def canvas: typings.storybookApi.storybookApiStrings.canvas = "canvas".asInstanceOf[typings.storybookApi.storybookApiStrings.canvas]
    
    @scala.inline
    def sidebar: typings.storybookApi.storybookApiStrings.sidebar = "sidebar".asInstanceOf[typings.storybookApi.storybookApiStrings.sidebar]
  }
  
  trait Layout extends StObject {
    
    var initialActive: ActiveTabsType
    
    var isFullscreen: Boolean
    
    var isToolshown: Boolean
    
    var panelPosition: PanelPositions
    
    var showNav: Boolean
    
    var showPanel: Boolean
  }
  object Layout {
    
    @scala.inline
    def apply(
      initialActive: ActiveTabsType,
      isFullscreen: Boolean,
      isToolshown: Boolean,
      panelPosition: PanelPositions,
      showNav: Boolean,
      showPanel: Boolean
    ): Layout = {
      val __obj = js.Dynamic.literal(initialActive = initialActive.asInstanceOf[js.Any], isFullscreen = isFullscreen.asInstanceOf[js.Any], isToolshown = isToolshown.asInstanceOf[js.Any], panelPosition = panelPosition.asInstanceOf[js.Any], showNav = showNav.asInstanceOf[js.Any], showPanel = showPanel.asInstanceOf[js.Any])
      __obj.asInstanceOf[Layout]
    }
    
    @scala.inline
    implicit class LayoutMutableBuilder[Self <: Layout] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialActive(value: ActiveTabsType): Self = StObject.set(x, "initialActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsFullscreen(value: Boolean): Self = StObject.set(x, "isFullscreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsToolshown(value: Boolean): Self = StObject.set(x, "isToolshown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelPosition(value: PanelPositions): Self = StObject.set(x, "panelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNav(value: Boolean): Self = StObject.set(x, "showNav", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowPanel(value: Boolean): Self = StObject.set(x, "showPanel", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.storybookApi.storybookApiStrings.bottom
    - typings.storybookApi.storybookApiStrings.right
  */
  trait PanelPositions extends StObject
  object PanelPositions {
    
    @scala.inline
    def bottom: typings.storybookApi.storybookApiStrings.bottom = "bottom".asInstanceOf[typings.storybookApi.storybookApiStrings.bottom]
    
    @scala.inline
    def right: typings.storybookApi.storybookApiStrings.right = "right".asInstanceOf[typings.storybookApi.storybookApiStrings.right]
  }
  
  @js.native
  trait SubAPI extends StObject {
    
    def setOptions(options: js.Any): Unit = js.native
    
    def toggleFullscreen(): Unit = js.native
    def toggleFullscreen(toggled: Boolean): Unit = js.native
    
    def toggleNav(): Unit = js.native
    def toggleNav(toggled: Boolean): Unit = js.native
    
    def togglePanel(): Unit = js.native
    def togglePanel(toggled: Boolean): Unit = js.native
    
    def togglePanelPosition(): Unit = js.native
    def togglePanelPosition(position: PanelPositions): Unit = js.native
    
    def toggleToolbar(): Unit = js.native
    def toggleToolbar(toggled: Boolean): Unit = js.native
  }
  
  trait SubState extends StObject {
    
    var layout: Layout
    
    var selectedPanel: js.UndefOr[String] = js.undefined
    
    var theme: ThemeVars
    
    var ui: UI
  }
  object SubState {
    
    @scala.inline
    def apply(layout: Layout, theme: ThemeVars, ui: UI): SubState = {
      val __obj = js.Dynamic.literal(layout = layout.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubState]
    }
    
    @scala.inline
    implicit class SubStateMutableBuilder[Self <: SubState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedPanel(value: String): Self = StObject.set(x, "selectedPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedPanelUndefined: Self = StObject.set(x, "selectedPanel", js.undefined)
      
      @scala.inline
      def setTheme(value: ThemeVars): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUi(value: UI): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    }
  }
  
  trait UI extends StObject {
    
    var docsMode: Boolean
    
    var enableShortcuts: Boolean
    
    var name: js.UndefOr[String] = js.undefined
    
    var sidebarAnimations: Boolean
    
    var url: js.UndefOr[String] = js.undefined
  }
  object UI {
    
    @scala.inline
    def apply(docsMode: Boolean, enableShortcuts: Boolean, sidebarAnimations: Boolean): UI = {
      val __obj = js.Dynamic.literal(docsMode = docsMode.asInstanceOf[js.Any], enableShortcuts = enableShortcuts.asInstanceOf[js.Any], sidebarAnimations = sidebarAnimations.asInstanceOf[js.Any])
      __obj.asInstanceOf[UI]
    }
    
    @scala.inline
    implicit class UIMutableBuilder[Self <: UI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDocsMode(value: Boolean): Self = StObject.set(x, "docsMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableShortcuts(value: Boolean): Self = StObject.set(x, "enableShortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSidebarAnimations(value: Boolean): Self = StObject.set(x, "sidebarAnimations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait UIOptions extends StObject {
    
    var addonPanelInRight: Boolean
    
    var goFullScreen: Boolean
    
    var name: js.UndefOr[String] = js.undefined
    
    var selectedPanel: js.UndefOr[String] = js.undefined
    
    var showAddonPanel: Boolean
    
    var showStoriesPanel: Boolean
    
    var theme: js.UndefOr[ThemeVars] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
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
    implicit class UIOptionsMutableBuilder[Self <: UIOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddonPanelInRight(value: Boolean): Self = StObject.set(x, "addonPanelInRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoFullScreen(value: Boolean): Self = StObject.set(x, "goFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSelectedPanel(value: String): Self = StObject.set(x, "selectedPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedPanelUndefined: Self = StObject.set(x, "selectedPanel", js.undefined)
      
      @scala.inline
      def setShowAddonPanel(value: Boolean): Self = StObject.set(x, "showAddonPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowStoriesPanel(value: Boolean): Self = StObject.set(x, "showStoriesPanel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: ThemeVars): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
