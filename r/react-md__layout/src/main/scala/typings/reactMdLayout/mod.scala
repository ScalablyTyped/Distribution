package typings.reactMdLayout

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.appBarTitleMod.AppBarTitleProps
import typings.reactMdLayout.configurationMod.ConfigurationProps
import typings.reactMdLayout.layoutAppBarMod.LayoutAppBarProps
import typings.reactMdLayout.layoutCloseNavigationButtonMod.LayoutCloseNavigationButtonProps
import typings.reactMdLayout.layoutMainMod.LayoutMainProps
import typings.reactMdLayout.layoutMod.LayoutProps
import typings.reactMdLayout.layoutNavToggleMod.LayoutNavToggleProps
import typings.reactMdLayout.layoutNavigationHeaderMod.LayoutNavigationHeaderProps
import typings.reactMdLayout.layoutNavigationMod.LayoutNavigationProps
import typings.reactMdLayout.layoutProviderMod.LayoutContext
import typings.reactMdLayout.layoutProviderMod.LayoutProviderProps
import typings.reactMdLayout.layoutTreeMod.LayoutTreeProps
import typings.reactMdLayout.typesMod.LayoutNavigationItem
import typings.reactMdLayout.typesMod.LayoutNavigationTree
import typings.reactMdLayout.typesMod.SupportedPhoneLayout
import typings.reactMdLayout.typesMod.SupportedTabletLayout
import typings.reactMdLayout.typesMod.SupportedWideLayout
import typings.reactMdLayout.useLayoutNavigationMod.LayoutNavigationState
import typings.reactMdLayout.utilsMod.GetLayoutOptions
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.TreeItemRenderer
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLUListElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Configuration {
    
    inline def apply(
      hasOnAppResizeChildrenIconsFormThemeDefaultDirPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSizeRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleDisableTooltipHoverModeTooltipDefaultDelayTooltipDelayTimeout: ConfigurationProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasOnAppResizeChildrenIconsFormThemeDefaultDirPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSizeRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleDisableTooltipHoverModeTooltipDefaultDelayTooltipDelayTimeout.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/layout", "Configuration")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/layout", "Configuration.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/layout", "Configuration.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.defaultDir")
      @js.native
      def defaultDir: js.Any = js.native
      inline def defaultDir_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultDir")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.defaultSize")
      @js.native
      def defaultSize: js.Any = js.native
      inline def defaultSize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.desktopLargeMinWidth")
      @js.native
      def desktopLargeMinWidth: js.Any = js.native
      inline def desktopLargeMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLargeMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.desktopMinWidth")
      @js.native
      def desktopMinWidth: js.Any = js.native
      inline def desktopMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.disableProgrammaticRipple")
      @js.native
      def disableProgrammaticRipple: js.Any = js.native
      inline def disableProgrammaticRipple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableProgrammaticRipple")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.disableRipple")
      @js.native
      def disableRipple: js.Any = js.native
      inline def disableRipple_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableRipple")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.disableTooltipHoverMode")
      @js.native
      def disableTooltipHoverMode: js.Any = js.native
      inline def disableTooltipHoverMode_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableTooltipHoverMode")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.formTheme")
      @js.native
      def formTheme: js.Any = js.native
      inline def formTheme_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formTheme")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.icons")
      @js.native
      def icons: js.Any = js.native
      inline def icons_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icons")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.onAppResize")
      @js.native
      def onAppResize: js.Any = js.native
      inline def onAppResize_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAppResize")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.phoneMaxWidth")
      @js.native
      def phoneMaxWidth: js.Any = js.native
      inline def phoneMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.rippleClassNames")
      @js.native
      def rippleClassNames: js.Any = js.native
      inline def rippleClassNames_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rippleClassNames")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.rippleTimeout")
      @js.native
      def rippleTimeout: js.Any = js.native
      inline def rippleTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rippleTimeout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.tabletMaxWidth")
      @js.native
      def tabletMaxWidth: js.Any = js.native
      inline def tabletMaxWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMaxWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.tabletMinWidth")
      @js.native
      def tabletMinWidth: js.Any = js.native
      inline def tabletMinWidth_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletMinWidth")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.tooltipDefaultDelay")
      @js.native
      def tooltipDefaultDelay: js.Any = js.native
      inline def tooltipDefaultDelay_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipDefaultDelay")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Configuration.propTypes.tooltipDelayTimeout")
      @js.native
      def tooltipDelayTimeout: js.Any = js.native
      inline def tooltipDelayTimeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltipDelayTimeout")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/layout", "DEFAULT_DESKTOP_LAYOUT")
  @js.native
  val DEFAULT_DESKTOP_LAYOUT: SupportedWideLayout = js.native
  
  @JSImport("@react-md/layout", "DEFAULT_LANDSCAPE_TABLET_LAYOUT")
  @js.native
  val DEFAULT_LANDSCAPE_TABLET_LAYOUT: SupportedTabletLayout = js.native
  
  @JSImport("@react-md/layout", "DEFAULT_LAYOUT_MAIN_CLASSNAMES")
  @js.native
  val DEFAULT_LAYOUT_MAIN_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/layout", "DEFAULT_PHONE_LAYOUT")
  @js.native
  val DEFAULT_PHONE_LAYOUT: SupportedPhoneLayout = js.native
  
  @JSImport("@react-md/layout", "DEFAULT_TABLET_LAYOUT")
  @js.native
  val DEFAULT_TABLET_LAYOUT: SupportedTabletLayout = js.native
  
  @JSImport("@react-md/layout", "DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES")
  @js.native
  val DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  object Layout {
    
    inline def apply(
      hasIdPropAppBarAppBarPropsNavAfterAppBarChildrenSkipPropsMainPropsPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutCustomTitleTitleTitlePropsNavToggleNavTogglePropsPropNavNavPropsNavHeaderNavHeaderPropsNavHeaderTitleNavHeaderTitlePropsCloseNavCloseNavPropsTreeProps: LayoutProps[LayoutNavigationItem]
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasIdPropAppBarAppBarPropsNavAfterAppBarChildrenSkipPropsMainPropsPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutCustomTitleTitleTitlePropsNavToggleNavTogglePropsPropNavNavPropsNavHeaderNavHeaderPropsNavHeaderTitleNavHeaderTitlePropsCloseNavCloseNavPropsTreeProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/layout", "Layout")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/layout", "Layout.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/layout", "Layout.propTypes.appBar")
      @js.native
      def appBar: js.Any = js.native
      
      @JSImport("@react-md/layout", "Layout.propTypes.appBarProps")
      @js.native
      def appBarProps: js.Any = js.native
      inline def appBarProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appBarProps")(x.asInstanceOf[js.Any])
      
      inline def appBar_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appBar")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.closeNav")
      @js.native
      def closeNav: js.Any = js.native
      
      @JSImport("@react-md/layout", "Layout.propTypes.closeNavProps")
      @js.native
      def closeNavProps: js.Any = js.native
      inline def closeNavProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeNavProps")(x.asInstanceOf[js.Any])
      
      inline def closeNav_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closeNav")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.customTitle")
      @js.native
      def customTitle: js.Any = js.native
      inline def customTitle_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("customTitle")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.desktopLayout")
      @js.native
      def desktopLayout: js.Any = js.native
      inline def desktopLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.id")
      @js.native
      def id: js.Any = js.native
      inline def id_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("id")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.landscapeTabletLayout")
      @js.native
      def landscapeTabletLayout: js.Any = js.native
      inline def landscapeTabletLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("landscapeTabletLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.largeDesktopLayout")
      @js.native
      def largeDesktopLayout: js.Any = js.native
      inline def largeDesktopLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("largeDesktopLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.mainProps")
      @js.native
      def mainProps: js.Any = js.native
      inline def mainProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainProps")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.nav")
      @js.native
      def nav: js.Any = js.native
      
      @JSImport("@react-md/layout", "Layout.propTypes.navAfterAppBar")
      @js.native
      def navAfterAppBar: js.Any = js.native
      inline def navAfterAppBar_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navAfterAppBar")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.navHeader")
      @js.native
      def navHeader: js.Any = js.native
      
      @JSImport("@react-md/layout", "Layout.propTypes.navHeaderProps")
      @js.native
      def navHeaderProps: js.Any = js.native
      inline def navHeaderProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navHeaderProps")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.navHeaderTitle")
      @js.native
      def navHeaderTitle: js.Any = js.native
      
      @JSImport("@react-md/layout", "Layout.propTypes.navHeaderTitleProps")
      @js.native
      def navHeaderTitleProps: js.Any = js.native
      inline def navHeaderTitleProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navHeaderTitleProps")(x.asInstanceOf[js.Any])
      
      inline def navHeaderTitle_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navHeaderTitle")(x.asInstanceOf[js.Any])
      
      inline def navHeader_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navHeader")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.navProps")
      @js.native
      def navProps: js.Any = js.native
      inline def navProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navProps")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.navToggle")
      @js.native
      def navToggle: js.Any = js.native
      
      @JSImport("@react-md/layout", "Layout.propTypes.navToggleProps")
      @js.native
      def navToggleProps: js.Any = js.native
      inline def navToggleProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navToggleProps")(x.asInstanceOf[js.Any])
      
      inline def navToggle_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("navToggle")(x.asInstanceOf[js.Any])
      
      inline def nav_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nav")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.phoneLayout")
      @js.native
      def phoneLayout: js.Any = js.native
      inline def phoneLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.skipProps")
      @js.native
      def skipProps: js.Any = js.native
      inline def skipProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("skipProps")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.tabletLayout")
      @js.native
      def tabletLayout: js.Any = js.native
      inline def tabletLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.title")
      @js.native
      def title: js.Any = js.native
      
      @JSImport("@react-md/layout", "Layout.propTypes.titleProps")
      @js.native
      def titleProps: js.Any = js.native
      inline def titleProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("titleProps")(x.asInstanceOf[js.Any])
      
      inline def title_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "Layout.propTypes.treeProps")
      @js.native
      def treeProps: js.Any = js.native
      inline def treeProps_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("treeProps")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/layout", "LayoutAppBar")
  @js.native
  val LayoutAppBar: ForwardRefExoticComponent[LayoutAppBarProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/layout", "LayoutAppBarTitle")
  @js.native
  val LayoutAppBarTitle: ForwardRefExoticComponent[AppBarTitleProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/layout", "LayoutCloseNavigationButton")
  @js.native
  val LayoutCloseNavigationButton: ForwardRefExoticComponent[LayoutCloseNavigationButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/layout", "LayoutMain")
  @js.native
  val LayoutMain: ForwardRefExoticComponent[LayoutMainProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/layout", "LayoutNavToggle")
  @js.native
  val LayoutNavToggle: ForwardRefExoticComponent[LayoutNavToggleProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/layout", "LayoutNavigation")
  @js.native
  val LayoutNavigation: ForwardRefExoticComponent[LayoutNavigationProps[LayoutNavigationItem] & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/layout", "LayoutNavigationHeader")
  @js.native
  val LayoutNavigationHeader: ForwardRefExoticComponent[LayoutNavigationHeaderProps & RefAttributes[HTMLDivElement]] = js.native
  
  object LayoutProvider {
    
    inline def apply(
      hasBaseIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutChildren: LayoutProviderProps
    ): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasBaseIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
    
    @JSImport("@react-md/layout", "LayoutProvider")
    @js.native
    val ^ : js.Any = js.native
    
    object propTypes {
      
      @JSImport("@react-md/layout", "LayoutProvider.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@react-md/layout", "LayoutProvider.propTypes.baseId")
      @js.native
      def baseId: js.Any = js.native
      inline def baseId_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseId")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "LayoutProvider.propTypes.children")
      @js.native
      def children: js.Any = js.native
      inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "LayoutProvider.propTypes.desktopLayout")
      @js.native
      def desktopLayout: js.Any = js.native
      inline def desktopLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("desktopLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "LayoutProvider.propTypes.landscapeTabletLayout")
      @js.native
      def landscapeTabletLayout: js.Any = js.native
      inline def landscapeTabletLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("landscapeTabletLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "LayoutProvider.propTypes.largeDesktopLayout")
      @js.native
      def largeDesktopLayout: js.Any = js.native
      inline def largeDesktopLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("largeDesktopLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "LayoutProvider.propTypes.phoneLayout")
      @js.native
      def phoneLayout: js.Any = js.native
      inline def phoneLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("phoneLayout")(x.asInstanceOf[js.Any])
      
      @JSImport("@react-md/layout", "LayoutProvider.propTypes.tabletLayout")
      @js.native
      def tabletLayout: js.Any = js.native
      inline def tabletLayout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tabletLayout")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("@react-md/layout", "LayoutTree")
  @js.native
  val LayoutTree: ForwardRefExoticComponent[LayoutTreeProps[LayoutNavigationItem] & RefAttributes[HTMLUListElement]] = js.native
  
  @JSImport("@react-md/layout", "defaultNavigationItemRenderer")
  @js.native
  val defaultNavigationItemRenderer: TreeItemRenderer[LayoutNavigationItem] = js.native
  
  inline def getLayoutType(
    hasAppSizePhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayout: GetLayoutOptions
  ): SupportedWideLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutType")(hasAppSizePhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayout.asInstanceOf[js.Any]).asInstanceOf[SupportedWideLayout]
  
  inline def isFullHeightLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullHeightLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPersistentLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPersistentLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTemporaryLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemporaryLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isToggleableLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToggleableLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useLayoutConfig(): LayoutContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutConfig")().asInstanceOf[LayoutContext]
  
  inline def useLayoutNavigation[T /* <: BaseTreeItem */](navItems: LayoutNavigationTree[T], pathname: String): LayoutNavigationState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutNavigation")(navItems.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[LayoutNavigationState[T]]
  inline def useLayoutNavigation[T /* <: BaseTreeItem */](navItems: LayoutNavigationTree[T], pathname: String, linkComponent: ElementType[js.Any]): LayoutNavigationState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutNavigation")(navItems.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], linkComponent.asInstanceOf[js.Any])).asInstanceOf[LayoutNavigationState[T]]
}
