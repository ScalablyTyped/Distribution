package typings
package reactDashRndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRndMod {
  type Direction = reactDashRndLib.reactDashRndLibStrings.bottom | reactDashRndLib.reactDashRndLibStrings.bottomLeft | reactDashRndLib.reactDashRndLibStrings.bottomRight | reactDashRndLib.reactDashRndLibStrings.left | reactDashRndLib.reactDashRndLibStrings.right | reactDashRndLib.reactDashRndLibStrings.top | reactDashRndLib.reactDashRndLibStrings.topLeft | reactDashRndLib.reactDashRndLibStrings.topRight
  type DraggableEventHandler = js.Function2[
    /* e */ reactLib.MouseEvent | reactLib.TouchEvent, 
    /* data */ DraggableData, 
    scala.Unit | reactDashRndLib.reactDashRndLibNumbers.`false`
  ]
  type ResizeHandler = js.Function5[
    /* e */ reactLib.MouseEvent | reactLib.TouchEvent, 
    /* direction */ Direction, 
    /* ref */ reactLib.HTMLDivElement, 
    /* delta */ Size, 
    /* position */ Position, 
    scala.Unit
  ]
  type Rnd = reactLib.reactMod.Component[stdLib.Partial[Options], js.Object, js.Any]
}
