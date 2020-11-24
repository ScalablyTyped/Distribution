package typings.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ResizeCallback = js.Function4[
    /* event */ typings.std.MouseEvent | typings.std.TouchEvent, 
    /* direction */ typings.reResizable.resizerMod.Direction, 
    /* elementRef */ typings.std.HTMLElement, 
    /* delta */ typings.reResizable.mod.NumberSize, 
    scala.Unit
  ]
  
  type ResizeDirection = typings.reResizable.resizerMod.Direction
  
  type ResizeStartCallback = js.Function3[
    /* e */ (typings.react.mod.MouseEvent[typings.std.HTMLElement, typings.react.mod.NativeMouseEvent]) | typings.react.mod.TouchEvent[typings.std.HTMLElement], 
    /* dir */ typings.reResizable.resizerMod.Direction, 
    /* elementRef */ typings.std.HTMLElement, 
    scala.Unit | scala.Boolean
  ]
}
