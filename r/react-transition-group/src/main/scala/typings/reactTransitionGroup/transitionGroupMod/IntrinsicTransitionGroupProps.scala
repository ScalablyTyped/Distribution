package typings.reactTransitionGroup.transitionGroupMod

import typings.reactTransitionGroup.transitionMod.TransitionActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrinsicTransitionGroupProps[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 175 */ js.Any */] extends TransitionActions {
  var component: js.UndefOr[T | Null] = js.undefined
}

object IntrinsicTransitionGroupProps {
  @scala.inline
  def apply[T](
    appear: js.UndefOr[Boolean] = js.undefined,
    component: js.UndefOr[Null | T] = js.undefined,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined
  ): IntrinsicTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(component)) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrinsicTransitionGroupProps[T]]
  }
}

