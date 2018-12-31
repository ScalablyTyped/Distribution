package typings
package reactDashOverlaysLib.libOverlayMod.OverlayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(reactDashOverlaysLib.libPositionMod.PositionNs.PositionProps because Would inherit conflicting mutable fields List(container))*/
trait OverlayProps
  extends reactDashOverlaysLib.reactDashOverlaysMod.TransitionCallbacks
     with reactDashOverlaysLib.libPortalMod.PortalNs.PortalProps {
  /**
    * A Callback fired by the Overlay when it wishes to be hidden.
    *
    * __required__ when `rootClose` is `true`.
    */
  var onHide: js.UndefOr[
    js.Function2[
      /* props */ reactDashOverlaysLib.libPortalMod.PortalNs.PortalProps, 
      /* repeated */ js.Any, 
      _
    ]
  ] = js.undefined
  /**
    * Specify whether the overlay should trigger `onHide` when the user clicks outside the overlay
    */
  var rootClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the visibility of the Overlay
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component
    * used to animate the overlay as it changes visibility.
    */
  var transition: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps]
  ] = js.undefined
}

