package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcBuiltinsMod {
  import typings.react.reactMod.ReactNode
  import typings.reactDashSelect.srcTypesMod.GroupType
  import typings.reactDashSelect.srcTypesMod.OptionTypeBase

  type formatGroupLabel[OptionType /* <: OptionTypeBase */] = js.Function1[/* group */ GroupType[OptionType], ReactNode]
  type getOptionLabel[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, String]
  type getOptionValue[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, String]
  type isOptionDisabled[OptionType /* <: OptionTypeBase */] = js.Function1[/* option */ OptionType, Boolean]
}
