package typings.splitpanes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesData extends js.Object {
  var container: containerTypes
  var panes: js.Array[_]
  var slotsCopy: String
  var slotsCount: Double
  // Detect double click on touch devices.
  var splitterTaps: splitterTapsTypes
  var splitters: js.Array[_]
  var touch: touchTypes
  var vnodes: js.Array[_]
}

object splitPanesData {
  @scala.inline
  def apply(
    container: containerTypes,
    panes: js.Array[_],
    slotsCopy: String,
    slotsCount: Double,
    splitterTaps: splitterTapsTypes,
    splitters: js.Array[_],
    touch: touchTypes,
    vnodes: js.Array[_]
  ): splitPanesData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], panes = panes.asInstanceOf[js.Any], slotsCopy = slotsCopy.asInstanceOf[js.Any], slotsCount = slotsCount.asInstanceOf[js.Any], splitterTaps = splitterTaps.asInstanceOf[js.Any], splitters = splitters.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any], vnodes = vnodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[splitPanesData]
  }
}

