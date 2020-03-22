package typings.reactRnd.mod

import typings.reResizable.mod.ResizeDirection
import typings.react.mod.NativeMouseEvent
import typings.reactDraggable.mod.DraggableEvent
import typings.reactDraggable.reactDraggableBooleans.`false`
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps extends js.Object {
  var maxHeight: Double
  var maxWidth: Double
  var onDrag: RndDragCallback
  var onDragStart: RndDragCallback
  var onDragStop: RndDragCallback
  var onResize: RndResizeCallback
  var onResizeStart: RndResizeStartCallback
  var onResizeStop: RndResizeCallback
  var scale: Double
}

object DefaultProps {
  @scala.inline
  def apply(
    maxHeight: Double,
    maxWidth: Double,
    onDrag: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`,
    onDragStart: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`,
    onDragStop: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`,
    onResize: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit,
    onResizeStart: (/* e */ (typings.react.mod.MouseEvent[HTMLDivElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLDivElement], /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement) => Unit,
    onResizeStop: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLDivElement, /* delta */ ResizableDelta, /* position */ Position) => Unit,
    scale: Double
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onDragStart = js.Any.fromFunction2(onDragStart), onDragStop = js.Any.fromFunction2(onDragStop), onResize = js.Any.fromFunction5(onResize), onResizeStart = js.Any.fromFunction3(onResizeStart), onResizeStop = js.Any.fromFunction5(onResizeStop), scale = scale.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DefaultProps]
  }
}

