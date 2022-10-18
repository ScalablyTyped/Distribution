package typings.reactMdMenu

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdList.typesListMod.ListElement
import typings.reactMdMenu.anon.ReadonlyMenuBarContext
import typings.reactMdMenu.anon.ReadonlyMenuConfiguration
import typings.reactMdMenu.anon.ReadonlyMenuVisibilityCon
import typings.reactMdMenu.typesMenuBarMod.MenuBarProps
import typings.reactMdMenu.typesMenuBarProviderMod.MenuBarProviderProps
import typings.reactMdMenu.typesMenuBarWidgetMod.MenuBarWidgetProps
import typings.reactMdMenu.typesMenuButtonMod.MenuButtonProps
import typings.reactMdMenu.typesMenuConfigurationProviderMod.MenuConfigurationProviderProps
import typings.reactMdMenu.typesMenuItemButtonMod.MenuItemButtonProps
import typings.reactMdMenu.typesMenuItemGroupMod.MenuItemGroupProps
import typings.reactMdMenu.typesMenuItemLinkMod.MenuItemLinkProps
import typings.reactMdMenu.typesMenuItemLinkMod.MenuItemLinkWithComponentProps
import typings.reactMdMenu.typesMenuItemSeparatorMod.MenuItemSeparatorProps
import typings.reactMdMenu.typesMenuKeyboardFocusProviderMod.MenuKeyboardFocusProviderProps
import typings.reactMdMenu.typesMenuRendererMod.MenuRendererProps
import typings.reactMdMenu.typesMenuSheetMod.MenuSheetProps
import typings.reactMdMenu.typesMenuVisibilityProviderMod.MenuVisibilityProviderProps
import typings.reactMdMenu.typesTypesMod.DropdownMenuProps
import typings.reactMdMenu.typesTypesMod.MenuConfiguration
import typings.reactMdMenu.typesTypesMod.MenuItemProps
import typings.reactMdMenu.typesTypesMod.MenuProps
import typings.reactMdMenu.typesTypesMod.MenuWidgetProps
import typings.reactMdMenu.typesTypesMod.RenderMenuAsSheet
import typings.reactMdMenu.typesUseContextMenuMod.ContextMenuHookOptions
import typings.reactMdMenu.typesUseContextMenuMod.ContextMenuHookReturnValue
import typings.reactMdMenu.typesUseMenuMod.MenuHookOptions
import typings.reactMdMenu.typesUseMenuMod.MenuHookReturnValue
import typings.reactMdSheet.typesSheetMod.SheetPosition
import typings.reactMdSheet.typesSheetMod.SheetVerticalSize
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
