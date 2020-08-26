package typings.reactOverlays.overlayMod

import typings.react.mod.ComponentType
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.reactOverlays.mod.TransitionCallbacks
import typings.reactOverlays.portalMod.PortalProps
import typings.reactOverlays.reactOverlaysStrings.click
import typings.reactOverlays.reactOverlaysStrings.mousedown
import typings.reactTransitionGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayProps
  extends TransitionCallbacks
     with PortalProps {
  /**
    * Enables the Popper.js `flip` modifier, allowing the Overlay to
    * automatically adjust it's placement in case of overlap with the viewport or toggle.
    */
  var flip: js.UndefOr[Boolean] = js.native
  /**
    * A Callback fired by the Overlay when it wishes to be hidden.
    *
    * __required__ when `rootClose` is `true`.
    */
  var onHide: js.UndefOr[js.Function2[/* props */ PortalProps, /* repeated */ js.Any, _]] = js.native
  /** Specify where the overlay element is positioned in relation to the target element */
  var placement: js.UndefOr[Placements] = js.native
  /**
    * A set of popper options and props passed directly to react-popper's Popper component.
    */
  var popperConfig: js.UndefOr[js.Object] = js.native
  /**
    * Specify whether the overlay should trigger `onHide` when the user clicks outside the overlay
    */
  var rootClose: js.UndefOr[Boolean] = js.native
  /**
    * Specify disabled for disable RootCloseWrapper
    */
  var rootCloseDisabled: js.UndefOr[Boolean] = js.native
  /**
    * Specify event for toggling overlay
    */
  var rootCloseEvent: js.UndefOr[click | mousedown] = js.native
  /**
    * Set the visibility of the Overlay
    */
  var show: js.UndefOr[Boolean] = js.native
  var target: js.UndefOr[ReactInstance | js.Function0[ReactInstance]] = js.native
  /**
    * A `react-transition-group@2.0.0` `<Transition/>` component
    * used to animate the overlay as it changes visibility.
    */
  var transition: js.UndefOr[ComponentType[TransitionProps[js.UndefOr[scala.Nothing]]]] = js.native
  /**
    * A render prop that returns an element to overlay and position. See
    * the [react-popper documentation](https://github.com/FezVrasta/react-popper#children) for more info.
    */
  def children(renderProps: OverlayRenderProps): ReactElement = js.native
}

object OverlayProps {
  @scala.inline
  def apply(children: OverlayRenderProps => ReactElement): OverlayProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[OverlayProps]
  }
  @scala.inline
  implicit class OverlayPropsOps[Self <: OverlayProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildren(value: OverlayRenderProps => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setFlip(value: Boolean): Self = this.set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlip: Self = this.set("flip", js.undefined)
    @scala.inline
    def setOnHide(value: (/* props */ PortalProps, /* repeated */ js.Any) => _): Self = this.set("onHide", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    @scala.inline
    def setPlacement(value: Placements): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setPopperConfig(value: js.Object): Self = this.set("popperConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopperConfig: Self = this.set("popperConfig", js.undefined)
    @scala.inline
    def setRootClose(value: Boolean): Self = this.set("rootClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootClose: Self = this.set("rootClose", js.undefined)
    @scala.inline
    def setRootCloseDisabled(value: Boolean): Self = this.set("rootCloseDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootCloseDisabled: Self = this.set("rootCloseDisabled", js.undefined)
    @scala.inline
    def setRootCloseEvent(value: click | mousedown): Self = this.set("rootCloseEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootCloseEvent: Self = this.set("rootCloseEvent", js.undefined)
    @scala.inline
    def setShow(value: Boolean): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    @scala.inline
    def setTargetFunction0(value: () => ReactInstance): Self = this.set("target", js.Any.fromFunction0(value))
    @scala.inline
    def setTarget(value: ReactInstance | js.Function0[ReactInstance]): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTransition(value: ComponentType[TransitionProps[js.UndefOr[scala.Nothing]]]): Self = this.set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
  }
  
}

