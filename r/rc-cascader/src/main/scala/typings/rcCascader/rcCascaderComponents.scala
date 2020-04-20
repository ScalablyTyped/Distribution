package typings.rcCascader

import typings.rcCascader.cascaderMod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcCascaderComponents extends rcCascaderProps {
  @scala.inline
  def Cascader: ComponentType[CascaderProps] = js.constructorOf[default].asInstanceOf[ComponentType[CascaderProps]]
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[typings.rcCascader.mod.default].asInstanceOf[ComponentType[LibProps]]
  @scala.inline
  def Menus: ComponentType[MenusProps] = js.constructorOf[typings.rcCascader.menusMod.default].asInstanceOf[ComponentType[MenusProps]]
}

