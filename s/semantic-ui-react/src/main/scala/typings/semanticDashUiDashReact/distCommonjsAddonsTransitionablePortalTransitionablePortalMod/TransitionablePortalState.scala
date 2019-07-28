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
    val __obj = js.Dynamic.literal(portalOpen = portalOpen, transitionVisible = transitionVisible)
  
    __obj.asInstanceOf[TransitionablePortalState]
  }
}

