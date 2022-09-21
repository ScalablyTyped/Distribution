package typings.reactPortalTooltip

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactPortalTooltip.anon.ArrowStyle
import typings.reactPortalTooltip.cardMod.Card.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("react-portal-tooltip/lib/Card", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CardProps, js.Object, Any]
  
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
      
      var children: js.UndefOr[ReactNode] = js.undefined
      
      var position: js.UndefOr[Position] = js.undefined
      
      var style: js.UndefOr[ArrowStyle] = js.undefined
      
      var useHover: js.UndefOr[Boolean] = js.undefined
    }
    object CardProps {
      
      inline def apply(): CardProps = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CardProps]
      }
      
      extension [Self <: CardProps](x: Self) {
        
        inline def setAlign(value: Align): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
        
        inline def setAlignNull: Self = StObject.set(x, "align", null)
        
        inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
        
        inline def setArrow(value: Arrow): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
        
        inline def setArrowNull: Self = StObject.set(x, "arrow", null)
        
        inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setStyle(value: ArrowStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
        
        inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
        
        inline def setUseHover(value: Boolean): Self = StObject.set(x, "useHover", value.asInstanceOf[js.Any])
        
        inline def setUseHoverUndefined: Self = StObject.set(x, "useHover", js.undefined)
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
      
      inline def bottom: typings.reactPortalTooltip.reactPortalTooltipStrings.bottom = "bottom".asInstanceOf[typings.reactPortalTooltip.reactPortalTooltipStrings.bottom]
      
      inline def left: typings.reactPortalTooltip.reactPortalTooltipStrings.left = "left".asInstanceOf[typings.reactPortalTooltip.reactPortalTooltipStrings.left]
      
      inline def right: typings.reactPortalTooltip.reactPortalTooltipStrings.right = "right".asInstanceOf[typings.reactPortalTooltip.reactPortalTooltipStrings.right]
      
      inline def top: typings.reactPortalTooltip.reactPortalTooltipStrings.top = "top".asInstanceOf[typings.reactPortalTooltip.reactPortalTooltipStrings.top]
    }
    
    trait _Align extends StObject
    
    trait _Arrow extends StObject
  }
  type Card = Component[CardProps, js.Object, Any]
}
