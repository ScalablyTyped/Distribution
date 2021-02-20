package typings.reactPortalTooltip

import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactPortalTooltip.cardMod.Card.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolTipMod {
  
  @JSImport("react-portal-tooltip/lib/ToolTip", JSImport.Default)
  @js.native
  class default ()
    extends Component[TooltipProps, js.Object, js.Any]
  
  type Tooltip = Component[TooltipProps, js.Object, js.Any]
  
  @js.native
  trait TooltipProps extends CardProps {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var group: js.UndefOr[String] = js.native
    
    var parent: String | Element | RefObject[_] = js.native
    
    var tooltipTimeout: js.UndefOr[Double] = js.native
  }
  object TooltipProps {
    
    @scala.inline
    def apply(parent: String | Element | RefObject[_]): TooltipProps = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit class TooltipPropsMutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      @scala.inline
      def setParent(value: String | Element | RefObject[_]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTimeout(value: Double): Self = StObject.set(x, "tooltipTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipTimeoutUndefined: Self = StObject.set(x, "tooltipTimeout", js.undefined)
    }
  }
}
