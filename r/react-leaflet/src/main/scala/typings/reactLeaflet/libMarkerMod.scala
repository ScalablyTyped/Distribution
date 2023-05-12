package typings.reactLeaflet

import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.MarkerOptions
import typings.leaflet.mod.Marker_
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMarkerMod {
  
  @JSImport("react-leaflet/lib/Marker", "Marker")
  @js.native
  val Marker: ForwardRefExoticComponent[MarkerProps & RefAttributes[Marker_[Any]]] = js.native
  
  trait MarkerProps
    extends StObject
       with MarkerOptions
       with EventedProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var position: LatLngExpression
  }
  object MarkerProps {
    
    inline def apply(position: LatLngExpression): MarkerProps = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPosition(value: LatLngExpression): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
}
