package typings.reactRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDraggedThumbIndex extends js.Object {
  var draggedThumbIndex: Double
  var isChanged: Boolean
  var thumbZIndexes: js.Array[Double]
}

object AnonDraggedThumbIndex {
  @scala.inline
  def apply(draggedThumbIndex: Double, isChanged: Boolean, thumbZIndexes: js.Array[Double]): AnonDraggedThumbIndex = {
    val __obj = js.Dynamic.literal(draggedThumbIndex = draggedThumbIndex.asInstanceOf[js.Any], isChanged = isChanged.asInstanceOf[js.Any], thumbZIndexes = thumbZIndexes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDraggedThumbIndex]
  }
}

