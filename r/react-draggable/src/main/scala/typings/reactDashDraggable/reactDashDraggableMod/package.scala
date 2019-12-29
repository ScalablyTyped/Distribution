package typings.reactDashDraggable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashDraggableMod {
  import typings.react.reactMod.Component
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.NativeMouseEvent
  import typings.react.reactMod.TouchEvent
  import typings.reactDashDraggable.reactDashDraggableBooleans.`false`
  import typings.std.HTMLElement
  import typings.std.Partial
  import typings.std.SVGElement

  type Draggable = Component[Partial[DraggableProps], js.Object, js.Any]
  type DraggableEvent = (MouseEvent[HTMLElement | SVGElement, NativeMouseEvent]) | (TouchEvent[HTMLElement | SVGElement]) | typings.std.MouseEvent | typings.std.TouchEvent
  type DraggableEventHandler = js.Function2[/* e */ DraggableEvent, /* data */ DraggableData, Unit | `false`]
}
