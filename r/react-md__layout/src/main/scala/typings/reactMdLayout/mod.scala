package typings.reactMdLayout

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.RefAttributes
import typings.reactMdAppBar.appBarTitleMod.AppBarTitleProps
import typings.reactMdLayout.configurationMod.ConfigurationProps
import typings.reactMdLayout.layoutAppBarMod.LayoutAppBarProps
import typings.reactMdLayout.layoutChildrenMod.LayoutChildrenProps
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
import typings.reactMdTransition.typesMod.CSSTransitionClassNames
import typings.reactMdTree.typesMod.BaseTreeItem
import typings.reactMdTree.typesMod.TreeItemRenderer
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
  
  inline def Configuration(
    hasOnAppResizeChildrenIconsFormThemeDefaultDirPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSizeRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleHoverModeMenuConfiguration: ConfigurationProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Configuration")(hasOnAppResizeChildrenIconsFormThemeDefaultDirPhoneMaxWidthTabletMinWidthTabletMaxWidthDesktopMinWidthDesktopLargeMinWidthDefaultSizeRippleTimeoutRippleClassNamesDisableRippleDisableProgrammaticRippleHoverModeMenuConfiguration.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/layout", "DEFAULT_DESKTOP_LAYOUT")
  @js.native
  val DEFAULT_DESKTOP_LAYOUT: SupportedWideLayout = js.native
  
  @JSImport("@react-md/layout", "DEFAULT_LANDSCAPE_TABLET_LAYOUT")
  @js.native
  val DEFAULT_LANDSCAPE_TABLET_LAYOUT: SupportedTabletLayout = js.native
  
  @JSImport("@react-md/layout", "DEFAULT_LAYOUT_MAIN_CLASSNAMES")
  @js.native
  val DEFAULT_LAYOUT_MAIN_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/layout", "DEFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES")
  @js.native
  val DEFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/layout", "DEFAULT_PHONE_LAYOUT")
  @js.native
  val DEFAULT_PHONE_LAYOUT: SupportedPhoneLayout = js.native
  
  @JSImport("@react-md/layout", "DEFAULT_TABLET_LAYOUT")
  @js.native
  val DEFAULT_TABLET_LAYOUT: SupportedTabletLayout = js.native
  
  /* Inlined std.Readonly<std.Readonly<@react-md/transition.@react-md/transition.CSSTransitionClassNamesObject>> */
  object DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES {
    
    @JSImport("@react-md/layout", "DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES.appear")
    @js.native
    val appear: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/layout", "DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES.appearActive")
    @js.native
    val appearActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/layout", "DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES.appearDone")
    @js.native
    val appearDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/layout", "DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES.enter")
    @js.native
    val enter: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/layout", "DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES.enterActive")
    @js.native
    val enterActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/layout", "DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES.enterDone")
    @js.native
    val enterDone: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/layout", "DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES.exit")
    @js.native
    val exit: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/layout", "DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES.exitActive")
    @js.native
    val exitActive: js.UndefOr[String] = js.native
    
    @JSImport("@react-md/layout", "DEFFAULT_LAYOUT_NAV_TOGGLE_CLASSNAMES.exitDone")
    @js.native
    val exitDone: js.UndefOr[String] = js.native
  }
  
  inline def Layout(
    hasIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutDefaultToggleableVisibleProps: LayoutProps[LayoutNavigationItem]
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Layout")(hasIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutDefaultToggleableVisibleProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/layout", "LayoutAppBar")
  @js.native
  val LayoutAppBar: ForwardRefExoticComponent[LayoutAppBarProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/layout", "LayoutAppBarTitle")
  @js.native
  val LayoutAppBarTitle: ForwardRefExoticComponent[AppBarTitleProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def LayoutChildren(
    hasIdPropAppBarAppBarPropsCustomTitleTitleTitlePropsNavToggleNavTogglePropsNavAfterAppBarPropNavMiniNavMiniNavItemsMiniWrapperPropsNavHeaderNavHeaderPropsNavHeaderTitleNavHeaderTitlePropsCloseNavCloseNavPropsTreePropsNavPropsSkipPropsMainPropsChildren: LayoutChildrenProps[LayoutNavigationItem]
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("LayoutChildren")(hasIdPropAppBarAppBarPropsCustomTitleTitleTitlePropsNavToggleNavTogglePropsNavAfterAppBarPropNavMiniNavMiniNavItemsMiniWrapperPropsNavHeaderNavHeaderPropsNavHeaderTitleNavHeaderTitlePropsCloseNavCloseNavPropsTreePropsNavPropsSkipPropsMainPropsChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
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
  
  inline def LayoutProvider(
    hasBaseIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutDefaultToggleableVisibleFixedAppBarChildren: LayoutProviderProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("LayoutProvider")(hasBaseIdPhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayoutDefaultToggleableVisibleFixedAppBarChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/layout", "LayoutTree")
  @js.native
  val LayoutTree: ForwardRefExoticComponent[LayoutTreeProps[LayoutNavigationItem] & RefAttributes[HTMLUListElement]] = js.native
  
  @JSImport("@react-md/layout", "defaultMiniNavigationItemRenderer")
  @js.native
  val defaultMiniNavigationItemRenderer: TreeItemRenderer[LayoutNavigationItem] = js.native
  
  @JSImport("@react-md/layout", "defaultNavigationItemRenderer")
  @js.native
  val defaultNavigationItemRenderer: TreeItemRenderer[LayoutNavigationItem] = js.native
  
  inline def getLayoutType(
    hasAppSizePhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayout: GetLayoutOptions
  ): SupportedWideLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("getLayoutType")(hasAppSizePhoneLayoutTabletLayoutLandscapeTabletLayoutDesktopLayoutLargeDesktopLayout.asInstanceOf[js.Any]).asInstanceOf[SupportedWideLayout]
  
  inline def isFullHeightLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFullHeightLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMiniLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMiniLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPersistentLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPersistentLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isTemporaryLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTemporaryLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isToggleableLayout(layout: SupportedWideLayout): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isToggleableLayout")(layout.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useLayoutConfig(): LayoutContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutConfig")().asInstanceOf[LayoutContext]
  
  inline def useLayoutNavigation[T /* <: BaseTreeItem */](navItems: LayoutNavigationTree[T], pathname: String): LayoutNavigationState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutNavigation")(navItems.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any])).asInstanceOf[LayoutNavigationState[T]]
  inline def useLayoutNavigation[T /* <: BaseTreeItem */](navItems: LayoutNavigationTree[T], pathname: String, linkComponent: ElementType[Any]): LayoutNavigationState[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useLayoutNavigation")(navItems.asInstanceOf[js.Any], pathname.asInstanceOf[js.Any], linkComponent.asInstanceOf[js.Any])).asInstanceOf[LayoutNavigationState[T]]
}
