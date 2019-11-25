package typings.reactDashRange

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DraggedThumbIndex extends js.Object {
  var draggedThumbIndex: Double
  var isChanged: Boolean
  var thumbZIndexes: js.Array[Double]
}

object Anon_DraggedThumbIndex {
  @scala.inline
  def apply(draggedThumbIndex: Double, isChanged: Boolean, thumbZIndexes: js.Array[Double]): Anon_DraggedThumbIndex = {
    val __obj = js.Dynamic.literal(draggedThumbIndex = draggedThumbIndex.asInstanceOf[js.Any], isChanged = isChanged.asInstanceOf[js.Any], thumbZIndexes = thumbZIndexes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DraggedThumbIndex]
  }
}

