package typings.reactDashRnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRndMod {
  import typings.react.NativeMouseEvent
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.TouchEvent
  import typings.reactDashDraggable.reactDashDraggableMod.DraggableEventHandler
  import typings.reactDashRnd.Anon_DeltaX
  import typings.std.HTMLDivElement
  import typings.std.HTMLElement
  import typings.std.SVGElement

  type DraggableData = Anon_DeltaX with Position
  type Grid = js.Tuple2[Double, Double]
  type RndDragCallback = DraggableEventHandler
  type RndDragEvent = (MouseEvent[HTMLElement | SVGElement, NativeMouseEvent]) | (TouchEvent[HTMLElement | SVGElement]) | typings.std.MouseEvent | typings.std.TouchEvent
  type RndResizeCallback = js.Function5[
    /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResizeDirection */ /* dir */ js.Any, 
    /* elementRef */ HTMLDivElement, 
    /* delta */ ResizableDelta, 
    /* position */ Position, 
    Unit
  ]
  type RndResizeStartCallback = js.Function3[
    /* e */ (MouseEvent[HTMLDivElement, NativeMouseEvent]) | TouchEvent[HTMLDivElement], 
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ResizeDirection */ /* dir */ js.Any, 
    /* elementRef */ HTMLDivElement, 
    Unit
  ]
}
