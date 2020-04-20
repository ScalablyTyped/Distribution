package typings.rcMenu

import typings.rcMenu.domwrapMod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcMenuComponents extends rcMenuProps {
  @scala.inline
  def DOMWrap: ComponentType[DOMWrapProps] = js.constructorOf[default].asInstanceOf[ComponentType[DOMWrapProps]]
  @scala.inline
  def Divider: ComponentType[DividerProps] = typings.rcMenu.dividerMod.default.asInstanceOf[ComponentType[DividerProps]]
  @scala.inline
  def ItemGroup: ComponentType[ItemGroupProps] = js.constructorOf[typings.rcMenu.mod.ItemGroup].asInstanceOf[ComponentType[ItemGroupProps]]
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[typings.rcMenu.mod.default].asInstanceOf[ComponentType[LibProps]]
  @scala.inline
  def Menu: ComponentType[MenuProps] = js.constructorOf[typings.rcMenu.menuMod.default].asInstanceOf[ComponentType[MenuProps]]
  @scala.inline
  def MenuItem: ComponentType[MenuItemProps] = js.constructorOf[typings.rcMenu.menuItemMod.MenuItem].asInstanceOf[ComponentType[MenuItemProps]]
  @scala.inline
  def MenuItemGroup: ComponentType[MenuItemGroupProps] = js.constructorOf[typings.rcMenu.menuItemGroupMod.default].asInstanceOf[ComponentType[MenuItemGroupProps]]
  @scala.inline
  def SubMenu: ComponentType[SubMenuProps] = js.constructorOf[typings.rcMenu.subMenuMod.SubMenu].asInstanceOf[ComponentType[SubMenuProps]]
  @scala.inline
  def SubPopupMenu: ComponentType[SubPopupMenuProps] = js.constructorOf[typings.rcMenu.subPopupMenuMod.default].asInstanceOf[ComponentType[SubPopupMenuProps]]
}

