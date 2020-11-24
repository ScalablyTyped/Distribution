package typings.reactRnd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Grid = js.Tuple2[scala.Double, scala.Double]
  
  type ResizeEnable = typings.reactRnd.anon.BottomLeft | scala.Boolean
  
  type RndDragCallback = typings.reactDraggable.mod.DraggableEventHandler
  
  type RndDragEvent = (typings.react.mod.MouseEvent[
    typings.std.HTMLElement | typings.std.SVGElement, 
    typings.react.mod.NativeMouseEvent
  ]) | (typings.react.mod.TouchEvent[typings.std.HTMLElement | typings.std.SVGElement]) | typings.std.MouseEvent | typings.std.TouchEvent
  
  type RndResizeCallback = js.Function5[
    /* e */ typings.std.MouseEvent | typings.std.TouchEvent, 
    /* dir */ typings.reResizable.mod.ResizeDirection, 
    /* elementRef */ typings.std.HTMLElement, 
    /* delta */ typings.reactRnd.mod.ResizableDelta, 
    /* position */ typings.reactRnd.mod.Position, 
    scala.Unit
  ]
  
  type RndResizeStartCallback = js.Function3[
    /* e */ (typings.react.mod.MouseEvent[typings.std.HTMLElement, typings.react.mod.NativeMouseEvent]) | typings.react.mod.TouchEvent[typings.std.HTMLElement], 
    /* dir */ typings.reResizable.mod.ResizeDirection, 
    /* elementRef */ typings.std.HTMLElement, 
    scala.Unit | scala.Boolean
  ]
  
  type TODO = js.Any
}
