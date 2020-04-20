package typings.reactOnclickoutside.mod

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleClickOutside[T] extends js.Object {
  var handleClickOutside: MouseEventHandler[T]
}

object HandleClickOutside {
  @scala.inline
  def apply[T](handleClickOutside: MouseEvent[T, NativeMouseEvent] => Unit): HandleClickOutside[T] = {
    val __obj = js.Dynamic.literal(handleClickOutside = js.Any.fromFunction1(handleClickOutside))
    __obj.asInstanceOf[HandleClickOutside[T]]
  }
}

