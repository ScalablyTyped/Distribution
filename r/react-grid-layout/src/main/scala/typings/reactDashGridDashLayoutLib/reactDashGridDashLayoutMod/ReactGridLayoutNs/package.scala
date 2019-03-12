package typings
package reactDashGridDashLayoutLib.reactDashGridDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactGridLayoutNs {
  type ItemCallback = js.Function6[
    /* layout */ js.Array[Layout], 
    /* oldItem */ Layout, 
    /* newItem */ Layout, 
    /* placeholder */ Layout, 
    /* event */ stdLib.MouseEvent, 
    /* element */ stdLib.HTMLElement, 
    scala.Unit
  ]
  type Responsive = reactLib.reactMod.Component[ResponsiveProps, js.Object, js.Any]
}
