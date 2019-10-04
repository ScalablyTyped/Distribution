package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsSingleValueMod {
  import typings.reactDashSelect.srcTypesMod.CommonProps
  import typings.reactDashSelect.srcTypesMod.OptionTypeBase

  type SingleValueProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with ValueProps[OptionType] with State
}
