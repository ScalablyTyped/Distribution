package typings.reactDashMovable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InitialX extends js.Object {
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

object Anon_InitialX {
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
  ): Anon_InitialX = {
    val __obj = js.Dynamic.literal(initialX = initialX, initialY = initialY, itemDragged = itemDragged, itemDraggedOutOfBounds = itemDraggedOutOfBounds, liveText = liveText, scrollWindow = scrollWindow, scrollingSpeed = scrollingSpeed, selectedItem = selectedItem, targetHeight = targetHeight, targetWidth = targetWidth, targetX = targetX, targetY = targetY)
  
    __obj.asInstanceOf[Anon_InitialX]
  }
}

