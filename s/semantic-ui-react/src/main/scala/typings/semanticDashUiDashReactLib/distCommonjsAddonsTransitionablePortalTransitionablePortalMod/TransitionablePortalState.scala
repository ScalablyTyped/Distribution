package typings
package semanticDashUiDashReactLib.distCommonjsAddonsTransitionablePortalTransitionablePortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionablePortalState extends js.Object {
  var portalOpen: scala.Boolean
  var transitionVisible: scala.Boolean
}

object TransitionablePortalState {
  @scala.inline
  def apply(portalOpen: scala.Boolean, transitionVisible: scala.Boolean): TransitionablePortalState = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("portalOpen")(portalOpen)
    __obj.updateDynamic("transitionVisible")(transitionVisible)
    __obj.asInstanceOf[TransitionablePortalState]
  }
}

