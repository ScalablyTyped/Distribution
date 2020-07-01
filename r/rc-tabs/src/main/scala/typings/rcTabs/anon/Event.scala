package typings.rcTabs.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  var event: (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element]
  var key: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(event: (MouseEvent[Element, NativeMouseEvent]) | KeyboardEvent[Element], key: String = null): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

