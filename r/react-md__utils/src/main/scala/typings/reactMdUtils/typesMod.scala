package typings.reactMdUtils

import typings.reactMdUtils.anon.Coordspositionfixedabsolu
import typings.reactMdUtils.anon.PartialPositionAnchor
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Coords extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Coords {
    
    @scala.inline
    def apply(): Coords = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Coords]
    }
    
    @scala.inline
    implicit class CoordsMutableBuilder[Self <: Coords] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait FixedPosition extends StObject {
    
    /**
      * The calculated horizontal position that can be used to compare to the
      * provided horizontal position anchor if additional manual updates should be
      * applied.
      */
    var actualX: HorizontalPosition
    
    /**
      * The calculated vertical position that can be used to compare to the
      * provided horizontal position anchor if additional manual updates should be
      * applied.
      */
    var actualY: VerticalPosition
    
    /**
      * The style object that should be applied to the fixed element so it will be
      * fixed to the container element. This will be `undefined` if the container
      * element doesn't exist within the DOM.
      *
      * Note: The fixed element styles **will not** contain styles for `z-index` or
      * `background-color` so you'll need to add that manually.
      */
    var style: js.UndefOr[Coordspositionfixedabsolu] = js.undefined
  }
  object FixedPosition {
    
    @scala.inline
    def apply(actualX: HorizontalPosition, actualY: VerticalPosition): FixedPosition = {
      val __obj = js.Dynamic.literal(actualX = actualX.asInstanceOf[js.Any], actualY = actualY.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedPosition]
    }
    
    @scala.inline
    implicit class FixedPositionMutableBuilder[Self <: FixedPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualX(value: HorizontalPosition): Self = StObject.set(x, "actualX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualY(value: VerticalPosition): Self = StObject.set(x, "actualY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: Coordspositionfixedabsolu): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait FixedPositionOptions
    extends StObject
       with InitialCoords {
    
    /**
      * The configuration to anchor the fixed element to the container element.
      */
    var anchor: js.UndefOr[PartialPositionAnchor] = js.undefined
    
    /**
      * The container element that the `element` should be fixed to.
      */
    var container: HTMLElement | Null
    
    /**
      * Boolean if the auto-swapping behavior should be disabled. It's normally
      * recommended to not disable this since it'll allow elements to appear off
      * screen.
      */
    var disableSwapping: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the fixed positioning should no longer prevent the fixed element
      * to be positioned within the viewport. This is nice if you want to allow for
      * full page scrolling instead and manually set a max-height on your element.
      */
    var disableVHBounds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The element that is fixed to a `container` element.
      */
    var element: HTMLElement | Null
    
    /**
      * Boolean if the fixed element should no longer be able to overlap the
      * container element. This is useful for autocomplete menus or other
      * components that retain focus on the container element while the fixed
      * element becomes visible.
      */
    var preventOverlap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the style object should include the `transformOrigin` value
      * based on the x and y positions.
      */
    var transformOrigin: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The viewwidth margin to apply so that the element doesn't need to be
      * directly on the screen edge.
      */
    var vhMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * The viewwidth margin to apply so that the element doesn't need to be
      * directly on the screen edge.
      */
    var vwMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * @see PositionWidth
      */
    var width: js.UndefOr[PositionWidth] = js.undefined
    
    /**
      * The container width margin to apply so that the element doesn't need to be
      * directly on the container's edge.
      */
    var xMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * The container height margin to apply so that the element doesn't need to be
      * directly on the container's edge
      */
    var yMargin: js.UndefOr[Double] = js.undefined
  }
  object FixedPositionOptions {
    
    @scala.inline
    def apply(): FixedPositionOptions = {
      val __obj = js.Dynamic.literal(container = null, element = null)
      __obj.asInstanceOf[FixedPositionOptions]
    }
    
    @scala.inline
    implicit class FixedPositionOptionsMutableBuilder[Self <: FixedPositionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchor(value: PartialPositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      @scala.inline
      def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerNull: Self = StObject.set(x, "container", null)
      
      @scala.inline
      def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSwappingUndefined: Self = StObject.set(x, "disableSwapping", js.undefined)
      
      @scala.inline
      def setDisableVHBounds(value: Boolean): Self = StObject.set(x, "disableVHBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableVHBoundsUndefined: Self = StObject.set(x, "disableVHBounds", js.undefined)
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementNull: Self = StObject.set(x, "element", null)
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.left
    - typings.reactMdUtils.reactMdUtilsStrings.right
    - typings.reactMdUtils.reactMdUtilsStrings.center
    - typings.reactMdUtils.reactMdUtilsStrings.`inner-left`
    - typings.reactMdUtils.reactMdUtilsStrings.`inner-right`
  */
  trait HorizontalPosition extends StObject
  object HorizontalPosition {
    
    @scala.inline
    def center: typings.reactMdUtils.reactMdUtilsStrings.center = "center".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.center]
    
    @scala.inline
    def `inner-left`: typings.reactMdUtils.reactMdUtilsStrings.`inner-left` = "inner-left".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.`inner-left`]
    
    @scala.inline
    def `inner-right`: typings.reactMdUtils.reactMdUtilsStrings.`inner-right` = "inner-right".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.`inner-right`]
    
    @scala.inline
    def left: typings.reactMdUtils.reactMdUtilsStrings.left = "left".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.left]
    
    @scala.inline
    def right: typings.reactMdUtils.reactMdUtilsStrings.right = "right".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.right]
  }
  
  trait InitialCoords extends StObject {
    
    /**
      * The initial x value to use when calculating the position instead of
      * finding the container element to determine the the correct position. All
      * the other positioning logic will still be in effect to ensure the element
      * will be visible within the viewport.
      */
    var initialX: js.UndefOr[Double] = js.undefined
    
    /**
      * The initial y value to use when calculating the position instead of
      * finding the container element to determine the the correct position. All
      * the other positioning logic will still be in effect to ensure the element
      * will be visible within the viewport.
      */
    var initialY: js.UndefOr[Double] = js.undefined
  }
  object InitialCoords {
    
    @scala.inline
    def apply(): InitialCoords = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitialCoords]
    }
    
    @scala.inline
    implicit class InitialCoordsMutableBuilder[Self <: InitialCoords] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      @scala.inline
      def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialYUndefined: Self = StObject.set(x, "initialY", js.undefined)
    }
  }
  
  trait PositionAnchor extends StObject {
    
    var x: HorizontalPosition
    
    var y: VerticalPosition
  }
  object PositionAnchor {
    
    @scala.inline
    def apply(x: HorizontalPosition, y: VerticalPosition): PositionAnchor = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionAnchor]
    }
    
    @scala.inline
    implicit class PositionAnchorMutableBuilder[Self <: PositionAnchor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: HorizontalPosition): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: VerticalPosition): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.auto
    - typings.reactMdUtils.reactMdUtilsStrings.equal
    - typings.reactMdUtils.reactMdUtilsStrings.min
  */
  trait PositionWidth extends StObject
  object PositionWidth {
    
    @scala.inline
    def auto: typings.reactMdUtils.reactMdUtilsStrings.auto = "auto".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.auto]
    
    @scala.inline
    def equal: typings.reactMdUtils.reactMdUtilsStrings.equal = "equal".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.equal]
    
    @scala.inline
    def min: typings.reactMdUtils.reactMdUtilsStrings.min = "min".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.min]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.above
    - typings.reactMdUtils.reactMdUtilsStrings.below
    - typings.reactMdUtils.reactMdUtilsStrings.left
    - typings.reactMdUtils.reactMdUtilsStrings.right
  */
  trait SimplePosition extends StObject
  object SimplePosition {
    
    @scala.inline
    def above: typings.reactMdUtils.reactMdUtilsStrings.above = "above".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.above]
    
    @scala.inline
    def below: typings.reactMdUtils.reactMdUtilsStrings.below = "below".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.below]
    
    @scala.inline
    def left: typings.reactMdUtils.reactMdUtilsStrings.left = "left".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.left]
    
    @scala.inline
    def right: typings.reactMdUtils.reactMdUtilsStrings.right = "right".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.right]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.above
    - typings.reactMdUtils.reactMdUtilsStrings.below
    - typings.reactMdUtils.reactMdUtilsStrings.center
    - typings.reactMdUtils.reactMdUtilsStrings.top
    - typings.reactMdUtils.reactMdUtilsStrings.bottom
  */
  trait VerticalPosition extends StObject
  object VerticalPosition {
    
    @scala.inline
    def above: typings.reactMdUtils.reactMdUtilsStrings.above = "above".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.above]
    
    @scala.inline
    def below: typings.reactMdUtils.reactMdUtilsStrings.below = "below".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.below]
    
    @scala.inline
    def bottom: typings.reactMdUtils.reactMdUtilsStrings.bottom = "bottom".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.bottom]
    
    @scala.inline
    def center: typings.reactMdUtils.reactMdUtilsStrings.center = "center".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.center]
    
    @scala.inline
    def top: typings.reactMdUtils.reactMdUtilsStrings.top = "top".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.top]
  }
}
