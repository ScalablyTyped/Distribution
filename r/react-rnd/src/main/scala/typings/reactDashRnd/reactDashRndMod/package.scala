package typings.reactDashRnd

import typings.react.reactMod.Component
import typings.reactDashRnd.reactDashRndNumbers.`false`
import typings.std.HTMLDivElement
import typings.std.MouseEvent
import typings.std.Partial
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRndMod {
  type CSSProperties = typings.react.reactMod.CSSProperties
  type DraggableEventHandler = js.Function2[/* e */ MouseEvent | TouchEvent, /* data */ DraggableData, Unit | `false`]
  type ResizeHandler = js.Function5[
    /* e */ MouseEvent | TouchEvent, 
    /* direction */ Direction, 
    /* ref */ HTMLDivElement, 
    /* delta */ Size, 
    /* position */ Position, 
    Unit
  ]
  type Rnd = Component[Partial[Options], js.Object, js.Any]
}
