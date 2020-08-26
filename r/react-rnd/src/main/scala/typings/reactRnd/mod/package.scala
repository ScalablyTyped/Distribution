package typings.reactRnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Grid = js.Tuple2[scala.Double, scala.Double]
  type ResizeEnable = typings.reactRnd.anon.Bottom | scala.Boolean
  type RndDragCallback = typings.reactDraggable.mod.DraggableEventHandler
  type RndDragEvent = (typings.react.mod.MouseEvent[
    typings.std.HTMLElement | typings.std.SVGElement, 
    typings.react.mod.NativeMouseEvent
  ]) | (typings.react.mod.TouchEvent[typings.std.HTMLElement | typings.std.SVGElement]) | typings.std.MouseEvent | typings.std.TouchEvent
  type RndResizeCallback = js.Function5[
    /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
    /* dir */ typings.reResizable.mod.ResizeDirection, 
    /* elementRef */ typings.std.HTMLDivElement, 
    /* delta */ typings.reactRnd.mod.ResizableDelta, 
    /* position */ typings.reactRnd.mod.Position, 
    scala.Unit
  ]
  type RndResizeStartCallback = js.Function3[
    /* e */ (typings.react.mod.MouseEvent[typings.std.HTMLDivElement, typings.react.mod.NativeMouseEvent]) | typings.react.mod.TouchEvent[typings.std.HTMLDivElement], 
    /* dir */ typings.reResizable.mod.ResizeDirection, 
    /* elementRef */ typings.std.HTMLDivElement, 
    scala.Unit
  ]
  type TODO = js.Any
}
