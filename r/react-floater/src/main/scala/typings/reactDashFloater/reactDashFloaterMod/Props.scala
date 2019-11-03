package typings.reactDashFloater.reactDashFloaterMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Open the Floater automatically.
    */
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * It will be called when the Floater change state
    */
  var callback: js.UndefOr[js.Function0[CallBackProps]] = js.undefined
  /**
    * An element to trigger the Floater.
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * A React component or function to as a custom UI for the Floater.
    * The prop closeFloater will be available in your component.
    */
  var component: js.UndefOr[js.Function1[/* renderProps */ RenderProps, ReactNode]] = js.undefined
  /**
    * The Floater content. It can be anything that can be rendered.
    * This is the only required props, unless you pass a component.
    */
  var content: ReactNode
  /**
    * Log some basic actions.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Animate the Floater on scroll/resize.
    */
  var disableAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable changes in the Floater position on scroll/resize.
    */
  var disableFlip: js.UndefOr[Boolean] = js.undefined
  /**
    * Don't convert hover event to click on mobile.
    */
  var disableHoverToClick: js.UndefOr[Boolean] = js.undefined
  /**
    * The event that will trigger the Floater. It can be hover | click.
    * These won't work in controlled mode.
    */
  var event: js.UndefOr[String] = js.undefined
  /**
    * The amount of time (in seconds) that the floater should wait after a mouseLeave event before hiding. Only valid for event type hover.
    */
  var eventDelay: js.UndefOr[Double] = js.undefined
  /**
    * It can be anything that can be rendered.
    */
  var footer: js.UndefOr[ReactNode] = js.undefined
  /**
    * Get the pooper.js instance
    */
  var getPopper: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Don't show the arrow. Useful for centered or modal layout.
    */
  var hideArrow: js.UndefOr[Boolean] = js.undefined
  /**
    * In case that you need to identify the portal.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  var isPositioned: js.UndefOr[Boolean] = js.undefined
  /**
    * The distance between the Floater and its target in pixels.
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * The switch between normal and controlled modes.
    */
  var open: js.UndefOr[Boolean] = js.undefined
  /**
    * Customize popper.js modifiers.
    */
  var options: js.UndefOr[Options] = js.undefined
  /**
    * The placement of the Floater. It will update the position if there's no space available.
    */
  var placement: js.UndefOr[Placement] = js.undefined
  /**
    * It will show a ⨉ button to close the Floater.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  /**
    * Customize the default UI.
    */
  var styles: js.UndefOr[js.Object] = js.undefined
  /**
    * The target used to calculate the Floater position. If it's not set, it will use the `children` as the target.
    */
  var target: js.UndefOr[String | js.Object] = js.undefined
  /**
    * It can be anything that can be rendered.
    */
  var title: js.UndefOr[ReactNode] = js.undefined
  /**
    * Position the wrapper relative to the target.
    */
  var wrapperOptions: js.UndefOr[js.Object] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    callback: () => CallBackProps = null,
    children: ReactNode = null,
    component: /* renderProps */ RenderProps => ReactNode = null,
    content: ReactNode = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    disableAnimation: js.UndefOr[Boolean] = js.undefined,
    disableFlip: js.UndefOr[Boolean] = js.undefined,
    disableHoverToClick: js.UndefOr[Boolean] = js.undefined,
    event: String = null,
    eventDelay: Int | Double = null,
    footer: ReactNode = null,
    getPopper: () => Unit = null,
    hideArrow: js.UndefOr[Boolean] = js.undefined,
    id: String | Double = null,
    isPositioned: js.UndefOr[Boolean] = js.undefined,
    offset: Int | Double = null,
    open: js.UndefOr[Boolean] = js.undefined,
    options: Options = null,
    placement: Placement = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    styles: js.Object = null,
    target: String | js.Object = null,
    title: ReactNode = null,
    wrapperOptions: js.Object = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction0(callback))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(js.Any.fromFunction1(component))
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (!js.isUndefined(disableAnimation)) __obj.updateDynamic("disableAnimation")(disableAnimation)
    if (!js.isUndefined(disableFlip)) __obj.updateDynamic("disableFlip")(disableFlip)
    if (!js.isUndefined(disableHoverToClick)) __obj.updateDynamic("disableHoverToClick")(disableHoverToClick)
    if (event != null) __obj.updateDynamic("event")(event)
    if (eventDelay != null) __obj.updateDynamic("eventDelay")(eventDelay.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (getPopper != null) __obj.updateDynamic("getPopper")(js.Any.fromFunction0(getPopper))
    if (!js.isUndefined(hideArrow)) __obj.updateDynamic("hideArrow")(hideArrow)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isPositioned)) __obj.updateDynamic("isPositioned")(isPositioned)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (options != null) __obj.updateDynamic("options")(options)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (style != null) __obj.updateDynamic("style")(style)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (wrapperOptions != null) __obj.updateDynamic("wrapperOptions")(wrapperOptions)
    __obj.asInstanceOf[Props]
  }
}

