package typings.reactLeaflet.mod

import typings.leaflet.mod.CrossOrigin
import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.leaflet.mod.LayerOptions because var conflicts: attribution, pane. Inlined 
- typings.leaflet.mod.InteractiveLayerOptions because var conflicts: attribution, pane. Inlined bubblingMouseEvents, interactive
- typings.leaflet.mod.ImageOverlayOptions because var conflicts: attribution, pane. Inlined alt, errorOverlayUrl, className, crossOrigin, zIndex, opacity */ trait ImageOverlayProps
  extends StObject
     with MapLayerProps {
  
  var alt: js.UndefOr[String] = js.undefined
  
  var bounds: js.UndefOr[LatLngBoundsExpression] = js.undefined
  
  var bubblingMouseEvents: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var crossOrigin: js.UndefOr[CrossOrigin] = js.undefined
  
  var errorOverlayUrl: js.UndefOr[String] = js.undefined
  
  var interactive: js.UndefOr[Boolean] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var url: String | HTMLImageElement
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object ImageOverlayProps {
  
  inline def apply(url: String | HTMLImageElement): ImageOverlayProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOverlayProps]
  }
  
  extension [Self <: ImageOverlayProps](x: Self) {
    
    inline def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
    
    inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
    
    inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    inline def setBubblingMouseEvents(value: Boolean): Self = StObject.set(x, "bubblingMouseEvents", value.asInstanceOf[js.Any])
    
    inline def setBubblingMouseEventsUndefined: Self = StObject.set(x, "bubblingMouseEvents", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCrossOrigin(value: CrossOrigin): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setErrorOverlayUrl(value: String): Self = StObject.set(x, "errorOverlayUrl", value.asInstanceOf[js.Any])
    
    inline def setErrorOverlayUrlUndefined: Self = StObject.set(x, "errorOverlayUrl", js.undefined)
    
    inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    
    inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setUrl(value: String | HTMLImageElement): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
