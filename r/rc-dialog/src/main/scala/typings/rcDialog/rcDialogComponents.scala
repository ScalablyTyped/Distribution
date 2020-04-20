package typings.rcDialog

import typings.rcDialog.dialogMod.default
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rcDialogComponents extends rcDialogProps {
  @scala.inline
  def Dialog: ComponentType[DialogProps] = js.constructorOf[default].asInstanceOf[ComponentType[DialogProps]]
  @scala.inline
  def LazyRenderBox: ComponentType[LazyRenderBoxProps] = js.constructorOf[typings.rcDialog.lazyRenderBoxMod.default].asInstanceOf[ComponentType[LazyRenderBoxProps]]
}

