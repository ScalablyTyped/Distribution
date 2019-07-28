package typings.reactDashTransitionDashGroup.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionActions extends js.Object {
  /**
    * Normally a component is not transitioned if it is shown when the
    * `<Transition>` component mounts. If you want to transition on the first
    * mount set  appear to true, and the component will transition in as soon
    * as the `<Transition>` mounts. Note: there are no specific "appear" states.
    * appear only adds an additional enter transition.
    */
  var appear: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable enter transitions.
    */
  var enter: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable exit transitions.
    */
  var exit: js.UndefOr[Boolean] = js.undefined
}

object TransitionActions {
  @scala.inline
  def apply(
    appear: js.UndefOr[Boolean] = js.undefined,
    enter: js.UndefOr[Boolean] = js.undefined,
    exit: js.UndefOr[Boolean] = js.undefined
  ): TransitionActions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter)
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit)
    __obj.asInstanceOf[TransitionActions]
  }
}

