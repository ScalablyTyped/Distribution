package typings.reactColor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object colorWrapMod {
  type ColorWrapChangeHandler = js.Function1[
    /* color */ typings.reactColor.mod.Color | typings.reactColor.mod.ColorResult, 
    scala.Unit
  ]
}
