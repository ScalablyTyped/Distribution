package typings.rcMenu

import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomEventKey extends js.Object {
  var domEvent: MouseEvent[HTMLElement, NativeMouseEvent]
  var key: Key
}

object AnonDomEventKey {
  @scala.inline
  def apply(domEvent: MouseEvent[HTMLElement, NativeMouseEvent], key: Key): AnonDomEventKey = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDomEventKey]
  }
}

