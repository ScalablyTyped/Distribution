package typings.reactRange.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggedThumbIndex extends js.Object {
  var draggedThumbIndex: Double
  var isChanged: Boolean
  var thumbZIndexes: js.Array[Double]
}

object DraggedThumbIndex {
  @scala.inline
  def apply(draggedThumbIndex: Double, isChanged: Boolean, thumbZIndexes: js.Array[Double]): DraggedThumbIndex = {
    val __obj = js.Dynamic.literal(draggedThumbIndex = draggedThumbIndex.asInstanceOf[js.Any], isChanged = isChanged.asInstanceOf[js.Any], thumbZIndexes = thumbZIndexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggedThumbIndex]
  }
}

