package typings
package reactDashStickyDashElLib.reactDashStickyDashElMod.StickyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props[HolderProps /* <: js.Object */]
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLElement] {
  /**
    * Sticky state will be triggered when the bottom of the element is
    * `bottomOffset` pixels from the bottom of the `scrollElement`.
    *
    * Defaults to `0`.
    */
  var bottomOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Selector to define a `boundaryElement`. It should be one of the parents
    * of the current element.
    *
    * Defaults to `null`.
    */
  var boundaryElement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Allows you to disable sticking by setting this prop to `true`.
    *
    * Defaults to `false`.
    */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If `false` then boundaryEl should have position: relative. In this case
    * sticky element won't disappear on reaching it's boundaries.
    *
    * Defaults to `true`.
    */
  var hideOnBoundaryHit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Anything that can be used by React.createElement. Used for holder
    * element. If you want to use some custom component, please be sure that
    * you don't lose style and className props.
    *
    * Defaults to 'div'.
    */
  var holderCmp: js.UndefOr[java.lang.String] = js.undefined
  /**
    * These props will be used to create `holderElement`.
    */
  var holderProps: js.UndefOr[HolderProps] = js.undefined
  /**
    * 'top' or 'bottom' - to which side element should stick.
    *
    * Defaults to 'top'.
    */
  var mode: js.UndefOr[
    reactDashStickyDashElLib.reactDashStickyDashElLibStrings.top | reactDashStickyDashElLib.reactDashStickyDashElLibStrings.bottom
  ] = js.undefined
  /**
    * This handler will be called right before changing `fixed` state.
    *
    * Defaults to `null`.
    */
  var onFixedToggle: js.UndefOr[js.Function1[/* fixed */ scala.Boolean, scala.Unit]] = js.undefined
  /**
    * If your DOM structure is mutating (you are adding/removing elements), it
    * will be usefull to provide `positionRecheckInterval` greater than zero,
    * in this case position check will be also performed using setInterval in
    * addition to scroll events.
    *
    * Defaults to `0`.
    */
  var positionRecheckInterval: js.UndefOr[scala.Double] = js.undefined
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
  var scrollElement: js.UndefOr[java.lang.String] = js.undefined
  /**
    * You can also specify a class name to be applied when the element becomes
    * sticky.
    *
    * Defaults to 'sticky'.
    */
  var stickyClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * In the event that you wish to override the style rules applied, simply
    * pass in the style object as a prop.
    *
    * Note: You likely want to avoid messing with the following attributes in
    * your stickyStyle: `left`, `top`, and `width`.
    */
  var stickyStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Sticky state will be triggered when the top of the element is `topOffset`
    * pixels from the top of the `scrollElement`. Positive numbers give the
    * impression of a lazy sticky state, whereas negative numbers are more
    * eager in their attachment.
    *
    * Defaults to `0`.
    */
  var topOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Anything that can be used by `React.createElement`. Used for `wrapper
    * element`. If you want to use some custom component, please be sure that
    * you don't lose `style` and `className` props.
    *
    * Defaults to 'div'.
    */
  var wrapperCmp: js.UndefOr[java.lang.String] = js.undefined
}

