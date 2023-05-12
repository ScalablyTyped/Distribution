package typings.reactLeaflet

import typings.leaflet.mod.FitBoundsOptions
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.MapOptions
import typings.leaflet.mod.Map_
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMapContainerMod {
  
  @JSImport("react-leaflet/lib/MapContainer", "MapContainer")
  @js.native
  val MapContainer: ForwardRefExoticComponent[MapContainerProps & RefAttributes[Map_]] = js.native
  
  trait MapContainerProps
    extends StObject
       with MapOptions {
    
    var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
    
    var boundsOptions: js.UndefOr[FitBoundsOptions] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[ReactNode] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var whenReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object MapContainerProps {
    
    inline def apply(): MapContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapContainerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MapContainerProps] (val x: Self) extends AnyVal {
      
      inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsOptions(value: FitBoundsOptions): Self = StObject.set(x, "boundsOptions", value.asInstanceOf[js.Any])
      
      inline def setBoundsOptionsUndefined: Self = StObject.set(x, "boundsOptions", js.undefined)
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value*))
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setPlaceholder(value: ReactNode): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWhenReady(value: () => Unit): Self = StObject.set(x, "whenReady", js.Any.fromFunction0(value))
      
      inline def setWhenReadyUndefined: Self = StObject.set(x, "whenReady", js.undefined)
    }
  }
}
