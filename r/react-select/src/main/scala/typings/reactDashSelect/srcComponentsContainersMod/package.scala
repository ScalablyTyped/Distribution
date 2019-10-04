package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsContainersMod {
  import typings.reactDashSelect.Anon_ChildrenHasValue
  import typings.reactDashSelect.Anon_ChildrenInnerPropsAnonOnKeyDown
  import typings.reactDashSelect.Anon_ChildrenReactNode
  import typings.reactDashSelect.srcTypesMod.CommonProps
  import typings.reactDashSelect.srcTypesMod.OptionTypeBase

  type ContainerProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with ContainerState with Anon_ChildrenInnerPropsAnonOnKeyDown
  type IndicatorContainerProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with IndicatorsState with Anon_ChildrenReactNode
  type ValueContainerProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with Anon_ChildrenHasValue
}
