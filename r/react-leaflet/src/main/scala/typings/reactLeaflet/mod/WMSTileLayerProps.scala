package typings.reactLeaflet.mod

import typings.leaflet.mod.WMSOptions
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet
- typings.leaflet.mod.GridLayerOptions because Already inherited
- typings.reactLeaflet.mod.MapLayerProps because var conflicts: attribution, pane. Inlined children
- typings.reactLeaflet.mod.GridLayerProps because var conflicts: attribution, bounds, className, keepBuffer, maxNativeZoom, maxZoom, minNativeZoom, minZoom, noWrap, opacity, pane, tileSize, updateInterval, updateWhenIdle, updateWhenZooming, zIndex. Inlined  */ trait WMSTileLayerProps
  extends StObject
     with TileLayerEvents
     with WMSOptions {
  
  var children: js.UndefOr[Children] = js.undefined
  
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  
  var url: String
}
object WMSTileLayerProps {
  
  inline def apply(url: String): WMSTileLayerProps = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMSTileLayerProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WMSTileLayerProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: Children): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    inline def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
