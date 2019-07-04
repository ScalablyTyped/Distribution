package typings
package splitpanesLib.splitpanesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait splitPanesData extends js.Object {
  var container: containerTypes
  var panes: js.Array[_]
  var slotsCopy: java.lang.String
  var slotsCount: scala.Double
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
    slotsCopy: java.lang.String,
    slotsCount: scala.Double,
    splitterTaps: splitterTapsTypes,
    splitters: js.Array[_],
    touch: touchTypes,
    vnodes: js.Array[_]
  ): splitPanesData = {
    val __obj = js.Dynamic.literal(container = container, panes = panes, slotsCopy = slotsCopy, slotsCount = slotsCount, splitterTaps = splitterTaps, splitters = splitters, touch = touch, vnodes = vnodes)
  
    __obj.asInstanceOf[splitPanesData]
  }
}

