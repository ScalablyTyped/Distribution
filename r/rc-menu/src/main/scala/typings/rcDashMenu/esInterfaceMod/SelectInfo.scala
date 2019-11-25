package typings.rcDashMenu.esInterfaceMod

import typings.react.NativeMouseEvent
import typings.react.reactMod.Key
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactInstance
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInfo extends MenuInfo {
  var selectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
}

object SelectInfo {
  @scala.inline
  def apply(
    domEvent: MouseEvent[HTMLElement, NativeMouseEvent],
    item: ReactInstance,
    key: Key,
    keyPath: js.Array[Key],
    selectedKeys: js.Array[Key] = null
  ): SelectInfo = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectInfo]
  }
}

