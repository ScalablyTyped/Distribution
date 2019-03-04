package typings
package reactDashTransitionDashGroupLib.transitiongroupMod.TransitionGroupNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentTransitionGroupProps[T /* <: reactLib.reactMod.ReactNs.ReactType[_] */]
  extends reactDashTransitionDashGroupLib.transitionMod.TransitionActions {
  var component: T
}

object ComponentTransitionGroupProps {
  @scala.inline
  def apply[T /* <: reactLib.reactMod.ReactNs.ReactType[_] */](
    component: T,
    appear: js.UndefOr[scala.Boolean] = js.undefined,
    enter: js.UndefOr[scala.Boolean] = js.undefined,
    exit: js.UndefOr[scala.Boolean] = js.undefined
  ): ComponentTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter)
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit)
    __obj.asInstanceOf[ComponentTransitionGroupProps[T]]
  }
}

