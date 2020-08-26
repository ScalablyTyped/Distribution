package typings.reactMdTree.useFlattenedTreeListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemMetadata extends js.Object {
  var id: String = js.native
  var ref: TreeItemRef = js.native
  var visibleIndex: Double = js.native
}

object ItemMetadata {
  @scala.inline
  def apply(id: String, ref: TreeItemRef, visibleIndex: Double): ItemMetadata = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemMetadata]
  }
  @scala.inline
  implicit class ItemMetadataOps[Self <: ItemMetadata] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setRef(value: TreeItemRef): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisibleIndex(value: Double): Self = this.set("visibleIndex", value.asInstanceOf[js.Any])
  }
  
}

