package typings.rmcCascader

import typings.react.mod.ComponentType
import typings.rmcCascader.cascaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rmcCascaderComponents extends rmcCascaderProps {
  @scala.inline
  def Cascader: ComponentType[CascaderProps] = js.constructorOf[default].asInstanceOf[ComponentType[CascaderProps]]
  @scala.inline
  def Popup: ComponentType[PopupProps] = js.constructorOf[typings.rmcCascader.popupMod.default].asInstanceOf[ComponentType[PopupProps]]
  @scala.inline
  def RmcCascader: ComponentType[RmcCascaderProps] = js.constructorOf[typings.rmcCascader.mod.default].asInstanceOf[ComponentType[RmcCascaderProps]]
}

