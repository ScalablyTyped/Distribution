package typings.rmcTrigger

import typings.react.mod.ComponentType
import typings.rmcTrigger.lazyRenderBoxMod.default
import typings.rmcTrigger.propsTypeMod.ITriggerProps
import typings.rmcTrigger.triggerMod.IProptypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rmcTriggerComponents extends rmcTriggerProps {
  @scala.inline
  def LazyRenderBox: ComponentType[LazyRenderBoxProps] = js.constructorOf[default].asInstanceOf[ComponentType[LazyRenderBoxProps]]
  @scala.inline
  def Popup: ComponentType[PopupProps] = js.constructorOf[typings.rmcTrigger.popupMod.default].asInstanceOf[ComponentType[PopupProps]]
  @scala.inline
  def PopupInner: ComponentType[PopupInnerProps] = js.constructorOf[typings.rmcTrigger.popupInnerMod.default].asInstanceOf[ComponentType[PopupInnerProps]]
  @scala.inline
  def RmcTrigger: ComponentType[RmcTriggerProps] = js.constructorOf[typings.rmcTrigger.mod.default].asInstanceOf[ComponentType[RmcTriggerProps]]
  @scala.inline
  def Trigger: ComponentType[ITriggerProps with IProptypes] = js.constructorOf[typings.rmcTrigger.triggerMod.default].asInstanceOf[ComponentType[ITriggerProps with IProptypes]]
}

