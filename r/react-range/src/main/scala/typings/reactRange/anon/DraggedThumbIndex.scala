package typings.reactRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggedThumbIndex extends js.Object {
  var draggedThumbIndex: Double = js.native
  var isChanged: Boolean = js.native
  var thumbZIndexes: js.Array[Double] = js.native
}

object DraggedThumbIndex {
  @scala.inline
  def apply(draggedThumbIndex: Double, isChanged: Boolean, thumbZIndexes: js.Array[Double]): DraggedThumbIndex = {
    val __obj = js.Dynamic.literal(draggedThumbIndex = draggedThumbIndex.asInstanceOf[js.Any], isChanged = isChanged.asInstanceOf[js.Any], thumbZIndexes = thumbZIndexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggedThumbIndex]
  }
  @scala.inline
  implicit class DraggedThumbIndexOps[Self <: DraggedThumbIndex] (val x: Self) extends AnyVal {
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
    def setDraggedThumbIndex(value: Double): Self = this.set("draggedThumbIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsChanged(value: Boolean): Self = this.set("isChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setThumbZIndexesVarargs(value: Double*): Self = this.set("thumbZIndexes", js.Array(value :_*))
    @scala.inline
    def setThumbZIndexes(value: js.Array[Double]): Self = this.set("thumbZIndexes", value.asInstanceOf[js.Any])
  }
  
}

