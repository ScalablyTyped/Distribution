package typings.rcMenu

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcMenuComponents extends rcMenuProps {
  @scala.inline
  def DOMWrap: ComponentType[DOMWrapProps] = js.constructorOf[typings.rcMenu.domwrapMod.default].asInstanceOf[typings.react.mod.ComponentType[DOMWrapProps]]
  @scala.inline
  def Divider: ComponentType[DividerProps] = typings.rcMenu.dividerMod.default.asInstanceOf[typings.react.mod.ComponentType[DividerProps]]
  @scala.inline
  def ItemGroup: ComponentType[ItemGroupProps] = js.constructorOf[typings.rcMenu.mod.ItemGroup].asInstanceOf[typings.react.mod.ComponentType[ItemGroupProps]]
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[typings.rcMenu.mod.default].asInstanceOf[typings.react.mod.ComponentType[LibProps]]
  @scala.inline
  def Menu: ComponentType[MenuProps] = js.constructorOf[typings.rcMenu.menuMod.default].asInstanceOf[typings.react.mod.ComponentType[MenuProps]]
  @scala.inline
  def MenuItem: ComponentType[MenuItemProps] = js.constructorOf[typings.rcMenu.menuItemMod.MenuItem].asInstanceOf[typings.react.mod.ComponentType[MenuItemProps]]
  @scala.inline
  def MenuItemGroup: ComponentType[MenuItemGroupProps] = js.constructorOf[typings.rcMenu.menuItemGroupMod.default].asInstanceOf[typings.react.mod.ComponentType[MenuItemGroupProps]]
  @scala.inline
  def SubMenu: ComponentType[SubMenuProps] = js.constructorOf[typings.rcMenu.subMenuMod.SubMenu].asInstanceOf[typings.react.mod.ComponentType[SubMenuProps]]
  @scala.inline
  def SubPopupMenu: ComponentType[SubPopupMenuProps] = js.constructorOf[typings.rcMenu.subPopupMenuMod.default].asInstanceOf[typings.react.mod.ComponentType[SubPopupMenuProps]]
}

