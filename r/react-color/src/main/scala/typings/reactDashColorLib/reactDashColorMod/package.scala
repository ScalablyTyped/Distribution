package typings
package reactDashColorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashColorMod {
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - HSLColor
    - RGBColor
  */
  type Color = _Color | java.lang.String
  type ColorChangeHandler = js.Function1[/* color */ ColorResult, scala.Unit]
}
