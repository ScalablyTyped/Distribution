package typings
package reactDashOverlaysLib.libOverlayMod.OverlayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- reactDashOverlaysLib.libPositionMod.PositionNs.PositionProps because var conflicts: container. Inlined target, containerPadding, placement, shouldUpdatePosition */ trait OverlayProps
  extends reactDashOverlaysLib.reactDashOverlaysMod.TransitionCallbacks
     with reactDashOverlaysLib.libPortalMod.PortalNs.PortalProps {
  /**
    * Minimum spacing in pixels between container border and component border
    */
  var containerPadding: js.UndefOr[scala.Double] = js.undefined
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
    * How to position the component relative to the target
    */
  var placement: js.UndefOr[
    reactDashOverlaysLib.reactDashOverlaysLibStrings.top | reactDashOverlaysLib.reactDashOverlaysLibStrings.right | reactDashOverlaysLib.reactDashOverlaysLibStrings.bottom | reactDashOverlaysLib.reactDashOverlaysLibStrings.left
  ] = js.undefined
  /**
    * Specify whether the overlay should trigger `onHide` when the user clicks outside the overlay
    */
  var rootClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the position should be changed on each update
    */
  var shouldUpdatePosition: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the visibility of the Overlay
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A node, element, or function that returns either. The child will be
    * be positioned next to the `target` specified.
    */
  var target: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | js.Function] = js.undefined
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component
    * used to animate the overlay as it changes visibility.
    */
  var transition: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps]
  ] = js.undefined
}

