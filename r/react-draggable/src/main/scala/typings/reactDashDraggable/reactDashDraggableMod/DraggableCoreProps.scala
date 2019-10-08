package typings.reactDashDraggable.reactDashDraggableMod

import typings.reactDashDraggable.reactDashDraggableNumbers.`false`
import typings.std.HTMLElement
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableCoreProps extends js.Object {
  var allowAnyClick: Boolean
  var cancel: String
  var disabled: Boolean
  var enableUserSelectHack: Boolean
  var grid: js.Tuple2[Double, Double]
  var handle: String
  var offsetParent: HTMLElement
  var onDrag: DraggableEventHandler
  var onStart: DraggableEventHandler
  var onStop: DraggableEventHandler
  var scale: Double
  def onMouseDown(e: MouseEvent): Unit
}

object DraggableCoreProps {
  @scala.inline
  def apply(
    allowAnyClick: Boolean,
    cancel: String,
    disabled: Boolean,
    enableUserSelectHack: Boolean,
    grid: js.Tuple2[Double, Double],
    handle: String,
    offsetParent: HTMLElement,
    onDrag: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    onMouseDown: MouseEvent => Unit,
    onStart: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    onStop: (/* e */ DraggableEvent, /* data */ DraggableData) => Unit | `false`,
    scale: Double
  ): DraggableCoreProps = {
    val __obj = js.Dynamic.literal(allowAnyClick = allowAnyClick, cancel = cancel, disabled = disabled, enableUserSelectHack = enableUserSelectHack, grid = grid, handle = handle, offsetParent = offsetParent, onDrag = js.Any.fromFunction2(onDrag), onMouseDown = js.Any.fromFunction1(onMouseDown), onStart = js.Any.fromFunction2(onStart), onStop = js.Any.fromFunction2(onStop), scale = scale)
  
    __obj.asInstanceOf[DraggableCoreProps]
  }
}

