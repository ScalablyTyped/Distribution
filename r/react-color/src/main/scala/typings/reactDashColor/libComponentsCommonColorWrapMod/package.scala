package typings.reactDashColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsCommonColorWrapMod {
  import typings.reactDashColor.reactDashColorMod.Color
  import typings.reactDashColor.reactDashColorMod.ColorResult

  type ColorWrapChangeHandler = js.Function1[/* color */ Color | ColorResult, Unit]
}
