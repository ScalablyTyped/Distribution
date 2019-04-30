package typings
package reactourLib.reactourMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactourProps extends js.Object {
  /**
    * Change `--reactour-accent` _(defaults to accentColor on IE)_ css custom prop to apply color in _Helper_, number, dots, etc
    * @default #007aff
    */
  var accentColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Customize _Badge_ content using `current` and `total` steps values
    */
  var badgeContent: js.UndefOr[
    js.Function2[/* current */ scala.Double, /* total */ scala.Double, reactLib.reactMod.ReactNode]
  ] = js.undefined
  /**
    * Content to be rendered inside the _Helper_
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Custom class name to add to the _Helper_
    */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Close the _Tour_ by clicking the _Mask_
    * @default true
    */
  var closeWithMask: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable interactivity with _Dots_ navigation in _Helper_
    */
  var disableDotsNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable the ability to click or intercat in any way with the _Highlighted_ element
    */
  var disableInteraction: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Disable all keyboard navigation (next and prev step) when true, disable only selected keys when array
    */
  var disableKeyboardNavigation: js.UndefOr[
    scala.Boolean | (js.Array[
      reactourLib.reactourLibStrings.esc | reactourLib.reactourLibStrings.right | reactourLib.reactourLibStrings.left
    ])
  ] = js.undefined
  /**
    * Function triggered each time current step change
    */
  var getCurrentStep: js.UndefOr[js.Function1[/* currentStep */ scala.Double, scala.Unit]] = js.undefined
  /**
    * Programmatically change current step after the first render, when the value changes
    */
  var goToStep: js.UndefOr[scala.Double] = js.undefined
  /**
    * Custom class name to add to the element which is the overlay for the target element when `disableInteraction`
    */
  var highlightedMaskClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Tolerance in pixels to add when calculating if an element is outside viewport to scroll into view
    */
  var inViewThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * You know…
    */
  var isOpen: scala.Boolean
  /**
    * Change Next button in last step into a custom button to close the Tour
    */
  var lastStepNextButton: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Custom class name to add to the _Mask_
    */
  var maskClassName: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Extra Space between in pixels between _Highlighted_ element and _Mask_
    */
  var maskSpace: js.UndefOr[scala.Double] = js.undefined
  /**
    * Renders as next button navigation
    */
  var nextButton: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Overrides default `nextStep` internal function
    */
  var nextStep: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Do something after _Tour_ is opened
    */
  var onAfterOpen: js.UndefOr[js.Function1[/* target */ stdLib.HTMLDivElement, scala.Unit]] = js.undefined
  /**
    * Do something before _Tour_ is closed
    */
  var onBeforeClose: js.UndefOr[js.Function1[/* target */ stdLib.HTMLDivElement, scala.Unit]] = js.undefined
  /**
    * Renders as prev button navigation
    */
  var prevButton: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  /**
    * Overrides default `prevStep` internal function
    */
  var prevStep: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Beautify _Helper_ and _Mask_ with `border-radius` (in px)
    * @default 0
    */
  var rounded: js.UndefOr[scala.Double] = js.undefined
  /**
    * Smooth scroll duration when positioning the target element (in ms)
    * @default 1
    */
  var scrollDuration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Offset when positioning the target element after scroll to it, by default it's a calculation to the center of the viewport
    */
  var scrollOffset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Show/Hide _Helper_ Navigation buttons
    * @default true
    */
  var showButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show/Hide _Helper_ Close button
    * @default true
    */
  var showCloseButton: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show/Hide _Helper_ Navigation Dots
    * @default true
    */
  var showNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show/Hide number when hovers on each Navigation Dot
    * @default true
    */
  var showNavigationNumber: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Show/Hide _Helper_ Number Badge
    * @default true
    */
  var showNumber: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Starting step when _Tour_ is open the first time
    */
  var startAt: js.UndefOr[scala.Double] = js.undefined
  /**
    * Array of elements to highlight with special info and props
    */
  var steps: js.Array[ReactourStep]
  /**
    * Value to listen if a forced update is needed
    */
  var update: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Delay time when forcing update. Useful when there are known animation/transitions
    * @default 1
    */
  var updateDelay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Function to close the _Tour_
    */
  def onRequestClose(event: reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent]): scala.Unit
}

