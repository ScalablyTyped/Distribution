package typings.reactDashSelect.srcComponentsMenuMod

import typings.react.reactMod.Ref
import typings.reactDashSelect.reactDashSelectStrings.auto
import typings.reactDashSelect.reactDashSelectStrings.bottom
import typings.reactDashSelect.reactDashSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementArgs extends js.Object {
  var isFixedPosition: Boolean
  var maxHeight: Double
  var menuEl: Ref[_]
  var minHeight: Double
  var placement: bottom | top | auto
  var shouldScroll: Boolean
}

object PlacementArgs {
  @scala.inline
  def apply(
    isFixedPosition: Boolean,
    maxHeight: Double,
    menuEl: Ref[_],
    minHeight: Double,
    placement: bottom | top | auto,
    shouldScroll: Boolean
  ): PlacementArgs = {
    val __obj = js.Dynamic.literal(isFixedPosition = isFixedPosition, maxHeight = maxHeight, menuEl = menuEl.asInstanceOf[js.Any], minHeight = minHeight, placement = placement.asInstanceOf[js.Any], shouldScroll = shouldScroll)
  
    __obj.asInstanceOf[PlacementArgs]
  }
}

