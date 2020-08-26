package typings.receptacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalItemData[X] extends js.Object {
  var expires: js.UndefOr[Double] = js.native
  var meta: js.UndefOr[X] = js.native
  var refresh: js.UndefOr[Double] = js.native
}

object InternalItemData {
  @scala.inline
  def apply[X](): InternalItemData[X] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalItemData[X]]
  }
  @scala.inline
  implicit class InternalItemDataOps[Self <: InternalItemData[_], X] (val x: Self with InternalItemData[X]) extends AnyVal {
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
    def setExpires(value: Double): Self = this.set("expires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpires: Self = this.set("expires", js.undefined)
    @scala.inline
    def setMeta(value: X): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setRefresh(value: Double): Self = this.set("refresh", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRefresh: Self = this.set("refresh", js.undefined)
  }
  
}

