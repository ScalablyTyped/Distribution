package typings.reactDashOnclickoutside.reactDashOnclickoutsideMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
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

