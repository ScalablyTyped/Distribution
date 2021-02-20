package typings.reactMdTransition

import typings.react.mod.CSSProperties
import typings.reactMdUtils.anon.PartialPositionAnchor
import typings.reactMdUtils.typesMod.PositionAnchor
import typings.reactMdUtils.typesMod.PositionWidth
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useFixedPositioningMod {
  
  @JSImport("@react-md/transition/types/useFixedPositioning", "useFixedPositioning")
  @js.native
  def useFixedPositioning(
    hasOnEnterOnEnteringOnEnteredOnExitedFixedToGetOptionsOnResizeOnScrollAnchorInitialXInitialYXMarginVwMarginYMarginVhMarginWidthOnPositionChangeTransformOriginPreventOverlapDisableSwappingDisableVHBounds: FixedPositioningOptions
  ): ReturnValue = js.native
  
  @js.native
  trait FixedPositioningOptions
    extends OptionalFixedPositionOptions
       with TransitionHooks {
    
    /**
      * The element that the transitioning node should be fixed to.
      */
    var fixedTo: FixedTo = js.native
    
    /**
      * An optional function to call to dynamically get the options when the node
      * has been added to the DOM. This is helpful if you need to check sizes or other
      * things once the DOM node has been added for initial positioning or other things
      * like that. The returned options will override the existing options
      */
    var getOptions: js.UndefOr[GetFixedPositionOptions] = js.native
    
    /**
      * An optional function to call when the provide `xPosition` and `yPosition` are not
      * the same as the "calculated" position after trying to make the element fixed
      * within the viewport.
      */
    var onPositionChange: js.UndefOr[PositionChange] = js.native
    
    /**
      * An optional function to call when the element is in the DOM and a window resize
      * event has occurred. The main use-case for this is hiding the fixed element when
      * the page is resized.
      */
    var onResize: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    /**
      * An optional function to call when the element is in the DOM and a window scroll
      * event has occurred. The main use-case for this is hiding the fixed element when
      * the element or the entire page has a scroll event.
      */
    var onScroll: js.UndefOr[OnFixedPositionScroll] = js.native
  }
  object FixedPositioningOptions {
    
    @scala.inline
    def apply(): FixedPositioningOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FixedPositioningOptions]
    }
    
    @scala.inline
    implicit class FixedPositioningOptionsMutableBuilder[Self <: FixedPositioningOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedTo(value: FixedTo): Self = StObject.set(x, "fixedTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedToFunction0(value: () => HTMLElement | Null): Self = StObject.set(x, "fixedTo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFixedToNull: Self = StObject.set(x, "fixedTo", null)
      
      @scala.inline
      def setGetOptions(value: /* node */ HTMLElement => OptionalFixedPositionOptions): Self = StObject.set(x, "getOptions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetOptionsUndefined: Self = StObject.set(x, "getOptions", js.undefined)
      
      @scala.inline
      def setOnPositionChange(value: (/* wanted */ PositionAnchor, /* actual */ PositionAnchor) => Unit): Self = StObject.set(x, "onPositionChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnPositionChangeUndefined: Self = StObject.set(x, "onPositionChange", js.undefined)
      
      @scala.inline
      def setOnResize(value: /* event */ Event => Unit): Self = StObject.set(x, "onResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResizeUndefined: Self = StObject.set(x, "onResize", js.undefined)
      
      @scala.inline
      def setOnScroll(value: (/* event */ Event, /* data */ ScrollData) => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
    }
  }
  
  type FixedTo = String | HTMLElement | Null | FixedToFunction
  
  type FixedToFunction = js.Function0[HTMLElement | Null]
  
  type GetFixedPositionOptions = js.Function1[/* node */ HTMLElement, OptionalFixedPositionOptions]
  
  type OnFixedPositionScroll = js.Function2[/* event */ Event, /* data */ ScrollData, Unit]
  
  /* Inlined std.Omit<@react-md/utils.@react-md/utils.FixedPositionOptions, 'container' | 'element'> */
  @js.native
  trait OptionalFixedPositionOptions extends StObject {
    
    var anchor: js.UndefOr[PartialPositionAnchor] = js.native
    
    var disableSwapping: js.UndefOr[Boolean] = js.native
    
    var disableVHBounds: js.UndefOr[Boolean] = js.native
    
    var initialX: js.UndefOr[Double] = js.native
    
    var initialY: js.UndefOr[Double] = js.native
    
    var preventOverlap: js.UndefOr[Boolean] = js.native
    
    var transformOrigin: js.UndefOr[Boolean] = js.native
    
    var vhMargin: js.UndefOr[Double] = js.native
    
    var vwMargin: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[PositionWidth] = js.native
    
    var xMargin: js.UndefOr[Double] = js.native
    
    var yMargin: js.UndefOr[Double] = js.native
  }
  object OptionalFixedPositionOptions {
    
    @scala.inline
    def apply(): OptionalFixedPositionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionalFixedPositionOptions]
    }
    
    @scala.inline
    implicit class OptionalFixedPositionOptionsMutableBuilder[Self <: OptionalFixedPositionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: PartialPositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSwappingUndefined: Self = StObject.set(x, "disableSwapping", js.undefined)
      
      @scala.inline
      def setDisableVHBounds(value: Boolean): Self = StObject.set(x, "disableVHBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableVHBoundsUndefined: Self = StObject.set(x, "disableVHBounds", js.undefined)
      
      @scala.inline
      def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      @scala.inline
      def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialYUndefined: Self = StObject.set(x, "initialY", js.undefined)
      
      @scala.inline
      def setPreventOverlap(value: Boolean): Self = StObject.set(x, "preventOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventOverlapUndefined: Self = StObject.set(x, "preventOverlap", js.undefined)
      
      @scala.inline
      def setTransformOrigin(value: Boolean): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      @scala.inline
      def setVhMargin(value: Double): Self = StObject.set(x, "vhMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVhMarginUndefined: Self = StObject.set(x, "vhMargin", js.undefined)
      
      @scala.inline
      def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVwMarginUndefined: Self = StObject.set(x, "vwMargin", js.undefined)
      
      @scala.inline
      def setWidth(value: PositionWidth): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXMarginUndefined: Self = StObject.set(x, "xMargin", js.undefined)
      
      @scala.inline
      def setYMargin(value: Double): Self = StObject.set(x, "yMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYMarginUndefined: Self = StObject.set(x, "yMargin", js.undefined)
    }
  }
  
  type PositionChange = js.Function2[/* wanted */ PositionAnchor, /* actual */ PositionAnchor, Unit]
  
  /* Inlined parent std.Required<@react-md/transition.@react-md/transition/types/useFixedPositioning.TransitionHooks> */
  @js.native
  trait ReturnValue extends StObject {
    
    var onEnter: js.Any = js.native
    
    var onEntered: js.Any = js.native
    
    var onEntering: js.Any = js.native
    
    var onExited: js.Any = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    def updateStyle(): Unit = js.native
  }
  object ReturnValue {
    
    @scala.inline
    def apply(onEnter: js.Any, onEntered: js.Any, onEntering: js.Any, onExited: js.Any, updateStyle: () => Unit): ReturnValue = {
      val __obj = js.Dynamic.literal(onEnter = onEnter.asInstanceOf[js.Any], onEntered = onEntered.asInstanceOf[js.Any], onEntering = onEntering.asInstanceOf[js.Any], onExited = onExited.asInstanceOf[js.Any], updateStyle = js.Any.fromFunction0(updateStyle))
      __obj.asInstanceOf[ReturnValue]
    }
    
    @scala.inline
    implicit class ReturnValueMutableBuilder[Self <: ReturnValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnEnter(value: js.Any): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEntered(value: js.Any): Self = StObject.set(x, "onEntered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnEntering(value: js.Any): Self = StObject.set(x, "onEntering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExited(value: js.Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUpdateStyle(value: () => Unit): Self = StObject.set(x, "updateStyle", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ScrollData extends StObject {
    
    var element: HTMLElement | Null = js.native
    
    var fixedTo: HTMLElement | Null = js.native
    
    /**
      * Boolean if the `fixedTo` element is visible within the viewport. This is useful
      * if you'd like to hide the element only once the user scrolls these elements
      * out of view.
      */
    var visible: Boolean = js.native
  }
  object ScrollData {
    
    @scala.inline
    def apply(visible: Boolean): ScrollData = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollData]
    }
    
    @scala.inline
    implicit class ScrollDataMutableBuilder[Self <: ScrollData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementNull: Self = StObject.set(x, "element", null)
      
      @scala.inline
      def setFixedTo(value: HTMLElement): Self = StObject.set(x, "fixedTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedToNull: Self = StObject.set(x, "fixedTo", null)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<react-transition-group.react-transition-group/Transition.TransitionProps<undefined>, 'onEnter' | 'onEntering' | 'onEntered' | 'onExited'> */
  @js.native
  trait TransitionHooks extends StObject {
    
    var onEnter: js.UndefOr[js.Any] = js.native
    
    var onEntered: js.UndefOr[js.Any] = js.native
    
    var onEntering: js.UndefOr[js.Any] = js.native
    
    var onExited: js.UndefOr[js.Any] = js.native
  }
  object TransitionHooks {
    
    @scala.inline
    def apply(): TransitionHooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransitionHooks]
    }
    
    @scala.inline
    implicit class TransitionHooksMutableBuilder[Self <: TransitionHooks] (val x: Self) extends AnyVal {
      
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
      def setOnExited(value: js.Any): Self = StObject.set(x, "onExited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnExitedUndefined: Self = StObject.set(x, "onExited", js.undefined)
    }
  }
}
