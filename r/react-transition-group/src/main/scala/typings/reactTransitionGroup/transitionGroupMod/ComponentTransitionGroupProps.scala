package typings.reactTransitionGroup.transitionGroupMod

import typings.react.mod.ReactType
import typings.reactTransitionGroup.transitionMod.TransitionActions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentTransitionGroupProps[T /* <: ReactType[_] */] extends TransitionActions {
  var component: T
}

object ComponentTransitionGroupProps {
  @scala.inline
  def apply[/* <: typings.react.mod.ReactType[_] */ T](
    component: T,
    appear: js.UndefOr[Boolean] = js.undefined,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined
  ): ComponentTransitionGroupProps[T] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentTransitionGroupProps[T]]
  }
}

