package typings.reactLeaflet

import typings.leaflet.mod.TileLayerOptions
import typings.leaflet.mod.TileLayer_
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactLeafletCore.libEventsMod.EventedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTileLayerMod {
  
  @JSImport("react-leaflet/lib/TileLayer", "TileLayer")
  @js.native
  val TileLayer: ForwardRefExoticComponent[TileLayerProps & RefAttributes[TileLayer_]] = js.native
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.leaflet.mod.LayerOptions because Already inherited
  - typings.reactLeafletCore.libLayerMod.LayerProps because var conflicts: attribution, pane. Inlined  */ trait TileLayerProps
    extends StObject
       with TileLayerOptions
       with EventedProps {
    
    var url: String
  }
  object TileLayerProps {
    
    inline def apply(url: String): TileLayerProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileLayerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TileLayerProps] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
