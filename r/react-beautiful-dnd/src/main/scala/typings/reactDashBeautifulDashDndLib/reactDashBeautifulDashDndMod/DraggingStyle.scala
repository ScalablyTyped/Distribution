package typings
package reactDashBeautifulDashDndLib.reactDashBeautifulDashDndMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggingStyle extends js.Object {
  var boxSizing: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.`border-box`
  var height: scala.Double
  var left: scala.Double
  var margin: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibNumbers.`0`
  var pointerEvents: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.none
  var position: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.fixed
  var top: scala.Double
  var transform: js.UndefOr[java.lang.String] = js.undefined
  var transition: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.none
  var width: scala.Double
  var zIndex: ZIndex
}

object DraggingStyle {
  @scala.inline
  def apply(
    boxSizing: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.`border-box`,
    height: scala.Double,
    left: scala.Double,
    margin: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibNumbers.`0`,
    pointerEvents: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.none,
    position: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.fixed,
    top: scala.Double,
    transition: reactDashBeautifulDashDndLib.reactDashBeautifulDashDndLibStrings.none,
    width: scala.Double,
    zIndex: ZIndex,
    transform: java.lang.String = null
  ): DraggingStyle = {
    val __obj = js.Dynamic.literal(boxSizing = boxSizing, height = height, left = left, margin = margin, pointerEvents = pointerEvents, position = position, top = top, transition = transition, width = width, zIndex = zIndex.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[DraggingStyle]
  }
}

