package typings.reResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object resizerMod {
  
  type OnStartCallback = js.Function2[
    /* e */ (typings.react.mod.MouseEvent[typings.std.HTMLDivElement, typings.react.mod.NativeMouseEvent]) | typings.react.mod.TouchEvent[typings.std.HTMLDivElement], 
    /* dir */ typings.reResizable.resizerMod.Direction, 
    scala.Unit
  ]
}
