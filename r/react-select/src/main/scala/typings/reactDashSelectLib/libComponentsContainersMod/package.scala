package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsContainersMod {
  type ContainerProps[OptionType] = reactDashSelectLib.libTypesMod.CommonProps[OptionType] with ContainerState with reactDashSelectLib.Anon_ChildrenInnerPropsAnonEventOnKeyDown
  type IndicatorContainerProps[OptionType] = reactDashSelectLib.libTypesMod.CommonProps[OptionType] with IndicatorsState with reactDashSelectLib.Anon_ChildrenReactNode
  type ValueContainerProps[OptionType] = reactDashSelectLib.libTypesMod.CommonProps[OptionType] with reactDashSelectLib.Anon_ChildrenHasValue
}
