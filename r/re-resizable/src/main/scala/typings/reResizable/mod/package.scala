package typings.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ResizeCallback = js.Function4[
    /* event */ typings.std.MouseEvent | typings.std.TouchEvent, 
    /* direction */ typings.reResizable.mod.ResizableDirection, 
    /* elementRef */ typings.std.HTMLDivElement, 
    /* delta */ typings.reResizable.mod.NumberSize, 
    scala.Unit
  ]
  type ResizeStartCallback = js.Function4[
    /* e */ (typings.react.mod.MouseEvent[typings.std.HTMLDivElement, typings.react.mod.NativeMouseEvent]) | typings.react.mod.TouchEvent[typings.std.HTMLDivElement], 
    /* dir */ typings.reResizable.mod.ResizableDirection, 
    /* elementRef */ typings.std.HTMLDivElement, 
    /* delta */ typings.reResizable.mod.NumberSize, 
    scala.Unit
  ]
}
