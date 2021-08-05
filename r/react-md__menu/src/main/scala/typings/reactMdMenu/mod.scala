package typings.reactMdMenu

import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactMdDivider.dividerMod.DividerElement
import typings.reactMdList.listItemLinkMod.ListItemLinkWithComponentProps
import typings.reactMdMenu.anon.PickBaseMenuPropshiddenvi
import typings.reactMdMenu.anon.PickBaseMenuPropshiddenviAbout
import typings.reactMdMenu.defaultMenuItemRendererMod.ValidMenuItem
import typings.reactMdMenu.defaultMenuRendererMod.AllInjectedMenuProps
import typings.reactMdMenu.dropdownMenuItemMod.DropdownMenuItemProps
import typings.reactMdMenu.dropdownMenuMod.DropdownMenuProps
import typings.reactMdMenu.menuButtonMod.MenuButtonProps
import typings.reactMdMenu.menuItemLinkMod.MenuItemLinkProps
import typings.reactMdMenu.menuItemMod.MenuItemProps
import typings.reactMdMenu.menuItemSeparatorMod.MenuItemSeparatorProps
import typings.reactMdMenu.useContextMenuMod.Options
import typings.reactMdMenu.useContextMenuMod.ReturnValue
import typings.reactMdUtils.typesTypesMod.LabelRequiredForA11y
import typings.std.HTMLAnchorElement
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/menu", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/menu", "DropdownMenu")
  @js.native
  val DropdownMenu: ForwardRefExoticComponent[DropdownMenuProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/menu", "DropdownMenuItem")
  @js.native
  val DropdownMenuItem: ForwardRefExoticComponent[DropdownMenuItemProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/menu", "Menu")
  @js.native
  val Menu: ForwardRefExoticComponent[PickBaseMenuPropshiddenvi | PickBaseMenuPropshiddenviAbout] = js.native
  
  @JSImport("@react-md/menu", "MenuButton")
  @js.native
  val MenuButton: ForwardRefExoticComponent[MenuButtonProps & RefAttributes[HTMLButtonElement]] = js.native
  
  @JSImport("@react-md/menu", "MenuItem")
  @js.native
  val MenuItem: ForwardRefExoticComponent[MenuItemProps & RefAttributes[HTMLLIElement]] = js.native
  
  @JSImport("@react-md/menu", "MenuItemLink")
  @js.native
  val MenuItemLink: ForwardRefExoticComponent[
    (MenuItemLinkProps & RefAttributes[HTMLAnchorElement]) | (MenuItemLinkProps & ListItemLinkWithComponentProps & RefAttributes[HTMLAnchorElement])
  ] = js.native
  
  @JSImport("@react-md/menu", "MenuItemSeparator")
  @js.native
  val MenuItemSeparator: ForwardRefExoticComponent[MenuItemSeparatorProps & RefAttributes[DividerElement]] = js.native
  
  inline def defaultMenuItemRenderer(item: ValidMenuItem, key: String): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultMenuItemRenderer")(item.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  inline def defaultMenuRenderer(hasHorizontalChildrenProps: LabelRequiredForA11y[AllInjectedMenuProps]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMenuRenderer")(hasHorizontalChildrenProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useContextMenu[CE /* <: HTMLElement */](): ReturnValue[CE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")().asInstanceOf[ReturnValue[CE]]
  inline def useContextMenu[CE /* <: HTMLElement */](hasIdPropRefAnchorClassNamesDisableDeselect: Options): ReturnValue[CE] = ^.asInstanceOf[js.Dynamic].applyDynamic("useContextMenu")(hasIdPropRefAnchorClassNamesDisableDeselect.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[CE]]
}
