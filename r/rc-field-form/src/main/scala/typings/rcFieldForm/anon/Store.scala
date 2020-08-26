package typings.rcFieldForm.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends js.Object {
  var store: typings.rcFieldForm.interfaceMod.Store = js.native
}

object Store {
  @scala.inline
  def apply(store: typings.rcFieldForm.interfaceMod.Store): Store = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  @scala.inline
  implicit class StoreOps[Self <: Store] (val x: Self) extends AnyVal {
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
    def setStore(value: typings.rcFieldForm.interfaceMod.Store): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

