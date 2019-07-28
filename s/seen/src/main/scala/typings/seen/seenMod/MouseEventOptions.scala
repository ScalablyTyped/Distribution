package typings.seen.seenMod

import typings.std.EventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MouseEventOptions extends js.Object {
  var drag: js.UndefOr[EventListener] = js.undefined
  var dragEnd: js.UndefOr[EventListener] = js.undefined
  var dragStart: js.UndefOr[EventListener] = js.undefined
  var mouseDown: js.UndefOr[EventListener] = js.undefined
  var mouseMove: js.UndefOr[EventListener] = js.undefined
  var mouseUp: js.UndefOr[EventListener] = js.undefined
  var mouseWheel: js.UndefOr[EventListener] = js.undefined
}

object MouseEventOptions {
  @scala.inline
  def apply(
    drag: EventListener = null,
    dragEnd: EventListener = null,
    dragStart: EventListener = null,
    mouseDown: EventListener = null,
    mouseMove: EventListener = null,
    mouseUp: EventListener = null,
    mouseWheel: EventListener = null
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

