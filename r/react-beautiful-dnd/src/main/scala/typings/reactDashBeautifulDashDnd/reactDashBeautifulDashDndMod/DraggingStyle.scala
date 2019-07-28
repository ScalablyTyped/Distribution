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
    zIndex: ZIndex,
    transform: String = null
  ): DraggingStyle = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing, height = height, left = left, margin = margin, pointerEvents = pointerEvents, position = position, top = top, transition = transition, width = width, zIndex = zIndex.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[DraggingStyle]
  }
}

