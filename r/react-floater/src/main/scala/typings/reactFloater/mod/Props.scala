package typings.reactFloater.mod

import typings.popperJs.mod.Data
import typings.popperJs.mod.Modifiers
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import typings.reactFloater.anon.Offset
import typings.reactFloater.anon.PartialStyles
import typings.reactFloater.reactFloaterStrings.click
import typings.reactFloater.reactFloaterStrings.floater
import typings.reactFloater.reactFloaterStrings.hover
import typings.reactFloater.reactFloaterStrings.wrapper
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props extends js.Object {
  /**
    * Open the Floater automatically.
    */
  var autoOpen: js.UndefOr[Boolean] = js.native
  /**
    * It will be called when the Floater change state
    */
  var callback: js.UndefOr[
    js.Function2[/* action */ Action, /* props */ PropsWithComponent | PropsWithContent, Unit]
  ] = js.native
  /**
    * An element to trigger the Floater.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Log some basic actions.
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * Animate the Floater on scroll/resize.
    */
  var disableAnimation: js.UndefOr[Boolean] = js.native
  /**
    * Disable changes in the Floater position on scroll/resize.
    */
  var disableFlip: js.UndefOr[Boolean] = js.native
  /**
    * Don't convert hover event to click on mobile.
    */
  var disableHoverToClick: js.UndefOr[Boolean] = js.native
  /**
    * The event that will trigger the Floater. It can be hover | click.
    * These won't work in controlled mode.
    */
  var event: js.UndefOr[click | hover] = js.native
  /**
    * The amount of time (in seconds) that the floater should wait after a mouseLeave event before hiding. Only valid for event type hover.
    */
  var eventDelay: js.UndefOr[Double] = js.native
  /**
    * It can be anything that can be rendered.
    */
  var footer: js.UndefOr[ReactNode] = js.native
  /**
    * Get the popper.js instance
    */
  var getPopper: js.UndefOr[js.Function2[/* popper */ Data, /* origin */ floater | wrapper, Unit]] = js.native
  /**
    * Don't show the arrow. Useful for centered or modal layout.
    */
  var hideArrow: js.UndefOr[Boolean] = js.native
  /**
    * In case that you need to identify the portal.
    */
  var id: js.UndefOr[String | Double] = js.native
  /**
    * The distance between the Floater and its target in pixels.
    */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Controlled mode.
    */
  var open: js.UndefOr[Boolean] = js.native
  /**
    * Customize popper.js modifiers.
    */
  var options: js.UndefOr[Modifiers] = js.native
  /**
    * The placement of the Floater. It will update the position if there's no space available.
    */
  var placement: js.UndefOr[Placement] = js.native
  /**
    * It will show a ⨉ button to close the Floater.
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
  /**
    * Customize the default UI.
    */
  var styles: js.UndefOr[PartialStyles] = js.native
  /**
    * The target used to calculate the Floater position. If it's not set, it will use the `children` as the target.
    */
  var target: js.UndefOr[String | HTMLElement | Null] = js.native
  /**
    * It can be anything that can be rendered.
    */
  var title: js.UndefOr[ReactNode] = js.native
  /**
    * Position the wrapper relative to the target.
    */
  var wrapperOptions: js.UndefOr[Offset] = js.native
}

object Props {
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
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
    def setAutoOpen(value: Boolean): Self = this.set("autoOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoOpen: Self = this.set("autoOpen", js.undefined)
    @scala.inline
    def setCallback(value: (/* action */ Action, /* props */ PropsWithComponent | PropsWithContent) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setDisableAnimation(value: Boolean): Self = this.set("disableAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableAnimation: Self = this.set("disableAnimation", js.undefined)
    @scala.inline
    def setDisableFlip(value: Boolean): Self = this.set("disableFlip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFlip: Self = this.set("disableFlip", js.undefined)
    @scala.inline
    def setDisableHoverToClick(value: Boolean): Self = this.set("disableHoverToClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHoverToClick: Self = this.set("disableHoverToClick", js.undefined)
    @scala.inline
    def setEvent(value: click | hover): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setEventDelay(value: Double): Self = this.set("eventDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventDelay: Self = this.set("eventDelay", js.undefined)
    @scala.inline
    def setFooter(value: ReactNode): Self = this.set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    @scala.inline
    def setGetPopper(value: (/* popper */ Data, /* origin */ floater | wrapper) => Unit): Self = this.set("getPopper", js.Any.fromFunction2(value))
    @scala.inline
    def deleteGetPopper: Self = this.set("getPopper", js.undefined)
    @scala.inline
    def setHideArrow(value: Boolean): Self = this.set("hideArrow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideArrow: Self = this.set("hideArrow", js.undefined)
    @scala.inline
    def setId(value: String | Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOpen(value: Boolean): Self = this.set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    @scala.inline
    def setOptions(value: Modifiers): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setPlacement(value: Placement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyles(value: PartialStyles): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTarget(value: String | HTMLElement): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetNull: Self = this.set("target", null)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setWrapperOptions(value: Offset): Self = this.set("wrapperOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperOptions: Self = this.set("wrapperOptions", js.undefined)
  }
  
}

