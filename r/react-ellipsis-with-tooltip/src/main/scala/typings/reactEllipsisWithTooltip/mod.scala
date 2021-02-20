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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-ellipsis-with-tooltip", JSImport.Default)
  @js.native
  class default ()
    extends Component[EllipsisWithTooltipProps, js.Object, js.Any]
  
  type EllipsisWithTooltip = Component[EllipsisWithTooltipProps, js.Object, js.Any]
  
  @js.native
  trait EllipsisWithTooltipProps extends StObject {
    
    var children: ReactNode = js.native
    
    var delayHide: js.UndefOr[Double] = js.native
    
    var delayShow: js.UndefOr[Double] = js.native
    
    var placement: js.UndefOr[
        `auto-start` | auto | `auto-end` | `top-start` | top | `top-end` | `right-start` | right | `right-end` | `bottom-end` | bottom | `bottom-start` | `left-end` | left | `left-start`
      ] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object EllipsisWithTooltipProps {
    
    @scala.inline
    def apply(): EllipsisWithTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisWithTooltipProps]
    }
    
    @scala.inline
    implicit class EllipsisWithTooltipPropsMutableBuilder[Self <: EllipsisWithTooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDelayHide(value: Double): Self = StObject.set(x, "delayHide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayHideUndefined: Self = StObject.set(x, "delayHide", js.undefined)
      
      @scala.inline
      def setDelayShow(value: Double): Self = StObject.set(x, "delayShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayShowUndefined: Self = StObject.set(x, "delayShow", js.undefined)
      
      @scala.inline
      def setPlacement(
        value: `auto-start` | auto | `auto-end` | `top-start` | top | `top-end` | `right-start` | right | `right-end` | `bottom-end` | bottom | `bottom-start` | `left-end` | left | `left-start`
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
