package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasState extends js.Object {
  def restore(): Unit
  def save(): Unit
}

object CanvasState {
  @scala.inline
  def apply(restore: () => Unit, save: () => Unit): CanvasState = {
    val __obj = js.Dynamic.literal(restore = js.Any.fromFunction0(restore), save = js.Any.fromFunction0(save))
    __obj.asInstanceOf[CanvasState]
  }
}

