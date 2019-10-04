package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsMultiValueMod {
  import typings.reactDashSelect.Anon_ChildrenComponents
  import typings.reactDashSelect.Anon_ChildrenInnerPropsSelectProps
  import typings.reactDashSelect.srcTypesMod.CommonProps
  import typings.reactDashSelect.srcTypesMod.OptionTypeBase

  type MultiValueProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with Anon_ChildrenComponents[OptionType]
  type MultiValueRemoveProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with Anon_ChildrenInnerPropsSelectProps
}
