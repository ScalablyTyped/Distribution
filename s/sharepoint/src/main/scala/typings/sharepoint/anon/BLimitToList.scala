package typings.sharepoint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BLimitToList extends js.Object {
  var bLimitToList: Boolean = js.native
  var id: String = js.native
  var items: js.Array[_] = js.native
}

object BLimitToList {
  @scala.inline
  def apply(bLimitToList: Boolean, id: String, items: js.Array[_]): BLimitToList = {
    val __obj = js.Dynamic.literal(bLimitToList = bLimitToList.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[BLimitToList]
  }
  @scala.inline
  implicit class BLimitToListOps[Self <: BLimitToList] (val x: Self) extends AnyVal {
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
    def setBLimitToList(value: Boolean): Self = this.set("bLimitToList", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[_]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

