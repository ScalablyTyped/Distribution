package typings.reactour

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentPropsWithRef
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactour.reactourStrings.div
import typings.reactour.reactourStrings.esc
import typings.reactour.reactourStrings.left
import typings.reactour.reactourStrings.nav
import typings.reactour.reactourStrings.right
import typings.std.HTMLButtonElement
import typings.std.HTMLDivElement
import typings.std.MutationObserver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reactour", JSImport.Default)
  @js.native
  class default ()
    extends Component[ReactourProps, ReactourState, js.Any]
  
  @JSImport("reactour", "Arrow")
  @js.native
  def Arrow(props: ArrowProps): ReactElement = js.native
  
  @JSImport("reactour", "Badge")
  @js.native
  val Badge: FC[BadgeProps] = js.native
  
  @JSImport("reactour", "Close")
  @js.native
  def Close(props: CloseProps): ReactElement = js.native
  
  @JSImport("reactour", "Controls")
  @js.native
  val Controls: FC[ControlsProps] = js.native
  
  @JSImport("reactour", "Dot")
  @js.native
  val Dot: FC[DotProps] = js.native
  
  @JSImport("reactour", "Navigation")
  @js.native
  val Navigation: FC[NavigationProps] = js.native
  
  @js.native
  trait ArrowProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var inverted: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[ReactNode] = js.native
    
    var onClick: MouseEventHandler[HTMLButtonElement] = js.native
  }
  object ArrowProps {
    
    @scala.inline
    def apply(onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): ArrowProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[ArrowProps]
    }
    
    @scala.inline
    implicit class ArrowPropsMutableBuilder[Self <: ArrowProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setInverted(value: Boolean): Self = StObject.set(x, "inverted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvertedUndefined: Self = StObject.set(x, "inverted", js.undefined)
      
      @scala.inline
      def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'span' extends react.react.ComponentClass<infer P, react.react.ComponentState> ? react.react.PropsWithoutRef<any> & react.react.RefAttributes<std.InstanceType<'span'>> : react.react.PropsWithRef<react.react.ComponentProps<'span'>> */ @js.native
  trait BadgeProps extends StObject {
    
    var accentColor: js.UndefOr[String] = js.native
  }
  object BadgeProps {
    
    @scala.inline
    def apply(): BadgeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BadgeProps]
    }
    
    @scala.inline
    implicit class BadgePropsMutableBuilder[Self <: BadgeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
    }
  }
  
  @js.native
  trait CloseProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var onClick: MouseEventHandler[HTMLButtonElement] = js.native
  }
  object CloseProps {
    
    @scala.inline
    def apply(onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): CloseProps = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction1(onClick))
      __obj.asInstanceOf[CloseProps]
    }
    
    @scala.inline
    implicit class ClosePropsMutableBuilder[Self <: CloseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    }
  }
  
  type ControlsProps = ComponentPropsWithRef[div]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped 'button' extends react.react.ComponentClass<infer P, react.react.ComponentState> ? react.react.PropsWithoutRef<any> & react.react.RefAttributes<std.InstanceType<'button'>> : react.react.PropsWithRef<react.react.ComponentProps<'button'>> */ @js.native
  trait DotProps extends StObject {
    
    var accentColor: js.UndefOr[String] = js.native
    
    var current: js.UndefOr[Double] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var showNumber: js.UndefOr[Boolean] = js.native
  }
  object DotProps {
    
    @scala.inline
    def apply(): DotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotProps]
    }
    
    @scala.inline
    implicit class DotPropsMutableBuilder[Self <: DotProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setShowNumber(value: Boolean): Self = StObject.set(x, "showNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNumberUndefined: Self = StObject.set(x, "showNumber", js.undefined)
    }
  }
  
  type NavigationProps = ComponentPropsWithRef[nav]
  
  @js.native
  trait ReactourAccessibilityOptions extends StObject {
    
    // attribute to associate the dialog with a title for screen readers
    var ariaLabelledBy: js.UndefOr[String] = js.native
    
    // aria-label attribute for the close button
    var closeButtonAriaLabel: js.UndefOr[String] = js.native
    
    // Show/Hide Navigation Dots for screen reader software
    var showNavigationScreenReaders: js.UndefOr[Boolean] = js.native
  }
  object ReactourAccessibilityOptions {
    
    @scala.inline
    def apply(): ReactourAccessibilityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactourAccessibilityOptions]
    }
    
    @scala.inline
    implicit class ReactourAccessibilityOptionsMutableBuilder[Self <: ReactourAccessibilityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setShowNavigationScreenReaders(value: Boolean): Self = StObject.set(x, "showNavigationScreenReaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNavigationScreenReadersUndefined: Self = StObject.set(x, "showNavigationScreenReaders", js.undefined)
    }
  }
  
  @js.native
  trait ReactourProps extends StObject {
    
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
      * Function to close the _Tour_
      */
    def onRequestClose(event: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
    
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
    implicit class ReactourPropsMutableBuilder[Self <: ReactourProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccentColor(value: String): Self = StObject.set(x, "accentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccentColorUndefined: Self = StObject.set(x, "accentColor", js.undefined)
      
      @scala.inline
      def setAccessibilityOptions(value: ReactourAccessibilityOptions): Self = StObject.set(x, "accessibilityOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityOptionsUndefined: Self = StObject.set(x, "accessibilityOptions", js.undefined)
      
      @scala.inline
      def setBadgeContent(value: (/* current */ Double, /* total */ Double) => ReactNode): Self = StObject.set(x, "badgeContent", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBadgeContentUndefined: Self = StObject.set(x, "badgeContent", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseWithMask(value: Boolean): Self = StObject.set(x, "closeWithMask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseWithMaskUndefined: Self = StObject.set(x, "closeWithMask", js.undefined)
      
      @scala.inline
      def setDisableDotsNavigation(value: Boolean): Self = StObject.set(x, "disableDotsNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDotsNavigationUndefined: Self = StObject.set(x, "disableDotsNavigation", js.undefined)
      
      @scala.inline
      def setDisableFocusLock(value: Boolean): Self = StObject.set(x, "disableFocusLock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFocusLockUndefined: Self = StObject.set(x, "disableFocusLock", js.undefined)
      
      @scala.inline
      def setDisableInteraction(value: Boolean): Self = StObject.set(x, "disableInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableInteractionUndefined: Self = StObject.set(x, "disableInteraction", js.undefined)
      
      @scala.inline
      def setDisableKeyboardNavigation(value: Boolean | (js.Array[esc | right | left])): Self = StObject.set(x, "disableKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableKeyboardNavigationUndefined: Self = StObject.set(x, "disableKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setDisableKeyboardNavigationVarargs(value: (esc | right | left)*): Self = StObject.set(x, "disableKeyboardNavigation", js.Array(value :_*))
      
      @scala.inline
      def setGetCurrentStep(value: /* currentStep */ Double => Unit): Self = StObject.set(x, "getCurrentStep", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetCurrentStepUndefined: Self = StObject.set(x, "getCurrentStep", js.undefined)
      
      @scala.inline
      def setGoToStep(value: Double): Self = StObject.set(x, "goToStep", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGoToStepUndefined: Self = StObject.set(x, "goToStep", js.undefined)
      
      @scala.inline
      def setHighlightedMaskClassName(value: String): Self = StObject.set(x, "highlightedMaskClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightedMaskClassNameUndefined: Self = StObject.set(x, "highlightedMaskClassName", js.undefined)
      
      @scala.inline
      def setInViewThreshold(value: Double): Self = StObject.set(x, "inViewThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInViewThresholdUndefined: Self = StObject.set(x, "inViewThreshold", js.undefined)
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastStepNextButton(value: ReactNode): Self = StObject.set(x, "lastStepNextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastStepNextButtonUndefined: Self = StObject.set(x, "lastStepNextButton", js.undefined)
      
      @scala.inline
      def setMaskClassName(value: String): Self = StObject.set(x, "maskClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClassNameUndefined: Self = StObject.set(x, "maskClassName", js.undefined)
      
      @scala.inline
      def setMaskSpace(value: Double): Self = StObject.set(x, "maskSpace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskSpaceUndefined: Self = StObject.set(x, "maskSpace", js.undefined)
      
      @scala.inline
      def setNextButton(value: ReactNode): Self = StObject.set(x, "nextButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextButtonUndefined: Self = StObject.set(x, "nextButton", js.undefined)
      
      @scala.inline
      def setNextStep(value: () => Unit): Self = StObject.set(x, "nextStep", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNextStepUndefined: Self = StObject.set(x, "nextStep", js.undefined)
      
      @scala.inline
      def setOnAfterOpen(value: /* target */ HTMLDivElement => Unit): Self = StObject.set(x, "onAfterOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAfterOpenUndefined: Self = StObject.set(x, "onAfterOpen", js.undefined)
      
      @scala.inline
      def setOnBeforeClose(value: /* target */ HTMLDivElement => Unit): Self = StObject.set(x, "onBeforeClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeCloseUndefined: Self = StObject.set(x, "onBeforeClose", js.undefined)
      
      @scala.inline
      def setOnRequestClose(value: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPrevButton(value: ReactNode): Self = StObject.set(x, "prevButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevButtonUndefined: Self = StObject.set(x, "prevButton", js.undefined)
      
      @scala.inline
      def setPrevStep(value: () => Unit): Self = StObject.set(x, "prevStep", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPrevStepUndefined: Self = StObject.set(x, "prevStep", js.undefined)
      
      @scala.inline
      def setRounded(value: Double): Self = StObject.set(x, "rounded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundedUndefined: Self = StObject.set(x, "rounded", js.undefined)
      
      @scala.inline
      def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDurationUndefined: Self = StObject.set(x, "scrollDuration", js.undefined)
      
      @scala.inline
      def setScrollOffset(value: Double): Self = StObject.set(x, "scrollOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollOffsetUndefined: Self = StObject.set(x, "scrollOffset", js.undefined)
      
      @scala.inline
      def setShowButtons(value: Boolean): Self = StObject.set(x, "showButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowButtonsUndefined: Self = StObject.set(x, "showButtons", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setShowNavigation(value: Boolean): Self = StObject.set(x, "showNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNavigationNumber(value: Boolean): Self = StObject.set(x, "showNavigationNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNavigationNumberUndefined: Self = StObject.set(x, "showNavigationNumber", js.undefined)
      
      @scala.inline
      def setShowNavigationUndefined: Self = StObject.set(x, "showNavigation", js.undefined)
      
      @scala.inline
      def setShowNumber(value: Boolean): Self = StObject.set(x, "showNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowNumberUndefined: Self = StObject.set(x, "showNumber", js.undefined)
      
      @scala.inline
      def setStartAt(value: Double): Self = StObject.set(x, "startAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartAtUndefined: Self = StObject.set(x, "startAt", js.undefined)
      
      @scala.inline
      def setSteps(value: js.Array[ReactourStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepsVarargs(value: ReactourStep*): Self = StObject.set(x, "steps", js.Array(value :_*))
      
      @scala.inline
      def setUpdate(value: String): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDelay(value: Double): Self = StObject.set(x, "updateDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDelayUndefined: Self = StObject.set(x, "updateDelay", js.undefined)
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  @js.native
  trait ReactourState extends StObject {
    
    var bottom: Double = js.native
    
    var current: Double = js.native
    
    var focusUnlocked: Boolean = js.native
    
    var h: Double = js.native
    
    var height: Double = js.native
    
    var helperHeight: js.UndefOr[Double] = js.native
    
    var helperPosition: js.UndefOr[ReactourStepPosition] = js.native
    
    var helperWidth: js.UndefOr[Double] = js.native
    
    var inDOM: Boolean = js.native
    
    var isOpen: Boolean = js.native
    
    var left: Double = js.native
    
    var observer: MutationObserver | Null = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
    
    var w: Double = js.native
    
    var width: Double = js.native
  }
  object ReactourState {
    
    @scala.inline
    def apply(
      bottom: Double,
      current: Double,
      focusUnlocked: Boolean,
      h: Double,
      height: Double,
      inDOM: Boolean,
      isOpen: Boolean,
      left: Double,
      right: Double,
      top: Double,
      w: Double,
      width: Double
    ): ReactourState = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], focusUnlocked = focusUnlocked.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], inDOM = inDOM.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactourState]
    }
    
    @scala.inline
    implicit class ReactourStateMutableBuilder[Self <: ReactourState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusUnlocked(value: Boolean): Self = StObject.set(x, "focusUnlocked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperHeight(value: Double): Self = StObject.set(x, "helperHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperHeightUndefined: Self = StObject.set(x, "helperHeight", js.undefined)
      
      @scala.inline
      def setHelperPosition(value: ReactourStepPosition): Self = StObject.set(x, "helperPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperPositionUndefined: Self = StObject.set(x, "helperPosition", js.undefined)
      
      @scala.inline
      def setHelperWidth(value: Double): Self = StObject.set(x, "helperWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHelperWidthUndefined: Self = StObject.set(x, "helperWidth", js.undefined)
      
      @scala.inline
      def setInDOM(value: Boolean): Self = StObject.set(x, "inDOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserver(value: MutationObserver): Self = StObject.set(x, "observer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObserverNull: Self = StObject.set(x, "observer", null)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReactourStep extends StObject {
    
    /**
      * Action that can be executed on target element of the step
      */
    var action: js.UndefOr[js.Function1[/* domNode */ js.Any, Unit]] = js.native
    
    /**
      * Content of the step
      */
    var content: ReactNode | (js.Function1[/* args */ ReactourStepContentArgs, ReactNode]) = js.native
    
    /**
      * Text read to screen reader software for this step's navigation dot
      */
    var navDotAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * Position of step content
      */
    var position: js.UndefOr[ReactourStepPosition | (js.Tuple2[Double, Double])] = js.native
    
    /**
      * DOM selector to find the target element
      */
    var selector: js.UndefOr[String] = js.native
    
    /**
      * Disable interaction for this specific step.
      * Could be enabled passing `true`
      * when `disableInteraction` prop is present in Tour
      */
    var stepInteraction: js.UndefOr[Boolean] = js.native
    
    /**
      * Additional styles
      */
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object ReactourStep {
    
    @scala.inline
    def apply(): ReactourStep = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactourStep]
    }
    
    @scala.inline
    implicit class ReactourStepMutableBuilder[Self <: ReactourStep] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: /* domNode */ js.Any => Unit): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setContent(value: ReactNode | (js.Function1[/* args */ ReactourStepContentArgs, ReactNode])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction1(value: /* args */ ReactourStepContentArgs => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setNavDotAriaLabel(value: String): Self = StObject.set(x, "navDotAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNavDotAriaLabelUndefined: Self = StObject.set(x, "navDotAriaLabel", js.undefined)
      
      @scala.inline
      def setPosition(value: ReactourStepPosition | (js.Tuple2[Double, Double])): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
      
      @scala.inline
      def setStepInteraction(value: Boolean): Self = StObject.set(x, "stepInteraction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepInteractionUndefined: Self = StObject.set(x, "stepInteraction", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait ReactourStepContentArgs extends StObject {
    
    def close(): Unit = js.native
    
    def goTo(step: Double): Unit = js.native
    
    var inDOM: Boolean = js.native
    
    var step: Double = js.native
  }
  object ReactourStepContentArgs {
    
    @scala.inline
    def apply(close: () => Unit, goTo: Double => Unit, inDOM: Boolean, step: Double): ReactourStepContentArgs = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), goTo = js.Any.fromFunction1(goTo), inDOM = inDOM.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactourStepContentArgs]
    }
    
    @scala.inline
    implicit class ReactourStepContentArgsMutableBuilder[Self <: ReactourStepContentArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGoTo(value: Double => Unit): Self = StObject.set(x, "goTo", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInDOM(value: Boolean): Self = StObject.set(x, "inDOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactour.reactourStrings.top
    - typings.reactour.reactourStrings.right
    - typings.reactour.reactourStrings.bottom
    - typings.reactour.reactourStrings.left
    - typings.reactour.reactourStrings.center
  */
  trait ReactourStepPosition extends StObject
  object ReactourStepPosition {
    
    @scala.inline
    def bottom: typings.reactour.reactourStrings.bottom = "bottom".asInstanceOf[typings.reactour.reactourStrings.bottom]
    
    @scala.inline
    def center: typings.reactour.reactourStrings.center = "center".asInstanceOf[typings.reactour.reactourStrings.center]
    
    @scala.inline
    def left: typings.reactour.reactourStrings.left = "left".asInstanceOf[typings.reactour.reactourStrings.left]
    
    @scala.inline
    def right: typings.reactour.reactourStrings.right = "right".asInstanceOf[typings.reactour.reactourStrings.right]
    
    @scala.inline
    def top: typings.reactour.reactourStrings.top = "top".asInstanceOf[typings.reactour.reactourStrings.top]
  }
  
  type Tour = Component[ReactourProps, ReactourState, js.Any]
}
