package typings.primereact

import typings.primereact.anon.Map
import typings.react.mod.Component
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait GMapProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var onMapClick: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var onMapDragEnd: js.UndefOr[js.Function0[Unit]] = js.native
    
    var onMapReady: js.UndefOr[js.Function1[/* map */ js.Any, Unit]] = js.native
    
    var onOverlayClick: js.UndefOr[js.Function1[/* e */ Map, Unit]] = js.native
    
    var onOverlayDrag: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var onOverlayDragEnd: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var onOverlayDragStart: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
    
    var onZoomChanged: js.UndefOr[js.Function0[Unit]] = js.native
    
    var options: js.UndefOr[js.Object] = js.native
    
    var overlays: js.UndefOr[js.Array[_]] = js.native
    
    var style: js.UndefOr[js.Object] = js.native
  }
  object GMapProps {
    
    @scala.inline
    def apply(): GMapProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GMapProps]
    }
    
    @scala.inline
    implicit class GMapPropsMutableBuilder[Self <: GMapProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOnMapClick(value: /* event */ Event => Unit): Self = StObject.set(x, "onMapClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMapClickUndefined: Self = StObject.set(x, "onMapClick", js.undefined)
      
      @scala.inline
      def setOnMapDragEnd(value: () => Unit): Self = StObject.set(x, "onMapDragEnd", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMapDragEndUndefined: Self = StObject.set(x, "onMapDragEnd", js.undefined)
      
      @scala.inline
      def setOnMapReady(value: /* map */ js.Any => Unit): Self = StObject.set(x, "onMapReady", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMapReadyUndefined: Self = StObject.set(x, "onMapReady", js.undefined)
      
      @scala.inline
      def setOnOverlayClick(value: /* e */ Map => Unit): Self = StObject.set(x, "onOverlayClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOverlayClickUndefined: Self = StObject.set(x, "onOverlayClick", js.undefined)
      
      @scala.inline
      def setOnOverlayDrag(value: /* event */ Event => Unit): Self = StObject.set(x, "onOverlayDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOverlayDragEnd(value: /* event */ Event => Unit): Self = StObject.set(x, "onOverlayDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOverlayDragEndUndefined: Self = StObject.set(x, "onOverlayDragEnd", js.undefined)
      
      @scala.inline
      def setOnOverlayDragStart(value: /* event */ Event => Unit): Self = StObject.set(x, "onOverlayDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOverlayDragStartUndefined: Self = StObject.set(x, "onOverlayDragStart", js.undefined)
      
      @scala.inline
      def setOnOverlayDragUndefined: Self = StObject.set(x, "onOverlayDrag", js.undefined)
      
      @scala.inline
      def setOnZoomChanged(value: () => Unit): Self = StObject.set(x, "onZoomChanged", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnZoomChangedUndefined: Self = StObject.set(x, "onZoomChanged", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOverlays(value: js.Array[_]): Self = StObject.set(x, "overlays", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlaysUndefined: Self = StObject.set(x, "overlays", js.undefined)
      
      @scala.inline
      def setOverlaysVarargs(value: js.Any*): Self = StObject.set(x, "overlays", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
