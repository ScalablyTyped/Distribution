package typings.reactPortalTooltip

import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactPortalTooltip.libToolTipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatefulToolTipMod {
  
  @JSImport("react-portal-tooltip/lib/StatefulToolTip", JSImport.Default)
  @js.native
  open class default ()
    extends Component[StatefulToolTipProps, js.Object, Any]
  
  type StatefulToolTip = Component[StatefulToolTipProps, js.Object, Any]
  
  trait StatefulToolTipProps
    extends StObject
       with TooltipProps {
    
    var className: js.UndefOr[String] = js.undefined
  }
  object StatefulToolTipProps {
    
    inline def apply(parent: String | Element | RefObject[Any]): StatefulToolTipProps = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulToolTipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatefulToolTipProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
