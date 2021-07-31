package typings.reactPowerTooltip

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolTipMod {
  
  @JSImport("react-power-tooltip/ToolTip", JSImport.Default)
  @js.native
  class default ()
    extends Component[TooltipProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactPowerTooltip.reactPowerTooltipStrings.fade
    - typings.reactPowerTooltip.reactPowerTooltipStrings.bounce
  */
  trait AnimationType extends StObject
  object AnimationType {
    
    @scala.inline
    def bounce: typings.reactPowerTooltip.reactPowerTooltipStrings.bounce = "bounce".asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.bounce]
    
    @scala.inline
    def fade: typings.reactPowerTooltip.reactPowerTooltipStrings.fade = "fade".asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.fade]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactPowerTooltip.reactPowerTooltipStrings.start
    - typings.reactPowerTooltip.reactPowerTooltipStrings.center
    - typings.reactPowerTooltip.reactPowerTooltipStrings.end
  */
  trait ArrowAlignType extends StObject
  object ArrowAlignType {
    
    @scala.inline
    def center: typings.reactPowerTooltip.reactPowerTooltipStrings.center = "center".asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.center]
    
    @scala.inline
    def end: typings.reactPowerTooltip.reactPowerTooltipStrings.end = "end".asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.end]
    
    @scala.inline
    def start: typings.reactPowerTooltip.reactPowerTooltipStrings.start = "start".asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.start]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`right start`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`right center`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`right end`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`bottom start`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`bottom center`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`bottom end`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`left start`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`left center`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`left end`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`top start`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`top center`
    - typings.reactPowerTooltip.reactPowerTooltipStrings.`top end`
  */
  trait PositionType extends StObject
  object PositionType {
    
    @scala.inline
    def `bottom center`: typings.reactPowerTooltip.reactPowerTooltipStrings.`bottom center` = ("bottom center").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`bottom center`]
    
    @scala.inline
    def `bottom end`: typings.reactPowerTooltip.reactPowerTooltipStrings.`bottom end` = ("bottom end").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`bottom end`]
    
    @scala.inline
    def `bottom start`: typings.reactPowerTooltip.reactPowerTooltipStrings.`bottom start` = ("bottom start").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`bottom start`]
    
    @scala.inline
    def `left center`: typings.reactPowerTooltip.reactPowerTooltipStrings.`left center` = ("left center").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`left center`]
    
    @scala.inline
    def `left end`: typings.reactPowerTooltip.reactPowerTooltipStrings.`left end` = ("left end").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`left end`]
    
    @scala.inline
    def `left start`: typings.reactPowerTooltip.reactPowerTooltipStrings.`left start` = ("left start").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`left start`]
    
    @scala.inline
    def `right center`: typings.reactPowerTooltip.reactPowerTooltipStrings.`right center` = ("right center").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`right center`]
    
    @scala.inline
    def `right end`: typings.reactPowerTooltip.reactPowerTooltipStrings.`right end` = ("right end").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`right end`]
    
    @scala.inline
    def `right start`: typings.reactPowerTooltip.reactPowerTooltipStrings.`right start` = ("right start").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`right start`]
    
    @scala.inline
    def `top center`: typings.reactPowerTooltip.reactPowerTooltipStrings.`top center` = ("top center").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`top center`]
    
    @scala.inline
    def `top end`: typings.reactPowerTooltip.reactPowerTooltipStrings.`top end` = ("top end").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`top end`]
    
    @scala.inline
    def `top start`: typings.reactPowerTooltip.reactPowerTooltipStrings.`top start` = ("top start").asInstanceOf[typings.reactPowerTooltip.reactPowerTooltipStrings.`top start`]
  }
  
  type Tooltip = Component[TooltipProps, js.Object, js.Any]
  
  trait TooltipProps extends StObject {
    
    var animation: js.UndefOr[AnimationType] = js.undefined
    
    var arrowAlign: js.UndefOr[ArrowAlignType] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var flat: js.UndefOr[Boolean] = js.undefined
    
    var fontFamily: js.UndefOr[String] = js.undefined
    
    var fontSize: js.UndefOr[String] = js.undefined
    
    var fontWeight: js.UndefOr[String] = js.undefined
    
    var hoverBackground: js.UndefOr[String] = js.undefined
    
    var lineSeparated: js.UndefOr[Boolean | String] = js.undefined
    
    var moveDown: js.UndefOr[String] = js.undefined
    
    var moveLeft: js.UndefOr[String] = js.undefined
    
    var moveRight: js.UndefOr[String] = js.undefined
    
    var moveUp: js.UndefOr[String] = js.undefined
    
    var position: js.UndefOr[PositionType] = js.undefined
    
    var show: Boolean
    
    var static: js.UndefOr[Boolean] = js.undefined
    
    var textAlign: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[String] = js.undefined
  }
  object TooltipProps {
    
    @scala.inline
    def apply(show: Boolean): TooltipProps = {
      val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimation(value: AnimationType): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setArrowAlign(value: ArrowAlignType): Self = StObject.set(x, "arrowAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowAlignUndefined: Self = StObject.set(x, "arrowAlign", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setFlat(value: Boolean): Self = StObject.set(x, "flat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlatUndefined: Self = StObject.set(x, "flat", js.undefined)
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setHoverBackground(value: String): Self = StObject.set(x, "hoverBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverBackgroundUndefined: Self = StObject.set(x, "hoverBackground", js.undefined)
      
      @scala.inline
      def setLineSeparated(value: Boolean | String): Self = StObject.set(x, "lineSeparated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineSeparatedUndefined: Self = StObject.set(x, "lineSeparated", js.undefined)
      
      @scala.inline
      def setMoveDown(value: String): Self = StObject.set(x, "moveDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveDownUndefined: Self = StObject.set(x, "moveDown", js.undefined)
      
      @scala.inline
      def setMoveLeft(value: String): Self = StObject.set(x, "moveLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveLeftUndefined: Self = StObject.set(x, "moveLeft", js.undefined)
      
      @scala.inline
      def setMoveRight(value: String): Self = StObject.set(x, "moveRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveRightUndefined: Self = StObject.set(x, "moveRight", js.undefined)
      
      @scala.inline
      def setMoveUp(value: String): Self = StObject.set(x, "moveUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveUpUndefined: Self = StObject.set(x, "moveUp", js.undefined)
      
      @scala.inline
      def setPosition(value: PositionType): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      @scala.inline
      def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setZIndex(value: String): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
