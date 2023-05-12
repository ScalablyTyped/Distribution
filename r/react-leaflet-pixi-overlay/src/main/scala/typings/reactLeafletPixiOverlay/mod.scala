package typings.reactLeafletPixiOverlay

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-leaflet-pixi-overlay", JSImport.Default)
  @js.native
  open class default protected ()
    extends Component[PixiOverlayProps, js.Object, Any] {
    def this(props: PixiOverlayProps) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: PixiOverlayProps, context: Any) = this()
  }
  
  trait MarkerPropsPixiOverlay extends StObject {
    
    var customIcon: js.UndefOr[String] = js.undefined
    
    var iconColor: js.UndefOr[String] = js.undefined
    
    var iconId: js.UndefOr[String] = js.undefined
    
    var id: String | Double
    
    var markerSpriteAnchor: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var popup: js.UndefOr[String] = js.undefined
    
    var popupOpen: js.UndefOr[Boolean] = js.undefined
    
    var position: js.Tuple2[Double, Double]
    
    var tooltip: js.UndefOr[String] = js.undefined
  }
  object MarkerPropsPixiOverlay {
    
    inline def apply(id: String | Double, position: js.Tuple2[Double, Double]): MarkerPropsPixiOverlay = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkerPropsPixiOverlay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MarkerPropsPixiOverlay] (val x: Self) extends AnyVal {
      
      inline def setCustomIcon(value: String): Self = StObject.set(x, "customIcon", value.asInstanceOf[js.Any])
      
      inline def setCustomIconUndefined: Self = StObject.set(x, "customIcon", js.undefined)
      
      inline def setIconColor(value: String): Self = StObject.set(x, "iconColor", value.asInstanceOf[js.Any])
      
      inline def setIconColorUndefined: Self = StObject.set(x, "iconColor", js.undefined)
      
      inline def setIconId(value: String): Self = StObject.set(x, "iconId", value.asInstanceOf[js.Any])
      
      inline def setIconIdUndefined: Self = StObject.set(x, "iconId", js.undefined)
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMarkerSpriteAnchor(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "markerSpriteAnchor", value.asInstanceOf[js.Any])
      
      inline def setMarkerSpriteAnchorUndefined: Self = StObject.set(x, "markerSpriteAnchor", js.undefined)
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPopup(value: String): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupOpen(value: Boolean): Self = StObject.set(x, "popupOpen", value.asInstanceOf[js.Any])
      
      inline def setPopupOpenUndefined: Self = StObject.set(x, "popupOpen", js.undefined)
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setPosition(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  type MarkersPropsPixiOverlay = js.Array[MarkerPropsPixiOverlay]
  
  trait PixiOverlayProps extends StObject {
    
    var markers: MarkersPropsPixiOverlay
  }
  object PixiOverlayProps {
    
    inline def apply(markers: MarkersPropsPixiOverlay): PixiOverlayProps = {
      val __obj = js.Dynamic.literal(markers = markers.asInstanceOf[js.Any])
      __obj.asInstanceOf[PixiOverlayProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PixiOverlayProps] (val x: Self) extends AnyVal {
      
      inline def setMarkers(value: MarkersPropsPixiOverlay): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
      
      inline def setMarkersVarargs(value: MarkerPropsPixiOverlay*): Self = StObject.set(x, "markers", js.Array(value*))
    }
  }
}
