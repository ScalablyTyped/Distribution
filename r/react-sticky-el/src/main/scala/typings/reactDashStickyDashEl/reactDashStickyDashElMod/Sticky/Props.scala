package typings.reactDashStickyDashEl.reactDashStickyDashElMod.Sticky

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.reactDashStickyDashEl.reactDashStickyDashElStrings.bottom
import typings.reactDashStickyDashEl.reactDashStickyDashElStrings.top
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[HolderProps /* <: js.Object */] extends HTMLAttributes[HTMLElement] {
  /**
    * Sticky state will be triggered when the bottom of the element is
    * `bottomOffset` pixels from the bottom of the `scrollElement`.
    *
    * Defaults to `0`.
    */
  var bottomOffset: js.UndefOr[Double] = js.undefined
  /**
    * Selector to define a `boundaryElement`. It should be one of the parents
    * of the current element.
    *
    * Defaults to `null`.
    */
  var boundaryElement: js.UndefOr[String] = js.undefined
  /**
    * Allows you to disable sticking by setting this prop to `true`.
    *
    * Defaults to `false`.
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * If `false` then boundaryEl should have position: relative. In this case
    * sticky element won't disappear on reaching it's boundaries.
    *
    * Defaults to `true`.
    */
  var hideOnBoundaryHit: js.UndefOr[Boolean] = js.undefined
  /**
    * Anything that can be used by React.createElement. Used for holder
    * element. If you want to use some custom component, please be sure that
    * you don't lose style and className props.
    *
    * Defaults to 'div'.
    */
  var holderCmp: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
  ] = js.undefined
  /**
    * These props will be used to create `holderElement`.
    */
  var holderProps: js.UndefOr[HolderProps] = js.undefined
  /**
    * 'top' or 'bottom' - to which side element should stick.
    *
    * Defaults to 'top'.
    */
  var mode: js.UndefOr[top | bottom] = js.undefined
  /**
    * This handler will be called right before changing `fixed` state.
    *
    * Defaults to `null`.
    */
  var onFixedToggle: js.UndefOr[js.Function1[/* fixed */ Boolean, Unit]] = js.undefined
  /**
    * If your DOM structure is mutating (you are adding/removing elements), it
    * will be usefull to provide `positionRecheckInterval` greater than zero,
    * in this case position check will be also performed using setInterval in
    * addition to scroll events.
    *
    * Defaults to `0`.
    */
  var positionRecheckInterval: js.UndefOr[Double] = js.undefined
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
  var scrollElement: js.UndefOr[String] = js.undefined
  /**
    * You can also specify a class name to be applied when the element becomes
    * sticky.
    *
    * Defaults to 'sticky'.
    */
  var stickyClassName: js.UndefOr[String] = js.undefined
  /**
    * In the event that you wish to override the style rules applied, simply
    * pass in the style object as a prop.
    *
    * Note: You likely want to avoid messing with the following attributes in
    * your stickyStyle: `left`, `top`, and `width`.
    */
  var stickyStyle: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Sticky state will be triggered when the top of the element is `topOffset`
    * pixels from the top of the `scrollElement`. Positive numbers give the
    * impression of a lazy sticky state, whereas negative numbers are more
    * eager in their attachment.
    *
    * Defaults to `0`.
    */
  var topOffset: js.UndefOr[Double] = js.undefined
  /**
    * Anything that can be used by `React.createElement`. Used for `wrapper
    * element`. If you want to use some custom component, please be sure that
    * you don't lose `style` and `className` props.
    *
    * Defaults to 'div'.
    */
  var wrapperCmp: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any
  ] = js.undefined
}

object Props {
  @scala.inline
  def apply[HolderProps /* <: js.Object */](
    HTMLAttributes: HTMLAttributes[HTMLElement] = null,
    bottomOffset: Int | Double = null,
    boundaryElement: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideOnBoundaryHit: js.UndefOr[Boolean] = js.undefined,
    holderCmp: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any = null,
    holderProps: HolderProps = null,
    mode: top | bottom = null,
    onFixedToggle: /* fixed */ Boolean => Unit = null,
    positionRecheckInterval: Int | Double = null,
    scrollElement: String = null,
    stickyClassName: String = null,
    stickyStyle: CSSProperties = null,
    topOffset: Int | Double = null,
    wrapperCmp: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 117 */ js.Any = null
  ): Props[HolderProps] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (bottomOffset != null) __obj.updateDynamic("bottomOffset")(bottomOffset.asInstanceOf[js.Any])
    if (boundaryElement != null) __obj.updateDynamic("boundaryElement")(boundaryElement)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(hideOnBoundaryHit)) __obj.updateDynamic("hideOnBoundaryHit")(hideOnBoundaryHit)
    if (holderCmp != null) __obj.updateDynamic("holderCmp")(holderCmp)
    if (holderProps != null) __obj.updateDynamic("holderProps")(holderProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onFixedToggle != null) __obj.updateDynamic("onFixedToggle")(js.Any.fromFunction1(onFixedToggle))
    if (positionRecheckInterval != null) __obj.updateDynamic("positionRecheckInterval")(positionRecheckInterval.asInstanceOf[js.Any])
    if (scrollElement != null) __obj.updateDynamic("scrollElement")(scrollElement)
    if (stickyClassName != null) __obj.updateDynamic("stickyClassName")(stickyClassName)
    if (stickyStyle != null) __obj.updateDynamic("stickyStyle")(stickyStyle)
    if (topOffset != null) __obj.updateDynamic("topOffset")(topOffset.asInstanceOf[js.Any])
    if (wrapperCmp != null) __obj.updateDynamic("wrapperCmp")(wrapperCmp)
    __obj.asInstanceOf[Props[HolderProps]]
  }
}

