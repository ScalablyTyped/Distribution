package typings.rcDashMenu.esInterfaceMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.Key
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactInstance
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
    val __obj = js.Dynamic.literal(domEvent = domEvent, item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath)
  
    __obj.asInstanceOf[MenuInfo]
  }
}

