package typings
package reactDashGridDashLayoutLib.reactDashGridDashLayoutMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ReactGridLayoutNs {
  type Breakpoints = reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.lg | reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.md | reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.sm | reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.xs | reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.xxs
  type ItemCallback = js.Function6[
    /* layout */ js.Array[Layout], 
    /* oldItem */ Layout, 
    /* newItem */ Layout, 
    /* placeholder */ Layout, 
    /* event */ reactLib.MouseEvent, 
    /* element */ reactLib.HTMLElement, 
    scala.Unit
  ]
  type Layouts = reactDashGridDashLayoutLib.reactDashGridDashLayoutLibStrings.Layouts with js.Any
  type Responsive = reactLib.reactMod.Component[ResponsiveProps, js.Object, js.Any]
}