object ReactourProps {
  @scala.inline
  def apply(
    isOpen: scala.Boolean,
    onRequestClose: reactLib.reactMod.MouseEvent[stdLib.HTMLDivElement, reactLib.NativeMouseEvent] => scala.Unit,
    steps: js.Array[ReactourStep],
    accentColor: java.lang.String = null,
    badgeContent: (/* current */ scala.Double, /* total */ scala.Double) => reactLib.reactMod.ReactNode = null,
    children: reactLib.reactMod.ReactNode = null,
    className: java.lang.String = null,
    closeWithMask: js.UndefOr[scala.Boolean] = js.undefined,
    disableDotsNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    disableInteraction: js.UndefOr[scala.Boolean] = js.undefined,
    disableKeyboardNavigation: scala.Boolean | (js.Array[
      reactourLib.reactourLibStrings.esc | reactourLib.reactourLibStrings.right | reactourLib.reactourLibStrings.left
    ]) = null,
    getCurrentStep: /* currentStep */ scala.Double => scala.Unit = null,
    goToStep: scala.Int | scala.Double = null,
    highlightedMaskClassName: java.lang.String = null,
    inViewThreshold: scala.Int | scala.Double = null,
    lastStepNextButton: reactLib.reactMod.ReactNode = null,
    maskClassName: java.lang.String = null,
    maskSpace: scala.Int | scala.Double = null,
    nextButton: reactLib.reactMod.ReactNode = null,
    nextStep: () => scala.Unit = null,
    onAfterOpen: /* target */ stdLib.HTMLDivElement => scala.Unit = null,
    onBeforeClose: /* target */ stdLib.HTMLDivElement => scala.Unit = null,
    prevButton: reactLib.reactMod.ReactNode = null,
    prevStep: () => scala.Unit = null,
    rounded: scala.Int | scala.Double = null,
    scrollDuration: scala.Int | scala.Double = null,
    scrollOffset: scala.Int | scala.Double = null,
    showButton: js.UndefOr[scala.Boolean] = js.undefined,
    showCloseButton: js.UndefOr[scala.Boolean] = js.undefined,
    showNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    showNavigationNumber: js.UndefOr[scala.Boolean] = js.undefined,
    showNumber: js.UndefOr[scala.Boolean] = js.undefined,
    startAt: scala.Int | scala.Double = null,
    update: java.lang.String = null,
    updateDelay: scala.Int | scala.Double = null
  ): ReactourProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen, onRequestClose = js.Any.fromFunction1(onRequestClose), steps = steps)
    if (accentColor != null) __obj.updateDynamic("accentColor")(accentColor)
    if (badgeContent != null) __obj.updateDynamic("badgeContent")(js.Any.fromFunction2(badgeContent))
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closeWithMask)) __obj.updateDynamic("closeWithMask")(closeWithMask)
    if (!js.isUndefined(disableDotsNavigation)) __obj.updateDynamic("disableDotsNavigation")(disableDotsNavigation)
    if (!js.isUndefined(disableInteraction)) __obj.updateDynamic("disableInteraction")(disableInteraction)
    if (disableKeyboardNavigation != null) __obj.updateDynamic("disableKeyboardNavigation")(disableKeyboardNavigation.asInstanceOf[js.Any])
    if (getCurrentStep != null) __obj.updateDynamic("getCurrentStep")(js.Any.fromFunction1(getCurrentStep))
    if (goToStep != null) __obj.updateDynamic("goToStep")(goToStep.asInstanceOf[js.Any])
    if (highlightedMaskClassName != null) __obj.updateDynamic("highlightedMaskClassName")(highlightedMaskClassName)
    if (inViewThreshold != null) __obj.updateDynamic("inViewThreshold")(inViewThreshold.asInstanceOf[js.Any])
    if (lastStepNextButton != null) __obj.updateDynamic("lastStepNextButton")(lastStepNextButton.asInstanceOf[js.Any])
    if (maskClassName != null) __obj.updateDynamic("maskClassName")(maskClassName)
    if (maskSpace != null) __obj.updateDynamic("maskSpace")(maskSpace.asInstanceOf[js.Any])
    if (nextButton != null) __obj.updateDynamic("nextButton")(nextButton.asInstanceOf[js.Any])
    if (nextStep != null) __obj.updateDynamic("nextStep")(js.Any.fromFunction0(nextStep))
    if (onAfterOpen != null) __obj.updateDynamic("onAfterOpen")(js.Any.fromFunction1(onAfterOpen))
    if (onBeforeClose != null) __obj.updateDynamic("onBeforeClose")(js.Any.fromFunction1(onBeforeClose))
    if (prevButton != null) __obj.updateDynamic("prevButton")(prevButton.asInstanceOf[js.Any])
    if (prevStep != null) __obj.updateDynamic("prevStep")(js.Any.fromFunction0(prevStep))
    if (rounded != null) __obj.updateDynamic("rounded")(rounded.asInstanceOf[js.Any])
    if (scrollDuration != null) __obj.updateDynamic("scrollDuration")(scrollDuration.asInstanceOf[js.Any])
    if (scrollOffset != null) __obj.updateDynamic("scrollOffset")(scrollOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(showButton)) __obj.updateDynamic("showButton")(showButton)
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton)
    if (!js.isUndefined(showNavigation)) __obj.updateDynamic("showNavigation")(showNavigation)
    if (!js.isUndefined(showNavigationNumber)) __obj.updateDynamic("showNavigationNumber")(showNavigationNumber)
    if (!js.isUndefined(showNumber)) __obj.updateDynamic("showNumber")(showNumber)
    if (startAt != null) __obj.updateDynamic("startAt")(startAt.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update)
    if (updateDelay != null) __obj.updateDynamic("updateDelay")(updateDelay.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactourProps]
  }
}

