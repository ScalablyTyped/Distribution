package typings.reactLeaflet.mod

import typings.leaflet.mod.LatLngBoundsExpression
import typings.leaflet.mod.LatLngTuple
import typings.leaflet.mod.VideoOverlayOptions
import typings.std.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactLeaflet.mod.MapComponentProps because var conflicts: pane. Inlined leaflet */ trait VideoOverlayProps
  extends StObject
     with VideoOverlayOptions {
  
  var bounds: LatLngBoundsExpression
  
  var leaflet: js.UndefOr[LeafletContext] = js.undefined
  
  var play: js.UndefOr[Boolean] = js.undefined
  
  var url: String | js.Array[String] | HTMLVideoElement
}
object VideoOverlayProps {
  
  inline def apply(bounds: LatLngBoundsExpression, url: String | js.Array[String] | HTMLVideoElement): VideoOverlayProps = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoOverlayProps]
  }
  
  extension [Self <: VideoOverlayProps](x: Self) {
    
    inline def setBounds(value: LatLngBoundsExpression): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsVarargs(value: LatLngTuple*): Self = StObject.set(x, "bounds", js.Array(value :_*))
    
    inline def setLeaflet(value: LeafletContext): Self = StObject.set(x, "leaflet", value.asInstanceOf[js.Any])
    
    inline def setLeafletUndefined: Self = StObject.set(x, "leaflet", js.undefined)
    
    inline def setPlay(value: Boolean): Self = StObject.set(x, "play", value.asInstanceOf[js.Any])
    
    inline def setPlayUndefined: Self = StObject.set(x, "play", js.undefined)
    
    inline def setUrl(value: String | js.Array[String] | HTMLVideoElement): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlVarargs(value: String*): Self = StObject.set(x, "url", js.Array(value :_*))
  }
}
