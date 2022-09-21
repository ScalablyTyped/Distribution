package typings.reactMdUtils

import typings.reactMdUtils.reactMdUtilsStrings.absolute
import typings.reactMdUtils.reactMdUtilsStrings.fixed
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object positioningTypesMod {
  
  trait CalculateFixedPositionOptions
    extends StObject
       with InitialCoords {
    
    /**
      * The configuration to anchor the fixed element to the container element.
      *
      * @defaultValue `BELOW_CENTER_ANCHOR`
      */
    var anchor: js.UndefOr[PositionAnchor] = js.undefined
    
    /**
      * Boolean if the auto-swapping behavior should be disabled. It's normally
      * recommended to not disable this since it'll allow elements to appear off
      * screen.
      *
      * @defaultValue `false`
      * @remarks \@since 5.0.0 This will always be `true` if the
      * {@link FixedPositionOptions.container} is `null`.
      */
    var disableSwapping: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the fixed positioning should no longer prevent the fixed element
      * to be positioned within the viewport. This is nice if you want to allow for
      * full page scrolling instead and manually set a max-height on your element.
      *
      * @defaultValue `false`
      */
    var disableVHBounds: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the fixed element should no longer be able to overlap the
      * container element. This is useful for autocomplete menus or other
      * components that retain focus on the container element while the fixed
      * element becomes visible.
      *
      * @defaultValue `false`
      */
    var preventOverlap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the style object should include the `transformOrigin` value
      * based on the x and y positions.
      *
      * @defaultValue `false`
      */
    var transformOrigin: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The viewwidth margin to apply so that the element doesn't need to be
      * directly on the screen edge.
      *
      * @defaultValue `16`
      */
    var vhMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * The viewwidth margin to apply so that the element doesn't need to be
      * directly on the screen edge.
      *
      * @defaultValue `16`
      */
    var vwMargin: js.UndefOr[Double] = js.undefined
    
    /** {@inheritDoc PositionWidth} */
    var width: js.UndefOr[PositionWidth] = js.undefined
    
    /**
      * The container width margin to apply so that the element doesn't need to be
      * directly on the container's edge.
      *
      * @defaultValue `0`
      */
    var xMargin: js.UndefOr[Double] = js.undefined
    
    /**
      * The container height margin to apply so that the element doesn't need to be
      * directly on the container's edge
      *
      * @defaultValue `0`
      */
    var yMargin: js.UndefOr[Double] = js.undefined
  }
  object CalculateFixedPositionOptions {
    
    inline def apply(): CalculateFixedPositionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CalculateFixedPositionOptions]
    }
    
    extension [Self <: CalculateFixedPositionOptions](x: Self) {
      
      inline def setAnchor(value: PositionAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
      
      inline def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      inline def setDisableSwappingUndefined: Self = StObject.set(x, "disableSwapping", js.undefined)
      
      inline def setDisableVHBounds(value: Boolean): Self = StObject.set(x, "disableVHBounds", value.asInstanceOf[js.Any])
      
      inline def setDisableVHBoundsUndefined: Self = StObject.set(x, "disableVHBounds", js.undefined)
      
      inline def setPreventOverlap(value: Boolean): Self = StObject.set(x, "preventOverlap", value.asInstanceOf[js.Any])
      
      inline def setPreventOverlapUndefined: Self = StObject.set(x, "preventOverlap", js.undefined)
      
      inline def setTransformOrigin(value: Boolean): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
      
      inline def setVhMargin(value: Double): Self = StObject.set(x, "vhMargin", value.asInstanceOf[js.Any])
      
      inline def setVhMarginUndefined: Self = StObject.set(x, "vhMargin", js.undefined)
      
      inline def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
      
      inline def setVwMarginUndefined: Self = StObject.set(x, "vwMargin", js.undefined)
      
      inline def setWidth(value: PositionWidth): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
      
      inline def setXMarginUndefined: Self = StObject.set(x, "xMargin", js.undefined)
      
      inline def setYMargin(value: Double): Self = StObject.set(x, "yMargin", value.asInstanceOf[js.Any])
      
      inline def setYMarginUndefined: Self = StObject.set(x, "yMargin", js.undefined)
    }
  }
  
  trait Coords extends StObject {
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var left: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var top: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Coords {
    
    inline def apply(): Coords = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Coords]
    }
    
    extension [Self <: Coords](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
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
    
    /** {@inheritDoc FixedPositionStyle} */
    var style: js.UndefOr[FixedPositionStyle] = js.undefined
  }
  object FixedPosition {
    
    inline def apply(actualX: HorizontalPosition, actualY: VerticalPosition): FixedPosition = {
      val __obj = js.Dynamic.literal(actualX = actualX.asInstanceOf[js.Any], actualY = actualY.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedPosition]
    }
    
    extension [Self <: FixedPosition](x: Self) {
      
      inline def setActualX(value: HorizontalPosition): Self = StObject.set(x, "actualX", value.asInstanceOf[js.Any])
      
      inline def setActualY(value: VerticalPosition): Self = StObject.set(x, "actualY", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: FixedPositionStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait FixedPositionOptions
    extends StObject
       with CalculateFixedPositionOptions {
    
    /**
      * The container element that the `element` should be fixed to.
      */
    var container: HTMLElement | Null
    
    /**
      * The element that is fixed to a `container` element.
      */
    var element: HTMLElement | Null
  }
  object FixedPositionOptions {
    
    inline def apply(): FixedPositionOptions = {
      val __obj = js.Dynamic.literal(container = null, element = null)
      __obj.asInstanceOf[FixedPositionOptions]
    }
    
    extension [Self <: FixedPositionOptions](x: Self) {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementNull: Self = StObject.set(x, "element", null)
    }
  }
  
  trait FixedPositionStyle
    extends StObject
       with Coords {
    
    /**
      * This will be `"fixed"` unless
      * {@link CalculateFixedPositionOptions.disableVHBounds} is set to `true`.
      */
    var position: fixed | absolute
    
    /**
      * This will be `undefined` unless
      * {@link CalculateFixedPositionOptions.transformOrigin} is set to `true`
      */
    var transformOrigin: js.UndefOr[String] = js.undefined
  }
  object FixedPositionStyle {
    
    inline def apply(position: fixed | absolute): FixedPositionStyle = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixedPositionStyle]
    }
    
    extension [Self <: FixedPositionStyle](x: Self) {
      
      inline def setPosition(value: fixed | absolute): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTransformOrigin(value: String): Self = StObject.set(x, "transformOrigin", value.asInstanceOf[js.Any])
      
      inline def setTransformOriginUndefined: Self = StObject.set(x, "transformOrigin", js.undefined)
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
    
    inline def center: typings.reactMdUtils.reactMdUtilsStrings.center = "center".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.center]
    
    inline def `inner-left`: typings.reactMdUtils.reactMdUtilsStrings.`inner-left` = "inner-left".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.`inner-left`]
    
    inline def `inner-right`: typings.reactMdUtils.reactMdUtilsStrings.`inner-right` = "inner-right".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.`inner-right`]
    
    inline def left: typings.reactMdUtils.reactMdUtilsStrings.left = "left".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.left]
    
    inline def right: typings.reactMdUtils.reactMdUtilsStrings.right = "right".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.right]
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
    
    inline def apply(): InitialCoords = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InitialCoords]
    }
    
    extension [Self <: InitialCoords](x: Self) {
      
      inline def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      inline def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      inline def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      inline def setInitialYUndefined: Self = StObject.set(x, "initialY", js.undefined)
    }
  }
  
  trait PositionAnchor extends StObject {
    
    var x: HorizontalPosition
    
    var y: VerticalPosition
  }
  object PositionAnchor {
    
    inline def apply(x: HorizontalPosition, y: VerticalPosition): PositionAnchor = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[PositionAnchor]
    }
    
    extension [Self <: PositionAnchor](x: Self) {
      
      inline def setX(value: HorizontalPosition): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: VerticalPosition): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.auto
    - typings.reactMdUtils.reactMdUtilsStrings.equal
    - typings.reactMdUtils.reactMdUtilsStrings.min
  */
  trait PositionWidth extends StObject
  object PositionWidth {
    
    inline def auto: typings.reactMdUtils.reactMdUtilsStrings.auto = "auto".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.auto]
    
    inline def equal: typings.reactMdUtils.reactMdUtilsStrings.equal = "equal".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.equal]
    
    inline def min: typings.reactMdUtils.reactMdUtilsStrings.min = "min".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.min]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdUtils.reactMdUtilsStrings.above
    - typings.reactMdUtils.reactMdUtilsStrings.below
    - typings.reactMdUtils.reactMdUtilsStrings.left
    - typings.reactMdUtils.reactMdUtilsStrings.right
  */
  trait SimplePosition extends StObject
  object SimplePosition {
    
    inline def above: typings.reactMdUtils.reactMdUtilsStrings.above = "above".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.above]
    
    inline def below: typings.reactMdUtils.reactMdUtilsStrings.below = "below".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.below]
    
    inline def left: typings.reactMdUtils.reactMdUtilsStrings.left = "left".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.left]
    
    inline def right: typings.reactMdUtils.reactMdUtilsStrings.right = "right".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.right]
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
    
    inline def above: typings.reactMdUtils.reactMdUtilsStrings.above = "above".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.above]
    
    inline def below: typings.reactMdUtils.reactMdUtilsStrings.below = "below".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.below]
    
    inline def bottom: typings.reactMdUtils.reactMdUtilsStrings.bottom = "bottom".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.bottom]
    
    inline def center: typings.reactMdUtils.reactMdUtilsStrings.center = "center".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.center]
    
    inline def top: typings.reactMdUtils.reactMdUtilsStrings.top = "top".asInstanceOf[typings.reactMdUtils.reactMdUtilsStrings.top]
  }
}
