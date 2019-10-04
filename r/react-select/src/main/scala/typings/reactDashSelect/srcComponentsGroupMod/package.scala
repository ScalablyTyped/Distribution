package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsGroupMod {
  import typings.reactDashSelect.srcTypesMod.CommonProps
  import typings.reactDashSelect.srcTypesMod.OptionTypeBase

  type GroupProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with ComponentProps
}
