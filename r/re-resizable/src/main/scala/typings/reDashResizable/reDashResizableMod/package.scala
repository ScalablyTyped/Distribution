package typings.reDashResizable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reDashResizableMod {
  import typings.react.NativeMouseEvent
  import typings.std.HTMLDivElement
  import typings.std.MouseEvent
  import typings.std.TouchEvent

  type ResizeCallback = js.Function4[
    /* event */ MouseEvent | TouchEvent, 
    /* direction */ ResizableDirection, 
    /* elementRef */ HTMLDivElement, 
    /* delta */ NumberSize, 
    Unit
  ]
  type ResizeStartCallback = js.Function4[
    /* e */ (typings.react.reactMod.MouseEvent[HTMLDivElement, NativeMouseEvent]) | typings.react.reactMod.TouchEvent[HTMLDivElement], 
    /* dir */ ResizableDirection, 
    /* elementRef */ HTMLDivElement, 
    /* delta */ NumberSize, 
    Unit
  ]
}
