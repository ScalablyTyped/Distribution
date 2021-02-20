package typings.reactPortalTooltip

import typings.react.mod.Component
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.reactPortalTooltip.toolTipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statefulToolTipMod {
  
  @JSImport("react-portal-tooltip/lib/StatefulToolTip", JSImport.Default)
  @js.native
  class default ()
    extends Component[StatefulToolTipProps, js.Object, js.Any]
  
  type StatefulToolTip = Component[StatefulToolTipProps, js.Object, js.Any]
  
  @js.native
  trait StatefulToolTipProps extends TooltipProps {
    
    var className: js.UndefOr[String] = js.native
  }
  object StatefulToolTipProps {
    
    @scala.inline
    def apply(parent: String | Element | RefObject[_]): StatefulToolTipProps = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[StatefulToolTipProps]
    }
    
    @scala.inline
    implicit class StatefulToolTipPropsMutableBuilder[Self <: StatefulToolTipProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
