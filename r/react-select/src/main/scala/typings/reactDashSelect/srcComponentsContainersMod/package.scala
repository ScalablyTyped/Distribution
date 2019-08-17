package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsContainersMod {
  import typings.reactDashSelect.Anon_ChildrenHasValue
  import typings.reactDashSelect.Anon_ChildrenInnerPropsAnonOnKeyDown
  import typings.reactDashSelect.Anon_ChildrenReactNode
  import typings.reactDashSelect.srcTypesMod.CommonProps

  type ContainerProps[OptionType] = CommonProps[OptionType] with ContainerState with Anon_ChildrenInnerPropsAnonOnKeyDown
  type IndicatorContainerProps[OptionType] = CommonProps[OptionType] with IndicatorsState with Anon_ChildrenReactNode
  type ValueContainerProps[OptionType] = CommonProps[OptionType] with Anon_ChildrenHasValue
}
