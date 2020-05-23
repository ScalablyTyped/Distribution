package typings.rcSwipeout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabled extends js.Object {
  var autoClose: Boolean
  var disabled: Boolean
  def onClose(): Unit
  def onOpen(): Unit
}

object Disabled {
  @scala.inline
  def apply(autoClose: Boolean, disabled: Boolean, onClose: () => Unit, onOpen: () => Unit): Disabled = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), onOpen = js.Any.fromFunction0(onOpen))
    __obj.asInstanceOf[Disabled]
  }
}

