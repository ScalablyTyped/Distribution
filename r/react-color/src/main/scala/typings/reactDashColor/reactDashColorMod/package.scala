package typings.reactDashColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashColorMod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.reactDashColor.reactDashColorMod.HSLColor
    - typings.reactDashColor.reactDashColorMod.RGBColor
  */
  type Color = _Color | String
  type ColorChangeHandler = js.Function1[/* color */ ColorResult, Unit]
}
