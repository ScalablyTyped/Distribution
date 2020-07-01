package typings.reactour.mod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.reactour.reactourStrings.esc
import typings.reactour.reactourStrings.left
import typings.reactour.reactourStrings.right
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactourProps extends js.Object {
  /**
    * Change `--reactour-accent` _(defaults to accentColor on IE)_ css custom prop to apply color in _Helper_, number, dots, etc
    * @default #007aff
    */
  var accentColor: js.UndefOr[String] = js.undefined
  /**
    * Configure accessibility related accessibility options
    */
  var accessibilityOptions: js.UndefOr[ReactourAccessibilityOptions] = js.undefined
  /**
    * Customize _Badge_ content using `current` and `total` steps values
    */
  var badgeContent: js.UndefOr[js.Function2[/* current */ Double, /* total */ Double, ReactNode]] = js.undefined
  /**
    * Content to be rendered inside the _Helper_
    */
  var children: js.UndefOr[ReactNode] = js.undefined
  /**
    * Custom class name to add to the _Helper_
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * Close the _Tour_ by clicking the _Mask_
    * @default true
    */
  var closeWithMask: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable interactivity with _Dots_ navigation in _Helper_
    */
  var disableDotsNavigation: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable FocusLock component
    * @default false
    */
  var disableFocusLock: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable the ability to click or intercat in any way with the _Highlighted_ element
    */
  var disableInteraction: js.UndefOr[Boolean] = js.undefined
  /**
    * Disable all keyboard navigation (next and prev step) when true, disable only selected keys when array
    */
  var disableKeyboardNavigation: js.UndefOr[Boolean | (js.Array[esc | right | left])] = js.undefined
  /**
    * Function triggered each time current step change
    */
  var getCurrentStep: js.UndefOr[js.Function1[/* currentStep */ Double, Unit]] = js.undefined
  /**
    * Programmatically change current step after the first render, when the value changes
    */
  var goToStep: js.UndefOr[Double] = js.undefined
  /**
    * Custom class name to add to the element which is the overlay for the target element when `disableInteraction`
    */
  var highlightedMaskClassName: js.UndefOr[String] = js.undefined
  /**
    * Tolerance in pixels to add when calculating if an element is outside viewport to scroll into view
    */
  var inViewThreshold: js.UndefOr[Double] = js.undefined
  /**
    * You know…
    */
  var isOpen: Boolean
  /**
    * Change Next button in last step into a custom button to close the Tour
    */
  var lastStepNextButton: js.UndefOr[ReactNode] = js.undefined
  /**
    * Custom class name to add to the _Mask_
    */
  var maskClassName: js.UndefOr[String] = js.undefined
  /**
    * Extra Space between in pixels between _Highlighted_ element and _Mask_
    */
  var maskSpace: js.UndefOr[Double] = js.undefined
  /**
    * Renders as next button navigation
    */
  var nextButton: js.UndefOr[ReactNode] = js.undefined
  /**
    * Overrides default `nextStep` internal function
    */
  var nextStep: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Do something after _Tour_ is opened
    */
  var onAfterOpen: js.UndefOr[js.Function1[/* target */ HTMLDivElement, Unit]] = js.undefined
  /**
    * Do something before _Tour_ is closed
    */
  var onBeforeClose: js.UndefOr[js.Function1[/* target */ HTMLDivElement, Unit]] = js.undefined
  /**
    * Renders as prev button navigation
    */
  var prevButton: js.UndefOr[ReactNode] = js.undefined
  /**
    * Overrides default `prevStep` internal function
    */
  var prevStep: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * Beautify _Helper_ and _Mask_ with `border-radius` (in px)
    * @default 0
    */
  var rounded: js.UndefOr[Double] = js.undefined
  /**
    * Smooth scroll duration when positioning the target element (in ms)
    * @default 1
    */
  var scrollDuration: js.UndefOr[Double] = js.undefined
  /**
    * Offset when positioning the target element after scroll to it, by default it's a calculation to the center of the viewport
    */
  var scrollOffset: js.UndefOr[Double] = js.undefined
  /**
    * Show/Hide _Helper_ Navigation buttons
    * @default true
    */
  var showButtons: js.UndefOr[Boolean] = js.undefined
  /**
    * Show/Hide _Helper_ Close button
    * @default true
    */
  var showCloseButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Show/Hide _Helper_ Navigation Dots
    * @default true
    */
  var showNavigation: js.UndefOr[Boolean] = js.undefined
  /**
    * Show/Hide number when hovers on each Navigation Dot
    * @default true
    */
  var showNavigationNumber: js.UndefOr[Boolean] = js.undefined
  /**
    * Show/Hide _Helper_ Number Badge
    * @default true
    */
  var showNumber: js.UndefOr[Boolean] = js.undefined
  /**
    * Starting step when _Tour_ is open the first time
    */
  var startAt: js.UndefOr[Double] = js.undefined
  /**
    * Array of elements to highlight with special info and props
    */
  var steps: js.Array[ReactourStep]
  /**
    * Value to listen if a forced update is needed
    */
  var update: js.UndefOr[String] = js.undefined
  /**
    * Delay time when forcing update. Useful when there are known animation/transitions
    * @default 1
    */
  var updateDelay: js.UndefOr[Double] = js.undefined
  /**
    * Function to close the _Tour_
    */
  def onRequestClose(event: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit
}

object ReactourProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    onRequestClose: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
    steps: js.Array[ReactourStep],
    accentColor: String = null,
    accessibilityOptions: ReactourAccessibilityOptions = null,
    badgeContent: (/* current */ Double, /* total */ Double) => ReactNode = null,
    children: ReactNode = null,
    className: String = null,
    closeWithMask: js.UndefOr[Boolean] = js.undefined,
    disableDotsNavigation: js.UndefOr[Boolean] = js.undefined,
    disableFocusLock: js.UndefOr[Boolean] = js.undefined,
    disableInteraction: js.UndefOr[Boolean] = js.undefined,
    disableKeyboardNavigation: Boolean | (js.Array[esc | right | left]) = null,
    getCurrentStep: /* currentStep */ Double => Unit = null,
    goToStep: js.UndefOr[Double] = js.undefined,
    highlightedMaskClassName: String = null,
    inViewThreshold: js.UndefOr[Double] = js.undefined,
    lastStepNextButton: ReactNode = null,
    maskClassName: String = null,
    maskSpace: js.UndefOr[Double] = js.undefined,
    nextButton: ReactNode = null,
    nextStep: () => Unit = null,
    onAfterOpen: /* target */ HTMLDivElement => Unit = null,
    onBeforeClose: /* target */ HTMLDivElement => Unit = null,
    prevButton: ReactNode = null,
    prevStep: () => Unit = null,
    rounded: js.UndefOr[Double] = js.undefined,
    scrollDuration: js.UndefOr[Double] = js.undefined,
    scrollOffset: js.UndefOr[Double] = js.undefined,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showNavigation: js.UndefOr[Boolean] = js.undefined,
    showNavigationNumber: js.UndefOr[Boolean] = js.undefined,
    showNumber: js.UndefOr[Boolean] = js.undefined,
    startAt: js.UndefOr[Double] = js.undefined,
    update: String = null,
    updateDelay: js.UndefOr[Double] = js.undefined
  ): ReactourProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1(onRequestClose), steps = steps.asInstanceOf[js.Any])
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor.asInstanceOf[js.Any])
    if (accessibilityOptions != null) __obj.updateDynamic("accessibilityOptions")(accessibilityOptions.asInstanceOf[js.Any])
    if (badgeContent != null) __obj.updateDynamic("badgeContent")(js.Any.fromFunction2(badgeContent))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closeWithMask)) __obj.updateDynamic("closeWithMask")(closeWithMask.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableDotsNavigation)) __obj.updateDynamic("disableDotsNavigation")(disableDotsNavigation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFocusLock)) __obj.updateDynamic("disableFocusLock")(disableFocusLock.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInteraction)) __obj.updateDynamic("disableInteraction")(disableInteraction.get.asInstanceOf[js.Any])
    if (disableKeyboardNavigation != null) __obj.updateDynamic("disableKeyboardNavigation")(disableKeyboardNavigation.asInstanceOf[js.Any])
    if (getCurrentStep != null) __obj.updateDynamic("getCurrentStep")(js.Any.fromFunction1(getCurrentStep))
    if (!js.isUndefined(goToStep)) __obj.updateDynamic("goToStep")(goToStep.get.asInstanceOf[js.Any])
    if (highlightedMaskClassName != null) __obj.updateDynamic("highlightedMaskClassName")(highlightedMaskClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(inViewThreshold)) __obj.updateDynamic("inViewThreshold")(inViewThreshold.get.asInstanceOf[js.Any])
    if (lastStepNextButton != null) __obj.updateDynamic("lastStepNextButton")(lastStepNextButton.asInstanceOf[js.Any])
    if (maskClassName != null) __obj.updateDynamic("maskClassName")(maskClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(maskSpace)) __obj.updateDynamic("maskSpace")(maskSpace.get.asInstanceOf[js.Any])
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton.asInstanceOf[js.Any])
    if (nextStep != null) __obj.updateDynamic("nextStep")(js.Any.fromFunction0(nextStep))
    if (onAfterOpen != null) __obj.updateDynamic("onAfterOpen")(js.Any.fromFunction1(onAfterOpen))
    if (onBeforeClose != null) __obj.updateDynamic("onBeforeClose")(js.Any.fromFunction1(onBeforeClose))
    if (prevButton != null) __obj.updateDynamic("prevButton")(prevButton.asInstanceOf[js.Any])
    if (prevStep != null) __obj.updateDynamic("prevStep")(js.Any.fromFunction0(prevStep))
    if (!js.isUndefined(rounded)) __obj.updateDynamic("rounded")(rounded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollDuration)) __obj.updateDynamic("scrollDuration")(scrollDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollOffset)) __obj.updateDynamic("scrollOffset")(scrollOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigation)) __obj.updateDynamic("showNavigation")(showNavigation.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigationNumber)) __obj.updateDynamic("showNavigationNumber")(showNavigationNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showNumber)) __obj.updateDynamic("showNumber")(showNumber.get.asInstanceOf[js.Any])
    if (!js.isUndefined(startAt)) __obj.updateDynamic("startAt")(startAt.get.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    if (!js.isUndefined(updateDelay)) __obj.updateDynamic("updateDelay")(updateDelay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactourProps]
  }
}

