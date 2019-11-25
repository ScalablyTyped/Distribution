package typings.semanticDashUiDashReact.distCommonjsAddonsTransitionablePortalTransitionablePortalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitionablePortalState extends js.Object {
  var portalOpen: Boolean
  var transitionVisible: Boolean
}

object TransitionablePortalState {
  @scala.inline
  def apply(portalOpen: Boolean, transitionVisible: Boolean): TransitionablePortalState = {
    val __obj = js.Dynamic.literal(portalOpen = portalOpen.asInstanceOf[js.Any], transitionVisible = transitionVisible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransitionablePortalState]
  }
}

