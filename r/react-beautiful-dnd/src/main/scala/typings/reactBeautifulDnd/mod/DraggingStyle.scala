package typings.reactBeautifulDnd.mod

import typings.reactBeautifulDnd.reactBeautifulDndStrings.`border-box`
import typings.reactBeautifulDnd.reactBeautifulDndStrings.fixed
import typings.reactBeautifulDnd.reactBeautifulDndStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggingStyle extends js.Object {
  var boxSizing: `border-box`
  var height: Double
  var left: Double
  var opacity: js.UndefOr[Double] = js.undefined
  var pointerEvents: none
  var position: fixed
  var top: Double
  var transform: js.UndefOr[String] = js.undefined
  var transition: none
  var width: Double
  var zIndex: Double
}

object DraggingStyle {
  @scala.inline
  def apply(
    boxSizing: `border-box`,
    height: Double,
    left: Double,
    pointerEvents: none,
    position: fixed,
    top: Double,
    transition: none,
    width: Double,
    zIndex: Double,
    opacity: Int | Double = null,
    transform: String = null
  ): DraggingStyle = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], pointerEvents = pointerEvents.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingStyle]
  }
}

