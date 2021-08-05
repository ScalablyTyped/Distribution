package typings.reactMdUtils

import typings.reactMdUtils.getCoordMod.YCoordConfig
import typings.reactMdUtils.typesMod.VerticalPosition
import typings.std.ClientRect
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createVerticalPositionMod {
  
  @JSImport("@react-md/utils/types/positioning/createVerticalPosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createAnchoredAbove(config: FixConfig): YPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnchoredAbove")(config.asInstanceOf[js.Any]).asInstanceOf[YPosition]
  
  inline def createAnchoredBelow(config: FixConfig): YPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnchoredBelow")(config.asInstanceOf[js.Any]).asInstanceOf[YPosition]
  
  inline def createAnchoredBottom(config: FixConfig): YPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnchoredBottom")(config.asInstanceOf[js.Any]).asInstanceOf[YPosition]
  
  inline def createAnchoredCenter(config: FixConfig): YPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnchoredCenter")(config.asInstanceOf[js.Any]).asInstanceOf[YPosition]
  
  inline def createAnchoredTop(config: FixConfig): YPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createAnchoredTop")(config.asInstanceOf[js.Any]).asInstanceOf[YPosition]
  
  inline def createVerticalPosition(
    hasYVhVhMarginYMarginElHeightInitialYContainerRectDisableSwappingPreventOverlapDisableVHBounds: Options
  ): YPosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createVerticalPosition")(hasYVhVhMarginYMarginElHeightInitialYContainerRectDisableSwappingPreventOverlapDisableVHBounds.asInstanceOf[js.Any]).asInstanceOf[YPosition]
  
  trait FixConfig
    extends StObject
       with YCoordConfig {
    
    var disableSwapping: Boolean
    
    var disableVHBounds: Boolean
    
    var preventOverlap: Boolean
    
    var screenBottom: Double
    
    var vhMargin: Double
  }
  object FixConfig {
    
    inline def apply(
      containerRect: DOMRect | ClientRect,
      disableSwapping: Boolean,
      disableVHBounds: Boolean,
      elHeight: Double,
      preventOverlap: Boolean,
      screenBottom: Double,
      vhMargin: Double,
      yMargin: Double
    ): FixConfig = {
      val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], disableSwapping = disableSwapping.asInstanceOf[js.Any], disableVHBounds = disableVHBounds.asInstanceOf[js.Any], elHeight = elHeight.asInstanceOf[js.Any], preventOverlap = preventOverlap.asInstanceOf[js.Any], screenBottom = screenBottom.asInstanceOf[js.Any], vhMargin = vhMargin.asInstanceOf[js.Any], yMargin = yMargin.asInstanceOf[js.Any])
      __obj.asInstanceOf[FixConfig]
    }
    
    extension [Self <: FixConfig](x: Self) {
      
      inline def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      inline def setDisableVHBounds(value: Boolean): Self = StObject.set(x, "disableVHBounds", value.asInstanceOf[js.Any])
      
      inline def setPreventOverlap(value: Boolean): Self = StObject.set(x, "preventOverlap", value.asInstanceOf[js.Any])
      
      inline def setScreenBottom(value: Double): Self = StObject.set(x, "screenBottom", value.asInstanceOf[js.Any])
      
      inline def setVhMargin(value: Double): Self = StObject.set(x, "vhMargin", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @private
    */
  /* Inlined parent std.Required<std.Pick<@react-md/utils.@react-md/utils/types/positioning/types.FixedPositionOptions, 'yMargin' | 'vhMargin' | 'preventOverlap' | 'disableSwapping' | 'disableVHBounds'>> */
  trait Options extends StObject {
    
    var containerRect: DOMRect | ClientRect
    
    var disableSwapping: Boolean
    
    var disableVHBounds: Boolean
    
    var elHeight: Double
    
    var initialY: js.UndefOr[Double] = js.undefined
    
    var preventOverlap: Boolean
    
    var vh: Double
    
    var vhMargin: Double
    
    var y: VerticalPosition
    
    var yMargin: Double
  }
  object Options {
    
    inline def apply(
      containerRect: DOMRect | ClientRect,
      disableSwapping: Boolean,
      disableVHBounds: Boolean,
      elHeight: Double,
      preventOverlap: Boolean,
      vh: Double,
      vhMargin: Double,
      y: VerticalPosition,
      yMargin: Double
    ): Options = {
      val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], disableSwapping = disableSwapping.asInstanceOf[js.Any], disableVHBounds = disableVHBounds.asInstanceOf[js.Any], elHeight = elHeight.asInstanceOf[js.Any], preventOverlap = preventOverlap.asInstanceOf[js.Any], vh = vh.asInstanceOf[js.Any], vhMargin = vhMargin.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yMargin = yMargin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContainerRect(value: DOMRect | ClientRect): Self = StObject.set(x, "containerRect", value.asInstanceOf[js.Any])
      
      inline def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      inline def setDisableVHBounds(value: Boolean): Self = StObject.set(x, "disableVHBounds", value.asInstanceOf[js.Any])
      
      inline def setElHeight(value: Double): Self = StObject.set(x, "elHeight", value.asInstanceOf[js.Any])
      
      inline def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      inline def setInitialYUndefined: Self = StObject.set(x, "initialY", js.undefined)
      
      inline def setPreventOverlap(value: Boolean): Self = StObject.set(x, "preventOverlap", value.asInstanceOf[js.Any])
      
      inline def setVh(value: Double): Self = StObject.set(x, "vh", value.asInstanceOf[js.Any])
      
      inline def setVhMargin(value: Double): Self = StObject.set(x, "vhMargin", value.asInstanceOf[js.Any])
      
      inline def setY(value: VerticalPosition): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYMargin(value: Double): Self = StObject.set(x, "yMargin", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @private
    */
  trait YPosition extends StObject {
    
    var actualY: VerticalPosition
    
    var bottom: js.UndefOr[Double] = js.undefined
    
    var top: Double
  }
  object YPosition {
    
    inline def apply(actualY: VerticalPosition, top: Double): YPosition = {
      val __obj = js.Dynamic.literal(actualY = actualY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[YPosition]
    }
    
    extension [Self <: YPosition](x: Self) {
      
      inline def setActualY(value: VerticalPosition): Self = StObject.set(x, "actualY", value.asInstanceOf[js.Any])
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
