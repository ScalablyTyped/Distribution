package typings.reactPortalTooltip

import typings.react.mod.Component
import typings.reactPortalTooltip.anon.ArrowStyle
import typings.reactPortalTooltip.cardMod.Card.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("react-portal-tooltip/lib/Card", JSImport.Default)
  @js.native
  class default ()
    extends Component[CardProps, js.Object, js.Any]
  
  object Card {
    
    /* Rewritten from type alias, can be one of: 
      - scala.Null
      - typings.reactPortalTooltip.reactPortalTooltipStrings.center
      - typings.reactPortalTooltip.reactPortalTooltipStrings.right
      - typings.reactPortalTooltip.reactPortalTooltipStrings.left
    */
    type Align = _Align | Null
    
    /* Rewritten from type alias, can be one of: 
      - scala.Null
      - typings.reactPortalTooltip.reactPortalTooltipStrings.center
      - typings.reactPortalTooltip.reactPortalTooltipStrings.top
      - typings.reactPortalTooltip.reactPortalTooltipStrings.right
      - typings.reactPortalTooltip.reactPortalTooltipStrings.bottom
      - typings.reactPortalTooltip.reactPortalTooltipStrings.left
    */
    type Arrow = _Arrow | Null
    
    trait CardProps extends StObject {
      
      var align: js.UndefOr[Align] = js.undefined
      
      var arrow: js.UndefOr[Arrow] = js.undefined
      
      var position: js.UndefOr[Position] = js.undefined
      
      var style: js.UndefOr[ArrowStyle] = js.undefined
      
      var useHover: js.UndefOr[Boolean] = js.undefined
    }
    object CardProps {
      
      @scala.inline
      def apply(): CardProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CardProps]
      }
      
      @scala.inline
      implicit class CardPropsMutableBuilder[Self <: CardProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAlignNull: Self = StObject.set(x, "align", null)
        
        @scala.inline
        def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        @scala.inline
        def setArrow(value: Arrow): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setArrowNull: Self = StObject.set(x, "arrow", null)
        
        @scala.inline
        def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
        
        @scala.inline
        def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        @scala.inline
        def setStyle(value: ArrowStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        @scala.inline
        def setUseHover(value: Boolean): Self = StObject.set(x, "useHover", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseHoverUndefined: Self = StObject.set(x, "useHover", js.undefined)
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.reactPortalTooltip.reactPortalTooltipStrings.top
      - typings.reactPortalTooltip.reactPortalTooltipStrings.right
      - typings.reactPortalTooltip.reactPortalTooltipStrings.bottom
      - typings.reactPortalTooltip.reactPortalTooltipStrings.left
    */
    trait Position extends StObject
    object Position {
      
      @scala.inline
      def bottom: typings.reactPortalTooltip.reactPortalTooltipStrings.bottom = "bottom".asInstanceOf[typings.reactPortalTooltip.reactPortalTooltipStrings.bottom]
      
      @scala.inline
      def left: typings.reactPortalTooltip.reactPortalTooltipStrings.left = "left".asInstanceOf[typings.reactPortalTooltip.reactPortalTooltipStrings.left]
      
      @scala.inline
      def right: typings.reactPortalTooltip.reactPortalTooltipStrings.right = "right".asInstanceOf[typings.reactPortalTooltip.reactPortalTooltipStrings.right]
      
      @scala.inline
      def top: typings.reactPortalTooltip.reactPortalTooltipStrings.top = "top".asInstanceOf[typings.reactPortalTooltip.reactPortalTooltipStrings.top]
    }
    
    trait _Align extends StObject
    
    trait _Arrow extends StObject
  }
  type Card = Component[CardProps, js.Object, js.Any]
}
