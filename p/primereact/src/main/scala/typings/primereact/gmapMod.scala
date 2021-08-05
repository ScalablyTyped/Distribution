package typings.primereact

import typings.primereact.anon.Map
import typings.react.mod.Component
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gmapMod {
  
  @JSImport("primereact/components/gmap/GMap", "GMap")
  @js.native
  class GMap protected ()
    extends Component[GMapProps, js.Any, js.Any] {
    def this(props: GMapProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: GMapProps, context: js.Any) = this()
  }
  
  trait GMapProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var onMapClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onMapDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMapReady: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.undefined
    
    var onOverlayClick: js.UndefOr[js.Function1[/* e */ Map, Unit]] = js.undefined
    
    var onOverlayDrag: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onOverlayDragEnd: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onOverlayDragStart: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.undefined
    
    var onZoomChanged: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var overlays: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object GMapProps {
    
    inline def apply(): GMapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GMapProps]
    }
    
    extension [Self <: GMapProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnMapClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onMapClick", js.Any.fromFunction1(value))
      
      inline def setOnMapClickUndefined: Self = StObject.set(x, "onMapClick", js.undefined)
      
      inline def setOnMapDragEnd(value: () => Unit): Self = StObject.set(x, "onMapDragEnd", js.Any.fromFunction0(value))
      
      inline def setOnMapDragEndUndefined: Self = StObject.set(x, "onMapDragEnd", js.undefined)
      
      inline def setOnMapReady(value: /* map */ js.Any => Unit): Self = StObject.set(x, "onMapReady", js.Any.fromFunction1(value))
      
      inline def setOnMapReadyUndefined: Self = StObject.set(x, "onMapReady", js.undefined)
      
      inline def setOnOverlayClick(value: /* e */ Map => Unit): Self = StObject.set(x, "onOverlayClick", js.Any.fromFunction1(value))
      
      inline def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      inline def setOnOverlayDrag(value: /* event */ Event => Unit): Self = StObject.set(x, "onOverlayDrag", js.Any.fromFunction1(value))
      
      inline def setOnOverlayDragEnd(value: /* event */ Event => Unit): Self = StObject.set(x, "onOverlayDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnOverlayDragEndUndefined: Self = StObject.set(x, "onOverlayDragEnd", js.undefined)
      
      inline def setOnOverlayDragStart(value: /* event */ Event => Unit): Self = StObject.set(x, "onOverlayDragStart", js.Any.fromFunction1(value))
      
      inline def setOnOverlayDragStartUndefined: Self = StObject.set(x, "onOverlayDragStart", js.undefined)
      
      inline def setOnOverlayDragUndefined: Self = StObject.set(x, "onOverlayDrag", js.undefined)
      
      inline def setOnZoomChanged(value: () => Unit): Self = StObject.set(x, "onZoomChanged", js.Any.fromFunction0(value))
      
      inline def setOnZoomChangedUndefined: Self = StObject.set(x, "onZoomChanged", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOverlays(value: js.Array[js.Any]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      inline def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
      
      inline def setOverlaysVarargs(value: js.Any*): Self = StObject.set(x, "overlays", js.Array(value :_*))
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
