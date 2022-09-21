package typings.reactMdTransition

import typings.react.mod.CSSProperties
import typings.react.mod.RefCallback
import typings.react.mod.RefObject
import typings.reactMdTransition.anon.ReadonlyRequiredFixedPosi
import typings.reactMdTransition.typesMod.FixedPositioningScrollData
import typings.reactMdTransition.typesMod.FixedPositioningTransitionOptions
import typings.reactMdTransition.typesMod.TransitionScrollCallback
import typings.reactMdUtils.positioningTypesMod.CalculateFixedPositionOptions
import typings.std.Event
import typings.std.EventListener
import typings.std.HTMLElement
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFixedPositioningMod {
  
  @JSImport("@react-md/transition/types/useFixedPositioning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFixedPositioning[FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */](
    hasPropStyleNodeRefFixedToOnEnterOnEnteringOnEnteredOnExitedAnchorDisableSwappingDisableVHBoundsInitialXInitialYPreventOverlapTransformOriginVhMarginVwMarginWidthXMarginYMarginGetFixedPositionOptionsOnScrollOnResize: FixedPositioningOptions[FixedToElement, FixedElement]
  ): FixedPositioningHookReturnValue[FixedElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFixedPositioning")(hasPropStyleNodeRefFixedToOnEnterOnEnteringOnEnteredOnExitedAnchorDisableSwappingDisableVHBoundsInitialXInitialYPreventOverlapTransformOriginVhMarginVwMarginWidthXMarginYMarginGetFixedPositionOptionsOnScrollOnResize.asInstanceOf[js.Any]).asInstanceOf[FixedPositioningHookReturnValue[FixedElement]]
  
  trait FixedPositioningHookReturnValue[E /* <: HTMLElement */] extends StObject {
    
    /**
      * This should really only be used if the {@link transitionOptions} is not
      * being used.
      */
    var callbacks: ReadonlyRequiredFixedPosi
    
    /**
      * A ref that should be passed to a component for the fixed positioning
      * behavior to work correctly.
      *
      * This should really only be used if the {@link transitionOptions} is not
      * being used.
      */
    var ref: RefCallback[E]
    
    /**
      * @see {@link FixedPositionStyle}
      */
    var style: CSSProperties
    
    /** {@inheritDoc FixedPositioningTransitionOptions} */
    var transitionOptions: Required[FixedPositioningTransitionOptions[E]]
    
    /**
      * A function that can be called to update the style for the fixed element.
      */
    def updateStyle(): Unit
  }
  object FixedPositioningHookReturnValue {
    
    inline def apply[E /* <: HTMLElement */](
      callbacks: ReadonlyRequiredFixedPosi,
      ref: /* instance */ E | Null => Unit,
      style: CSSProperties,
      transitionOptions: Required[FixedPositioningTransitionOptions[E]],
      updateStyle: () => Unit
    ): FixedPositioningHookReturnValue[E] = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], ref = js.Any.fromFunction1(ref), style = style.asInstanceOf[js.Any], transitionOptions = transitionOptions.asInstanceOf[js.Any], updateStyle = js.Any.fromFunction0(updateStyle))
      __obj.asInstanceOf[FixedPositioningHookReturnValue[E]]
    }
    
    extension [Self <: FixedPositioningHookReturnValue[?], E /* <: HTMLElement */](x: Self & FixedPositioningHookReturnValue[E]) {
      
      inline def setCallbacks(value: ReadonlyRequiredFixedPosi): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setRef(value: /* instance */ E | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setTransitionOptions(value: Required[FixedPositioningTransitionOptions[E]]): Self = StObject.set(x, "transitionOptions", value.asInstanceOf[js.Any])
      
      inline def setUpdateStyle(value: () => Unit): Self = StObject.set(x, "updateStyle", js.Any.fromFunction0(value))
    }
  }
  
  trait FixedPositioningOptions[FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */]
    extends StObject
       with FixedPositioningTransitionOptions[FixedElement]
       with CalculateFixedPositionOptions {
    
    /**
      * A ref pointing to an element that another element should be fixed to. This
      * **must** be provided for the positioning to work.
      */
    var fixedTo: RefObject[FixedToElement]
    
    /**
      * An optional function that can be used to override positioning options if
      * some options require the element to be in the DOM for specific
      * calculations.
      */
    var getFixedPositionOptions: js.UndefOr[js.Function0[CalculateFixedPositionOptions]] = js.undefined
    
    /**
      * An optional function to call if the page resizes while the
      * {@link FixedElement} is visible.
      */
    var onResize: js.UndefOr[EventListener] = js.undefined
    
    /** {@inheritDoc TransitionScrollCallback} */
    var onScroll: js.UndefOr[TransitionScrollCallback[FixedToElement, FixedElement]] = js.undefined
    
    /**
      * An optional style that will be merged with the fixed positioning required
      * styles.
      *
      * @see {@link FixedPositionStyle}
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object FixedPositioningOptions {
    
    inline def apply[FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */](fixedTo: RefObject[FixedToElement]): FixedPositioningOptions[FixedToElement, FixedElement] = {
      val __obj = js.Dynamic.literal(fixedTo = fixedTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedPositioningOptions[FixedToElement, FixedElement]]
    }
    
    extension [Self <: FixedPositioningOptions[?, ?], FixedToElement /* <: HTMLElement */, FixedElement /* <: HTMLElement */](x: Self & (FixedPositioningOptions[FixedToElement, FixedElement])) {
      
      inline def setFixedTo(value: RefObject[FixedToElement]): Self = StObject.set(x, "fixedTo", value.asInstanceOf[js.Any])
      
      inline def setGetFixedPositionOptions(value: () => CalculateFixedPositionOptions): Self = StObject.set(x, "getFixedPositionOptions", js.Any.fromFunction0(value))
      
      inline def setGetFixedPositionOptionsUndefined: Self = StObject.set(x, "getFixedPositionOptions", js.undefined)
      
      inline def setOnResize(value: /* evt */ Event => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      inline def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      inline def setOnScroll(
        value: (/* event */ Event, /* data */ FixedPositioningScrollData[FixedToElement, FixedElement]) => Unit
      ): Self = StObject.set(x, "onScroll", js.Any.fromFunction2(value))
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
