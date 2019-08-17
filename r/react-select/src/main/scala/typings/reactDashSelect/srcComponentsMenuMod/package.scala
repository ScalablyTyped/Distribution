package typings.reactDashSelect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcComponentsMenuMod {
  import typings.reactDashSelect.Anon_AppendTo
  import typings.reactDashSelect.Anon_ChildrenGetPortalPlacement
  import typings.reactDashSelect.Anon_ChildrenInnerPropsKey
  import typings.reactDashSelect.srcTypesMod.CommonProps

  type MenuListComponentProps[OptionType] = CommonProps[OptionType] with MenuListProps with MenuListState
  type MenuPortalProps[OptionType] = CommonProps[OptionType] with Anon_AppendTo
  type MenuProps[OptionType] = CommonProps[OptionType] with Anon_ChildrenGetPortalPlacement
  type NoticeProps[OptionType] = CommonProps[OptionType] with Anon_ChildrenInnerPropsKey
}
