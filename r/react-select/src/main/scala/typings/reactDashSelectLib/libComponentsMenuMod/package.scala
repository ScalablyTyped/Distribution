package typings
package reactDashSelectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libComponentsMenuMod {
  type MenuListComponentProps[OptionType] = reactDashSelectLib.libTypesMod.CommonProps[OptionType] with MenuListProps with MenuListState
  type MenuPortalProps[OptionType] = reactDashSelectLib.libTypesMod.CommonProps[OptionType] with reactDashSelectLib.Anon_AppendTo
  type MenuProps[OptionType] = reactDashSelectLib.libTypesMod.CommonProps[OptionType] with reactDashSelectLib.Anon_ChildrenGetPortalPlacement
  type NoticeProps[OptionType] = reactDashSelectLib.libTypesMod.CommonProps[OptionType] with reactDashSelectLib.Anon_ChildrenInnerPropsKey
}
