package typings.reactSortableHoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortableElementProps extends js.Object {
  var collection: js.UndefOr[Offset] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var index: Double = js.native
}

object SortableElementProps {
  @scala.inline
  def apply(index: Double): SortableElementProps = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortableElementProps]
  }
  @scala.inline
  implicit class SortableElementPropsOps[Self <: SortableElementProps] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollection(value: Offset): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollection: Self = this.set("collection", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
  }
  
}

