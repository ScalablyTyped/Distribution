package typings.rcMenu

import typings.react.mod.Key
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomEvent extends js.Object {
  var domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement]
  var key: Key
}

object AnonDomEvent {
  @scala.inline
  def apply(domEvent: (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLElement], key: Key): AnonDomEvent = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDomEvent]
  }
}

