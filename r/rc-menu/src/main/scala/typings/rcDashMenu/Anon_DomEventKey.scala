package typings.rcDashMenu

import typings.react.reactMod.Key
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomEventKey extends js.Object {
  var domEvent: MouseEvent[HTMLElement, NativeMouseEvent]
  var key: Key
}

object Anon_DomEventKey {
  @scala.inline
  def apply(domEvent: MouseEvent[HTMLElement, NativeMouseEvent], key: Key): Anon_DomEventKey = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DomEventKey]
  }
}

