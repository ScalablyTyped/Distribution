package typings.reactSelect.menuMod

import typings.react.mod.Ref
import typings.reactSelect.reactSelectStrings.auto
import typings.reactSelect.reactSelectStrings.bottom
import typings.reactSelect.reactSelectStrings.top
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
    minHeight: Double,
    placement: bottom | top | auto,
    shouldScroll: Boolean,
    menuEl: Ref[_] = null
  ): PlacementArgs = {
    val __obj = js.Dynamic.literal(isFixedPosition = isFixedPosition.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldScroll = shouldScroll.asInstanceOf[js.Any])
    if (menuEl != null) __obj.updateDynamic("menuEl")(menuEl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementArgs]
  }
}

