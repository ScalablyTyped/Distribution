package typings
package reactDashOverlaysLib.libOverlayMod.OverlayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps
  extends reactDashOverlaysLib.reactDashOverlaysMod.TransitionCallbacks
     with reactDashOverlaysLib.libPortalMod.PortalNs.PortalProps {
  /**
    * Enables the Popper.js `flip` modifier, allowing the Overlay to
    * automatically adjust it's placement in case of overlap with the viewport or toggle.
    */
  var flip: js.UndefOr[scala.Boolean] = js.undefined
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
  /** Specify where the overlay element is positioned in relation to the target element */
  var placement: js.UndefOr[Placements] = js.undefined
  /**
    * A set of popper options and props passed directly to react-popper's Popper component.
    */
  var popperConfig: js.UndefOr[js.Object] = js.undefined
  /**
    * Specify whether the overlay should trigger `onHide` when the user clicks outside the overlay
    */
  var rootClose: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify disabled for disable RootCloseWrapper
    */
  var rootCloseDisabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Specify event for toggling overlay
    */
  var rootCloseEvent: js.UndefOr[
    reactDashOverlaysLib.reactDashOverlaysLibStrings.click | reactDashOverlaysLib.reactDashOverlaysLibStrings.mousedown
  ] = js.undefined
  /**
    * Set the visibility of the Overlay
    */
  var show: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance]
  ] = js.undefined
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component
    * used to animate the overlay as it changes visibility.
    */
  var transition: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps]
  ] = js.undefined
  /**
    * A render prop that returns an element to overlay and position. See
    * the [react-popper documentation](https://github.com/FezVrasta/react-popper#children) for more info.
    */
  def children(renderProps: OverlayRenderProps): reactLib.reactMod.ReactNs.ReactElement[_]
}

