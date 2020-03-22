package typings.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResizeCallback = js.Function4[
    /* event */ typings.std.MouseEvent | typings.std.TouchEvent, 
    /* direction */ typings.reResizable.resizerMod.Direction, 
    /* elementRef */ typings.std.HTMLDivElement, 
    /* delta */ typings.reResizable.mod.NumberSize, 
    scala.Unit
  ]
  type ResizeDirection = typings.reResizable.resizerMod.Direction
  type ResizeStartCallback = js.Function3[
    /* e */ (typings.react.mod.MouseEvent[typings.std.HTMLDivElement, typings.react.mod.NativeMouseEvent]) | typings.react.mod.TouchEvent[typings.std.HTMLDivElement], 
    /* dir */ typings.reResizable.resizerMod.Direction, 
    /* elementRef */ typings.std.HTMLDivElement, 
    scala.Unit | scala.Boolean
  ]
}
