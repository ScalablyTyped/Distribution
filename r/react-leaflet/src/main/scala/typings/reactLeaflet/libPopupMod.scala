package typings.reactLeaflet

import typings.leaflet.mod.LatLngExpression
import typings.leaflet.mod.PopupOptions
import typings.leaflet.mod.Popup_
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopupMod {
  
  @JSImport("react-leaflet/lib/Popup", "Popup")
  @js.native
  val Popup: ForwardRefExoticComponent[PopupProps & RefAttributes[Popup_]] = js.native
  
  trait PopupProps
    extends StObject
       with PopupOptions
       with EventedProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var position: js.UndefOr[LatLngExpression] = js.undefined
  }
  object PopupProps {
    
    inline def apply(): PopupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPosition(value: LatLngExpression): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    }
  }
}
