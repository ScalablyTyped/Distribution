package typings.reactMdUtils

import typings.reactMdUtils.getCoordMod.YCoordConfig
import typings.reactMdUtils.typesMod.VerticalPosition
import typings.std.ClientRect
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createVerticalPositionMod {
  
  @JSImport("@react-md/utils/types/positioning/createVerticalPosition", "createAnchoredAbove")
  @js.native
  def createAnchoredAbove(config: FixConfig): YPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createVerticalPosition", "createAnchoredBelow")
  @js.native
  def createAnchoredBelow(config: FixConfig): YPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createVerticalPosition", "createAnchoredBottom")
  @js.native
  def createAnchoredBottom(config: FixConfig): YPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createVerticalPosition", "createAnchoredCenter")
  @js.native
  def createAnchoredCenter(config: FixConfig): YPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createVerticalPosition", "createAnchoredTop")
  @js.native
  def createAnchoredTop(config: FixConfig): YPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createVerticalPosition", "createVerticalPosition")
  @js.native
  def createVerticalPosition(
    hasYVhVhMarginYMarginElHeightInitialYContainerRectDisableSwappingPreventOverlapDisableVHBounds: Options
  ): YPosition = js.native
  
  @js.native
  trait FixConfig extends YCoordConfig {
    
    var disableSwapping: Boolean = js.native
    
    var disableVHBounds: Boolean = js.native
    
    var preventOverlap: Boolean = js.native
    
    var screenBottom: Double = js.native
    
    var vhMargin: Double = js.native
  }
  object FixConfig {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FixConfigMutableBuilder[Self <: FixConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableVHBounds(value: Boolean): Self = StObject.set(x, "disableVHBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventOverlap(value: Boolean): Self = StObject.set(x, "preventOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenBottom(value: Double): Self = StObject.set(x, "screenBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVhMargin(value: Double): Self = StObject.set(x, "vhMargin", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @private
    */
  /* Inlined parent std.Required<std.Pick<@react-md/utils.@react-md/utils/types/positioning/types.FixedPositionOptions, 'yMargin' | 'vhMargin' | 'preventOverlap' | 'disableSwapping' | 'disableVHBounds'>> */
  @js.native
  trait Options extends StObject {
    
    var containerRect: DOMRect | ClientRect = js.native
    
    var disableSwapping: Boolean = js.native
    
    var disableVHBounds: Boolean = js.native
    
    var elHeight: Double = js.native
    
    var initialY: js.UndefOr[Double] = js.native
    
    var preventOverlap: Boolean = js.native
    
    var vh: Double = js.native
    
    var vhMargin: Double = js.native
    
    var y: VerticalPosition = js.native
    
    var yMargin: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerRect(value: DOMRect | ClientRect): Self = StObject.set(x, "containerRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableVHBounds(value: Boolean): Self = StObject.set(x, "disableVHBounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElHeight(value: Double): Self = StObject.set(x, "elHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialYUndefined: Self = StObject.set(x, "initialY", js.undefined)
      
      @scala.inline
      def setPreventOverlap(value: Boolean): Self = StObject.set(x, "preventOverlap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVh(value: Double): Self = StObject.set(x, "vh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVhMargin(value: Double): Self = StObject.set(x, "vhMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: VerticalPosition): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYMargin(value: Double): Self = StObject.set(x, "yMargin", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @private
    */
  @js.native
  trait YPosition extends StObject {
    
    var actualY: VerticalPosition = js.native
    
    var bottom: js.UndefOr[Double] = js.native
    
    var top: Double = js.native
  }
  object YPosition {
    
    @scala.inline
    def apply(actualY: VerticalPosition, top: Double): YPosition = {
      val __obj = js.Dynamic.literal(actualY = actualY.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[YPosition]
    }
    
    @scala.inline
    implicit class YPositionMutableBuilder[Self <: YPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualY(value: VerticalPosition): Self = StObject.set(x, "actualY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
