package typings.reactMovable.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialX extends js.Object {
  var initialX: Double
  var initialY: Double
  var itemDragged: Double
  var itemDraggedOutOfBounds: Double
  var liveText: String
  var scrollWindow: Boolean
  var scrollingSpeed: Double
  var selectedItem: Double
  var targetHeight: Double
  var targetWidth: Double
  var targetX: Double
  var targetY: Double
}

object InitialX {
  @scala.inline
  def apply(
    initialX: Double,
    initialY: Double,
    itemDragged: Double,
    itemDraggedOutOfBounds: Double,
    liveText: String,
    scrollWindow: Boolean,
    scrollingSpeed: Double,
    selectedItem: Double,
    targetHeight: Double,
    targetWidth: Double,
    targetX: Double,
    targetY: Double
  ): InitialX = {
    val __obj = js.Dynamic.literal(initialX = initialX.asInstanceOf[js.Any], initialY = initialY.asInstanceOf[js.Any], itemDragged = itemDragged.asInstanceOf[js.Any], itemDraggedOutOfBounds = itemDraggedOutOfBounds.asInstanceOf[js.Any], liveText = liveText.asInstanceOf[js.Any], scrollWindow = scrollWindow.asInstanceOf[js.Any], scrollingSpeed = scrollingSpeed.asInstanceOf[js.Any], selectedItem = selectedItem.asInstanceOf[js.Any], targetHeight = targetHeight.asInstanceOf[js.Any], targetWidth = targetWidth.asInstanceOf[js.Any], targetX = targetX.asInstanceOf[js.Any], targetY = targetY.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialX]
  }
}

