package typings.reactMdUtils

import typings.reactMdUtils.getCoordMod.XCoordConfig
import typings.reactMdUtils.typesMod.HorizontalPosition
import typings.reactMdUtils.typesMod.PositionWidth
import typings.std.ClientRect
import typings.std.DOMRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createHorizontalPositionMod {
  
  @JSImport("@react-md/utils/types/positioning/createHorizontalPosition", "createAnchoredCenter")
  @js.native
  def createAnchoredCenter(config: FixConfig): XPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createHorizontalPosition", "createAnchoredInnerLeft")
  @js.native
  def createAnchoredInnerLeft(config: FixConfig): XPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createHorizontalPosition", "createAnchoredInnerRight")
  @js.native
  def createAnchoredInnerRight(config: FixConfig): XPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createHorizontalPosition", "createAnchoredLeft")
  @js.native
  def createAnchoredLeft(config: FixConfig): XPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createHorizontalPosition", "createAnchoredRight")
  @js.native
  def createAnchoredRight(config: FixConfig): XPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createHorizontalPosition", "createEqualWidth")
  @js.native
  def createEqualWidth(hasXVwElWidthXMarginVwMarginInitialXContainerRectIsMinWidth: EqualWidthOptions): XPosition = js.native
  
  @JSImport("@react-md/utils/types/positioning/createHorizontalPosition", "createHorizontalPosition")
  @js.native
  def createHorizontalPosition(hasXVwVwMarginXMarginWidthElWidthInitialXContainerRectDisableSwapping: Options): XPosition = js.native
  
  /* Inlined parent std.Pick<@react-md/utils.@react-md/utils/types/positioning/createHorizontalPosition.Options, 'x' | 'vw' | 'elWidth' | 'xMargin' | 'vwMargin' | 'containerRect' | 'initialX'> */
  @js.native
  trait EqualWidthOptions extends StObject {
    
    var containerRect: DOMRect | ClientRect = js.native
    
    var elWidth: Double = js.native
    
    var initialX: js.UndefOr[Double] = js.native
    
    var isMinWidth: Boolean = js.native
    
    var vw: Double = js.native
    
    var vwMargin: Double = js.native
    
    var x: HorizontalPosition = js.native
    
    var xMargin: Double = js.native
  }
  object EqualWidthOptions {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class EqualWidthOptionsMutableBuilder[Self <: EqualWidthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerRect(value: DOMRect | ClientRect): Self = StObject.set(x, "containerRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElWidth(value: Double): Self = StObject.set(x, "elWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      @scala.inline
      def setIsMinWidth(value: Boolean): Self = StObject.set(x, "isMinWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVw(value: Double): Self = StObject.set(x, "vw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: HorizontalPosition): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FixConfig extends XCoordConfig {
    
    var disableSwapping: Boolean = js.native
    
    var screenRight: Double = js.native
    
    var vwMargin: Double = js.native
  }
  object FixConfig {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FixConfigMutableBuilder[Self <: FixConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenRight(value: Double): Self = StObject.set(x, "screenRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @private
    */
  /* Inlined parent std.Required<std.Pick<@react-md/utils.@react-md/utils/types/positioning/types.FixedPositionOptions, 'vwMargin' | 'xMargin' | 'width' | 'disableSwapping'>> */
  @js.native
  trait Options extends StObject {
    
    var containerRect: DOMRect | ClientRect = js.native
    
    var disableSwapping: Boolean = js.native
    
    var elWidth: Double = js.native
    
    var initialX: js.UndefOr[Double] = js.native
    
    var vw: Double = js.native
    
    var vwMargin: Double = js.native
    
    var width: PositionWidth = js.native
    
    var x: HorizontalPosition = js.native
    
    var xMargin: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerRect(value: DOMRect | ClientRect): Self = StObject.set(x, "containerRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableSwapping(value: Boolean): Self = StObject.set(x, "disableSwapping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElWidth(value: Double): Self = StObject.set(x, "elWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      @scala.inline
      def setVw(value: Double): Self = StObject.set(x, "vw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVwMargin(value: Double): Self = StObject.set(x, "vwMargin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: PositionWidth): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: HorizontalPosition): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXMargin(value: Double): Self = StObject.set(x, "xMargin", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @private
    */
  @js.native
  trait XPosition extends StObject {
    
    var actualX: HorizontalPosition = js.native
    
    var left: Double = js.native
    
    var minWidth: js.UndefOr[Double] = js.native
    
    var right: js.UndefOr[Double] = js.native
    
    var width: js.UndefOr[Double] = js.native
  }
  object XPosition {
    
    @scala.inline
    def apply(actualX: HorizontalPosition, left: Double): XPosition = {
      val __obj = js.Dynamic.literal(actualX = actualX.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any])
      __obj.asInstanceOf[XPosition]
    }
    
    @scala.inline
    implicit class XPositionMutableBuilder[Self <: XPosition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActualX(value: HorizontalPosition): Self = StObject.set(x, "actualX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
