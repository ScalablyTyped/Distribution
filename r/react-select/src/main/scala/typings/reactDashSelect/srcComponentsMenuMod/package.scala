package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsMenuMod {
  import typings.reactDashSelect.Anon_AppendTo
  import typings.reactDashSelect.Anon_ChildrenGetPortalPlacement
  import typings.reactDashSelect.Anon_ChildrenInnerPropsKey
  import typings.reactDashSelect.srcTypesMod.CommonProps
  import typings.reactDashSelect.srcTypesMod.OptionTypeBase

  type MenuListComponentProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with MenuListProps with MenuListState
  type MenuPortalProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with Anon_AppendTo
  type MenuProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with Anon_ChildrenGetPortalPlacement
  type NoticeProps[OptionType /* <: OptionTypeBase */] = CommonProps[OptionType] with Anon_ChildrenInnerPropsKey
}
