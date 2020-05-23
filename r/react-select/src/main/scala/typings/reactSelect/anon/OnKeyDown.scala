package typings.reactSelect.anon

import typings.react.mod.KeyboardEvent
import typings.reactSelect.typesMod.KeyboardEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnKeyDown extends js.Object {
  var onKeyDown: KeyboardEventHandler
}

object OnKeyDown {
  @scala.inline
  def apply(onKeyDown: /* event */ KeyboardEvent[HTMLElement] => Unit): OnKeyDown = {
    val __obj = js.Dynamic.literal(onKeyDown = js.Any.fromFunction1(onKeyDown))
    __obj.asInstanceOf[OnKeyDown]
  }
}

