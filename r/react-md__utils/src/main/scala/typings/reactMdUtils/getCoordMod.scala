package typings.reactMdUtils

import typings.std.ClientRect
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCoordMod {
  
  @JSImport("@react-md/utils/types/positioning/getCoord", "getAboveCoord")
  @js.native
  def getAboveCoord(hasYMarginInitialYElHeightContainerRect: YCoordConfig): Top = js.native
  
  @JSImport("@react-md/utils/types/positioning/getCoord", "getBelowCoord")
  @js.native
  def getBelowCoord(hasYMarginInitialYContainerRect: YCoordConfig): Top = js.native
  
  @JSImport("@react-md/utils/types/positioning/getCoord", "getBottomCoord")
  @js.native
  def getBottomCoord(hasYMarginInitialYElHeightContainerRect: YCoordConfig): Top = js.native
  
  @JSImport("@react-md/utils/types/positioning/getCoord", "getCenterXCoord")
  @js.native
  def getCenterXCoord(hasElWidthInitialXContainerRect: XCoordConfig): Left = js.native
  
  @JSImport("@react-md/utils/types/positioning/getCoord", "getCenterYCoord")
  @js.native
  def getCenterYCoord(hasElHeightInitialYContainerRect: YCoordConfig): Top = js.native
  
  @JSImport("@react-md/utils/types/positioning/getCoord", "getInnerLeftCoord")
  @js.native
  def getInnerLeftCoord(hasXMarginInitialXContainerRect: XCoordConfig): Left = js.native
  
  @JSImport("@react-md/utils/types/positioning/getCoord", "getInnerRightCoord")
  @js.native
  def getInnerRightCoord(hasXMarginElWidthInitialXContainerRect: XCoordConfig): Left = js.native
  
  @JSImport("@react-md/utils/types/positioning/getCoord", "getLeftCoord")
  @js.native
  def getLeftCoord(hasXMarginElWidthInitialXContainerRect: XCoordConfig): Left = js.native
  
  @JSImport("@react-md/utils/types/positioning/getCoord", "getRightCoord")
  @js.native
  def getRightCoord(hasXMarginInitialXContainerRect: XCoordConfig): Left = js.native
  
  @JSImport("@react-md/utils/types/positioning/getCoord", "getTopCoord")
  @js.native
  def getTopCoord(hasYMarginInitialYContainerRect: YCoordConfig): Top = js.native
  
  type Left = Double
  
  type Top = Double
  
  @js.native
  trait XCoordConfig extends StObject {
    
    var containerRect: DOMRect | ClientRect = js.native
    
    var elWidth: Double = js.native
    
    var initialX: js.UndefOr[Double] = js.native
    
    var xMargin: Double = js.native
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
  
  @js.native
  trait YCoordConfig extends StObject {
    
    var containerRect: DOMRect | ClientRect = js.native
    
    var elHeight: Double = js.native
    
    var initialY: js.UndefOr[Double] = js.native
    
    var yMargin: Double = js.native
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
