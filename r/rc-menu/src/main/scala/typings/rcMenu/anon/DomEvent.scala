package typings.rcMenu.anon

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomEvent extends js.Object {
  var domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]
  var key: typings.react.mod.Key
}

object DomEvent {
  @scala.inline
  def apply(
    domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement],
    key: typings.react.mod.Key
  ): DomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent]
  }
}

