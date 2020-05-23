package typings.reactScrollbar.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerHeight extends js.Object {
  var containerHeight: Double
  var containerWidth: Double
  var leftPosition: Double
  var realHeight: Double
  var realWidth: Double
  var topPosition: Double
}

object ContainerHeight {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    leftPosition: Double,
    realHeight: Double,
    realWidth: Double,
    topPosition: Double
  ): ContainerHeight = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], leftPosition = leftPosition.asInstanceOf[js.Any], realHeight = realHeight.asInstanceOf[js.Any], realWidth = realWidth.asInstanceOf[js.Any], topPosition = topPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerHeight]
  }
}

