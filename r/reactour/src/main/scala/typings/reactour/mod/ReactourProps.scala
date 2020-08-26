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

@js.native
trait ReactourProps extends js.Object {
  /**
    * Change `--reactour-accent` _(defaults to accentColor on IE)_ css custom prop to apply color in _Helper_, number, dots, etc
    * @default #007aff
    */
  var accentColor: js.UndefOr[String] = js.native
  /**
    * Configure accessibility related accessibility options
    */
  var accessibilityOptions: js.UndefOr[ReactourAccessibilityOptions] = js.native
  /**
    * Customize _Badge_ content using `current` and `total` steps values
    */
  var badgeContent: js.UndefOr[js.Function2[/* current */ Double, /* total */ Double, ReactNode]] = js.native
  /**
    * Content to be rendered inside the _Helper_
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * Custom class name to add to the _Helper_
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Close the _Tour_ by clicking the _Mask_
    * @default true
    */
  var closeWithMask: js.UndefOr[Boolean] = js.native
  /**
    * Disable interactivity with _Dots_ navigation in _Helper_
    */
  var disableDotsNavigation: js.UndefOr[Boolean] = js.native
  /**
    * Disable FocusLock component
    * @default false
    */
  var disableFocusLock: js.UndefOr[Boolean] = js.native
  /**
    * Disable the ability to click or intercat in any way with the _Highlighted_ element
    */
  var disableInteraction: js.UndefOr[Boolean] = js.native
  /**
    * Disable all keyboard navigation (next and prev step) when true, disable only selected keys when array
    */
  var disableKeyboardNavigation: js.UndefOr[Boolean | (js.Array[esc | right | left])] = js.native
  /**
    * Function triggered each time current step change
    */
  var getCurrentStep: js.UndefOr[js.Function1[/* currentStep */ Double, Unit]] = js.native
  /**
    * Programmatically change current step after the first render, when the value changes
    */
  var goToStep: js.UndefOr[Double] = js.native
  /**
    * Custom class name to add to the element which is the overlay for the target element when `disableInteraction`
    */
  var highlightedMaskClassName: js.UndefOr[String] = js.native
  /**
    * Tolerance in pixels to add when calculating if an element is outside viewport to scroll into view
    */
  var inViewThreshold: js.UndefOr[Double] = js.native
  /**
    * You know…
    */
  var isOpen: Boolean = js.native
  /**
    * Change Next button in last step into a custom button to close the Tour
    */
  var lastStepNextButton: js.UndefOr[ReactNode] = js.native
  /**
    * Custom class name to add to the _Mask_
    */
  var maskClassName: js.UndefOr[String] = js.native
  /**
    * Extra Space between in pixels between _Highlighted_ element and _Mask_
    */
  var maskSpace: js.UndefOr[Double] = js.native
  /**
    * Renders as next button navigation
    */
  var nextButton: js.UndefOr[ReactNode] = js.native
  /**
    * Overrides default `nextStep` internal function
    */
  var nextStep: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Do something after _Tour_ is opened
    */
  var onAfterOpen: js.UndefOr[js.Function1[/* target */ HTMLDivElement, Unit]] = js.native
  /**
    * Do something before _Tour_ is closed
    */
  var onBeforeClose: js.UndefOr[js.Function1[/* target */ HTMLDivElement, Unit]] = js.native
  /**
    * Renders as prev button navigation
    */
  var prevButton: js.UndefOr[ReactNode] = js.native
  /**
    * Overrides default `prevStep` internal function
    */
  var prevStep: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Beautify _Helper_ and _Mask_ with `border-radius` (in px)
    * @default 0
    */
  var rounded: js.UndefOr[Double] = js.native
  /**
    * Smooth scroll duration when positioning the target element (in ms)
    * @default 1
    */
  var scrollDuration: js.UndefOr[Double] = js.native
  /**
    * Offset when positioning the target element after scroll to it, by default it's a calculation to the center of the viewport
    */
  var scrollOffset: js.UndefOr[Double] = js.native
  /**
    * Show/Hide _Helper_ Navigation buttons
    * @default true
    */
  var showButtons: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide _Helper_ Close button
    * @default true
    */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide _Helper_ Navigation Dots
    * @default true
    */
  var showNavigation: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide number when hovers on each Navigation Dot
    * @default true
    */
  var showNavigationNumber: js.UndefOr[Boolean] = js.native
  /**
    * Show/Hide _Helper_ Number Badge
    * @default true
    */
  var showNumber: js.UndefOr[Boolean] = js.native
  /**
    * Starting step when _Tour_ is open the first time
    */
  var startAt: js.UndefOr[Double] = js.native
  /**
    * Array of elements to highlight with special info and props
    */
  var steps: js.Array[ReactourStep] = js.native
  /**
    * Value to listen if a forced update is needed
    */
  var update: js.UndefOr[String] = js.native
  /**
    * Delay time when forcing update. Useful when there are known animation/transitions
    * @default 1
    */
  var updateDelay: js.UndefOr[Double] = js.native
  /**
    * Function to close the _Tour_
    */
  def onRequestClose(event: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
}

object ReactourProps {
  @scala.inline
  def apply(
    isOpen: Boolean,
    onRequestClose: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit,
    steps: js.Array[ReactourStep]
  ): ReactourProps = {
    val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], onRequestClose = js.Any.fromFunction1(onRequestClose), steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactourProps]
  }
  @scala.inline
  implicit class ReactourPropsOps[Self <: ReactourProps] (val x: Self) extends AnyVal {
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
    def setIsOpen(value: Boolean): Self = this.set("isOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnRequestClose(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = this.set("onRequestClose", js.Any.fromFunction1(value))
    @scala.inline
    def setStepsVarargs(value: ReactourStep*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[ReactourStep]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccentColor(value: String): Self = this.set("accentColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccentColor: Self = this.set("accentColor", js.undefined)
    @scala.inline
    def setAccessibilityOptions(value: ReactourAccessibilityOptions): Self = this.set("accessibilityOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityOptions: Self = this.set("accessibilityOptions", js.undefined)
    @scala.inline
    def setBadgeContent(value: (/* current */ Double, /* total */ Double) => ReactNode): Self = this.set("badgeContent", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBadgeContent: Self = this.set("badgeContent", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCloseWithMask(value: Boolean): Self = this.set("closeWithMask", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseWithMask: Self = this.set("closeWithMask", js.undefined)
    @scala.inline
    def setDisableDotsNavigation(value: Boolean): Self = this.set("disableDotsNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDotsNavigation: Self = this.set("disableDotsNavigation", js.undefined)
    @scala.inline
    def setDisableFocusLock(value: Boolean): Self = this.set("disableFocusLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableFocusLock: Self = this.set("disableFocusLock", js.undefined)
    @scala.inline
    def setDisableInteraction(value: Boolean): Self = this.set("disableInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableInteraction: Self = this.set("disableInteraction", js.undefined)
    @scala.inline
    def setDisableKeyboardNavigationVarargs(value: (esc | right | left)*): Self = this.set("disableKeyboardNavigation", js.Array(value :_*))
    @scala.inline
    def setDisableKeyboardNavigation(value: Boolean | (js.Array[esc | right | left])): Self = this.set("disableKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableKeyboardNavigation: Self = this.set("disableKeyboardNavigation", js.undefined)
    @scala.inline
    def setGetCurrentStep(value: /* currentStep */ Double => Unit): Self = this.set("getCurrentStep", js.Any.fromFunction1(value))
    @scala.inline
    def deleteGetCurrentStep: Self = this.set("getCurrentStep", js.undefined)
    @scala.inline
    def setGoToStep(value: Double): Self = this.set("goToStep", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGoToStep: Self = this.set("goToStep", js.undefined)
    @scala.inline
    def setHighlightedMaskClassName(value: String): Self = this.set("highlightedMaskClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightedMaskClassName: Self = this.set("highlightedMaskClassName", js.undefined)
    @scala.inline
    def setInViewThreshold(value: Double): Self = this.set("inViewThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInViewThreshold: Self = this.set("inViewThreshold", js.undefined)
    @scala.inline
    def setLastStepNextButton(value: ReactNode): Self = this.set("lastStepNextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastStepNextButton: Self = this.set("lastStepNextButton", js.undefined)
    @scala.inline
    def setMaskClassName(value: String): Self = this.set("maskClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskClassName: Self = this.set("maskClassName", js.undefined)
    @scala.inline
    def setMaskSpace(value: Double): Self = this.set("maskSpace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskSpace: Self = this.set("maskSpace", js.undefined)
    @scala.inline
    def setNextButton(value: ReactNode): Self = this.set("nextButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextButton: Self = this.set("nextButton", js.undefined)
    @scala.inline
    def setNextStep(value: () => Unit): Self = this.set("nextStep", js.Any.fromFunction0(value))
    @scala.inline
    def deleteNextStep: Self = this.set("nextStep", js.undefined)
    @scala.inline
    def setOnAfterOpen(value: /* target */ HTMLDivElement => Unit): Self = this.set("onAfterOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAfterOpen: Self = this.set("onAfterOpen", js.undefined)
    @scala.inline
    def setOnBeforeClose(value: /* target */ HTMLDivElement => Unit): Self = this.set("onBeforeClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnBeforeClose: Self = this.set("onBeforeClose", js.undefined)
    @scala.inline
    def setPrevButton(value: ReactNode): Self = this.set("prevButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrevButton: Self = this.set("prevButton", js.undefined)
    @scala.inline
    def setPrevStep(value: () => Unit): Self = this.set("prevStep", js.Any.fromFunction0(value))
    @scala.inline
    def deletePrevStep: Self = this.set("prevStep", js.undefined)
    @scala.inline
    def setRounded(value: Double): Self = this.set("rounded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRounded: Self = this.set("rounded", js.undefined)
    @scala.inline
    def setScrollDuration(value: Double): Self = this.set("scrollDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollDuration: Self = this.set("scrollDuration", js.undefined)
    @scala.inline
    def setScrollOffset(value: Double): Self = this.set("scrollOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollOffset: Self = this.set("scrollOffset", js.undefined)
    @scala.inline
    def setShowButtons(value: Boolean): Self = this.set("showButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowButtons: Self = this.set("showButtons", js.undefined)
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = this.set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCloseButton: Self = this.set("showCloseButton", js.undefined)
    @scala.inline
    def setShowNavigation(value: Boolean): Self = this.set("showNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNavigation: Self = this.set("showNavigation", js.undefined)
    @scala.inline
    def setShowNavigationNumber(value: Boolean): Self = this.set("showNavigationNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNavigationNumber: Self = this.set("showNavigationNumber", js.undefined)
    @scala.inline
    def setShowNumber(value: Boolean): Self = this.set("showNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowNumber: Self = this.set("showNumber", js.undefined)
    @scala.inline
    def setStartAt(value: Double): Self = this.set("startAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartAt: Self = this.set("startAt", js.undefined)
    @scala.inline
    def setUpdate(value: String): Self = this.set("update", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdate: Self = this.set("update", js.undefined)
    @scala.inline
    def setUpdateDelay(value: Double): Self = this.set("updateDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateDelay: Self = this.set("updateDelay", js.undefined)
  }
  
}

