package typings
package reactDashGridDashLayoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashGridDashLayoutMod {
  type ItemCallback = js.Function6[
    /* layout */ js.Array[Layout], 
    /* oldItem */ Layout, 
    /* newItem */ Layout, 
    /* placeholder */ Layout, 
    /* event */ stdLib.MouseEvent, 
    /* element */ stdLib.HTMLElement, 
    scala.Unit
  ]
  type Layouts = org.scalablytyped.runtime.StringDictionary[js.Array[Layout]]
  type ReactGridLayout = reactLib.reactMod.Component[ReactGridLayoutProps, js.Object, js.Any]
}
