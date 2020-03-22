package typings.reactDraggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Draggable = typings.react.mod.Component[typings.reactDraggable.PartialDraggableProps, js.Object, js.Any]
  type DraggableEvent = (typings.react.mod.MouseEvent[
    typings.std.HTMLElement | typings.std.SVGElement, 
    typings.react.mod.NativeMouseEvent
  ]) | (typings.react.mod.TouchEvent[typings.std.HTMLElement | typings.std.SVGElement]) | typings.std.MouseEvent | typings.std.TouchEvent
  type DraggableEventHandler = js.Function2[
    /* e */ typings.reactDraggable.mod.DraggableEvent, 
    /* data */ typings.reactDraggable.mod.DraggableData, 
    scala.Unit | typings.reactDraggable.reactDraggableBooleans.`false`
  ]
}
