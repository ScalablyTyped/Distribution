package typings.reactMdTransition

import typings.react.mod.CSSProperties
import typings.reactMdTransition.typesMod.CSSTransitionElementProps
import typings.reactMdTransition.typesMod.CSSTransitionHookReturnValue
import typings.reactMdTransition.typesMod.PreconfiguredCSSTransitionOptions
import typings.reactMdTransition.typesMod.TransitionStage
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useCollapseTransitionMod {
  
  @JSImport("@react-md/transition/types/useCollapseTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/transition/types/useCollapseTransition", "DEFAULT_COLLAPSE_MIN_HEIGHT")
  @js.native
  val DEFAULT_COLLAPSE_MIN_HEIGHT: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition/types/useCollapseTransition", "DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM")
  @js.native
  val DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM: /* 0 */ Double = js.native
  
  @JSImport("@react-md/transition/types/useCollapseTransition", "DEFAULT_COLLAPSE_MIN_PADDING_TOP")
  @js.native
  val DEFAULT_COLLAPSE_MIN_PADDING_TOP: /* 0 */ Double = js.native
  
  /* Inlined std.Readonly<@react-md/transition.@react-md/transition/types/types.TransitionTimeoutObject> */
  object DEFAULT_COLLAPSE_TIMEOUT {
    
    @JSImport("@react-md/transition/types/useCollapseTransition", "DEFAULT_COLLAPSE_TIMEOUT.appear")
    @js.native
    val appear: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition/types/useCollapseTransition", "DEFAULT_COLLAPSE_TIMEOUT.enter")
    @js.native
    val enter: js.UndefOr[Double] = js.native
    
    @JSImport("@react-md/transition/types/useCollapseTransition", "DEFAULT_COLLAPSE_TIMEOUT.exit")
    @js.native
    val exit: js.UndefOr[Double] = js.native
  }
  
  inline def useCollapseTransition[E /* <: HTMLElement */](
    hasPropNodeRefPropStyleClassNameTransitionInTimeoutMinHeightMinPaddingTopMinPaddingBottomTemporaryAppearEnterExitOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited: CollapseTransitionHookOptions[E]
  ): CollapseTransitionHookReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useCollapseTransition")(hasPropNodeRefPropStyleClassNameTransitionInTimeoutMinHeightMinPaddingTopMinPaddingBottomTemporaryAppearEnterExitOnEnterOnEnteringOnEnteredOnExitOnExitingOnExited.asInstanceOf[js.Any]).asInstanceOf[CollapseTransitionHookReturnValue[E]]
  
  trait CollapseConfigurationStyle extends StObject {
    
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
      *
      * @see {@link DEFAULT_COLLAPSE_MIN_HEIGHT}
      * @defaultValue `DEFAULT_COLLAPSE_MIN_HEIGHT`
      */
    var minHeight: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The minimum padding-bottom that the collapsed element can be which defaults
      * to `0`. This can either be a number of pixels or a string CSS
      * `padding-bottom` value.
      *
      * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
      * are all set to `0` (default), the child will be removed from the DOM while
      * collapsed.
      *
      * @see {@link DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM}
      * @defaultValue `DEFAULT_COLLAPSE_MIN_PADDING_BOTTOM`
      */
    var minPaddingBottom: js.UndefOr[Double | String] = js.undefined
    
    /**
      * The minimum padding-top that the collapsed element can be which defaults to
      * `0`. This can either be a number of pixels or a string CSS `padding-top`
      * value.
      *
      * Note: If the `minHeight`, `minPaddingTop`, and `minPaddingBottom` options
      * are all set to `0` (default), the child will be removed from the DOM while
      * collapsed.
      *
      * @see {@link DEFAULT_COLLAPSE_MIN_PADDING_TOP}
      * @defaultValue `DEFAULT_COLLAPSE_MIN_PADDING_TOP`
      */
    var minPaddingTop: js.UndefOr[Double | String] = js.undefined
  }
  object CollapseConfigurationStyle {
    
    inline def apply(): CollapseConfigurationStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseConfigurationStyle]
    }
    
    extension [Self <: CollapseConfigurationStyle](x: Self) {
      
      inline def setMinHeight(value: Double | String): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      inline def setMinPaddingBottom(value: Double | String): Self = StObject.set(x, "minPaddingBottom", value.asInstanceOf[js.Any])
      
      inline def setMinPaddingBottomUndefined: Self = StObject.set(x, "minPaddingBottom", js.undefined)
      
      inline def setMinPaddingTop(value: Double | String): Self = StObject.set(x, "minPaddingTop", value.asInstanceOf[js.Any])
      
      inline def setMinPaddingTopUndefined: Self = StObject.set(x, "minPaddingTop", js.undefined)
    }
  }
  
  trait CollapseElementProps[E /* <: HTMLElement */]
    extends StObject
       with CSSTransitionElementProps[E] {
    
    /**
      * This will be set to true when the element is fully collapsed and the
      * {@link CollapseTransitionHookOptions.temporary} is set to `false`. This
      * should be applied as the `hidden` attribute to a DOM node.
      */
    var hidden: Boolean
    
    /**
      * A merged styled object required for the collapse transition to work.
      *
      * @see {@link CollapseStyle}
      * @see {@link CollapseTransitionHookOptions.style}
      */
    var style: CSSProperties
  }
  object CollapseElementProps {
    
    inline def apply[E /* <: HTMLElement */](hidden: Boolean, ref: /* instance */ E | Null => Unit, style: CSSProperties): CollapseElementProps[E] = {
      val __obj = js.Dynamic.literal(hidden = hidden.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseElementProps[E]]
    }
    
    extension [Self <: CollapseElementProps[?], E /* <: HTMLElement */](x: Self & CollapseElementProps[E]) {
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
  
  trait CollapseStyle
    extends StObject
       with CollapseConfigurationStyle {
    
    /**
      * This will only be set when the {@link TransitionStage} is `"entering"` or
      * `"exiting"` as `"${timeout}ms"`.
      */
    var transitionDuration: js.UndefOr[String] = js.undefined
  }
  object CollapseStyle {
    
    inline def apply(): CollapseStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CollapseStyle]
    }
    
    extension [Self <: CollapseStyle](x: Self) {
      
      inline def setTransitionDuration(value: String): Self = StObject.set(x, "transitionDuration", value.asInstanceOf[js.Any])
      
      inline def setTransitionDurationUndefined: Self = StObject.set(x, "transitionDuration", js.undefined)
    }
  }
  
  trait CollapseTransitionHookOptions[E /* <: HTMLElement */]
    extends StObject
       with PreconfiguredCSSTransitionOptions[E]
       with CollapseConfigurationStyle {
    
    /**
      * An optional style to merge with the required collapse transition styles.
      *
      * If any keys from the {@link CollapseStyle} are included in this object,
      * these styles will override and possibly break the collapse transition.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object CollapseTransitionHookOptions {
    
    inline def apply[E /* <: HTMLElement */](transitionIn: Boolean): CollapseTransitionHookOptions[E] = {
      val __obj = js.Dynamic.literal(transitionIn = transitionIn.asInstanceOf[js.Any])
      __obj.asInstanceOf[CollapseTransitionHookOptions[E]]
    }
    
    extension [Self <: CollapseTransitionHookOptions[?], E /* <: HTMLElement */](x: Self & CollapseTransitionHookOptions[E]) {
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.reactMdTransition.typesMod.CSSTransitionElementProps because Already inherited
  - typings.reactMdTransition.useCollapseTransitionMod.CollapseElementProps because var conflicts: className, ref. Inlined style, hidden */ trait CollapseTransitionHookReturnValue[E /* <: HTMLElement */]
    extends StObject
       with CSSTransitionHookReturnValue[E] {
    
    /**
      * This is just a convenience object so that you don't need to destructure as
      * many variables to pass to an element.
      *
      * @example
      * Simple Usage
      * ```tsx
      * const { elementProps, rendered } = useCollapseTransition({
      *   // ...options
      *   transitionIn,
      * });
      *
      * if (!rendered) {
      *   return null
      * }
      *
      * return <div {...elementProps}>{children}</div>;
      *
      * // This is the long-hand version
      * const { ref, style, className, hidden, rendered } = useCollapseTransition({
      *   // ...options
      *   transitionIn,
      * });
      *
      * if (!rendered) {
      *   return null
      * }
      *
      * return (
      *   <div
      *     ref={ref}
      *     style={style}
      *     className={className}
      *     hidden={hidden}
      *   >
      *     {children}
      *   </div>
      * );
      * ```
      */
    @JSName("elementProps")
    var elementProps_CollapseTransitionHookReturnValue: CollapseElementProps[E]
    
    /**
      * This will be set to true when the element is fully collapsed and the
      * {@link CollapseTransitionHookOptions.temporary} is set to `false`. This
      * should be applied as the `hidden` attribute to a DOM node.
      */
    var hidden: Boolean
    
    /**
      * A merged styled object required for the collapse transition to work.
      *
      * @see {@link CollapseStyle}
      * @see {@link CollapseTransitionHookOptions.style}
      */
    var style: CSSProperties
  }
  object CollapseTransitionHookReturnValue {
    
    inline def apply[E /* <: HTMLElement */](
      appearing: Boolean,
      elementProps: CollapseElementProps[E],
      hidden: Boolean,
      ref: /* instance */ E | Null => Unit,
      rendered: Boolean,
      stage: TransitionStage,
      style: CSSProperties,
      transitionTo: TransitionStage => Unit
    ): CollapseTransitionHookReturnValue[E] = {
      val __obj = js.Dynamic.literal(appearing = appearing.asInstanceOf[js.Any], elementProps = elementProps.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref), rendered = rendered.asInstanceOf[js.Any], stage = stage.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], transitionTo = js.Any.fromFunction1(transitionTo))
      __obj.asInstanceOf[CollapseTransitionHookReturnValue[E]]
    }
    
    extension [Self <: CollapseTransitionHookReturnValue[?], E /* <: HTMLElement */](x: Self & CollapseTransitionHookReturnValue[E]) {
      
      inline def setElementProps(value: CollapseElementProps[E]): Self = StObject.set(x, "elementProps", value.asInstanceOf[js.Any])
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
