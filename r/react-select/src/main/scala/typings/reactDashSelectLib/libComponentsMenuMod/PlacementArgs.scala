package typings
package reactDashSelectLib.libComponentsMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementArgs extends js.Object {
  var isFixedPosition: scala.Boolean
  var maxHeight: scala.Double
  var menuEl: reactLib.reactMod.Ref[_]
  var minHeight: scala.Double
  var placement: reactDashSelectLib.reactDashSelectLibStrings.bottom | reactDashSelectLib.reactDashSelectLibStrings.top | reactDashSelectLib.reactDashSelectLibStrings.auto
  var shouldScroll: scala.Boolean
}

object PlacementArgs {
  @scala.inline
  def apply(
    isFixedPosition: scala.Boolean,
    maxHeight: scala.Double,
    menuEl: reactLib.reactMod.Ref[_],
    minHeight: scala.Double,
    placement: reactDashSelectLib.reactDashSelectLibStrings.bottom | reactDashSelectLib.reactDashSelectLibStrings.top | reactDashSelectLib.reactDashSelectLibStrings.auto,
    shouldScroll: scala.Boolean
  ): PlacementArgs = {
    val __obj = js.Dynamic.literal(isFixedPosition = isFixedPosition, maxHeight = maxHeight, menuEl = menuEl.asInstanceOf[js.Any], minHeight = minHeight, placement = placement.asInstanceOf[js.Any], shouldScroll = shouldScroll)
  
    __obj.asInstanceOf[PlacementArgs]
  }
}

