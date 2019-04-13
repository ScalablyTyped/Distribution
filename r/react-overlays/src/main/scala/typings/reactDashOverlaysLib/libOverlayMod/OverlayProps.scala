package typings
package reactDashOverlaysLib.libOverlayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayProps
  extends reactDashOverlaysLib.reactDashOverlaysMod.TransitionCallbacks
     with reactDashOverlaysLib.libPortalMod.PortalProps {
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
    js.Function2[/* props */ reactDashOverlaysLib.libPortalMod.PortalProps, /* repeated */ js.Any, _]
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
  var target: js.UndefOr[reactLib.reactMod.ReactInstance | js.Function0[reactLib.reactMod.ReactInstance]] = js.undefined
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component
    * used to animate the overlay as it changes visibility.
    */
  var transition: js.UndefOr[
    reactLib.reactMod.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps]
  ] = js.undefined
  /**
    * A render prop that returns an element to overlay and position. See
    * the [react-popper documentation](https://github.com/FezVrasta/react-popper#children) for more info.
    */
  def children(renderProps: OverlayRenderProps): reactLib.reactMod.ReactElement[_]
}

object OverlayProps {
  @scala.inline
  def apply(
    children: OverlayRenderProps => reactLib.reactMod.ReactElement[_],
    container: reactLib.reactMod.ReactNode | js.Function = null,
    flip: js.UndefOr[scala.Boolean] = js.undefined,
    onEnter: /* node */ stdLib.HTMLElement => _ = null,
    onEntered: /* node */ stdLib.HTMLElement => _ = null,
    onEntering: /* node */ stdLib.HTMLElement => _ = null,
    onExit: /* node */ stdLib.HTMLElement => _ = null,
    onExited: /* node */ stdLib.HTMLElement => _ = null,
    onExiting: /* node */ stdLib.HTMLElement => _ = null,
    onHide: (/* props */ reactDashOverlaysLib.libPortalMod.PortalProps, /* repeated */ js.Any) => _ = null,
    onRendered: js.Function = null,
    placement: Placements = null,
    popperConfig: js.Object = null,
    rootClose: js.UndefOr[scala.Boolean] = js.undefined,
    rootCloseDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    rootCloseEvent: reactDashOverlaysLib.reactDashOverlaysLibStrings.click | reactDashOverlaysLib.reactDashOverlaysLibStrings.mousedown = null,
    show: js.UndefOr[scala.Boolean] = js.undefined,
    target: reactLib.reactMod.ReactInstance | js.Function0[reactLib.reactMod.ReactInstance] = null,
    transition: reactLib.reactMod.ComponentType[reactDashTransitionDashGroupLib.transitionMod.TransitionProps] = null
  ): OverlayProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(flip)) __obj.updateDynamic("flip")(flip)
    if (onEnter != null) __obj.updateDynamic("onEnter")(js.Any.fromFunction1(onEnter))
    if (onEntered != null) __obj.updateDynamic("onEntered")(js.Any.fromFunction1(onEntered))
    if (onEntering != null) __obj.updateDynamic("onEntering")(js.Any.fromFunction1(onEntering))
    if (onExit != null) __obj.updateDynamic("onExit")(js.Any.fromFunction1(onExit))
    if (onExited != null) __obj.updateDynamic("onExited")(js.Any.fromFunction1(onExited))
    if (onExiting != null) __obj.updateDynamic("onExiting")(js.Any.fromFunction1(onExiting))
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction2(onHide))
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

