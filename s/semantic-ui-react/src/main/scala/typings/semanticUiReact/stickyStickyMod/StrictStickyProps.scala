package typings.semanticUiReact.stickyStickyMod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictStickyProps extends js.Object {
  /** A Sticky can be active. */
  var active: js.UndefOr[Boolean] = js.native
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Offset in pixels from the bottom of the screen when fixing element to viewport. */
  var bottomOffset: js.UndefOr[Double] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Additional classes. */
  var className: js.UndefOr[String] = js.native
  /** Context which sticky element should stick to. */
  var context: js.UndefOr[Document | Window | HTMLElement | Ref[HTMLElement]] = js.native
  /** Offset in pixels from the top of the screen when fixing element to viewport. */
  var offset: js.UndefOr[Double] = js.native
  /**
    * Callback when element is bound to bottom of parent container.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onBottom: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps, Unit]
  ] = js.native
  /**
    * Callback when element is fixed to page.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onStick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps, Unit]
  ] = js.native
  /**
    * Callback when element is bound to top of parent container.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onTop: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps, Unit]
  ] = js.native
  /**
    * Callback when element is unfixed from page.
    *
    * @param {SyntheticEvent} event - React's original SyntheticEvent.
    * @param {object} data - All props.
    */
  var onUnstick: js.UndefOr[
    js.Function2[/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps, Unit]
  ] = js.native
  /** Whether element should be "pushed" by the viewport, attaching to the bottom of the screen when scrolling up. */
  var pushing: js.UndefOr[Boolean] = js.native
  /** Context which sticky should attach onscroll events. */
  var scrollContext: js.UndefOr[Document | Window | HTMLElement | Ref[HTMLElement]] = js.native
  /** Custom style for sticky element. */
  var styleElement: js.UndefOr[CSSProperties] = js.native
}

object StrictStickyProps {
  @scala.inline
  def apply(): StrictStickyProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictStickyProps]
  }
  @scala.inline
  implicit class StrictStickyPropsOps[Self <: StrictStickyProps] (val x: Self) extends AnyVal {
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    @scala.inline
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setBottomOffset(value: Double): Self = this.set("bottomOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomOffset: Self = this.set("bottomOffset", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setContextFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("context", js.Any.fromFunction1(value))
    @scala.inline
    def setContext(value: Document | Window | HTMLElement | Ref[HTMLElement]): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setContextNull: Self = this.set("context", null)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnBottom(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit): Self = this.set("onBottom", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBottom: Self = this.set("onBottom", js.undefined)
    @scala.inline
    def setOnStick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit): Self = this.set("onStick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnStick: Self = this.set("onStick", js.undefined)
    @scala.inline
    def setOnTop(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit): Self = this.set("onTop", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTop: Self = this.set("onTop", js.undefined)
    @scala.inline
    def setOnUnstick(value: (/* event */ MouseEvent[HTMLElement, NativeMouseEvent], /* data */ StickyProps) => Unit): Self = this.set("onUnstick", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUnstick: Self = this.set("onUnstick", js.undefined)
    @scala.inline
    def setPushing(value: Boolean): Self = this.set("pushing", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePushing: Self = this.set("pushing", js.undefined)
    @scala.inline
    def setScrollContextFunction1(value: /* instance */ HTMLElement | Null => Unit): Self = this.set("scrollContext", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollContext(value: Document | Window | HTMLElement | Ref[HTMLElement]): Self = this.set("scrollContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollContext: Self = this.set("scrollContext", js.undefined)
    @scala.inline
    def setScrollContextNull: Self = this.set("scrollContext", null)
    @scala.inline
    def setStyleElement(value: CSSProperties): Self = this.set("styleElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleElement: Self = this.set("styleElement", js.undefined)
  }
  
}

