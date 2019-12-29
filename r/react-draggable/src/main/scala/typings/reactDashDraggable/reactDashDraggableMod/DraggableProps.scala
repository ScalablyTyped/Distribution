package typings.reactDashDraggable.reactDashDraggableMod

import typings.reactDashDraggable.reactDashDraggableBooleans.`false`
import typings.reactDashDraggable.reactDashDraggableStrings.both
import typings.reactDashDraggable.reactDashDraggableStrings.none
import typings.reactDashDraggable.reactDashDraggableStrings.x
import typings.reactDashDraggable.reactDashDraggableStrings.y
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProps extends DraggableCoreProps {
  var axis: both | x | y | none
  var bounds: DraggableBounds | String | `false`
  var defaultClassName: String
  var defaultClassNameDragged: String
  var defaultClassNameDragging: String
  var defaultPosition: ControlPosition
  var position: ControlPosition
  var positionOffset: PositionOffsetControlPosition
}

object DraggableProps {
  @scala.inline
  def apply(
    allowAnyClick: Boolean,
    axis: both | x | y | none,
    bounds: DraggableBounds | String | `false`,
    cancel: String,
    defaultClassName: String,
    defaultClassNameDragged: String,
    defaultClassNameDragging: String,
    defaultPosition: ControlPosition,
    disabled: Boolean,
    enableUserSelectHack: Boolean,
    grid: js.Tuple2[Double, Double],
    handle: String,
    offsetParent: HTMLElement,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    onMouseDown: MouseEvent => Unit,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    position: ControlPosition,
    positionOffset: PositionOffsetControlPosition,
    scale: Double
  ): DraggableProps = {
    val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick.asInstanceOf[js.Any], axis = axis.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], cancel = cancel.asInstanceOf[js.Any], defaultClassName = defaultClassName.asInstanceOf[js.Any], defaultClassNameDragged = defaultClassNameDragged.asInstanceOf[js.Any], defaultClassNameDragging = defaultClassNameDragging.asInstanceOf[js.Any], defaultPosition = defaultPosition.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], enableUserSelectHack = enableUserSelectHack.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], handle = handle.asInstanceOf[js.Any], offsetParent = offsetParent.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onMouseDown = js.Any.fromFunction1(onMouseDown), onStart = js.Any.fromFunction2(onStart), onStop = js.Any.fromFunction2(onStop), position = position.asInstanceOf[js.Any], positionOffset = positionOffset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DraggableProps]
  }
}

