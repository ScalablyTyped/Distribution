package typings.rmcDialog

import typings.react.mod.ComponentType
import typings.rmcDialog.dialogMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rmcDialogComponents extends rmcDialogProps {
  @scala.inline
  def Dialog: ComponentType[DialogProps] = js.constructorOf[default].asInstanceOf[ComponentType[DialogProps]]
  @scala.inline
  def LazyRenderBox: ComponentType[LazyRenderBoxProps] = js.constructorOf[typings.rmcDialog.lazyRenderBoxMod.default].asInstanceOf[ComponentType[LazyRenderBoxProps]]
  @scala.inline
  def Modal: ComponentType[ModalProps] = js.constructorOf[typings.rmcDialog.modalMod.default].asInstanceOf[ComponentType[ModalProps]]
  @scala.inline
  def RmcDialog: ComponentType[RmcDialogProps] = js.constructorOf[typings.rmcDialog.mod.default].asInstanceOf[ComponentType[RmcDialogProps]]
}

