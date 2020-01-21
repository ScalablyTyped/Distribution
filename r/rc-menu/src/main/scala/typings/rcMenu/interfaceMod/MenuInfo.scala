package typings.rcMenu.interfaceMod

import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactInstance
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuInfo extends js.Object {
  var domEvent: MouseEvent[HTMLElement, NativeMouseEvent]
  var item: ReactInstance
  var key: Key
  var keyPath: js.Array[Key]
}

object MenuInfo {
  @scala.inline
  def apply(
    domEvent: MouseEvent[HTMLElement, NativeMouseEvent],
    item: ReactInstance,
    key: Key,
    keyPath: js.Array[Key]
  ): MenuInfo = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MenuInfo]
  }
}

