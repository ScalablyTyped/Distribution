package typings.reactLeaflet

import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.TooltipOptions
import typings.leaflet.mod.Tooltip_
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTooltipMod {
  
  @JSImport("react-leaflet/lib/Tooltip", "Tooltip")
  @js.native
  val Tooltip: ForwardRefExoticComponent[TooltipProps & RefAttributes[Tooltip_]] = js.native
  
  trait TooltipProps
    extends StObject
       with TooltipOptions
       with EventedProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var position: js.UndefOr[LatLngExpression] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPosition(value: LatLngExpression): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
