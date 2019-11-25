package typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndMod

import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndNumbers.`0`
import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndStrings.`border-box`
import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndStrings.fixed
import typings.reactDashBeautifulDashDnd.reactDashBeautifulDashDndStrings.none
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggingStyle extends js.Object {
  var boxSizing: `border-box`
  var height: Double
  var left: Double
  var margin: `0`
  var pointerEvents: none
  var position: fixed
  var top: Double
  var transform: js.UndefOr[String] = js.undefined
  var transition: none
  var width: Double
  var zIndex: ZIndex
}

object DraggingStyle {
  @scala.inline
  def apply(
    boxSizing: `border-box`,
    height: Double,
    left: Double,
    margin: `0`,
    pointerEvents: none,
    position: fixed,
    top: Double,
    transition: none,
    width: Double,
    transform: String = null,
    zIndex: ZIndex = null
  ): DraggingStyle = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], margin = margin.asInstanceOf[js.Any], pointerEvents = pointerEvents.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggingStyle]
  }
}

