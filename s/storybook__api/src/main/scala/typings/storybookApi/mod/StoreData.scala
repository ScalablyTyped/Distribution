package typings.storybookApi.mod

import typings.storybookApi.storeMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreData extends js.Object {
  var store: default = js.native
}

object StoreData {
  @scala.inline
  def apply(store: default): StoreData = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreData]
  }
  @scala.inline
  implicit class StoreDataOps[Self <: StoreData] (val x: Self) extends AnyVal {
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
    def setStore(value: default): Self = this.set("store", value.asInstanceOf[js.Any])
  }
  
}

