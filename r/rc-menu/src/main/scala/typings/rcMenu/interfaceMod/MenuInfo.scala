package typings.rcMenu.interfaceMod

import typings.react.mod.Key
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactInstance
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuInfo extends js.Object {
  var domEvent: MouseEvent[HTMLElement, NativeMouseEvent] = js.native
  var item: ReactInstance = js.native
  var key: Key = js.native
  var keyPath: js.Array[Key] = js.native
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
  @scala.inline
  implicit class MenuInfoOps[Self <: MenuInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomEvent(value: MouseEvent[HTMLElement, NativeMouseEvent]): Self = this.set("domEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: ReactInstance): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyPathVarargs(value: Key*): Self = this.set("keyPath", js.Array(value :_*))
    @scala.inline
    def setKeyPath(value: js.Array[Key]): Self = this.set("keyPath", value.asInstanceOf[js.Any])
  }
  
}

