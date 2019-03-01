package typings
package reactDashTransitionDashGroupLib.transitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionActions extends js.Object {
  var appear: js.UndefOr[scala.Boolean] = js.undefined
  var enter: js.UndefOr[scala.Boolean] = js.undefined
  var exit: js.UndefOr[scala.Boolean] = js.undefined
}

object TransitionActions {
  @scala.inline
  def apply(
    appear: js.UndefOr[scala.Boolean] = js.undefined,
    enter: js.UndefOr[scala.Boolean] = js.undefined,
    exit: js.UndefOr[scala.Boolean] = js.undefined
  ): TransitionActions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appear)) __obj.updateDynamic("appear")(appear)
    if (!js.isUndefined(enter)) __obj.updateDynamic("enter")(enter)
    if (!js.isUndefined(exit)) __obj.updateDynamic("exit")(exit)
    __obj.asInstanceOf[TransitionActions]
  }
}

