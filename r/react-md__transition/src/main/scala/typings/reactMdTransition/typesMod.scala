package typings.reactMdTransition

import typings.react.mod.CSSProperties
import typings.react.mod.Ref
import typings.react.mod.RefCallback
import typings.reactTransitionGroup.csstransitionMod.CSSTransitionClassNames
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Inlined parent std.Omit<@react-md/transition.@react-md/transition/types/types.TransitionOptions<E>, 'repaint'> */
  @js.native
  trait CSSTransitionOptions[E /* <: HTMLElement */] extends StObject {
    
    var appear: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional className that should ge merged with the CSS transition class
      * name based on the current transition stage.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * The transition class names to apply. Unlike in `react-transition-group`, if
      * this is a `string` instead of an object, the different states will be
      * `--{state}` instead of `-{state}`.
      *
      * Example:
      *
      * ```ts
      * const options = {
      *   classNames: "scale"
      * }
      *
      * // creates
      * const classNames = {
      *   enter: "scale--enter",
      *   enterActive: "scale--enter-active",
      *   exit: "scale--exit",
      *   exitActive: "scale--exit-active",
      * }
      * ```
      *
      * ```ts
      * const options = {
      *   classNames: "scale"
      *   appear: true,
      * }
      *
      * // creates
      * const classNames = {
      *   appear: "scale--enter",
      *   appearActive: "scale--enter-active",
      *   enter: "scale--enter",
      *   enterActive: "scale--enter-active",
      *   exit: "scale--exit",
      *   exitActive: "scale--exit-active",
      * }
      * ```
      */
    var classNames: CSSTransitionClassNames | String = js.native
    
    var enter: js.UndefOr[Boolean] = js.native
    
    var exit: js.UndefOr[Boolean] = js.native
    
    var onEnter: js.UndefOr[EnterHandler[E]] = js.native
    
    var onEntered: js.UndefOr[EnterHandler[E]] = js.native
    
    var onEntering: js.UndefOr[EnterHandler[E]] = js.native
    
    var onExit: js.UndefOr[ExitHandler[E]] = js.native
    
    var onExited: js.UndefOr[ExitHandler[E]] = js.native
    
    var onExiting: js.UndefOr[ExitHandler[E]] = js.native
    
    var ref: js.UndefOr[Ref[E]] = js.native
    
    var temporary: js.UndefOr[Boolean] = js.native
    
    var timeout: TransitionTimeout = js.native
    
    var transitionIn: Boolean = js.native
  }
  object CSSTransitionOptions {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](classNames: CSSTransitionClassNames | String, timeout: TransitionTimeout, transitionIn: Boolean): CSSTransitionOptions[E] = {
      val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CSSTransitionOptions[E]]
    }
    
    @scala.inline
    implicit class CSSTransitionOptionsMutableBuilder[Self <: CSSTransitionOptions[_], E /* <: HTMLElement */] (val x: Self with CSSTransitionOptions[E]) extends AnyVal {
      
      @scala.inline
      def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassNames(value: CSSTransitionClassNames | String): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setOnEnter(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: E => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: E => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: E => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
      
      @scala.inline
      def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionIn(value: Boolean): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CSSTransitionProvidedProps[E /* <: HTMLElement */] extends StObject {
    
    /**
      * The current class name based on the provided `className` options and the
      * state in the transition.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * A ref that **must** be passed to the element that is triggering a CSS
      * transition change. An error will be thrown if the transition starts, but
      * the ref is still `null` or the `ref` was passed to a component instance
      * instead of a DOM node.
      */
    var ref: RefCallback[E] = js.native
  }
  object CSSTransitionProvidedProps {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](ref: /* instance */ E | Null => Unit): CSSTransitionProvidedProps[E] = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[CSSTransitionProvidedProps[E]]
    }
    
    @scala.inline
    implicit class CSSTransitionProvidedPropsMutableBuilder[Self <: CSSTransitionProvidedProps[_], E /* <: HTMLElement */] (val x: Self with CSSTransitionProvidedProps[E]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setRef(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined parent std.Omit<@react-md/transition.@react-md/transition/types/types.TransitionOptions<E>, 'repaint' | 'transitionIn' | 'timeout'> */
  @js.native
  trait CollapseOptions[E /* <: HTMLElement */] extends StObject {
    
    var appear: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional className to merge with the current collapse transition
      * className.
      */
    var className: js.UndefOr[String] = js.native
    
    var enter: js.UndefOr[Boolean] = js.native
    
    var exit: js.UndefOr[Boolean] = js.native
    
    /**
      * The minimum height that the collapsed element can be which defaults to `0`.
      * This can either be a number of pixels or a string CSS height value.
      *
      * Setting this value to any non-zero value will allow for the element to
      * shrink to the defined min-height, and then expand to the full height once
      * no longer collapsed.
      *
      * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
      * are all set to `0` (default), the child will be removed from the DOM while
      * collapsed.
      */
    var minHeight: js.UndefOr[Double | String] = js.native
    
    /**
      * The minimum padding-bottom that the collapsed element can be which defaults
      * to `0`. This can either be a number of pixels or a string CSS
      * `padding-bottom` value.
      *
      * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
      * are all set to `0` (default), the child will be removed from the DOM while
      * collapsed.
      */
    var minPaddingBottom: js.UndefOr[Double | String] = js.native
    
    /**
      * The minimum padding-top that the collapsed element can be which defaults to
      * `0`. This can either be a number of pixels or a string CSS `padding-top`
      * value.
      *
      * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
      * are all set to `0` (default), the child will be removed from the DOM while
      * collapsed.
      */
    var minPaddingTop: js.UndefOr[Double | String] = js.native
    
    var onEnter: js.UndefOr[EnterHandler[E]] = js.native
    
    var onEntered: js.UndefOr[EnterHandler[E]] = js.native
    
    var onEntering: js.UndefOr[EnterHandler[E]] = js.native
    
    var onExit: js.UndefOr[ExitHandler[E]] = js.native
    
    var onExited: js.UndefOr[ExitHandler[E]] = js.native
    
    var onExiting: js.UndefOr[ExitHandler[E]] = js.native
    
    var ref: js.UndefOr[Ref[E]] = js.native
    
    var temporary: js.UndefOr[Boolean] = js.native
    
    /**
      * The timeout for the collapse transition. This will default to 250ms enter
      * and 200ms exit.
      */
    var timeout: js.UndefOr[TransitionTimeout] = js.native
  }
  object CollapseOptions {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): CollapseOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseOptions[E]]
    }
    
    @scala.inline
    implicit class CollapseOptionsMutableBuilder[Self <: CollapseOptions[_], E /* <: HTMLElement */] (val x: Self with CollapseOptions[E]) extends AnyVal {
      
      @scala.inline
      def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinPaddingBottom(value: Double | String): Self = StObject.set(x, "minPaddingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPaddingBottomUndefined: Self = StObject.set(x, "minPaddingBottom", js.undefined)
      
      @scala.inline
      def setMinPaddingTop(value: Double | String): Self = StObject.set(x, "minPaddingTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPaddingTopUndefined: Self = StObject.set(x, "minPaddingTop", js.undefined)
      
      @scala.inline
      def setOnEnter(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: E => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: E => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: E => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
      
      @scala.inline
      def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait CollapseTransitionProvidedProps[E /* <: HTMLElement */] extends StObject {
    
    /**
      * The class name to apply that will allow for the element to transition
      * between collapsed states.
      */
    var className: String = js.native
    
    /**
      * The `hidden` DOM attribute that will be enabled if the component is fully
      * collapsed with no height and padding but still rendered within the DOM.
      */
    var hidden: Boolean = js.native
    
    /**
      * A ref that **must** be passed to the element that is triggering a CSS
      * transition change. An error will be thrown if the transition starts, but
      * the ref is still `null` or the `ref` was passed to a component instance
      * instead of a DOM node.
      */
    var ref: RefCallback[E] = js.native
    
    /**
      * A conditional style that will provide the required `max-height`,
      * `padding-top`, `padding-bottom`, and `transition-duration` styles required
      * for the collapse transition.
      */
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object CollapseTransitionProvidedProps {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](className: String, hidden: Boolean, ref: /* instance */ E | Null => Unit): CollapseTransitionProvidedProps[E] = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref))
      __obj.asInstanceOf[CollapseTransitionProvidedProps[E]]
    }
    
    @scala.inline
    implicit class CollapseTransitionProvidedPropsMutableBuilder[Self <: CollapseTransitionProvidedProps[_], E /* <: HTMLElement */] (val x: Self with CollapseTransitionProvidedProps[E]) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type EnterHandler[E /* <: HTMLElement */] = js.Function2[/* node */ E, /* isAppearing */ Boolean, Unit]
  
  type ExitHandler[E /* <: HTMLElement */] = js.Function1[/* node */ E, Unit]
  
  /* Inlined @react-md/transition.@react-md/transition/types/types.OverridableTransitionProps & std.Pick<react-transition-group.react-transition-group/CSSTransition.CSSTransitionProps<undefined>, 'classNames'> */
  @js.native
  trait OverridableCSSTransitionProps extends StObject {
    
    /**
      * Normally a component is not transitioned if it is shown when the
      * `<Transition>` component mounts. If you want to transition on the first
      * mount set  appear to true, and the component will transition in as soon
      * as the `<Transition>` mounts. Note: there are no specific "appear" states.
      * appear only adds an additional enter transition.
      */
    var appear: js.UndefOr[Boolean] = js.native
    
    var classNames: js.UndefOr[js.Any] = js.native
    
    /**
      * Enable or disable enter transitions.
      */
    var enter: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable or disable exit transitions.
      */
    var exit: js.UndefOr[Boolean] = js.native
    
    var in: js.UndefOr[js.Any] = js.native
    
    var mountOnEnter: js.UndefOr[js.Any] = js.native
    
    var onEnter: js.UndefOr[js.Any] = js.native
    
    var onEntered: js.UndefOr[js.Any] = js.native
    
    var onEntering: js.UndefOr[js.Any] = js.native
    
    var onExit: js.UndefOr[js.Any] = js.native
    
    var onExited: js.UndefOr[js.Any] = js.native
    
    var onExiting: js.UndefOr[js.Any] = js.native
    
    var timeout: js.UndefOr[TransitionTimeout] = js.native
    
    var unmountOnExit: js.UndefOr[js.Any] = js.native
  }
  object OverridableCSSTransitionProps {
    
    @scala.inline
    def apply(): OverridableCSSTransitionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverridableCSSTransitionProps]
    }
    
    @scala.inline
    implicit class OverridableCSSTransitionPropsMutableBuilder[Self <: OverridableCSSTransitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setClassNames(value: js.Any): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
      
      @scala.inline
      def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setIn(value: js.Any): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setMountOnEnter(value: js.Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      @scala.inline
      def setOnEnter(value: js.Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: js.Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: js.Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: js.Any): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: js.Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: js.Any): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUnmountOnExit(value: js.Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
  
  /* Inlined parent react-transition-group.react-transition-group/Transition.TransitionActions */
  /* Inlined parent std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps<undefined>, @react-md/transition.@react-md/transition/types/types.TransitionKeys> */
  @js.native
  trait OverridableTransitionProps extends StObject {
    
    /**
      * Normally a component is not transitioned if it is shown when the
      * `<Transition>` component mounts. If you want to transition on the first
      * mount set  appear to true, and the component will transition in as soon
      * as the `<Transition>` mounts. Note: there are no specific "appear" states.
      * appear only adds an additional enter transition.
      */
    var appear: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable or disable enter transitions.
      */
    var enter: js.UndefOr[Boolean] = js.native
    
    /**
      * Enable or disable exit transitions.
      */
    var exit: js.UndefOr[Boolean] = js.native
    
    var in: js.UndefOr[js.Any] = js.native
    
    var mountOnEnter: js.UndefOr[js.Any] = js.native
    
    var onEnter: js.UndefOr[js.Any] = js.native
    
    var onEntered: js.UndefOr[js.Any] = js.native
    
    var onEntering: js.UndefOr[js.Any] = js.native
    
    var onExit: js.UndefOr[js.Any] = js.native
    
    var onExited: js.UndefOr[js.Any] = js.native
    
    var onExiting: js.UndefOr[js.Any] = js.native
    
    var timeout: js.UndefOr[TransitionTimeout] = js.native
    
    var unmountOnExit: js.UndefOr[js.Any] = js.native
  }
  object OverridableTransitionProps {
    
    @scala.inline
    def apply(): OverridableTransitionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OverridableTransitionProps]
    }
    
    @scala.inline
    implicit class OverridableTransitionPropsMutableBuilder[Self <: OverridableTransitionProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setIn(value: js.Any): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInUndefined: Self = StObject.set(x, "in", js.undefined)
      
      @scala.inline
      def setMountOnEnter(value: js.Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountOnEnterUndefined: Self = StObject.set(x, "mountOnEnter", js.undefined)
      
      @scala.inline
      def setOnEnter(value: js.Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: js.Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: js.Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: js.Any): Self = StObject.set(x, "onExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: js.Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: js.Any): Self = StObject.set(x, "onExiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
      
      @scala.inline
      def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUnmountOnExit(value: js.Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountOnExitUndefined: Self = StObject.set(x, "unmountOnExit", js.undefined)
    }
  }
  
  @js.native
  trait TransitionCallbacks[E /* <: HTMLElement */] extends StObject {
    
    /**
      * An optional enter handler that can be used to determine additional
      * transition styles if you need access to the DOM node to calculate those
      * styles. This will also be fired for `appear` transitions.
      *
      * This will be fired right after the `transitionIn` is set to `true`.
      */
    var onEnter: js.UndefOr[EnterHandler[E]] = js.native
    
    /**
      * An optional entered handler that can be used to determine additional
      * transition styles if you need access to the DOM node to calculate those
      * styles. This will also be fired for `appear` transitions.
      *
      * This will be fired once the transition has finished.
      */
    var onEntered: js.UndefOr[EnterHandler[E]] = js.native
    
    /**
      * An optional entering handler that can be used to determine additional
      * transition styles if you need access to the DOM node to calculate those
      * styles. This will also be fired for `appear` transitions.
      *
      * This will be fired almost immediately after the `onEnter` callback.
      * However, if the `repaint` option was enabled, it will ensure the DOM as
      * been repainted before firing to help with CSS transitions.
      */
    var onEntering: js.UndefOr[EnterHandler[E]] = js.native
    
    /**
      * An optional exit handler that can be used to determine additional
      * transition styles if you need access to the DOM node to calculate those
      * styles.
      *
      * This will be fired right after the `transitionIn` is set to `false`.
      */
    var onExit: js.UndefOr[ExitHandler[E]] = js.native
    
    /**
      * An optional entered handler that can be used to determine additional
      * transition styles if you need access to the DOM node to calculate those
      * styles. This will also be fired for `appear` transitions.
      *
      * This will be fired once the transition has finished.
      *
      * Note: If the `temporary` option was enabled, the `rendered` result will be
      * `false` and the node actually won't exist in the DOM anymore.
      */
    var onExited: js.UndefOr[ExitHandler[E]] = js.native
    
    /**
      * An optional exit handler that can be used to determine additional
      * transition styles if you need access to the DOM node to calculate those
      * styles.
      *
      * This will be fired almost immdiately after the `onExit` callback. However,
      * if the `repaint` option was enabled, it will ensure the DOM as been
      * repainted before firing to help with CSS transitions.
      */
    var onExiting: js.UndefOr[ExitHandler[E]] = js.native
  }
  object TransitionCallbacks {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](): TransitionCallbacks[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionCallbacks[E]]
    }
    
    @scala.inline
    implicit class TransitionCallbacksMutableBuilder[Self <: TransitionCallbacks[_], E /* <: HTMLElement */] (val x: Self with TransitionCallbacks[E]) extends AnyVal {
      
      @scala.inline
      def setOnEnter(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      @scala.inline
      def setOnEntered(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntered", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnteredUndefined: Self = StObject.set(x, "onEntered", js.undefined)
      
      @scala.inline
      def setOnEntering(value: (E, /* isAppearing */ Boolean) => Unit): Self = StObject.set(x, "onEntering", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnEnteringUndefined: Self = StObject.set(x, "onEntering", js.undefined)
      
      @scala.inline
      def setOnExit(value: E => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      @scala.inline
      def setOnExited(value: E => Unit): Self = StObject.set(x, "onExited", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
      
      @scala.inline
      def setOnExiting(value: E => Unit): Self = StObject.set(x, "onExiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnExitingUndefined: Self = StObject.set(x, "onExiting", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdTransition.reactMdTransitionStrings.in
    - typings.reactMdTransition.reactMdTransitionStrings.mountOnEnter
    - typings.reactMdTransition.reactMdTransitionStrings.unmountOnExit
    - typings.reactMdTransition.reactMdTransitionStrings.onEnter
    - typings.reactMdTransition.reactMdTransitionStrings.onEntering
    - typings.reactMdTransition.reactMdTransitionStrings.onEntered
    - typings.reactMdTransition.reactMdTransitionStrings.onExit
    - typings.reactMdTransition.reactMdTransitionStrings.onExiting
    - typings.reactMdTransition.reactMdTransitionStrings.onExited
  */
  trait TransitionKeys extends StObject
  object TransitionKeys {
    
    @scala.inline
    def in: typings.reactMdTransition.reactMdTransitionStrings.in = "in".asInstanceOf[typings.reactMdTransition.reactMdTransitionStrings.in]
    
    @scala.inline
    def mountOnEnter: typings.reactMdTransition.reactMdTransitionStrings.mountOnEnter = "mountOnEnter".asInstanceOf[typings.reactMdTransition.reactMdTransitionStrings.mountOnEnter]
    
    @scala.inline
    def onEnter: typings.reactMdTransition.reactMdTransitionStrings.onEnter = "onEnter".asInstanceOf[typings.reactMdTransition.reactMdTransitionStrings.onEnter]
    
    @scala.inline
    def onEntered: typings.reactMdTransition.reactMdTransitionStrings.onEntered = "onEntered".asInstanceOf[typings.reactMdTransition.reactMdTransitionStrings.onEntered]
    
    @scala.inline
    def onEntering: typings.reactMdTransition.reactMdTransitionStrings.onEntering = "onEntering".asInstanceOf[typings.reactMdTransition.reactMdTransitionStrings.onEntering]
    
    @scala.inline
    def onExit: typings.reactMdTransition.reactMdTransitionStrings.onExit = "onExit".asInstanceOf[typings.reactMdTransition.reactMdTransitionStrings.onExit]
    
    @scala.inline
    def onExited: typings.reactMdTransition.reactMdTransitionStrings.onExited = "onExited".asInstanceOf[typings.reactMdTransition.reactMdTransitionStrings.onExited]
    
    @scala.inline
    def onExiting: typings.reactMdTransition.reactMdTransitionStrings.onExiting = "onExiting".asInstanceOf[typings.reactMdTransition.reactMdTransitionStrings.onExiting]
    
    @scala.inline
    def unmountOnExit: typings.reactMdTransition.reactMdTransitionStrings.unmountOnExit = "unmountOnExit".asInstanceOf[typings.reactMdTransition.reactMdTransitionStrings.unmountOnExit]
  }
  
  @js.native
  trait TransitionOptions[E /* <: HTMLElement */] extends TransitionCallbacks[E] {
    
    /**
      * Boolean if the transition should also be triggered immediately once the
      * component mounts. This is generally not recommended for server side
      * rendering/initial page load so it is set to `false` by default.
      */
    var appear: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the transition should allow for an enter animation once the
      * `transitionIn` booleanis set to `true`.
      */
    var enter: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the transition should allow for an exit animation once the
      * `transitionIn` booleanis set to `false`.
      */
    var exit: js.UndefOr[Boolean] = js.native
    
    /**
      * An optional ref that will get merged with the required ref for the
      * transition to work.
      */
    var ref: js.UndefOr[Ref[E]] = js.native
    
    /**
      * Boolean if the transition should force a DOM repaint before triggering the
      * next stage. Defaults to `false` since it's only really recommended for DOM
      * and CSS transitions.
      */
    var repaint: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean if the component should mount and unmount based on the current
      * `transitionIn` stage with a default value of `false`. When this is
      * `false`, the first result (`rendered`) in the return value array will
      * always be `true`.
      *
      * When this is set to `true`, the first result (`rendered`) in the return
      * value array will be `true` only while the `transitionIn` option is `true`
      * or the transition is still happening.
      *
      * Note: **Changing this option while the hook/component is mounted will not
      * do anything**. If you want to dynamically change the component's temporary
      * state, you will need to also change the `key` to get the component to
      * re-mount.
      */
    var temporary: js.UndefOr[Boolean] = js.native
    
    /**
      * The transition timeout to use for each stage. Just like in
      * `react-transition-group`, this can either be a `number` which will a static
      * duration to use for each stage. Otherwise, this can be an object of
      * timeouts for the `appear`, `enter`, and `exit` stages which default to `0`
      * if omitted.
      *
      * Note: If any of the timeout values are set to `0`, the transition will be
      * considered disabled and skip the `ENTERING`/`EXITING` stages.
      *
      * Note: If the `appear` stage is omitted in the timeout object but the
      * `appear` option was enabled for the transition, it will instead default to
      * the `enter` duration.
      */
    var timeout: TransitionTimeout = js.native
    
    /**
      * Changing this boolean will trigger a transition between the six stagees:
      *
      * - `ENTER`
      * - `ENTERING`
      * - `ENTERED`
      * - `EXIT`
      * - `EXITING`
      * - `EXITED`
      *
      * Changing from `false` to `true`, the stagees will change in this order:
      * `EXITED` -> `ENTER` -> `ENTERING` -> `ENTERED`
      *
      * Changing from `true` to `false`, the stagees will change in this order:
      * `ENTERED` -> `EXIT` -> `EXITING` -> `EXITED`
      */
    var transitionIn: Boolean = js.native
  }
  object TransitionOptions {
    
    @scala.inline
    def apply[E /* <: HTMLElement */](timeout: TransitionTimeout, transitionIn: Boolean): TransitionOptions[E] = {
      val __obj = js.Dynamic.literal(timeout = timeout.asInstanceOf[js.Any], transitionIn = transitionIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransitionOptions[E]]
    }
    
    @scala.inline
    implicit class TransitionOptionsMutableBuilder[Self <: TransitionOptions[_], E /* <: HTMLElement */] (val x: Self with TransitionOptions[E]) extends AnyVal {
      
      @scala.inline
      def setAppear(value: Boolean): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppearUndefined: Self = StObject.set(x, "appear", js.undefined)
      
      @scala.inline
      def setEnter(value: Boolean): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
      
      @scala.inline
      def setExit(value: Boolean): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
      
      @scala.inline
      def setRef(value: Ref[E]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRepaint(value: Boolean): Self = StObject.set(x, "repaint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepaintUndefined: Self = StObject.set(x, "repaint", js.undefined)
      
      @scala.inline
      def setTemporary(value: Boolean): Self = StObject.set(x, "temporary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTemporaryUndefined: Self = StObject.set(x, "temporary", js.undefined)
      
      @scala.inline
      def setTimeout(value: TransitionTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionIn(value: Boolean): Self = StObject.set(x, "transitionIn", value.asInstanceOf[js.Any])
    }
  }
  
  type TransitionTimeout = /* import warning: importer.ImportType#apply Failed type conversion: std.Required<react-transition-group.react-transition-group/Transition.TransitionProps<undefined>>['timeout'] */ js.Any
}
