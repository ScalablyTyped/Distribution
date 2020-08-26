package typings.reactStickyEl.mod.Sticky

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.reactStickyEl.reactStickyElStrings.bottom
import typings.reactStickyEl.reactStickyElStrings.top
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Props[HolderProps /* <: js.Object */] extends HTMLAttributes[HTMLElement] {
  /**
    * Sticky state will be triggered when the bottom of the element is
    * `bottomOffset` pixels from the bottom of the `scrollElement`.
    *
    * Defaults to `0`.
    */
  var bottomOffset: js.UndefOr[Double] = js.native
  /**
    * Selector to define a `boundaryElement`. It should be one of the parents
    * of the current element.
    *
    * Defaults to `null`.
    */
  var boundaryElement: js.UndefOr[String] = js.native
  /**
    * Allows you to disable sticking by setting this prop to `true`.
    *
    * Defaults to `false`.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * If `false` then boundaryEl should have position: relative. In this case
    * sticky element won't disappear on reaching it's boundaries.
    *
    * Defaults to `true`.
    */
  var hideOnBoundaryHit: js.UndefOr[Boolean] = js.native
  /**
    * Anything that can be used by React.createElement. Used for holder
    * element. If you want to use some custom component, please be sure that
    * you don't lose style and className props.
    *
    * Defaults to 'div'.
    */
  var holderCmp: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.native
  /**
    * These props will be used to create `holderElement`.
    */
  var holderProps: js.UndefOr[HolderProps] = js.native
  /**
    * 'top' or 'bottom' - to which side element should stick.
    *
    * Defaults to 'top'.
    */
  var mode: js.UndefOr[top | bottom] = js.native
  /**
    * This handler will be called right before changing `fixed` state.
    *
    * Defaults to `null`.
    */
  var onFixedToggle: js.UndefOr[js.Function1[/* fixed */ Boolean, Unit]] = js.native
  /**
    * If your DOM structure is mutating (you are adding/removing elements), it
    * will be usefull to provide `positionRecheckInterval` greater than zero,
    * in this case position check will be also performed using setInterval in
    * addition to scroll events.
    *
    * Defaults to `0`.
    */
  var positionRecheckInterval: js.UndefOr[Double] = js.native
  /**
    * Selector to define a `scrollElement`. All position checks will be
    * performed according to this element, also it will be listened for
    * 'scroll' event.
    *
    * It should be one of the parents of the current element. Possible
    * selectors: 'body', 'window', '#{id}', anything suitable for
    * `Element.matches`.
    *
    * Defaults to `window`.
    */
  var scrollElement: js.UndefOr[String] = js.native
  /**
    * You can also specify a class name to be applied when the element becomes
    * sticky.
    *
    * Defaults to 'sticky'.
    */
  var stickyClassName: js.UndefOr[String] = js.native
  /**
    * In the event that you wish to override the style rules applied, simply
    * pass in the style object as a prop.
    *
    * Note: You likely want to avoid messing with the following attributes in
    * your stickyStyle: `left`, `top`, and `width`.
    */
  var stickyStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Sticky state will be triggered when the top of the element is `topOffset`
    * pixels from the top of the `scrollElement`. Positive numbers give the
    * impression of a lazy sticky state, whereas negative numbers are more
    * eager in their attachment.
    *
    * Defaults to `0`.
    */
  var topOffset: js.UndefOr[Double] = js.native
  /**
    * Anything that can be used by `React.createElement`. Used for `wrapper
    * element`. If you want to use some custom component, please be sure that
    * you don't lose `style` and `className` props.
    *
    * Defaults to 'div'.
    */
  var wrapperCmp: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any
  ] = js.native
}

object Props {
  @scala.inline
  def apply[/* <: js.Object */ HolderProps](): Props[HolderProps] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props[HolderProps]]
  }
  @scala.inline
  implicit class PropsOps[Self <: Props[_], /* <: js.Object */ HolderProps] (val x: Self with Props[HolderProps]) extends AnyVal {
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
    def setBottomOffset(value: Double): Self = this.set("bottomOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottomOffset: Self = this.set("bottomOffset", js.undefined)
    @scala.inline
    def setBoundaryElement(value: String): Self = this.set("boundaryElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundaryElement: Self = this.set("boundaryElement", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHideOnBoundaryHit(value: Boolean): Self = this.set("hideOnBoundaryHit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideOnBoundaryHit: Self = this.set("hideOnBoundaryHit", js.undefined)
    @scala.inline
    def setHolderCmp(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = this.set("holderCmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHolderCmp: Self = this.set("holderCmp", js.undefined)
    @scala.inline
    def setHolderProps(value: HolderProps): Self = this.set("holderProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHolderProps: Self = this.set("holderProps", js.undefined)
    @scala.inline
    def setMode(value: top | bottom): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setOnFixedToggle(value: /* fixed */ Boolean => Unit): Self = this.set("onFixedToggle", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnFixedToggle: Self = this.set("onFixedToggle", js.undefined)
    @scala.inline
    def setPositionRecheckInterval(value: Double): Self = this.set("positionRecheckInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositionRecheckInterval: Self = this.set("positionRecheckInterval", js.undefined)
    @scala.inline
    def setScrollElement(value: String): Self = this.set("scrollElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollElement: Self = this.set("scrollElement", js.undefined)
    @scala.inline
    def setStickyClassName(value: String): Self = this.set("stickyClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyClassName: Self = this.set("stickyClassName", js.undefined)
    @scala.inline
    def setStickyStyle(value: CSSProperties): Self = this.set("stickyStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyStyle: Self = this.set("stickyStyle", js.undefined)
    @scala.inline
    def setTopOffset(value: Double): Self = this.set("topOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopOffset: Self = this.set("topOffset", js.undefined)
    @scala.inline
    def setWrapperCmp(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 118 */ js.Any): Self = this.set("wrapperCmp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapperCmp: Self = this.set("wrapperCmp", js.undefined)
  }
  
}

