package typings
package reactDashRndLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashRndMod {
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
