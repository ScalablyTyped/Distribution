package typings
package reactDashScrollbarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContainerHeight extends js.Object {
  var containerHeight: scala.Double
  var containerWidth: scala.Double
  var leftPosition: scala.Double
  var realHeight: scala.Double
  var realWidth: scala.Double
  var topPosition: scala.Double
}

object Anon_ContainerHeight {
  @scala.inline
  def apply(
    containerHeight: scala.Double,
    containerWidth: scala.Double,
    leftPosition: scala.Double,
    realHeight: scala.Double,
    realWidth: scala.Double,
    topPosition: scala.Double
  ): Anon_ContainerHeight = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("containerHeight")(containerHeight)
    __obj.updateDynamic("containerWidth")(containerWidth)
    __obj.updateDynamic("leftPosition")(leftPosition)
    __obj.updateDynamic("realHeight")(realHeight)
    __obj.updateDynamic("realWidth")(realWidth)
    __obj.updateDynamic("topPosition")(topPosition)
    __obj.asInstanceOf[Anon_ContainerHeight]
  }
}

