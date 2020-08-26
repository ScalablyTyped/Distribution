package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewToken extends js.Object {
  var index: Double | Null = js.native
  var isViewable: Boolean = js.native
  var item: js.Any = js.native
  var key: String = js.native
  var section: js.UndefOr[js.Any] = js.native
}

object ViewToken {
  @scala.inline
  def apply(isViewable: Boolean, item: js.Any, key: String): ViewToken = {
    val __obj = js.Dynamic.literal(isViewable = isViewable.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewToken]
  }
  @scala.inline
  implicit class ViewTokenOps[Self <: ViewToken] (val x: Self) extends AnyVal {
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
    def setIsViewable(value: Boolean): Self = this.set("isViewable", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: js.Any): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndexNull: Self = this.set("index", null)
    @scala.inline
    def setSection(value: js.Any): Self = this.set("section", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSection: Self = this.set("section", js.undefined)
  }
  
}

