package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcBuiltinsMod {
  import typings.react.reactMod.ReactNode
  import typings.reactDashSelect.srcTypesMod.GroupType

  type formatGroupLabel[OptionType] = js.Function1[/* group */ GroupType[OptionType], ReactNode]
  type getOptionLabel[OptionType] = js.Function1[/* option */ OptionType, String]
  type getOptionValue[OptionType] = js.Function1[/* option */ OptionType, String]
  type isOptionDisabled[OptionType] = js.Function1[/* option */ OptionType, Boolean]
}
