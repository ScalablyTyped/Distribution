package typings.reactScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainerHeight extends js.Object {
  var containerHeight: Double
  var containerWidth: Double
  var leftPosition: Double
  var realHeight: Double
  var realWidth: Double
  var topPosition: Double
}

object AnonContainerHeight {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    leftPosition: Double,
    realHeight: Double,
    realWidth: Double,
    topPosition: Double
  ): AnonContainerHeight = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], leftPosition = leftPosition.asInstanceOf[js.Any], realHeight = realHeight.asInstanceOf[js.Any], realWidth = realWidth.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonContainerHeight]
  }
}

