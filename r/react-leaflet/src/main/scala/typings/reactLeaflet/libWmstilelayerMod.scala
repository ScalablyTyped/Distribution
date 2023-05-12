package typings.reactLeaflet

import typings.leaflet.mod.TileLayer_.WMS
import typings.leaflet.mod.WMSOptions
import typings.leaflet.mod.WMSParams
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libWmstilelayerMod {
  
  @JSImport("react-leaflet/lib/WMSTileLayer", "WMSTileLayer")
  @js.native
  val WMSTileLayer: ForwardRefExoticComponent[WMSTileLayerProps & RefAttributes[WMS]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.reactLeafletCore.libLayerMod.LayerProps because var conflicts: attribution, pane. Inlined  */ trait WMSTileLayerProps
    extends StObject
       with WMSOptions
       with EventedProps {
    
    var params: js.UndefOr[WMSParams] = js.undefined
    
    var url: String
  }
  object WMSTileLayerProps {
    
    inline def apply(url: String): WMSTileLayerProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[WMSTileLayerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WMSTileLayerProps] (val x: Self) extends AnyVal {
      
      inline def setParams(value: WMSParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
