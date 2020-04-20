package typings.rcDrawer

import typings.rcDrawer.drawerChildMod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDrawerComponents extends rcDrawerProps {
  @scala.inline
  def DrawerChild: ComponentType[DrawerChildProps] = js.constructorOf[default].asInstanceOf[ComponentType[DrawerChildProps]]
  @scala.inline
  def DrawerWrapper: ComponentType[DrawerWrapperProps] = js.constructorOf[typings.rcDrawer.drawerWrapperMod.default].asInstanceOf[ComponentType[DrawerWrapperProps]]
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[typings.rcDrawer.mod.default].asInstanceOf[ComponentType[LibProps]]
}

