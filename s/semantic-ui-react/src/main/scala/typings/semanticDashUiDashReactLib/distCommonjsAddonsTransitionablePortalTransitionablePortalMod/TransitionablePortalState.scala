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
    val __obj = js.Dynamic.literal(portalOpen = portalOpen, transitionVisible = transitionVisible)
  
    __obj.asInstanceOf[TransitionablePortalState]
  }
}

