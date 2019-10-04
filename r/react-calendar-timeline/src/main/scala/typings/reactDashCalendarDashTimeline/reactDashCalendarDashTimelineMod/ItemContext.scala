package typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import typings.reactDashCalendarDashTimeline.Anon_CollisionLeft
import typings.reactDashCalendarDashTimeline.Anon_X
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.left
import typings.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemContext extends js.Object {
  var canMove: Boolean
  var canResizeLeft: Boolean
  var canResizeRight: Boolean
  var dimensions: Anon_CollisionLeft
  var dragGroupDelta: Double
  var dragStart: Anon_X
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
    dimensions: Anon_CollisionLeft,
    dragGroupDelta: Double,
    dragStart: Anon_X,
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
    val __obj = js.Dynamic.literal(canMove = canMove, canResizeLeft = canResizeLeft, canResizeRight = canResizeRight, dimensions = dimensions, dragGroupDelta = dragGroupDelta, dragStart = dragStart, dragTime = dragTime, dragging = dragging, resizeEdge = resizeEdge.asInstanceOf[js.Any], resizeStart = resizeStart, resizeTime = resizeTime, resizing = resizing, selected = selected, title = title, useResizeHandle = useResizeHandle, width = width)
  
    __obj.asInstanceOf[ItemContext]
  }
}

