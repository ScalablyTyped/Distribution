package typings
package seenLib.seenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEventOptions extends js.Object {
  var drag: js.UndefOr[stdLib.EventListener] = js.undefined
  var dragEnd: js.UndefOr[stdLib.EventListener] = js.undefined
  var dragStart: js.UndefOr[stdLib.EventListener] = js.undefined
  var mouseDown: js.UndefOr[stdLib.EventListener] = js.undefined
  var mouseMove: js.UndefOr[stdLib.EventListener] = js.undefined
  var mouseUp: js.UndefOr[stdLib.EventListener] = js.undefined
  var mouseWheel: js.UndefOr[stdLib.EventListener] = js.undefined
}

object MouseEventOptions {
  @scala.inline
  def apply(
    drag: stdLib.EventListener = null,
    dragEnd: stdLib.EventListener = null,
    dragStart: stdLib.EventListener = null,
    mouseDown: stdLib.EventListener = null,
    mouseMove: stdLib.EventListener = null,
    mouseUp: stdLib.EventListener = null,
    mouseWheel: stdLib.EventListener = null
  ): MouseEventOptions = {
    val __obj = js.Dynamic.literal()
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragEnd != null) __obj.updateDynamic("dragEnd")(dragEnd)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (mouseDown != null) __obj.updateDynamic("mouseDown")(mouseDown)
    if (mouseMove != null) __obj.updateDynamic("mouseMove")(mouseMove)
    if (mouseUp != null) __obj.updateDynamic("mouseUp")(mouseUp)
    if (mouseWheel != null) __obj.updateDynamic("mouseWheel")(mouseWheel)
    __obj.asInstanceOf[MouseEventOptions]
  }
}

