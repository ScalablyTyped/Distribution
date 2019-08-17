package typings.reactDashGridDashLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashGridDashLayoutMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.Component
  import typings.std.HTMLElement
  import typings.std.MouseEvent

  type ItemCallback = js.Function6[
    /* layout */ js.Array[Layout], 
    /* oldItem */ Layout, 
    /* newItem */ Layout, 
    /* placeholder */ Layout, 
    /* event */ MouseEvent, 
    /* element */ HTMLElement, 
    Unit
  ]
  type Layouts = StringDictionary[js.Array[Layout]]
  type ReactGridLayout = Component[ReactGridLayoutProps, js.Object, js.Any]
}
