package typings.reactCalendarTimeline.mod

import typings.reactCalendarTimeline.anon.CollisionLeft
import typings.reactCalendarTimeline.anon.X
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typings.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemContext extends js.Object {
  var canMove: Boolean
  var canResizeLeft: Boolean
  var canResizeRight: Boolean
  var dimensions: CollisionLeft
  var dragGroupDelta: Double
  var dragStart: X
  var dragTime: Double
  var dragging: Boolean
  var resizeEdge: left | right
  var resizeStart: Double
  var resizeTime: Double
  var resizing: Boolean
  var selected: Boolean
  var title: String
  var useResizeHandle: Boolean
  var width: Boolean
}

object ItemContext {
  @scala.inline
  def apply(
    canMove: Boolean,
    canResizeLeft: Boolean,
    canResizeRight: Boolean,
    dimensions: CollisionLeft,
    dragGroupDelta: Double,
    dragStart: X,
    dragTime: Double,
    dragging: Boolean,
    resizeEdge: left | right,
    resizeStart: Double,
    resizeTime: Double,
    resizing: Boolean,
    selected: Boolean,
    title: String,
    useResizeHandle: Boolean,
    width: Boolean
  ): ItemContext = {
    val __obj = js.Dynamic.literal(canMove = canMove.asInstanceOf[js.Any], canResizeLeft = canResizeLeft.asInstanceOf[js.Any], canResizeRight = canResizeRight.asInstanceOf[js.Any], dimensions = dimensions.asInstanceOf[js.Any], dragGroupDelta = dragGroupDelta.asInstanceOf[js.Any], dragStart = dragStart.asInstanceOf[js.Any], dragTime = dragTime.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], resizeEdge = resizeEdge.asInstanceOf[js.Any], resizeStart = resizeStart.asInstanceOf[js.Any], resizeTime = resizeTime.asInstanceOf[js.Any], resizing = resizing.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], useResizeHandle = useResizeHandle.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemContext]
  }
}

