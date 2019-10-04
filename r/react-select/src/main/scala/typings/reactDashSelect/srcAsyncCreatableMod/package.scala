package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcAsyncCreatableMod {
  import typings.reactDashSelect.srcTypesMod.OptionTypeBase

  type Props[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcAsyncMod.Props[OptionType] with typings.reactDashSelect.srcCreatableMod.Props[OptionType]
  type State[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcAsyncMod.State[OptionType] with typings.reactDashSelect.srcCreatableMod.State[OptionType]
}
