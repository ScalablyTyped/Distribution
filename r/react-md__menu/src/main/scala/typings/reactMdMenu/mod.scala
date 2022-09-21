package typings.reactMdMenu

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdList.listMod.ListElement
import typings.reactMdMenu.anon.ReadonlyMenuBarContext
import typings.reactMdMenu.anon.ReadonlyMenuConfiguration
import typings.reactMdMenu.anon.ReadonlyMenuVisibilityCon
import typings.reactMdMenu.menuBarMod.MenuBarProps
import typings.reactMdMenu.menuBarProviderMod.MenuBarProviderProps
import typings.reactMdMenu.menuBarWidgetMod.MenuBarWidgetProps
import typings.reactMdMenu.menuButtonMod.MenuButtonProps
import typings.reactMdMenu.menuConfigurationProviderMod.MenuConfigurationProviderProps
import typings.reactMdMenu.menuItemButtonMod.MenuItemButtonProps
import typings.reactMdMenu.menuItemGroupMod.MenuItemGroupProps
import typings.reactMdMenu.menuItemLinkMod.MenuItemLinkProps
import typings.reactMdMenu.menuItemLinkMod.MenuItemLinkWithComponentProps
import typings.reactMdMenu.menuItemSeparatorMod.MenuItemSeparatorProps
import typings.reactMdMenu.menuKeyboardFocusProviderMod.MenuKeyboardFocusProviderProps
import typings.reactMdMenu.menuRendererMod.MenuRendererProps
import typings.reactMdMenu.menuSheetMod.MenuSheetProps
import typings.reactMdMenu.menuVisibilityProviderMod.MenuVisibilityProviderProps
import typings.reactMdMenu.typesMod.DropdownMenuProps
import typings.reactMdMenu.typesMod.MenuConfiguration
import typings.reactMdMenu.typesMod.MenuItemProps
import typings.reactMdMenu.typesMod.MenuProps
import typings.reactMdMenu.typesMod.MenuWidgetProps
import typings.reactMdMenu.typesMod.RenderMenuAsSheet
import typings.reactMdMenu.useContextMenuMod.ContextMenuHookOptions
import typings.reactMdMenu.useContextMenuMod.ContextMenuHookReturnValue
import typings.reactMdMenu.useMenuMod.MenuHookOptions
import typings.reactMdMenu.useMenuMod.MenuHookReturnValue
import typings.reactMdSheet.sheetMod.SheetPosition
import typings.reactMdSheet.sheetMod.SheetVerticalSize
import typings.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<@react-md/menu.@react-md/menu/types/types.MenuConfigurationContext> */
  object DEFAULT_MENU_CONFIGURATION {
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.horizontal")
    @js.native
    val horizontal: Boolean = js.native
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.renderAsSheet")
    @js.native
    val renderAsSheet: RenderMenuAsSheet = js.native
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.sheetFooter")
    @js.native
    val sheetFooter: ReactNode = js.native
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.sheetHeader")
    @js.native
    val sheetHeader: ReactNode = js.native
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.sheetPosition")
    @js.native
    val sheetPosition: SheetPosition = js.native
    
    @JSImport("@react-md/menu", "DEFAULT_MENU_CONFIGURATION.sheetVerticalSize")
    @js.native
    val sheetVerticalSize: SheetVerticalSize = js.native
  }
  
  inline def DropdownMenu(
    hasIdOnClickOnKeyDownOnMouseEnterOnMouseLeaveMenuLabelPropMenuPropsMenuStyleMenuClassNameSheetPropsSheetMenuPropsSheetStyleSheetClassNamePropSheetHeaderPropSheetFooterPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeListStyleListClassNameListPropsAppearEnterExitPropTimeoutClassNamesAnchorFixedPositionOptionsGetFixedPositionOptionsTemporaryPortalPortalIntoPortalIntoIdOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedPropHorizontalChildrenPreventScrollCloseOnResizeCloseOnScrollPropIconRotator: DropdownMenuProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("DropdownMenu")(hasIdOnClickOnKeyDownOnMouseEnterOnMouseLeaveMenuLabelPropMenuPropsMenuStyleMenuClassNameSheetPropsSheetMenuPropsSheetStyleSheetClassNamePropSheetHeaderPropSheetFooterPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeListStyleListClassNameListPropsAppearEnterExitPropTimeoutClassNamesAnchorFixedPositionOptionsGetFixedPositionOptionsTemporaryPortalPortalIntoPortalIntoIdOnEnterOnEnteringOnEnteredOnExitOnExitingOnExitedPropHorizontalChildrenPreventScrollCloseOnResizeCloseOnScrollPropIconRotator.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/menu", "Menu")
  @js.native
  val Menu: ForwardRefExoticComponent[LabelRequiredForA11y[MenuProps] & RefAttributes[HTMLDivElement]] = js.native
  
  inline def MenuBar(hasHoverTimeoutProps: MenuBarProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuBar")(hasHoverTimeoutProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuBarProvider(hasChildrenRootDefaultActiveIdHoverTimeout: MenuBarProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuBarProvider")(hasChildrenRootDefaultActiveIdHoverTimeout.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuBarWidget(hasChildrenTabIndexPropOnFocusPropOnKeyDownProps: MenuBarWidgetProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuBarWidget")(hasChildrenTabIndexPropOnFocusPropOnKeyDownProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/menu", "MenuButton")
  @js.native
  val MenuButton: ForwardRefExoticComponent[MenuButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  inline def MenuConfigurationProvider(hasChildrenConfiguration: MenuConfigurationProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuConfigurationProvider")(hasChildrenConfiguration.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/menu", "MenuItem")
  @js.native
  val MenuItem: ForwardRefExoticComponent[MenuItemProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/menu", "MenuItemButton")
  @js.native
  val MenuItemButton: ForwardRefExoticComponent[MenuItemButtonProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/menu", "MenuItemGroup")
  @js.native
  val MenuItemGroup: ForwardRefExoticComponent[MenuItemGroupProps & RefAttributes[ListElement]] = js.native
  
  @JSImport("@react-md/menu", "MenuItemLink")
  @js.native
  val MenuItemLink: ForwardRefExoticComponent[
    (MenuItemLinkProps & RefAttributes[HTMLAnchorElement]) | ((Pick[MenuItemLinkWithComponentProps, String | Double]) & RefAttributes[HTMLAnchorElement])
  ] = js.native
  
  @JSImport("@react-md/menu", "MenuItemSeparator")
  @js.native
  val MenuItemSeparator: ForwardRefExoticComponent[MenuItemSeparatorProps & RefAttributes[HTMLLIElement]] = js.native
  
  inline def MenuKeyboardFocusProvider(hasHorizontalChildren: MenuKeyboardFocusProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuKeyboardFocusProvider")(hasHorizontalChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuRenderer(
    hasMenuRefMenuPropsMenuStyleMenuClassNameSheetPropsPropSheetHeaderPropSheetFooterSheetStyleSheetClassNameSheetMenuPropsChildrenPropHorizontalPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeOnRequestCloseOnClickOnKeyDownProps: MenuRendererProps
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuRenderer")(hasMenuRefMenuPropsMenuStyleMenuClassNameSheetPropsPropSheetHeaderPropSheetFooterSheetStyleSheetClassNameSheetMenuPropsChildrenPropHorizontalPropRenderAsSheetPropSheetPositionPropSheetVerticalSizeOnRequestCloseOnClickOnKeyDownProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuSheet(
    hasIdChildrenHeaderFooterHorizontalMenuRefMenuPropsListStyleListClassNameListPropsPositionVerticalSizeOnClickOverlayPropsOnRequestCloseProps: LabelRequiredForA11y[MenuSheetProps]
  ): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuSheet")(hasIdChildrenHeaderFooterHorizontalMenuRefMenuPropsListStyleListClassNameListPropsPositionVerticalSizeOnClickOverlayPropsOnRequestCloseProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def MenuVisibilityProvider(hasVisibleSetVisibleChildren: MenuVisibilityProviderProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuVisibilityProvider")(hasVisibleSetVisibleChildren.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("@react-md/menu", "MenuWidget")
  @js.native
  val MenuWidget: ForwardRefExoticComponent[LabelRequiredForA11y[MenuWidgetProps] & RefAttributes[HTMLDivElement]] = js.native
  
  inline def useContextMenu(): ContextMenuHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")().asInstanceOf[ContextMenuHookReturnValue]
  inline def useContextMenu(
    hasAnchorBaseIdMenuLabelFixedPositionOptionsOnContextMenuPreventScrollOptions: ContextMenuHookOptions
  ): ContextMenuHookReturnValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")(hasAnchorBaseIdMenuLabelFixedPositionOptionsOnContextMenuPreventScrollOptions.asInstanceOf[js.Any]).asInstanceOf[ContextMenuHookReturnValue]
  
  inline def useMenu[ToggleEl /* <: HTMLElement */](options: MenuHookOptions[ToggleEl]): MenuHookReturnValue[ToggleEl] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenu")(options.asInstanceOf[js.Any]).asInstanceOf[MenuHookReturnValue[ToggleEl]]
  
  inline def useMenuBarContext(): ReadonlyMenuBarContext = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuBarContext")().asInstanceOf[ReadonlyMenuBarContext]
  
  inline def useMenuBarWidgetFocusId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuBarWidgetFocusId")().asInstanceOf[String]
  
  inline def useMenuConfiguration(): ReadonlyMenuConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuConfiguration")().asInstanceOf[ReadonlyMenuConfiguration]
  inline def useMenuConfiguration(hasHorizontalRenderAsSheetSheetHeaderSheetFooterSheetPositionSheetVerticalSize: MenuConfiguration): ReadonlyMenuConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuConfiguration")(hasHorizontalRenderAsSheetSheetHeaderSheetFooterSheetPositionSheetVerticalSize.asInstanceOf[js.Any]).asInstanceOf[ReadonlyMenuConfiguration]
  
  inline def useMenuVisibility(): ReadonlyMenuVisibilityCon = ^.asInstanceOf[js.Dynamic].applyDynamic("useMenuVisibility")().asInstanceOf[ReadonlyMenuVisibilityCon]
}
