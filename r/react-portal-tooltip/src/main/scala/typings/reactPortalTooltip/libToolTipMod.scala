package typings.reactPortalTooltip

import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactPortalTooltip.libCardMod.Card.CardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolTipMod {
  
  @JSImport("react-portal-tooltip/lib/ToolTip", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TooltipProps, js.Object, Any]
  
  type Tooltip = Component[TooltipProps, js.Object, Any]
  
  trait TooltipProps
    extends StObject
       with CardProps {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var group: js.UndefOr[String] = js.undefined
    
    var parent: String | Element | RefObject[Any]
    
    var tooltipTimeout: js.UndefOr[Double] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(parent: String | Element | RefObject[Any]): TooltipProps = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setParent(value: String | Element | RefObject[Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setTooltipTimeout(value: Double): Self = StObject.set(x, "tooltipTimeout", value.asInstanceOf[js.Any])
      
      inline def setTooltipTimeoutUndefined: Self = StObject.set(x, "tooltipTimeout", js.undefined)
    }
  }
}
