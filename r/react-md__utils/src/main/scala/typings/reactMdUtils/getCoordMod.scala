package typings.reactMdUtils

import typings.std.ClientRect
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCoordMod {
  
  @JSImport("@react-md/utils/types/positioning/getCoord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAboveCoord(hasYMarginInitialYElHeightContainerRect: YCoordConfig): Top = ^.asInstanceOf[js.Dynamic].applyDynamic("getAboveCoord")(hasYMarginInitialYElHeightContainerRect.asInstanceOf[js.Any]).asInstanceOf[Top]
  
  @scala.inline
  def getBelowCoord(hasYMarginInitialYContainerRect: YCoordConfig): Top = ^.asInstanceOf[js.Dynamic].applyDynamic("getBelowCoord")(hasYMarginInitialYContainerRect.asInstanceOf[js.Any]).asInstanceOf[Top]
  
  @scala.inline
  def getBottomCoord(hasYMarginInitialYElHeightContainerRect: YCoordConfig): Top = ^.asInstanceOf[js.Dynamic].applyDynamic("getBottomCoord")(hasYMarginInitialYElHeightContainerRect.asInstanceOf[js.Any]).asInstanceOf[Top]
  
  @scala.inline
  def getCenterXCoord(hasElWidthInitialXContainerRect: XCoordConfig): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenterXCoord")(hasElWidthInitialXContainerRect.asInstanceOf[js.Any]).asInstanceOf[Left]
  
  @scala.inline
  def getCenterYCoord(hasElHeightInitialYContainerRect: YCoordConfig): Top = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenterYCoord")(hasElHeightInitialYContainerRect.asInstanceOf[js.Any]).asInstanceOf[Top]
  
  @scala.inline
  def getInnerLeftCoord(hasXMarginInitialXContainerRect: XCoordConfig): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("getInnerLeftCoord")(hasXMarginInitialXContainerRect.asInstanceOf[js.Any]).asInstanceOf[Left]
  
  @scala.inline
  def getInnerRightCoord(hasXMarginElWidthInitialXContainerRect: XCoordConfig): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("getInnerRightCoord")(hasXMarginElWidthInitialXContainerRect.asInstanceOf[js.Any]).asInstanceOf[Left]
  
  @scala.inline
  def getLeftCoord(hasXMarginElWidthInitialXContainerRect: XCoordConfig): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("getLeftCoord")(hasXMarginElWidthInitialXContainerRect.asInstanceOf[js.Any]).asInstanceOf[Left]
  
  @scala.inline
  def getRightCoord(hasXMarginInitialXContainerRect: XCoordConfig): Left = ^.asInstanceOf[js.Dynamic].applyDynamic("getRightCoord")(hasXMarginInitialXContainerRect.asInstanceOf[js.Any]).asInstanceOf[Left]
  
  @scala.inline
  def getTopCoord(hasYMarginInitialYContainerRect: YCoordConfig): Top = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopCoord")(hasYMarginInitialYContainerRect.asInstanceOf[js.Any]).asInstanceOf[Top]
  
  type Left = Double
  
  type Top = Double
  
  trait XCoordConfig extends StObject {
    
    var containerRect: DOMRect | ClientRect
    
    var elWidth: Double
    
    var initialX: js.UndefOr[Double] = js.undefined
    
    var xMargin: Double
  }
  object XCoordConfig {
    
    @scala.inline
    def apply(containerRect: DOMRect | ClientRect, elWidth: Double, xMargin: Double): XCoordConfig = {
      val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], elWidth = elWidth.asInstanceOf[js.Any], xMargin = xMargin.asInstanceOf[js.Any])
      __obj.asInstanceOf[XCoordConfig]
    }
    
    @scala.inline
    implicit class XCoordConfigMutableBuilder[Self <: XCoordConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerRect(value: DOMRect | ClientRect): Self = StObject.set(x, "containerRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElWidth(value: Double): Self = StObject.set(x, "elWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      @scala.inline
      def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
    }
  }
  
  trait YCoordConfig extends StObject {
    
    var containerRect: DOMRect | ClientRect
    
    var elHeight: Double
    
    var initialY: js.UndefOr[Double] = js.undefined
    
    var yMargin: Double
  }
  object YCoordConfig {
    
    @scala.inline
    def apply(containerRect: DOMRect | ClientRect, elHeight: Double, yMargin: Double): YCoordConfig = {
      val __obj = js.Dynamic.literal(containerRect = containerRect.asInstanceOf[js.Any], elHeight = elHeight.asInstanceOf[js.Any], yMargin = yMargin.asInstanceOf[js.Any])
      __obj.asInstanceOf[YCoordConfig]
    }
    
    @scala.inline
    implicit class YCoordConfigMutableBuilder[Self <: YCoordConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerRect(value: DOMRect | ClientRect): Self = StObject.set(x, "containerRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElHeight(value: Double): Self = StObject.set(x, "elHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialYUndefined: Self = StObject.set(x, "initialY", js.undefined)
      
      @scala.inline
      def setYMargin(value: Double): Self = StObject.set(x, "yMargin", value.asInstanceOf[js.Any])
    }
  }
}
