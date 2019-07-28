package typings.reactDashTransitionDashGroup.transitionGroupMod

import typings.reactDashTransitionDashGroup.transitionMod.TransitionActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrinsicTransitionGroupProps[T /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 174 */ js.Any */] extends TransitionActions {
  var component: js.UndefOr[T | Null] = js.undefined
}

object IntrinsicTransitionGroupProps {
  @scala.inline
  def apply[T /* <: /* import warning: LimitUnionLength.enterTypeRef Was union type with length 174 */ js.Any */](
    appear: js.UndefOr[Boolean] = js.undefined,
    component: T = null,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined
  ): IntrinsicTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter)
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit)
    __obj.asInstanceOf[IntrinsicTransitionGroupProps[T]]
  }
}

