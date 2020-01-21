package typings.reactRnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type DraggableData = typings.reactRnd.AnonDeltaX with typings.reactRnd.mod.Position
  type Grid = js.Tuple2[scala.Double, scala.Double]
  type RndDragCallback = typings.reactDraggable.mod.DraggableEventHandler
  type RndDragEvent = (typings.react.mod.MouseEvent[
    typings.std.HTMLElement | typings.std.SVGElement, 
    typings.react.mod.NativeMouseEvent
  ]) | (typings.react.mod.TouchEvent[typings.std.HTMLElement | typings.std.SVGElement]) | typings.std.MouseEvent | typings.std.TouchEvent
  type RndResizeCallback = js.Function5[
    /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeDirection */ /* dir */ js.Any, 
    /* elementRef */ typings.std.HTMLDivElement, 
    /* delta */ typings.reactRnd.mod.ResizableDelta, 
    /* position */ typings.reactRnd.mod.Position, 
    scala.Unit
  ]
  type RndResizeStartCallback = js.Function3[
    /* e */ (typings.react.mod.MouseEvent[typings.std.HTMLDivElement, typings.react.mod.NativeMouseEvent]) | typings.react.mod.TouchEvent[typings.std.HTMLDivElement], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResizeDirection */ /* dir */ js.Any, 
    /* elementRef */ typings.std.HTMLDivElement, 
    scala.Unit
  ]
  type TODO = js.Any
}
