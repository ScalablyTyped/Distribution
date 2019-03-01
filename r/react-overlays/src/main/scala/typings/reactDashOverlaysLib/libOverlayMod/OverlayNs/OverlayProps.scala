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

object OverlayProps {
  @scala.inline
  def apply(
    children: js.Function1[OverlayRenderProps, reactLib.reactMod.ReactNs.ReactElement[_]],
    container: reactLib.reactMod.ReactNs.ReactNode | js.Function = null,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    onEnter: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onEntered: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onEntering: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExit: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExited: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onExiting: js.Function1[/* node */ reactLib.HTMLElement, _] = null,
    onHide: js.Function2[
      /* props */ reactDashOverlaysLib.libPortalMod.PortalNs.PortalProps, 
      /* repeated */ js.Any, 
      _
    ] = null,
    onRendered: js.Function = null,
    placement: Placements = null,
    popperConfig: js.Object = null,
    rootClose: js.UndefOr[scala.Boolean] = js.undefined,
    rootCloseDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    rootCloseEvent: reactDashOverlaysLib.reactDashOverlaysLibStrings.click | reactDashOverlaysLib.reactDashOverlaysLibStrings.mousedown = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    target: reactLib.reactMod.ReactNs.ReactInstance | js.Function0[reactLib.reactMod.ReactNs.ReactInstance] = null,
    transition: reactLib.reactMod.ReactNs.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps] = null
  ): OverlayProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("children")(children)
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter)
    if (onEntered != null) __obj.updateDynamic("onEntered")(onEntered)
    if (onEntering != null) __obj.updateDynamic("onEntering")(onEntering)
    if (onExit != null) __obj.updateDynamic("onExit")(onExit)
    if (onExited != null) __obj.updateDynamic("onExited")(onExited)
    if (onExiting != null) __obj.updateDynamic("onExiting")(onExiting)
    if (onHide != null) __obj.updateDynamic("onHide")(onHide)
    if (onRendered != null) __obj.updateDynamic("onRendered")(onRendered)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (popperConfig != null) __obj.updateDynamic("popperConfig")(popperConfig)
    if (!js.isUndefined(rootClose)) __obj.updateDynamic("rootClose")(rootClose)
    if (!js.isUndefined(rootCloseDisabled)) __obj.updateDynamic("rootCloseDisabled")(rootCloseDisabled)
    if (rootCloseEvent != null) __obj.updateDynamic("rootCloseEvent")(rootCloseEvent.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayProps]
  }
}

