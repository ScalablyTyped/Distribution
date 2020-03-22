package typings.rcMenu

import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonKey extends js.Object {
  var domEvent: MouseEvent[HTMLElement, NativeMouseEvent]
  var key: Key
}

object AnonKey {
  @scala.inline
  def apply(domEvent: MouseEvent[HTMLElement, NativeMouseEvent], key: Key): AnonKey = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonKey]
  }
}

