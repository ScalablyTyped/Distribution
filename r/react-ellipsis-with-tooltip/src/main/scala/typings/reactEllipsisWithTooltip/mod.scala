package typings.reactEllipsisWithTooltip

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`auto-end`
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`auto-start`
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`bottom-end`
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`bottom-start`
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`left-end`
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`left-start`
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`right-end`
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`right-start`
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`top-end`
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.`top-start`
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.auto
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.bottom
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.left
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.right
import typings.reactEllipsisWithTooltip.reactEllipsisWithTooltipStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-ellipsis-with-tooltip", JSImport.Default)
  @js.native
  open class default ()
    extends Component[EllipsisWithTooltipProps, js.Object, Any]
  
  type EllipsisWithTooltip = Component[EllipsisWithTooltipProps, js.Object, Any]
  
  trait EllipsisWithTooltipProps extends StObject {
    
    var children: ReactNode
    
    var delayHide: js.UndefOr[Double] = js.undefined
    
    var delayShow: js.UndefOr[Double] = js.undefined
    
    var placement: js.UndefOr[
        `auto-start` | auto | `auto-end` | `top-start` | top | `top-end` | `right-start` | right | `right-end` | `bottom-end` | bottom | `bottom-start` | `left-end` | left | `left-start`
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object EllipsisWithTooltipProps {
    
    inline def apply(): EllipsisWithTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisWithTooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EllipsisWithTooltipProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDelayHide(value: Double): Self = StObject.set(x, "delayHide", value.asInstanceOf[js.Any])
      
      inline def setDelayHideUndefined: Self = StObject.set(x, "delayHide", js.undefined)
      
      inline def setDelayShow(value: Double): Self = StObject.set(x, "delayShow", value.asInstanceOf[js.Any])
      
      inline def setDelayShowUndefined: Self = StObject.set(x, "delayShow", js.undefined)
      
      inline def setPlacement(
        value: `auto-start` | auto | `auto-end` | `top-start` | top | `top-end` | `right-start` | right | `right-end` | `bottom-end` | bottom | `bottom-start` | `left-end` | left | `left-start`
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
