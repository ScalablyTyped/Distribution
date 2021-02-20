package typings.reactMdTabs

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactMdTabs.typesMod.TabConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsManagerMod {
  
  @JSImport("@react-md/tabs/types/TabsManager", "TabsManager")
  @js.native
  def TabsManager(
    hasTabsIdDefaultActiveIndexActiveIndexOnActiveIndexChangeTabsStackedIconAfterChildren: TabsManagerProps
  ): ReactElement = js.native
  
  @JSImport("@react-md/tabs/types/TabsManager", "useTabs")
  @js.native
  def useTabs(): InitializedTabsManagerContext = js.native
  
  /* Inlined @react-md/tabs.@react-md/tabs/types/types.TabConfig & std.Required<std.Pick<@react-md/tabs.@react-md/tabs/types/types.TabConfig, 'id'>> */
  @js.native
  trait InitializedTabConfig extends StObject {
    
    /**
      * The children to display in the tab. This is required and should normally
      * just be text or an icon.
      */
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * An optional className to apply to the tab.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * An optional className to apply to the `<span>` surrounding the `children`
      * of the `Tab`. You _probably_ won't need to use this.
      */
    var contentClassName: js.UndefOr[String] = js.native
    
    /**
      * An optional style to apply to the `<span>` surrounding the `children` of
      * the `Tab`. You _probably_ won't need to use this.
      */
    var contentStyle: js.UndefOr[CSSProperties] = js.native
    
    /**
      * Boolean if the tab should be disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional icon to render in the `Tab` along with the normal text. If you
      * want to have an icon only tab, you should not use this prop and instead
      * just provide the icon as the tab's children.
      */
    var icon: js.UndefOr[ReactNode] = js.native
    
    /**
      * Boolean if the icon should appear after the text instead of before. When
      * the `stacked` prop is also enabled, it will cause the icon to appear below
      * the text instead of above.
      */
    var iconAfter: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional id to use for the tab if the default generated ids are not to
      * your liking.
      */
    var id: js.UndefOr[String] with String = js.native
    
    /**
      * Boolean if the icon and text should be stacked instead of rendered inline.
      * This is only valid when the `icon` prop has been provided.
      */
    var stacked: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional style to apply to the tab.
      */
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object InitializedTabConfig {
    
    @scala.inline
    def apply(id: js.UndefOr[String] with String): InitializedTabConfig = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitializedTabConfig]
    }
    
    @scala.inline
    implicit class InitializedTabConfigMutableBuilder[Self <: InitializedTabConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      @scala.inline
      def setContentStyle(value: CSSProperties): Self = StObject.set(x, "contentStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentStyleUndefined: Self = StObject.set(x, "contentStyle", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setId(value: js.UndefOr[String] with String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* Inlined std.Required<@react-md/tabs.@react-md/tabs/types/TabsManager.TabsManagerContext> */
  @js.native
  trait InitializedTabsManagerContext extends StObject {
    
    var activeIndex: Double = js.native
    
    var onActiveIndexChange: js.Function1[/* activeIndex */ Double, Unit] = js.native
    
    var tabs: js.Array[InitializedTabConfig] = js.native
    
    var tabsId: String = js.native
  }
  object InitializedTabsManagerContext {
    
    @scala.inline
    def apply(
      activeIndex: Double,
      onActiveIndexChange: /* activeIndex */ Double => Unit,
      tabs: js.Array[InitializedTabConfig],
      tabsId: String
    ): InitializedTabsManagerContext = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1(onActiveIndexChange), tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitializedTabsManagerContext]
    }
    
    @scala.inline
    implicit class InitializedTabsManagerContextMutableBuilder[Self <: InitializedTabsManagerContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnActiveIndexChange(value: /* activeIndex */ Double => Unit): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTabs(value: js.Array[InitializedTabConfig]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsId(value: String): Self = StObject.set(x, "tabsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsVarargs(value: InitializedTabConfig*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
  
  @js.native
  trait TabsManagerContext extends StObject {
    
    /**
      * The current active tab index to determine which tabs to animate in and out
      * of view.
      */
    var activeIndex: Double = js.native
    
    /**
      * A function to call when the `activeIndex` should change due to keyboard
      * movement or clicking on a tab.
      */
    def onActiveIndexChange(activeIndex: Double): Unit = js.native
    
    /**
      * The list of tabs that should be controlled by the tabs manager.
      */
    var tabs: js.Array[InitializedTabConfig] = js.native
    
    /**
      * This is an id prefix to use for all the child Tab, TabList, and TabPanel
      * components.
      *
      * - `Tabs` -> id={id}
      * - `Tab` ->
      *    - id={`${id}-tab-${index + 1}`}
      *    - panelId={active && `${id}-panel-${index + 1}`}
      * - `TabPanel` -> id={`${id}-panel-${index + 1}`}
      */
    var tabsId: String = js.native
  }
  object TabsManagerContext {
    
    @scala.inline
    def apply(
      activeIndex: Double,
      onActiveIndexChange: Double => Unit,
      tabs: js.Array[InitializedTabConfig],
      tabsId: String
    ): TabsManagerContext = {
      val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], onActiveIndexChange = js.Any.fromFunction1(onActiveIndexChange), tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsManagerContext]
    }
    
    @scala.inline
    implicit class TabsManagerContextMutableBuilder[Self <: TabsManagerContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnActiveIndexChange(value: Double => Unit): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTabs(value: js.Array[InitializedTabConfig]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsId(value: String): Self = StObject.set(x, "tabsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsVarargs(value: InitializedTabConfig*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
  
  /* Inlined parent std.Omit<@react-md/tabs.@react-md/tabs/types/TabsManager.TabsManagerContext, 'activeIndex' | 'onActiveIndexChange' | 'tabs'> */
  @js.native
  trait TabsManagerProps extends StObject {
    
    /**
      * If you want to control the current active index instead of relying on the
      * built in behavior, you can provide an `activeIndex` prop which will be used
      * instead.  If this prop is defined, you **must** also provide the
      * `onActiveIndexChange` so that keyboard functionality and tab changing
      * behavior can still be used.
      */
    var activeIndex: js.UndefOr[Double] = js.native
    
    /**
      * The children to render that should eventually have the `Tabs` component and
      * the `TabContent` for matching specific tabs.
      */
    var children: ReactNode = js.native
    
    /**
      * The index of the tab that should be active by default. This is ignored if
      * the `activeIndex` prop is defined.
      */
    var defaultActiveIndex: js.UndefOr[Double] = js.native
    
    /**
      * Boolean if the icon should appear after the text instead of before for all
      * the `tabs` that have an icon. When the `stacked` prop is also enabled, it
      * will cause the icon to appear below the text instead of above.
      *
      * This is mostly a convenience prop so that you don't manually need to enable
      * it for each tab in the `tabs` list and if a `tab` in the `tabs` list has
      * the `stacked` attribute enabled defined, it will be used instead of this
      * value.
      */
    var iconAfter: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional function to call when the active index changes when the
      * `activeIndex` prop is not provided. If the `activeIndex` prop is provided,
      * this is **required** for keyboard accessibility.
      */
    var onActiveIndexChange: js.UndefOr[js.Function1[/* activeIndex */ Double, Unit]] = js.native
    
    /**
      * Boolean if all the `tabs` that have icons should be stacked instead of
      * rendered inline.
      *
      * This is mostly a convenience prop so that you don't manually need to enable
      * it for each tab in the `tabs` list and if a `tab` in the `tabs` list has
      * the `stacked` attribute enabled defined, it will be used instead of this
      * value.
      */
    var stacked: js.UndefOr[Boolean] = js.native
    
    /**
      * The list of tabs that should be controlled by the tabs manager.
      */
    var tabs: js.Array[TabConfig | ReactElement | String] = js.native
    
    var tabsId: String = js.native
  }
  object TabsManagerProps {
    
    @scala.inline
    def apply(tabs: js.Array[TabConfig | ReactElement | String], tabsId: String): TabsManagerProps = {
      val __obj = js.Dynamic.literal(tabs = tabs.asInstanceOf[js.Any], tabsId = tabsId.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsManagerProps]
    }
    
    @scala.inline
    implicit class TabsManagerPropsMutableBuilder[Self <: TabsManagerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefaultActiveIndex(value: Double): Self = StObject.set(x, "defaultActiveIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultActiveIndexUndefined: Self = StObject.set(x, "defaultActiveIndex", js.undefined)
      
      @scala.inline
      def setIconAfter(value: Boolean): Self = StObject.set(x, "iconAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconAfterUndefined: Self = StObject.set(x, "iconAfter", js.undefined)
      
      @scala.inline
      def setOnActiveIndexChange(value: /* activeIndex */ Double => Unit): Self = StObject.set(x, "onActiveIndexChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnActiveIndexChangeUndefined: Self = StObject.set(x, "onActiveIndexChange", js.undefined)
      
      @scala.inline
      def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
      
      @scala.inline
      def setTabs(value: js.Array[TabConfig | ReactElement | String]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsId(value: String): Self = StObject.set(x, "tabsId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabsVarargs(value: (TabConfig | ReactElement | String)*): Self = StObject.set(x, "tabs", js.Array(value :_*))
    }
  }
}
