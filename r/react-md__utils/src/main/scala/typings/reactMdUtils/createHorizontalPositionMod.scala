package typings.reactMdUtils

import typings.reactMdUtils.getCoordMod.XCoordConfig
import typings.reactMdUtils.typesMod.HorizontalPosition
import typings.reactMdUtils.typesMod.PositionWidth
import typings.std.ClientRect
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHorizontalPositionMod {
  
  @JSImport("@react-md/utils/types/positioning/createHorizontalPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAnchoredCenter(config: FixConfig): XPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnchoredCenter")(config.asInstanceOf[js.Any]).asInstanceOf[XPosition]
  
  inline def createAnchoredInnerLeft(config: FixConfig): XPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnchoredInnerLeft")(config.asInstanceOf[js.Any]).asInstanceOf[XPosition]
  
  inline def createAnchoredInnerRight(config: FixConfig): XPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnchoredInnerRight")(config.asInstanceOf[js.Any]).asInstanceOf[XPosition]
  
  inline def createAnchoredLeft(config: FixConfig): XPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnchoredLeft")(config.asInstanceOf[js.Any]).asInstanceOf[XPosition]
  
  inline def createAnchoredRight(config: FixConfig): XPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnchoredRight")(config.asInstanceOf[js.Any]).asInstanceOf[XPosition]
  
  inline def createEqualWidth(hasXVwElWidthXMarginVwMarginInitialXContainerRectIsMinWidth: EqualWidthOptions): XPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createEqualWidth")(hasXVwElWidthXMarginVwMarginInitialXContainerRectIsMinWidth.asInstanceOf[js.Any]).asInstanceOf[XPosition]
  
  inline def createHorizontalPosition(hasXVwVwMarginXMarginWidthElWidthInitialXContainerRectDisableSwapping: Options): XPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createHorizontalPosition")(hasXVwVwMarginXMarginWidthElWidthInitialXContainerRectDisableSwapping.asInstanceOf[js.Any]).asInstanceOf[XPosition]
  
  /* Inlined parent std.Pick<@react-md/utils.@react-md/utils/types/positioning/createHorizontalPosition.Options, 'x' | 'vw' | 'elWidth' | 'xMargin' | 'vwMargin' | 'containerRect' | 'initialX'> */
  trait EqualWidthOptions extends StObject {
    
    var containerRect: DOMRect | ClientRect
    
    var elWidth: Double
    
    var initialX: js.UndefOr[Double] = js.undefined
    
    var isMinWidth: Boolean
    
    var vw: Double
    
    var vwMargin: Double
    
    var x: HorizontalPosition
    
    var xMargin: Double
  }
  object EqualWidthOptions {
    
    inline def apply(
      containerRect: DOMRect | ClientRect,
      elWidth: Double,
      isMinWidth: Boolean,
      vw: Double,
      vwMargin: Double,
      x: HorizontalPosition,
      xMargin: Double
    ): EqualWidthOptions = {
      val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], elWidth = elWidth.asInstanceOf[js.Any], isMinWidth = isMinWidth.asInstanceOf[js.Any], vw = vw.asInstanceOf[js.Any], vwMargin = vwMargin.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xMargin = xMargin.asInstanceOf[js.Any])
      __obj.asInstanceOf[EqualWidthOptions]
    }
    
    extension [Self <: EqualWidthOptions](x: Self) {
      
      inline def setContainerRect(value: DOMRect | ClientRect): Self = StObject.set(x, "containerRect", value.asInstanceOf[js.Any])
      
      inline def setElWidth(value: Double): Self = StObject.set(x, "elWidth", value.asInstanceOf[js.Any])
      
      inline def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      inline def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      inline def setIsMinWidth(value: Boolean): Self = StObject.set(x, "isMinWidth", value.asInstanceOf[js.Any])
      
      inline def setVw(value: Double): Self = StObject.set(x, "vw", value.asInstanceOf[js.Any])
      
      inline def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
      
      inline def setX(value: HorizontalPosition): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
    }
  }
  
  trait FixConfig
    extends StObject
       with XCoordConfig {
    
    var disableSwapping: Boolean
    
    var screenRight: Double
    
    var vwMargin: Double
  }
  object FixConfig {
    
    inline def apply(
      containerRect: DOMRect | ClientRect,
      disableSwapping: Boolean,
      elWidth: Double,
      screenRight: Double,
      vwMargin: Double,
      xMargin: Double
    ): FixConfig = {
      val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], disableSwapping = disableSwapping.asInstanceOf[js.Any], elWidth = elWidth.asInstanceOf[js.Any], screenRight = screenRight.asInstanceOf[js.Any], vwMargin = vwMargin.asInstanceOf[js.Any], xMargin = xMargin.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixConfig]
    }
    
    extension [Self <: FixConfig](x: Self) {
      
      inline def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      inline def setScreenRight(value: Double): Self = StObject.set(x, "screenRight", value.asInstanceOf[js.Any])
      
      inline def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @private
    */
  /* Inlined parent std.Required<std.Pick<@react-md/utils.@react-md/utils/types/positioning/types.FixedPositionOptions, 'vwMargin' | 'xMargin' | 'width' | 'disableSwapping'>> */
  trait Options extends StObject {
    
    var containerRect: DOMRect | ClientRect
    
    var disableSwapping: Boolean
    
    var elWidth: Double
    
    var initialX: js.UndefOr[Double] = js.undefined
    
    var vw: Double
    
    var vwMargin: Double
    
    var width: PositionWidth
    
    var x: HorizontalPosition
    
    var xMargin: Double
  }
  object Options {
    
    inline def apply(
      containerRect: DOMRect | ClientRect,
      disableSwapping: Boolean,
      elWidth: Double,
      vw: Double,
      vwMargin: Double,
      width: PositionWidth,
      x: HorizontalPosition,
      xMargin: Double
    ): Options = {
      val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], disableSwapping = disableSwapping.asInstanceOf[js.Any], elWidth = elWidth.asInstanceOf[js.Any], vw = vw.asInstanceOf[js.Any], vwMargin = vwMargin.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xMargin = xMargin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContainerRect(value: DOMRect | ClientRect): Self = StObject.set(x, "containerRect", value.asInstanceOf[js.Any])
      
      inline def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      inline def setElWidth(value: Double): Self = StObject.set(x, "elWidth", value.asInstanceOf[js.Any])
      
      inline def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      inline def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      inline def setVw(value: Double): Self = StObject.set(x, "vw", value.asInstanceOf[js.Any])
      
      inline def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: PositionWidth): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: HorizontalPosition): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @private
    */
  trait XPosition extends StObject {
    
    var actualX: HorizontalPosition
    
    var left: Double
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var right: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object XPosition {
    
    inline def apply(actualX: HorizontalPosition, left: Double): XPosition = {
      val __obj = js.Dynamic.literal(actualX = actualX.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[XPosition]
    }
    
    extension [Self <: XPosition](x: Self) {
      
      inline def setActualX(value: HorizontalPosition): Self = StObject.set(x, "actualX", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
