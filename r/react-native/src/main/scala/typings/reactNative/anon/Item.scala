package typings.reactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Item[ItemT] extends js.Object {
  var animated: js.UndefOr[Boolean | Null] = js.native
  var item: ItemT = js.native
  var viewPosition: js.UndefOr[Double] = js.native
}

object Item {
  @scala.inline
  def apply[ItemT](item: ItemT): Item[ItemT] = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item[ItemT]]
  }
  @scala.inline
  implicit class ItemOps[Self <: Item[_], ItemT] (val x: Self with Item[ItemT]) extends AnyVal {
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
    def setItem(value: ItemT): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setAnimatedNull: Self = this.set("animated", null)
    @scala.inline
    def setViewPosition(value: Double): Self = this.set("viewPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewPosition: Self = this.set("viewPosition", js.undefined)
  }
  
}

