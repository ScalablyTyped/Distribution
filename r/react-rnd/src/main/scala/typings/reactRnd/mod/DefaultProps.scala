package typings.reactRnd.mod

import typings.reResizable.mod.ResizeDirection
import typings.react.mod.NativeMouseEvent
import typings.reactDraggable.mod.DraggableEvent
import typings.reactDraggable.reactDraggableBooleans.`false`
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultProps extends js.Object {
  
  var maxHeight: Double = js.native
  
  var maxWidth: Double = js.native
  
  var onDrag: RndDragCallback = js.native
  
  var onDragStart: RndDragCallback = js.native
  
  var onDragStop: RndDragCallback = js.native
  
  var onResize: RndResizeCallback = js.native
  
  var onResizeStart: RndResizeStartCallback = js.native
  
  var onResizeStop: RndResizeCallback = js.native
  
  var scale: Double = js.native
}
object DefaultProps {
  
  @scala.inline
  def apply(
    maxHeight: Double,
    maxWidth: Double,
    onDrag: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`,
    onDragStart: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`,
    onDragStop: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`,
    onResize: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit,
    onResizeStart: (/* e */ (typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLElement], /* dir */ ResizeDirection, /* elementRef */ HTMLElement) => Unit | Boolean,
    onResizeStop: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit,
    scale: Double
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(maxHeight = maxHeight.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], onDrag = js.Any.fromFunction2(onDrag), onDragStart = js.Any.fromFunction2(onDragStart), onDragStop = js.Any.fromFunction2(onDragStop), onResize = js.Any.fromFunction5(onResize), onResizeStart = js.Any.fromFunction3(onResizeStart), onResizeStop = js.Any.fromFunction5(onResizeStop), scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps]
  }
  
  @scala.inline
  implicit class DefaultPropsOps[Self <: DefaultProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDrag(
      value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`
    ): Self = this.set("onDrag", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragStart(
      value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`
    ): Self = this.set("onDragStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnDragStop(
      value: (/* e */ DraggableEvent, /* data */ typings.reactDraggable.mod.DraggableData) => Unit | `false`
    ): Self = this.set("onDragStop", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnResize(
      value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
    ): Self = this.set("onResize", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnResizeStart(
      value: (/* e */ (typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent]) | typings.react.mod.TouchEvent[HTMLElement], /* dir */ ResizeDirection, /* elementRef */ HTMLElement) => Unit | Boolean
    ): Self = this.set("onResizeStart", js.Any.fromFunction3(value))
    
    @scala.inline
    def setOnResizeStop(
      value: (/* e */ MouseEvent | TouchEvent, /* dir */ ResizeDirection, /* elementRef */ HTMLElement, /* delta */ ResizableDelta, /* position */ Position) => Unit
    ): Self = this.set("onResizeStop", js.Any.fromFunction5(value))
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
  }
}
