package typings.rcTrigger

import typings.rcTrigger.popupInnerMod.PopupInnerProps
import typings.react.mod.ComponentType
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcTriggerComponents extends rcTriggerProps {
  @scala.inline
  def Lib: ComponentType[LibProps] = js.constructorOf[typings.rcTrigger.mod.default].asInstanceOf[typings.react.mod.ComponentType[LibProps]]
  @scala.inline
  def Mock: ComponentType[MockProps] = js.constructorOf[typings.rcTrigger.mockMod.default].asInstanceOf[typings.react.mod.ComponentType[MockProps]]
  @scala.inline
  def Popup: ComponentType[PopupProps] = js.constructorOf[typings.rcTrigger.popupMod.default].asInstanceOf[typings.react.mod.ComponentType[PopupProps]]
  @scala.inline
  def PopupInner: ComponentType[PopupInnerProps with RefAttributes[HTMLDivElement]] = typings.rcTrigger.popupInnerMod.default.asInstanceOf[typings.react.mod.ComponentType[
  typings.rcTrigger.popupInnerMod.PopupInnerProps with typings.react.mod.RefAttributes[typings.std.HTMLDivElement]]]
}

