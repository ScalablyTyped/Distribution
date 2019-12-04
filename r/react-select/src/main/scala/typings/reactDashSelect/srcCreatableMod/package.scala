package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcCreatableMod {
  import typings.reactDashSelect.srcTypesMod.OptionTypeBase

  type Props[OptionType /* <: OptionTypeBase */] = typings.reactDashSelect.srcSelectMod.Props[OptionType] with CreatableProps[OptionType]
}
