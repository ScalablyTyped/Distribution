package typings.rcMenu.anon

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var domEvent: MouseEvent[HTMLElement, NativeMouseEvent]
  var key: typings.react.mod.Key
}

object Key {
  @scala.inline
  def apply(domEvent: MouseEvent[HTMLElement, NativeMouseEvent], key: typings.react.mod.Key): Key = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

